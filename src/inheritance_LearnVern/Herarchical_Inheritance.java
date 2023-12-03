package inheritance_LearnVern;

public class Herarchical_Inheritance
{
	public static void main(String [] args)
	{
		Person pr = new Person();                        //for person class Object
		CollegeStudent cs = new CollegeStudent();       //for College Student class Object
		EmployeeDetails em = new EmployeeDetails();    //for Employee Class Object
		
		
		//for person class Objects Parameters
		pr.setPerson
		("Mohd Zaid", (9311295436L), "mohdjaid9311@gmail.com","Votar ID No. 3927451047");
		
		//for College Student class Objects Parameters
		cs.setCollegeStudent
		("Vasim Ali", (7289935881L), "vsali9891@gmail.com", "Student ID No. DPS5375H", 84, "Science Side : Pharmacy", "2rd Year");
		
		//for Employee Class Objects Parameters
		em.setEmployeeDetails
		("Sadiq", (8587938177L), "sadiqchoudhary@gmail.com", "Employee ID No. ITSEC5344T", "Create Applications & Coding", 45000D, "B.sc Computer Science");
		
		
		
		System.out.println("For Person.........!\n");
		pr.printPerson();
		
		System.out.println("\n\nFor College Student........!\n");
		cs.printCollegeStudent();
		
		
		System.out.println("\n\nFor Employee Details........!");
		em.printEmployeeDetails();
		
	}
}

class Person
{
	
	protected String name;
	protected long contact;
	protected String mail;
	protected String Id;
	
	public void setPerson(String name, long contact, String mail, String Id)
	{
		this.name = name;
		this.contact = contact;
		this.mail = mail;
		this.Id = Id;
	}
	public void printPerson()
	{
		System.out.println("The Name   : "+name);
		System.out.println("Contact No : "+contact);
		System.out.println("E-Mail ID  : "+mail);
		System.out.println("I'd Card   : "+Id);
	}
	
}


class CollegeStudent extends Person
{
	protected int rollNo;
	protected String stream;
	protected String year;
	
	public void setCollegeStudent
	(String name, long contact, String mail, String Id, int rollNo, String stream, String year)
	{
		setPerson(name, contact, mail, Id);
		this.rollNo = rollNo;
		this.stream = stream;
		this.year = year;
	}
	public void printCollegeStudent()
	{
		printPerson();
		System.out.println("The Salary Of the Student: 56000 ");
		System.out.println("The Roll No of Student   : "+rollNo);
		System.out.println("The Stream of Student    : "+stream);
		System.out.println("The Current Year Student : "+year);
	}
}


class EmployeeDetails extends Person{
	protected String work;
	protected double salary;
	protected String education;
	
	public void setEmployeeDetails
	(String name, long contact, String mail, String Id, String work, double salary, String education)
	{
		setPerson(name, contact, mail, Id);
		this.work = work;
		this.salary = salary;
		this.education = education;
	}
	
	public void printEmployeeDetails()
	{
		printPerson();
		System.out.println("The Work of Employee   : "+work);
		System.out.println("The Salary of Employee : "+salary);
		System.out.println("The Education of Employee : "+education);
	}
	
}




