package com.michaelhoffmaninc.microservice.example;

import org.springframework.boot.context.properties.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;

/**
 * Rest controller to expose an api at /api/greeting.
 * 
 * @author Michael Hoffman
 *
 */
@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix = "greeting")
public class GreeterRestController {

   private String saying;
   private String backendServiceHost;
   private int backendServicePort;
   private RestTemplate restTemplate = new RestTemplate();

   @RequestMapping(value = "/greeting", method = RequestMethod.GET,
         produces = "text/plain")
   public String greeting() {
      String backendServiceUrl = String.format(
            "http://%s:%d/api/backend?greeting={greeting}", backendServiceHost,
            backendServicePort);
      System.out.println(backendServiceUrl);
      BackendDTO response = restTemplate.getForObject(backendServiceUrl, BackendDTO.class,
            saying);
      return response.getGreeting() + " at host: " + response.getIp();
   }

   /**
    * @return the saying
    */
   public String getSaying() {
      return saying;
   }

   /**
    * @param saying
    *           the saying to set
    */
   public void setSaying(String saying) {
      this.saying = saying;
   }

   /**
    * @return the backendServiceHost
    */
   public String getBackendServiceHost() {
      return backendServiceHost;
   }

   /**
    * @param backendServiceHost
    *           the backendServiceHost to set
    */
   public void setBackendServiceHost(String backendServiceHost) {
      this.backendServiceHost = backendServiceHost;
   }

   /**
    * @return the backendServicePort
    */
   public int getBackendServicePort() {
      return backendServicePort;
   }

   /**
    * @param backendServicePort
    *           the backendServicePort to set
    */
   public void setBackendServicePort(int backendServicePort) {
      this.backendServicePort = backendServicePort;
   }

}
