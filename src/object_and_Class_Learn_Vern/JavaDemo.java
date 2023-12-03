package object_and_Class_Learn_Vern;

class JavaDemo
{
   public class Learning {

	}

public static void main(String [] Args)
   {
       Students s = new Students();
       s.setRollNo(74);
       s.setName("Mohd Jaid");
       s.setMarks(95);

       System.out.println("The Name of the Student : " + s.getName());
       System.out.println("The Roll No of  Student : " + s.getRollNo());
      System.out.println("The Marks of the Student : "+s.getMarks());
   }  
}

class Students
{
     private int rollNo ;
     private String name ;
     private float marks;

      public void setRollNo(int RN)
      {
         rollNo = RN;
      }
      public int getRollNo()
      {
         return rollNo;
      }

      public void setName(String NM)
      {
         name = NM;
      }
      public String getName()
      {
         return name;
      }

      public void setMarks(float Mr)
      {
         marks = Mr;
      }
      public float getMarks()
      {
         return marks;
      }

}