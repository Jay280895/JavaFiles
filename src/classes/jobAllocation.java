package classes;

public class jobAllocation {
    public void job_Allocation(char gender, int age,char martialStatus){
        if (gender=='F'||gender=='f'){
            System.out.println ("Female can work in Urban area only");
        } else if ( gender=='M' || gender =='m') {
            if (age>20&& age<40){
                System.out.println ("Youngsters can work anywhere");
            } else if ( age>40 && age<60 ) {
                System.out.println ("Elder can work in Urban area only");
            } else if ( age>60 ) {
                System.out.println ("Error");
            }
        }
    }
}
