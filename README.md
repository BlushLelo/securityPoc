# Getting Started


## You will need
 * Java 11
 * Keycloak 11.0.1 (use docker or standalone application)



##Endpoints
* In this application we have 3 endpoints 
    ```
    http://localhost:8081/user/{name}   --- End point that need's role USER for use the resource
    http://localhost:8081/batata/{name}  --- End point that need's role BATATA for use the resource
    http://localhost:8081/mundo  --- Free endpoint, anyone can use it
    ```
### Reference Documentation
For further reference, please consider the following sections:

* [Official Keycloak documentation](https://www.keycloak.org/documentation)
* [Spring Boot OAuth 2.0 Resource Server Guide](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#oauth2resourceserver)



