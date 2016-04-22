# IBM Security AppScan Annotations Demo App

In AppScan Source and Static Analyzer we provide support with method-level
annotations. Developers can identify interesting validators, sanitizers and callback methods during code development
and insert these annotations directly into the source code before a scan is done;
or they can be added after a scan during remediation to achieve the desired effect.

# Prerequisites

- A local installation of IBM Security AppScan Source.

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
