// DebugBox.java
public class DebugBox
{
   private int width;
   private int length;
   private int height;

   // Default constructor
   public DebugBox()
   {
      width = 1;
      length = 1;
      height = 1;
   }

   // Constructor with parameters
   public DebugBox(int w, int l, int h)
   {
      width = w;
      length = l;
      height = h;
   }

   public void showData()
   {
      System.out.println("Width: " + width + "  Length: " + length + "  Height: " + height);
   }

   public double getVolume()
   {
      return (double) width * length * height;
   }
}
