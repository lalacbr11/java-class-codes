public class ForLoop1
{
   public static void main(String[] args)
   {
      int i; 
      // i is the variable for conditional testing
      // i can be declared and initialized before or inside the for statement
      
      for (i = 0; i < 4; i++)
      {
         System.out.println("i = " + i);
      }
      System.out.println("after loop i = " + i);
      
      int x = 1;
      System.out.println("post increment x = " + (x++) + " x = " + x) // post increment
      x = 1; // reset
      System.out.println(" x = " + x + " pre increment x = " + (++x) ); // pre increment

   }
} 