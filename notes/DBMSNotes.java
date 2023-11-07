public class DBMSNotes {

    /**
     * What is DBMS?
     * DBMS - Database Management System
     * It is a set of application or programs that enables users to create
     * and maintain a database.
     * 
     * RDBMS - store data in the form of table as dbms store data in files
     * MySQL, Oracle, PostgresSQL
     * 
     * What is Database?
     * A Database is an organized, consistent and logical collection of data
     * that can be easily be updated, accessed and managed.
     * set of tables, Objects
     * row, tuple, ->
     * dbms extract data from db in the form of queries given by user.
     * 
     * Data Warehousing - The process of collecting, extracting, transforming
     * and loading data from multiple surces and storing them in one database
     * is known as data wareshousing.
     * 
     * Different level of data abstraction in DBMs
     * Phsical level - lowest level managed by dbms like storage descriptions
     * 
     * Conceptual level or logical level- level at which developers and system admin
     * work
     * what data stored and relationship between them
     * 
     * External level and view level - the result of the query is an example of
     * view level abstraction basically a user.
     * 
     * view - A view is a virtual table created by selecting fields from
     * one or more table present in the database.
     * 
     * Entity Relationship (E-R) model:
     * diagrammatic approach to a database design
     * Entity - real world object having attributes and features
     * Entity Type - Collection of entities that have same attributes
     * Entity set - set of all entities present in a specific entit type
     * 
     * Diff types of relationship among table
     * 1 to 1 relationship -
     * particular row in a table x is linked to singular row in table y
     * person - passport
     * 
     * one to many relationship -
     * A single row in table x is related to multiple row in table y
     * Customer - Account
     * 
     * Many to many relatioship -
     * Many row in table x is related to many row in table y
     * Customer - Product
     * 
     * Self referencing relationship -
     * A particular row in table x associated with the same table
     * Customer - order - Salutation
     * 
     * Intension and extension in database
     * Intension - known as Database schema
     * extension(Snapshot of the database) - At any given time number of tuple
     * stored in database
     * 
     * 
     * Diff between Delete and Truncate
     * 
     * Delete - delets the row from a table based on the where clause
     * can be rolled back
     * maintains the log to lock the row of the table before deleting
     * Can delete the content of the whole database if where clause is not
     * present,
     * 
     * Truncate is like delete command with no where clause
     * 
     * Lock?
     * protect data from getting updated by two or more users at the same time.
     * 
     * Shared lock - required for reading the data
     * multiple users can get lock in this case
     * Exclusive lock - required for write and update and delete
     * only one user at a time
     * 
     * Normalization and denormaliztion
     * Process of reducing redundancy by Organizing data into multiples table
     * 
     * 
     * Denormalization - Reverse process of normalization
     * like JOIN Operation allows us to create denormalized form of that data
     * retrieval becomes faster.
     * 
     * 
     * Normalization forms in a dbms
     * 1NF: (First Normal form)
     * Every Column should have one value - atomic
     * Duplicate column from the same table should be removed
     * Seperate table for each group of related data and each row should
     * be indentified with a unique column
     * 
     * 2NF: (Second Normal form)
     * Table should in 1NF to satisfy all the conditions for 2NF
     * That is every Non key attribute should be dependent on the primary
     * key
     * 
     * 3NF: (Third normal form)
     * Table should be in 2NF
     * No transitive (if A -> B, B -> C, then A -> C) functional dependency of one
     * attribute on any attribute
     * in the same table
     * 
     * BCNF - (BoyCe Codd Normal form) Advanced version of 3NF
     * Table should be 3NF
     * A -> B (A)should be the super key of the table
     * A can't be non prime attribute if b is a prime attribute
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {

    }

}
