# nosql-starters
Nosql starters provide babe bones code setup for MongoDB with Java and Spring Boot coding. Conquer datalayer.


## Install dependencies
JDK >= 11.x

Maven 3.8.6

IDE like Eclipse or IntelliJ IDEA. Set JAVA_HOME and M2_HOME environment variables.

## How to run

Check out repo using git.

### Run nosql-starter-java

Go to directory nosql-starter-java

``` java
//make mongodb connection changes in MongoConfig.java
//private String uri="mongodb://nosqlfree:vQ6ZbFmv5@x.x.x.x:27017/?authSource=admin";
//build fat jar
mvn clean package

//run from command line using fat jar
java -jar target/nosql-starter-java-0.0.1-jar-with-dependencies.jar
``` 

### Run nosql-starter-spring boot

Go to directory nosql-starter-springboot

``` java
//make mongodb connection changes in application.properties
//build project
mvn clean package

//run from command
java -jar target/nosql-starter-springboot-1.0-SNAPSHOT.jar

```

## ?? Links
[Datalayer](https://datalayer.in/)

## Contributing
Pull requests are welcome. For major changes, please open an issue.

## License
[MIT](https://choosealicense.com/licenses/mit/)