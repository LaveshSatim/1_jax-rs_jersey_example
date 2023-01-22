
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
