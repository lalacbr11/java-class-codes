// DebugTrip.java
public class DebugTrip
{
   private String destination;
   private String departureCity;
   private String mode;

   // 1-argument constructor
   public DebugTrip(String destination)
   {
      this.destination = destination;
      this.departureCity = "unknown";
      this.mode = "unknown";
      System.out.println("[Debug] Created trip with 1 argument");
   }

   // 2-argument constructor
   public DebugTrip(String destination, String departureCity)
   {
      this.destination = destination;
      this.departureCity = departureCity;
      this.mode = "unknown";
      System.out.println("[Debug] Created trip with 2 arguments");
   }

   // 3-argument constructor
   public DebugTrip(String destination, String departureCity, String mode)
   {
      this.destination = destination;
      this.departureCity = departureCity;
      this.mode = mode;
      System.out.println("[Debug] Created trip with 3 arguments");
   }

   public String getDestination()
   {
      return destination;
   }

   public String getDepartureCity()
   {
      return departureCity;
   }

   public String getMode()
   {
      return mode;
   }
}
