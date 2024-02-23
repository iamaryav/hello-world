# Desgin of TinyURL
1. #### Requirements and the goals of the system
    - Functional requirements
        - Generate a shorter and unique alias of a URL
        - our service should redirect user from short link to original link
        - User should be able to pick custom short link for their URL
        - Link expiration after default timespan and user should be able to specify the time 
    - Non functional requirement:
        - Highly availabel, because this fails no URL will be reachable
        - Redirection should happen in real time with minimal latency
        - shortened links should not be predictable.
    - Extended Requirements:
        - Analytics; e.g., how many times redirection happened
        - Our service should be accessible through REST API by other services
2. #### Capacity estimation and Constraints
    - 500M new URLs per month and 100:1 ; read:write ratio
    - Read Heavy
    - 100:1 : redirection:shortening : read:write
    - Assumption: 500M new URL shortening per month
    - 100 * 500M = 50B redirections
    - URL shortening per second: ~200/sec
    - URL redirection/s: ~20k/sec
    - storing link for 5 years: 30 billion link
    - size of each object 500 bytes: 15 TB
    - Bandwidth estimates: Incoming data - ~100 KB/s
    outgoing data - ~10 MB/s
    - Caching most frequently cached URLs following 80-20% rule: 170 GB/s
3. #### System APIs
```
String createURL(api_dev_key, original_url, custom_alia=None, expire_date=None)

String deleteURL(api_dev_key, url_key)

```
4. #### Database desgin
```

```
     