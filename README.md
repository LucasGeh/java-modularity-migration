# Java-Modularity-Migration

This GitHub contains the base and solution projects for the workshop on Java modularity.

## Prerequisites
1. [At least OpenJDK 11](https://jdk.java.net/11/)
2. [An IDE that supports the corresponding Java version (IntelliJ is highly recommended)](https://www.jetbrains.com/idea/download/)
3. Maven-install-plugin version 2.5 or higher

***

## Setting up - Geocoder project
Once installed, please download and open the Geocoder project in your IDE. The goal of the application is to create a simple modular project that does the following things:

* Accept an address as input from the user
* Process the address into coordinates
* Give the coordinates as output

For the processing of the coordinates we'll be making use of the Google Maps API, of which the code will be provided to you. 

### Adding a local Maven dependency to your project
To get a a local jar to become a Maven dependency, it has to be installed into the local .m2 repository on your PC. To do this, open your terminal/cmd, navigate to the directory where your snapshot jar file resides, and insert the following command: <br />
```shell
mvn install
```

***

## Troubleshooting 
This chapter provides external links for solving problems we had during development/installation

* [Directory of Java is invalid on Windows](https://stackoverflow.com/questions/1184056/unable-to-install-maven-on-windows-java-home-is-set-to-an-invalid-directory)
* [Installing a local maven dependency](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html)

![Geocoder class diagram](https://github.com/sebivenlo/java-modularity-migration/blob/master/img/Class%20Diagram1.png "Nothing to see here..")
