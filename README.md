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

The assignment is to implement the classes *AddressInput* and *OutputCoordinates*, where the former should provide functionality for inserting an address, and the latter should get the output from the *Processor* class and provide functionality for exporting the results. Once that is done, create the snapshot jar file of your project (please see the next section).

Please see the class diagram below (or alternatively click [this link](https://github.com/sebivenlo/java-modularity-migration/blob/master/img/) for the files):
![Geocoder class diagram](https://github.com/sebivenlo/java-modularity-migration/blob/master/img/Class%20Diagram1.png "Nothing to see here..")

### Creating a snapshot jar of your Maven project
To create a snapshot of your project, browse to your project directory and simply enter the following command:
```shell
mvn package
```

### Adding a local Maven dependency to your project
To get a a local jar to become a Maven dependency, it has to be installed into the local .m2 repository on your PC. To do this, open your terminal/cmd, navigate to the directory where your snapshot jar file resides, and insert the following command: <br />
```shell
mvn install
```

***

## TransportOrm
With the introduction of modules in Java 9, the use of services has become very powerful. This small exercise is aimed at getting you familiar with its structure. To get started first get the projects contained in the "transportorm" folder. In there, we will *provide* (pun not initially intended...) you with a base project and a JSON file containing vehicles. the purpose is to create providers for every unique vehicle type, a simple print line or so will suffice for this exercise.

Start out with defining the service in the "admin" module. Once that has been done, continue by implementing the providers in the "serviceimpl" module. 

![Service structure](https://github.com/sebivenlo/java-modularity-migration/blob/master/img/Servicesample.PNG "Service sample")

Once the providers have been correctly implemented, checkout the module user project as well. In here you will be implementing the consumer module, where it should find a specific service and make use of its functionality in your own creative way.

## Troubleshooting 
This chapter provides potential solutions for solving problems we had during development/installation

* [Directory of Java is invalid on Windows](https://stackoverflow.com/questions/1184056/unable-to-install-maven-on-windows-java-home-is-set-to-an-invalid-directory)
* [Installing a local maven dependency](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html)
* [Setting javac target release](https://stackoverflow.com/questions/12900373/idea-javac-source-release-1-7-requires-target-release-1-7/12900859#12900859) Settings can be openend using CTRL+ALT+S
* If java 9 keywords (such as module) do not work, try checking the project's JDK version using CTRL+SHIFT+ALT+S.
