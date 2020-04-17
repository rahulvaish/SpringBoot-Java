package com.scheduling.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling; 

@SpringBootApplication 
@EnableScheduling
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
/* ON RUNNING THIS APP:
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2020-04-17 12:19:34.634  INFO 12192 --- [           main] c.s.rest.SpringBootDemoApplication       : Starting SpringBootDemoApplication on VAISH with PID 12192 (D:\SPRING_workspace\SpringBootScheduling\target\classes started by Lenovo in D:\SPRING_workspace\SpringBootScheduling)
2020-04-17 12:19:34.634  INFO 12192 --- [           main] c.s.rest.SpringBootDemoApplication       : No active profile set, falling back to default profiles: default
2020-04-17 12:19:34.686  INFO 12192 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6f3b5d16: startup date [Fri Apr 17 12:19:34 IST 2020]; root of context hierarchy
2020-04-17 12:19:35.632  INFO 12192 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8473 (http)
2020-04-17 12:19:35.652  INFO 12192 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-04-17 12:19:35.652  INFO 12192 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.34
2020-04-17 12:19:35.656  INFO 12192 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_31\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Program Files/Java/jre1.8.0_31/bin/server;C:/Program Files/Java/jre1.8.0_31/bin;C:/Program Files/Java/jre1.8.0_31/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Tesseract-OCR;E:\SetUps\apache-maven-3.5.3\bin;C:\Program Files\Git\cmd;C:\Program Files\TortoiseGit\bin;C:\WINDOWS\System32\OpenSSH\;C:\Users\Lenovo\AppData\Roaming\Python\Python36\Scripts;C:\Program Files\Git LFS;C:\Program Files (x86)\Windows Kits\8.1\Windows Performance Toolkit\;E:\SetUps\Kubernetes;C:\cygwin64\bin;C:\Program Files\nodejs\;E:\SetUps\OSE-CLI;E:\SetUps\spark-2.4.1-bin-hadoop2.7\bin;C:\Program Files (x86)\sbt\bin;C:\Program Files\Java\jdk1.8.0_31\bin;C:\Program Files (x86)\scala\bin;E:\SetUps\minishift-1.33.0-windows-amd64;;C:\Program Files\GitLFS;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Users\Lenovo\AppData\Local\Programs\Python\Python37\Scripts\;C:\Users\Lenovo\AppData\Local\Programs\Python\Python37\;C:\Users\Lenovo\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Docker Toolbox;E:\SetUps\Kubernetes;C:\cygwin64\bin;C:\Users\Lenovo\AppData\Roaming\npm;C:\Users\Lenovo\AppData\Local\Programs\Microsoft VS Code\bin;E:\SetUps\OSE-CLI;E:\SetUps\spark-2.4.1-bin-hadoop2.7\bin;C:\Program Files\Java\jdk1.8.0_31\bin;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\bin;;E:\SetUps\minishift-1.33.0-windows-amd64;;E:\SetUps\STS\sts-bundle\sts-3.9.4.RELEASE;;.]
2020-04-17 12:19:35.739  INFO 12192 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-04-17 12:19:35.739  INFO 12192 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1057 ms
2020-04-17 12:19:35.808  INFO 12192 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2020-04-17 12:19:35.812  INFO 12192 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2020-04-17 12:19:35.812  INFO 12192 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2020-04-17 12:19:35.813  INFO 12192 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2020-04-17 12:19:35.813  INFO 12192 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]*/
//2020-04-17 12:19:35.906  INFO 12192 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
/*2020-04-17 12:19:36.114  INFO 12192 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6f3b5d16: startup date [Fri Apr 17 12:19:34 IST 2020]; root of context hierarchy
2020-04-17 12:19:36.162  INFO 12192 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/name/],methods=[GET]}" onto public java.lang.String com.scheduling.rest.controller.MyController.getName()
2020-04-17 12:19:36.168  INFO 12192 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2020-04-17 12:19:36.168  INFO 12192 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2020-04-17 12:19:36.192  INFO 12192 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2020-04-17 12:19:36.193  INFO 12192 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2020-04-17 12:19:36.322  INFO 12192 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2020-04-17 12:19:36.337  INFO 12192 --- [           main] s.a.ScheduledAnnotationBeanPostProcessor : No TaskScheduler/ScheduledExecutorService bean found for scheduled processing
2020-04-17 12:19:36.374  INFO 12192 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8473 (http) with context path ''
2020-04-17 12:19:36.378  INFO 12192 --- [           main] c.s.rest.SpringBootDemoApplication       : Started SpringBootDemoApplication in 2.018 seconds (JVM running for 2.787)
Current time is :: Fri Apr 17 12:19:36 IST 2020
Current time is :: Fri Apr 17 12:19:37 IST 2020
Current time is :: Fri Apr 17 12:19:38 IST 2020
Current time is :: Fri Apr 17 12:19:39 IST 2020
Current time is :: Fri Apr 17 12:19:40 IST 2020
Current time is :: Fri Apr 17 12:19:41 IST 2020
Current time is :: Fri Apr 17 12:19:42 IST 2020
Current time is :: Fri Apr 17 12:19:43 IST 2020
Current time is :: Fri Apr 17 12:19:44 IST 2020
Current time is :: Fri Apr 17 12:19:45 IST 2020
Current time is :: Fri Apr 17 12:19:46 IST 2020
Current time is :: Fri Apr 17 12:19:47 IST 2020
Current time is :: Fri Apr 17 12:19:48 IST 2020
Current time is :: Fri Apr 17 12:19:49 IST 2020
Current time is :: Fri Apr 17 12:19:50 IST 2020
Current time is :: Fri Apr 17 12:19:51 IST 2020
*/