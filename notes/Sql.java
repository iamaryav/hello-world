public class Sql {

    /**
     * SQL Notes
     * 
     * what is Database?
     * A database is a organized collection of data that can be
     * easily accessed, managed and updated.
     * 
     * What is DBMS? (Database Management Software)
     * It is a system software responsible for the creation, retrieval, updation
     * and management of the database.
     * 
     * RDBMS - It stores the data in form of collection of tables
     * DBMS - It stores the data in the form of file
     * 
     * SQL - (Structured query language)
     * It is the standard language for RDBMS
     * used in handling organized data.
     * 
     * SQL - Standard language for retrieving and manipulating structured database.
     * 
     * MySQL - It is a RDBMS that is used to manage SQL database
     * 
     * Table - Organized collection of data stored in the form of rows and
     * column
     * 
     * row - horizontal, tuple, records, reprsents a single entity
     * column - field, attribute, vertical
     * 
     * Constraints - rules concerning data in table
     * can be applied for single or multiple fields during creation of the
     * table, or after creating we can modify using ALTER command
     * 
     * NOT NULL, CHECK, DEFAULT, UNIQUE, INDEX, PRIMARY KEY, FOREIGN KEY
     * 
     * Primary Key,
     * CREATE TABLE students(
     * ID NOT NULL PRIMARY KEY,
     * NAME VARCHAR(255),
     * PRIMARY KEY (ID, ...)
     * )
     * ALTER TABLE students ADD PRIMARY KEY (ID)
     * ALTER TABLE students ADD CONSTRAINT PK_Student PRIMARY KEY (ID, ...)
     * 
     * UNIQUE Constraint - All value in the column are unique including null
     * can be multiple in a table
     * Syntax similar to primary key
     * 
     * Foreign key
     * single or collection of fields in a table that essentially refers to the
     * primary key in another table
     * 
     * CREATE TABLE students(
     * ID INT NOT NULL PRIMARY KEY,
     * NAME VARCHAR(255),
     * LibraryId INT FOREIGN KEY (Library_ID) REFERENCES Library(LibraryID),
     * 
     * PRIMARY KEY (ID),
     * FOREIGN KEY (Library_ID) REFERENCES Library(LibraryID)
     * )
     * 
     * ALTER TABLE Students ADD FOREIGN KEY(LibraryID) REFERENCES Library(LibraryID)
     * 
     * What is join?
     * The SQL join clause is used to combine records (rows) from two or more
     * tables in a SQL database on a related column between them
     * 
     * (Inner join) - Retrieves records that have matching values in both tables
     * involved in the join
     * SELECT * FROM TABLE_A JOIN TABLE_B;
     * SELEECT * FROM TABLE_A INNER JOIN TABLE_B;
     * 
     * LEFT (OUTER) JOIN - Retrieves all the records from left and matching
     * records from the right table.
     * SELECT * FROM TABLE_A A LEFT JOIN TABLE_B B ON A.COL = B.COL;
     * 
     * 
     * RIGHT (OUTER) JOIN - Retrieves all the records from right table and matching
     * records from left table.
     * 
     * SELECT * FROM TABLE_A A RIGHT JOIN TABLE_B B ON A.COL = B.COL;
     * 
     * FULL (OUTER) JOIN - Retrieves all the records where there is a match
     * in either the left or right table.
     * 
     * SELECT * FROM TABLE_A A FULL JOIN TABLE_B B ON A.COL = B.COL;
     * 
     * What is a self-join?
     * joining the same table to itself based on some relation between its
     * column. It uses INNER JOIN or Left JOIN clause
     * 
     * SELECT A.EMP_ID AS "EMP_ID", A.EMP_NAME AS "EMPLOYEE", B.EMP_ID AS
     * "SUP_ID", B.EMP_NAME AS "SUPERVISOR" FROM EMPLOYEE A, EMPLOYEE B
     * WHERE A.EMP_SUP = B.EMP_ID;
     * 
     * What is Cross-Join?
     * Cartesian product,
     * row - r1 * r2
     * col - c1 + c2
     * 
     * It will map each row with each row of other table
     * 
     * SELECT STU.NAME, SUB.SUBJECT FROM STUDENT AS STU CROSS JOIN SUBJECTS AS SUB;
     * 
     * What is an Index?
     * 
     * Index - Database Data Structures that provides quick lookup of data in
     * a column or columns of a table. It enhances the speed of operations
     * accessing data from a database table at the cost of additional writes
     * and memory to maintain the index ds.
     * 
     * Unique, Non unique, Clustered, Non Clustered
     * 
     * 
     * Data Integrity - Assurance of accuracy and consistency of data.
     * 
     * Cursor - It can be viewed as a pointer to one row in set of rows.
     * control structure that allows for the traversal of records in db.
     * 
     * SQL Cursor -
     * 
     * Entity - It can be real object that has some property
     * 
     * Relationship - Relations or links between entities that have
     * something to do with each other.
     * b
     * Alias - Giving temporary name to a table or columns of a table in
     * sql query.
     * 
     * What is view?
     * Virtual table
     * 
     * Normalization is the way of organizing structured data in the database
     * efficiently.
     * 
     * Denormaliztion - performance improvement
     * 
     * various form of normalization:
     * 1NF, 2NF, 3NF, BCNF
     * 
     * TRUNCATE, DELETE and DROP
     * 
     * What is the aggregate and scalar function?
     * AVG(), Count(), sum(), min(), max()
     * 
     * What is OLTP?
     * Online Transaction Processing
     * 
     * Diff between OLTP and OLAP?
     * 
     * What is collation?
     * Set of rules that determines how data is stored and compared
     * 
     * What is Stored Procedure?
     * 
     * Subroutine availabel to applications that access a RDBMS.
     * It stored in db data dictonary.
     * Only runs on database, provides sense of security
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
     * 
     * @param args
     */
    public static void main(String[] args) {

    }
}