package inheritance_LearnVern;

public class Inherit {
    public static void main(String[] args) {
        // Person_Clone object is not used, consider removing this line if not needed
        // Persons pr = new Persons();

        CollegeStudents cs = new CollegeStudents();
        EmployeeDeetails em = new EmployeeDeetails();

        cs.setCollegeStudents("Vasim Ali", (7289935881L), "vsali9891@gmail.com", "Student ID No. DPS5375H", 84,
                "Science Side : Pharmacy", "2rd Year");

        em.setEmployeeDeetails("Sadiq", (8587938177L), "sadiqchoudhary@gmail.com", "Employee ID No. ITSEC5344T", "Create Applications & Coding", 45000D, "B.sc Computer Science");

        System.out.println("For College Student........!\n");
        cs.printCollegeStudents();

        System.out.println("\n\nFor Employee Details........!");
        em.printEmployeeDeetails();
    }
}

class Persons {
    protected String name;
    protected long contact;
    protected String mail;
    protected String Id;

    public void setPersons(String name, long contact, String mail, String Id) {
        this.name = name;
        this.contact = contact;
        this.mail = mail;
        this.Id = Id;
    }

    public void printPersons() {
        System.out.println("The Name   : " + name);
        System.out.println("Contact No : " + contact);
        System.out.println("E-Mail ID  : " + mail);
        System.out.println("I'd Card   : " + Id);
    }
}

class CollegeStudents extends Persons {
    protected int rollNo;
    protected String stream;
    protected String year;

    public void setCollegeStudents(String name, long contact, String mail, String Id, int rollNo, String stream,
            String year) {
        setPersons(name, contact, mail, Id);
        this.rollNo = rollNo;
        this.stream = stream;
        this.year = year;
    }

    public void printCollegeStudents() {
        printPersons();
        System.out.println("The Roll No of Student   : " + rollNo);
        System.out.println("The Stream of Student    : " + stream);
        System.out.println("The Current Year Student : " + year);
    }
}

class EmployeeDeetails extends Persons {
    protected String work;
    protected double salary;
    protected String education;

    public void setEmployeeDeetails(String name, long contact, String mail, String Id, String work, double salary, String education)
    {
        setPersons(name, contact, mail, Id);
        this.work = work;
        this.salary = salary;
        this.education = education;
    }

    public void printEmployeeDeetails() {
        printPersons();
        System.out.println("The Work of Employee   : " + work);
        System.out.println("The Salary of Employee : " + salary);
        System.out.println("The Education of Employee : " + education);
    }
}




/*
 * Initialization Order: In the setEmployeeDetails method of the EmployeeDetails
 * class, you are calling printPerson() before actually setting the values for
 * name, contact, mail, and Id. This will result in printing default or
 * uninitialized values. You should call setPerson first to set these values and
 * then print the details.
 * 
 * Unused Objects: In the main method, you are creating objects of Person_Clone,
 * CollegeStudent, and EmployeeDetails, but the Person_Clone object pr is not being
 * used. If it's not necessary, you might want to remove that line.
 */