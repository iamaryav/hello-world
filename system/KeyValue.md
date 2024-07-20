## Design of key value store

### Funtional requirement
    - Able to save and Reterieve value - get(key), put(key, value)
    - key can be String, text, or hash value , value can be string list, object
    - Redis, Memcached, Amazon dynamo, Cassandra, BigTable
    - Ability to store Big data
### Non functional requirement - book
    - Low latency 
    - High availability
    - High Scalability
    - Fault taulrance
    - Ditributed key-value store, Automatic Scaling, Distributed hash table
    - Tunable Consistency
### capacity estimation and constraints - (Back of the envelop calculation)
    - size of key value pair is 10 KB
    - 
### High level design
### Database schema and API Design
### Detailed component design
    - Data Partition
        - Distribute data evenly
        - less data movement when nodes are added or removed
        - Solution is consisten hashing - Automatic scaling, Heterogeneity
    - Data Replicatoin
        - To achieve high availability and reliability
        - For better reliability, replicas are placed in distinct data centers
    - Consistency
        - Since data is replicated at multiple nodes it must be synchronized across replicas
        - Quorum consensus is the solution
    - Consistency models
        - Strong consistency
        - Weak consistency
        - Eventual consistency - dynamo and Cassandra
    - Inconsistency resuolution: versioning
        - Vector clocks and Reconcilation
    - Handling Failures
        - Failure Detection method
            - Gossip Protocol
                - Each node maintains a node membership list
        - Handling temporary failures
            - hinted handoff solution
        - Permanent node failure
            - Anti-Entropy protocol
            - Merkle tree is used for inconsistency detection
        - Handling data center outage
            - Replicate data across multiple datacenters
### system Architectural design
### write path and Read path - books
### Evaluation