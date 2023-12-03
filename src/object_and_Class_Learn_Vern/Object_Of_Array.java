package object_and_Class_Learn_Vern;

import java.util.Scanner;

class Employee{
	
	private String name;
	private int empId;
	private float salary;
	
	public void setEmployee(String Nm, int ID, float sal )
	{
		name = Nm;
		empId = ID;
		salary = sal;
	}
	
	public void printEmployee() {
		System.out.println("Name : "+name+" Employee ID : "+empId+" Salary : "+salary);
	}
	
	public float getSalary() {
		return salary;
	}
	
}
public class Object_Of_Array {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String [] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your n Num Value : ");
		int n = sc.nextInt();
		
		Employee EMP[];
		EMP = new Employee[n];
	
		for(int i=0; i<n; i++) {
			EMP[i] = new Employee();
			EMP[i].setEmployee("Name"+(i+10),i+1,10000*(i+1));
		}
		for(int i=0; i<n; i++) {
			//EMP[i].printEmployee();
			for(int j=0; j<n; j++) {
				if(EMP[i].getSalary()< 15000) {
					System.out.println(i+1+".Bonuc is 3000 ");
					EMP[i].printEmployee();
					break;
				}
				else {
					System.out.println(i+1+".Bonuc is 1000");
					EMP[i].printEmployee();
					break;
				}
			}
			//EMP[i].printEmployee();
			
		}
		/*for(int i=0; i<n; i++) {
			if(EMP[i].getSalary()< 15000) {
				System.out.println(i+1+".Bonuc is 3000 "+EMP[i].getSalary());
				EMP[i].printEmployee();
				break;
			}
			else {
				System.out.println(i+1+".Bonuc is 1000");
				EMP[i].printEmployee();
				break;
			}
		}*/
		
	}

}
