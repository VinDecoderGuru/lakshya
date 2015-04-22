package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vinay.pawar on 4/22/15.
 */
@Path("hello")
public class HelloWorld {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "hi there";
    }
}
