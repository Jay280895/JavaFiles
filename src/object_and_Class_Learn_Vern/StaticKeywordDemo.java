package object_and_Class_Learn_Vern;

class NewStudent{
	int rollNo;
	static int passingMarks;
	String name;
	float marks;
	
	public static void setPassingMarks(int pm) {
		passingMarks = pm;
	}
	
	public void StudentDetails(String name, int rollNo, float marks) {
		this.name   = name;
		this.rollNo = rollNo;
		this.marks  = marks;
	}
	
	public void display() {
		System.out.println("The Name is : "+name);
		System.out.println("Roll Number : "+rollNo);
		System.out.println("The Marks   : "+marks);
		if(marks < passingMarks) {
			System.err.println("Student Grade is : Failed\n");
		}
		else {
			System.out.println("Student Grade is : passed\n");
		}
	}
	
}

public class StaticKeywordDemo {
	@SuppressWarnings("unused")
	public static  void main(String [] args) {
		NewStudent.setPassingMarks(33);  //call the static method 
		
		NewStudent sd  = new NewStudent();
		NewStudent sd0 = new NewStudent();
		NewStudent sd1 = new NewStudent();
		NewStudent sd2 = new NewStudent();
		NewStudent sd3 = new NewStudent();
		NewStudent sd4 = new NewStudent();
		NewStudent sd5 = new NewStudent();
		
		sd0.StudentDetails("Sam",12,45.7f);
		sd1.StudentDetails("Ram",36,32.9f);
		sd2.StudentDetails("Ban",23,33f);
		sd3.StudentDetails("Fam",42,24f);
		sd4.StudentDetails("Jam",51,55f);
		sd5.StudentDetails("Wen",01,20f);
		
		sd0.display();
		sd1.display();
		sd2.display();
		sd3.display();
		sd4.display();
		sd5.display();
		
	}
	
}
