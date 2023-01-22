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
