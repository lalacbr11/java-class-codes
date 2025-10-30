// Class 10/30/25
// This program displays the current time (hour, minute, second)
// in real time using LocalDateTime and updates every second.

// class 10/30/25

import java.time.*;
public class clock 
{ 
   public static void main(String[] args)
   {
      LocalDateTime now; 
      int nowSec;
      int prevSec = 0;
      for (;;)
      {
         now = LocalDateTime.now();
         nowSec = now.getSecond();
         if(nowSec != prevSec)
         {
            System.out.println(now.getHour() + " : " + 
               now.getMinute() + " : " + nowSec);
            prevSec = nowSec;
         }
      }
   }
}
