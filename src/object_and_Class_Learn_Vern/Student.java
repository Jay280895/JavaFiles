package object_and_Class_Learn_Vern;


public class Student
{
	
	int rollNum;
	String name;
	float marks;
	

	
	void setRollNumber(int RN)
	{
		rollNum = RN;
	}
	int getRollNumber()
	{
		return rollNum;
	}
	
	
	
	void setNameOfStudent(String NM)
	{
		name = NM;
	}
	String getNameOfStudent()
	{
		return name;
	}
	
	
	
	void setMarks(float MK)
	{
		marks = MK;
	}
	float getMarks()
	{
		return marks;
	}
	
	
	//main method 
	public static void main(String [] args) {
		
		Student Details = new Student();
		Student Std[];
		Std = new Student[3];
		for(int i=0; i<3; i++) {
			Std[i] = new Student();
			System.out.println(i);
		}
		
		Details.setRollNumber(786);
		Details.setNameOfStudent("Mohd Jaid");
		Details.setMarks((float) 83.58);
		
		
		System.out.println("The Name is : "+Details.getNameOfStudent());
		System.out.println("The Roll No is : "+ Details.getRollNumber());
		System.out.println("The Total Marks : "+ Details.getMarks()+"%");
		
		
		/*
		 int i=1, n=5;
		 
		 do { System.out.println("The Name is : "+Details.getNameOfStudent());
		 System.out.println("The Roll No is : "+ Details.getRollNumber());
		 System.out.println("The Total Marks : "+ Details.getMarks()+"%"); break; }
		 while (i<=n );
		 */

	}
	
}


