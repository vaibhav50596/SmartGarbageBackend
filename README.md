# SmartGarbageBackend

SpringBoot Application with MySQL using JDBC

This application is developed in Spring Boot framework with MySQL database using JDBC connection. You should have Maven installed 
in order to build and run this application on your machine. Also, you should have MySQL database running locally on localhost:3306
port.

The code does not create database and tables progrmmatically. Please create database and table manually using cmd or MySQL Workbench.
you should have database schema as below:

database name: garbagedb
table name: garbagedata

SQL query to create table:

CREATE TABLE garbagedata (HouseId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
HouseAddress VARCHAR(40),
ZipCode VARCHAR(30),
RecycledQuantity int(4),
LandfillQuantity int(4),
DumpDate DATE);

After you create database and table then you can open this project in IntelliJ IDEA and run this locally. By default this project runs 
on localhost:5006 but you can change this port by changing port in resources > application.properties file.

Once your backend is running locally then you can run frontend app https://github.com/vaibhav50596/SmartGarbageFrontend or you can test
backend with Postman.
