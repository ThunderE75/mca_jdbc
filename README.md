# JDBC programs from Amity

Here are all the JDBC programs of MCA - 1(A) 

## Prerequisites 

- Java 
- Mysql
- [JDBC Connector](https://dev.mysql.com/downloads/connector/j/)

## Compile 

```cmd
javac -cp "Absolute_path_to_JDBC_driver;." Java_File.java
java -cp "Absolute_path_to_JDBC_driver;." Java_File
```


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

---

### setup for my env

> MariaDB is virtually same as MySQL by Oracle without propritary stuff.

1. To check if mariadb is install (I am on OpenSUSE)
    ```bash
    sudo zypper install mariadb
    ```
1. To run the mysql service (it takes a while)
    ```bash
    sudo systemctl start mariadb
    ```
    OR (You can make it start by default, but it might slowdown startup times)
    ```bash
    sudo systemctl enable mariadb
    ```

1. To run as root
    ```bash
    sudo /usr/bin/mariadb -u root -p
    ```
1. Download MariaDB java connector link from [mariadb.com](https://mariadb.com/downloads/connectors/connectors-data-access/java8-connector/)
1. To to compile & run programs (zsh)
    ```zsh
        # Compile
        javac -cp .:mariadb-java-client-x.x.x.jar <file.java>

        # Run
        java -cp .;mariadb-java-client-x.x.x.jar <javafile>
    ```