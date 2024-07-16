# Rate Limiter

### Requirements:
    - Functional Requirements
        - Limit excessive requests server
    - Non functional requirement
        - High Availability
        - Low Latency
        - Use as little memory as possible
        - Distributed rate limiting
        - High Fault tolerance
    - Questions to ask?
        - Server side or client side - based on tech stack
        - Identify the limiting algo that fits the business need
        - If API gateway is there add rate limiter there
        - If resource is not present used third party one
### Capacity estimation and constraint
    - User
        - 200M Users, 20M DAU
    - Storage
        - 20 GB/Day, 10KB/s
    - Bandwidth
        - ?
### High level design
    - client - Rate limiter - Redis cache - server 

### Algorithms - book
    - Token buket
    - Leaking bucket
    - Fixed window counter
    - Sliding window log
    - Sliding window counter

### Design deep dive
    - Rate limiting rules
        ```
        domain: messaging
        descriptors:
        - key: message_type
          Value: marketing
          rate_limit:
            unit: day
            request_per_unit: 5
        ```
        - hard and soft rate limiting
    - Excessing the rate limit
        - return response code 429(too many requests) 
    - Rate limiter headers
        - Response header: X-Ratelimit-Remaining, X-Ratelimit-Limit:, X-Ratelimit-Retry-After
        - To let client know the status of rate limiting
    - Detailed design of Rate limiter
    - Rate limiter in a distributed environment
        - Race condition 
            - to avoid this use locks but better solution is lua script and Sorted set data structure in Redis
        - Synchronization issue
            - Use centralized database like redis to store the session information
    - Performance Optimization
        - Multi-data center setup
        - Synchronize data with eventual consistency model?
    - Monitoring
        - Algorithms and Limiting rules are effective?
        - Relax the rules or change the algo if needed

    
    