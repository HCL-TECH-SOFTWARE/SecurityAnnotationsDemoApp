# IBM Security AppScan Annotations Demo App

In AppScan Source and Static Analyzer we provide support with method-level
annotations. Developers can identify interesting validators, sanitizers and callback methods during code development
and insert these annotations directly into the source code before a scan is done;
or they can be added after a scan during remediation to achieve the desired effect.

# Prerequisites

- A local installation of IBM Security AppScan Source. (Version 9.0.3)
- The lastest version of Gradle installed (Gradle 2.13)
- You will need to set up a system variable known as "SECANNOTATIONS" in order to
run the gradle build script properly. 

In order to do this with a windows system you need to create an environmental variable within the command prompt. Simply type 'setx SECANNOTATIONS "AppScan Source install location"'. After this your gradle build script should run with no issues.

In order to do this with a UNIX system you need to create an environmental variable within the terminal. Simply type "SECANNOTATIONS=" followed by the file path to the install location of Appscan Source. After this is input type "export SECANNOTATIONS". After this your gradle build script should run with no issues. 

# Dependencies

This demo app depends on the following packages: 

* javax:javaee-api:6.0
* org.hibernate:hibernate-core:4.0.1.Final
* org.hibernate:hibernate-validator:4.2.0.Final
* org.ow2.jonas.osgi:springframework:5.1.0-M1
* org.springframework:spring-web:3.1.0.RELEASE
* commons-lang:commons-lang:2.1
* org.apache.derby:derby:10.8.2.2

# License

All files found in this project are licensed under the [Apache License Version 2.0](LICENSE).
