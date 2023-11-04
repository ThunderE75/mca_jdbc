# JDBC programs from Amity

Here are all the JDBC programs of MCA - 1(A) 

## Prerequisites 

- Java 
- Mysql
- [JDBC Connector](https://dev.mysql.com/downloads/connector/j/)

## Initial SQL Setup

```sql
SHOW DATABASES;
CREATE DATABASE jdbc;
USE jdbc; 
```

### To change password
```
String user = "root";
String password = "PASSWORD";
String url = "jdbc:mysql://localhost:3306/jdbc";
```