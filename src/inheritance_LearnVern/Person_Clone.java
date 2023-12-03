package inheritance_LearnVern;

class PersonNew implements Cloneable {
    protected String name;
    protected int age;

    // Constructor
    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    public String GetName() {
        return name;
    }

    public int GetAge() {
        return age;
    }

    // Override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Person_Clone {
    public static void main(String[] args) {
        PersonNew person1 = new PersonNew("John", 35);

        try {
            // Using clone() method to create a copy
            PersonNew person2 = (PersonNew) person1.clone();
            
            //Clone But Change the values
            person2.age = 12;
            person2.name = "Simba";
            
            // Outputting details of both persons
            System.out.println("Person 1 Name : " + person1.GetName() + ", Age " + person1.GetAge());
            System.out.println("Person 2 Name : " + person2.GetName() + ", Age " + person2.GetAge());
        } catch (CloneNotSupportedException e) {
           // e.printStackTrace();
        	System.out.println(e);
        }
    }

	
}



