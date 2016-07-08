package com.michaelhoffmaninc.microservice.example;

/**
 * DTO object returned from the backend service.
 * 
 * @author Michael Hoffman
 *
 */
public class BackendDTO {

   private String greeting;
   private long time;
   private String ip;

   public BackendDTO() {
      super();
   }

   public BackendDTO(String greeting, long time, String ip) {
      super();
      this.greeting = greeting;
      this.time = time;
      this.ip = ip;
   }

   /**
    * @return the greeting
    */
   public String getGreeting() {
      return greeting;
   }

   /**
    * @param greeting
    *           the greeting to set
    */
   public void setGreeting(String greeting) {
      this.greeting = greeting;
   }

   /**
    * @return the time
    */
   public long getTime() {
      return time;
   }

   /**
    * @param time
    *           the time to set
    */
   public void setTime(long time) {
      this.time = time;
   }

   /**
    * @return the ip
    */
   public String getIp() {
      return ip;
   }

   /**
    * @param ip
    *           the ip to set
    */
   public void setIp(String ip) {
      this.ip = ip;
   }

}
