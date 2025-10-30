// DebugPen.java
public class DebugPen
{
   private String color;
   private String point;

   // Default constructor
   public DebugPen()
   {
      color = "black";
      point = "medium";
   }

   // Constructor with parameters
   public DebugPen(String color, String point)
   {
      this.color = color;
      this.point = point;
   }

   // Getter methods
   public String getColor()
   {
      return color;
   }

   public String getPoint()
   {
      return point;
   }

   // Optional setter methods (if you need them later)
   public void setColor(String color)
   {
      this.color = color;
   }

   public void setPoint(String point)
   {
      this.point = point;
   }
}
