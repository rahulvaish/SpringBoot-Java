### Important Points:

Step#1: Build (Clean & Install) the project.

Step#2: Notice index.html is created. Launch the file.

<img width="566" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/41b4fd15-9df9-4654-821e-783d110b56df">

The html displays the code coverage as below:
<img width="1161" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/7ddfe8e3-c5dc-4db5-be3c-3eafc828e94d">

Note: In the pom.xml we have mentioned the minimul limit(in %) of code coverage. If the minimum limit is not met, then the build fails.

### Integration with SonarQube:

Step#1: Download Sonar (Community Edition)

Step#2: Update pom.xml with sonar-maven-plugin

Step#3: Start Sonar
<img width="1224" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/aaf8cecb-8856-401c-beb5-8c16f456d3d1">

Step#4: Login Sonar with the default login id as **admin** and password as **admin**. Change the password later.

Step#5: Form IJ's Terminal execute
```
mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=root
```
<img width="1538" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/bbbe04ba-d381-41dc-8bf1-d15e3e041bac">

Step#6: Launch Sonar
<img width="1728" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/11c2aad9-07dd-4e85-930d-51d99f51830a">

