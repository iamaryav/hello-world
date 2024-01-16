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
    - 

