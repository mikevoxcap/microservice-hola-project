package com.michaelhoffmaninc.microservice.example;

import java.net.*;

import org.springframework.boot.context.properties.*;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller to expose an api at /api/hola.
 * 
 * @author Michael Hoffman
 *
 */
@RestController
@RequestMapping("/api-hello")
@ConfigurationProperties(prefix = "helloapp")
public class HolaRestController {

   // Spring Boot will take the value from configuration properties and use it
   // here.
   private String saying;

   @RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
   public String hola() {
      String hostName = "";
      try {
         hostName = InetAddress.getLocalHost().getHostAddress();
      } catch (Exception e) {
         hostName = "unknown";
      }
      return saying + " " + hostName;
   }

   public String getSaying() {
      return saying;
   }

   public void setSaying(String saying) {
      this.saying = saying;
   }
}
