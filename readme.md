Using  below command we can give the active profile details while running the jar file also. Then if we have mentioned any active profiles inside property file that value will be overriden by this provided value.


java -jar target/spring-boot-profile-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod