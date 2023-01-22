### conclusion
> by using web.xml we configure servlet container and run the application easy to understand


## Dependencies

```xml
<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.inject</groupId>
			<artifactId>jersey-hk2</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			<artifactId>jersey-container-servlet</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-server</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-common</artifactId>
			<version>3.0.8</version>
		</dependency>
	</dependencies>
```

## Web.xml config

```java
<web-app>

	<display-name>Archetype Created Web Application</display-name>

	<servlet>
		<servlet-name>jersey</servlet-name>
		<servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>

		<init-param>
			<param-name>jersey.config.server.provider.packages</param-name>
			<param-value>com.lavesh.randomotpgenerator</param-value>
		</init-param>

		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>jersey</servlet-name>
		<url-pattern>/api/*</url-pattern>

	</servlet-mapping>
</web-app>
```

## class

```java
package com.lavesh.randomotpgenerator;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/generator")
public class GenerateOtp {

	@GET
	@Produces("text/plain")
	public double get(@QueryParam("num") int num) {

		return new SecureRandom().nextDouble() * 100;
	}
}


```
## url

```url
http://localhost:8080/1_optgenerator/api/generator?num=100
```
