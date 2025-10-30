// class 10/09/2025

public class Student 
{ 
   private static final int SCHOOL_ID = 12345; 
   private int stuNum;
   private double gpa;
   
   public Student(int stuNum, double gps)
   {
      this.stuNum = stuNum;
      this.gpa = gpa;
      stuNum = 0; 
      gpa = 0;
   }
   public void showStudent()
   { //int stuNum = 999; // local variable. use this. if you want the global variable 
      System.out.println("Student a" + stuNum +
          "gpa is" + gpa);
   }
}