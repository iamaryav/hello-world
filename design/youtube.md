# Youtube / Netflix / Vimeo / Dailymotion / Veoh / Video Streaming Services - Design

## Design Steps
1. ###  Requirements and the goals of the system
    - Functional Requirements 
        - Stream videos
        - Upload videos
        - Search videos according to titles
        - Views, like and dislike videos stats of the videos
        - Add comments to videos
        - View thumnails
    - Nonfunctional requirements
        - High availability
        - Scalability
        - Good Performance
2. ### Capacity estimation and constraints
    - User estimates
        - 1.5b users, 800 million DAU
    - Storage estimates
        - 1500 GB/min
    - Bandwidth estimates
        - 1 TB/sec

3. ### High level design
    - Processing Queue, Encoder, Thumbnail generator, Video and Thumbnail storage, User Database, Video metadata storage

4. ### Database Schema
    - Video metadata storage - MySql
        - VideoId, VideoTitle, Description, size, 
        Thumbnail, Uploader/user, LikeCount, DislikeCount, Views, VideoUrl, ThumbnailUrl
    - For each video comment we need following information
         - CommentId, VideoId, UserId, Comment, TimeOfCreation
    - User data storage
        - UserId, UserName, Email, address, age, registration Details etc
5. ### API design
    - SOAP / REST API to expose functionality of our service  
        ``` 

        uploadVideo(api_dev_key, video_title, video_description, tags[], category_id, default_language, recordingDetails, recording_details, video_content)
        
        ```
        - Returns: string
            Successful upload will return HTTP 202 (request accepted)
            Once the video encoding is completed user is notified through email with link to access video
            We can also expose a queryabel API to show user status of their video upload
    - Search
        ```
        search(api_dev_key, search_query, user_location, maximum_videos_to_return, page_token)
        
        ```
        Returns: JSON
            Response containing list of video matching the search query, each video resource will have a video title, a thumbnail, a video creation data and views count
    - Stream
        ```
        stream(api_dev_key, video_id, offset, codec, resolution) 
        
        ```
        Returns: (Stream)
        A media stream (a video chunk) from the given offset.

5. ### Detailed component design
    - Service would be read heavy (200:1)
    - Video storage? - Videos can be stored in a distributed file storage like HDFS or GlusterFS or S3.
    - Traffic Management? - We should segregate our read traffic from write traffic. Since we will have multiple copies of each video.
    - We can distribute our read traffic to different servers
    - For metadata, we can have master-slave configurations (problem - Staleness in data)
    - Thumbnail Storage? - Assumption 5 image per video so lots of image storing in the image will be result in more latencies, Bigtable can be a option
    - Cache? - keeping thumbnail in cache will increase the speed
    - Video Uploads - We should support resume from the same point upload if connection drops
    - Video Encoding - Newly uploaded videos are stored on the server and a new tasks is added to the processing queue to encode the video into multiple format, generate thumbnails, check for copyright infrigement and so on once everything is completed it will be made available for view / sharing
    - Metadata Sharding? - Since we have huge number of new videos everyday and our read load is extremely high, therefore, we need to distribute our data onto multiple machines so that we can perform read/write operations efficiently.
        - Sharding based on UserId, Sharding based on VideoId
    - Video Deduplication? - Will cause problems like More data storage, Caching, Network usage, Energy consumption, duplicate search results, longer videos startup times, and interrupted streaming Solutions - when user uploads videos we can run video matching algorithm e.g., Block Matching, Phase Correlation etc. to find duplications
    - Load Balancing? - we should use Consistent Hashing among our cache servers, which will also help in balancing the load between cache servers. we can redirect user to less busy server if a server is very busy serving request for popular videos. We can dynamic HTTP redirections for this scenario. drawbacks multiple redirection if server doesn't have the video and server needs to have a client to make request
    - Cache? - we can cache the videos that are more in demand for the regions and we can have our data cached near to that region we can use cache for thumbnail also, for balancing load on the cache servers we can use the load balancers.
    Use the Memcahche to cache the data and Least Recent Use (LRU) can be a reasonable cache eviction policy.
    we can use 80-20 rule 20% of daily read volume fo r videos is generating 80% of the traffic so we can try caching the 20% of the video that causes the most traffic
    - CDN (Content Delivery Network) - It is a system of distrubuted servers that deliver web content to a user based in the geographic locations of the user. Our services can move popular videos to CDNs
    - Fault Tolerance - We should use consistent hashing for distribution amond database servers.
    

