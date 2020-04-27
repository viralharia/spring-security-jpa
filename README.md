# Spring Boot Security with JPA

A Spring Boot application with Spring Security that demonstrates database authentication using JPA.

We have below 3 endpoints configured for different roles:

`http://localhost:8080/` - for all users

`http://localhost:8080/user` - accessible only for users having 'ROLE_USER' or 'ROLE_ADMIN' role

`http://localhost:8080/admin` - accessible only for users having 'ROLE_ADMIN' role

## Running application locally
```
git clone https://github.com/viralharia/spring-security-jpa.git
cd spring-security-jpa
mvnw spring-boot:run
```

## Dependencies used
* Spring-web
* Spring-security
* Spring-data-jpa
* H2 (Only for dev. For production, respective database driver dependency is required)

## H2 setup
Since we have added, `H2` dependency, SpringBoot will automatically configure the `datasource` for us.
In production env, we will have to configure the datasource.

H2 console can be accessed via - http://localhost:8080/h2-console

#### data.sql & schema.sql
Our schema for `User` table is in - __schema.sql__ file in `resource` folder.
SpringBoot automatically picks it up at the start.

We have inserted test users in the `User` table using __data.sql__ file in `resource` folder.
SpringBoot automatically picks it up at the start.

#### Test users
* ROLE_USER : user, user
* ROLE_ADMIN : admin, admin

P.S - To logout the current user, just hit the url - http://localhost:8080/logout