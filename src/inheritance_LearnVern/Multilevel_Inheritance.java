package inheritance_LearnVern;

//Main Method Class
public class Multilevel_Inheritance
{
	public static void main(String [] args)
	{
		Employees em = new Employees(); 
		FullTimeEmployee ftm = new FullTimeEmployee();
		Manager mg = new Manager();
		
		
		em.setEmployees("Sameer","CPUPJ6344F", "Owner Of The Company\n");
		ftm.setFullTimeEmployee("Zameer","DDLJP5473P", 7483D, "Employee\n");
		mg.setManager("Hement Shah", "UPDL4727A", 10000D, "Orders to Employees And Manage The Work", 500, "Manager");
		
		em.printEmployees();
		ftm.printFullTimeEmployee();
		mg.printManager();
	}
		  
}


// Class A 
class Employees 
{
	protected String empId; 
	protected String empName;
	protected String position;
	public void setEmployees(String empName, String empId, String position)
	{
		this.empId = empId;
		this.empName = empName;
		this.position = position;
	}
	public void printEmployees()
	{
		System.out.println("ID : " + this.empId);
		System.out.println("Name : " + this.empName);
		System.out.println("Position : "+this.position);
	}
}

//Class B Inherit Class A 
class FullTimeEmployee extends Employees
{
	protected Double salary;
	
	public void setFullTimeEmployee(String empName, String empId, Double salary, String position)
	{
		setEmployees(empId, empName, position);
		this.salary = salary;
	}
	
	
	public void printFullTimeEmployee()
	{
		//printEmployee(); or this 
		
		System.out.println("ID : " + this.empId);
		System.out.println("Name : " + this.empName);
		System.out.println("Salary : "+this.salary);
		System.out.println("Position : "+this.position);
	}
	
}


//Class C Inherit Class B

class Manager extends FullTimeEmployee
{
	protected String Work;
	protected int ManageEmployees;
	
	public void setManager(String empName, String empId, Double salary, String Work, int ManageEmployees, String position)
	{
		setFullTimeEmployee(empId, empName, salary, position);
		this.Work = Work;
		this.ManageEmployees = ManageEmployees;
	}
	
	public void printManager()
	{
		{
		//printFullTimeEmployee(); this
			
		//or this
		System.out.println("ID : " + this.empId);
		System.out.println("Name : " + this.empName);
		System.out.println("Salary : "+this.salary);
		System.out.println("Position : "+this.position);
		}
		
		System.out.println("The Work of the Manager : " + this.Work);
		System.out.println("How Many Employees Work in Under Manager : " + this.ManageEmployees);
	}
}
