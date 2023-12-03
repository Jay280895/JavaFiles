package classes;
public class attendenceCheck {
    public void attendenceChecking ( float attendedDays , float classHeld , char medicalStatus ) {
        float percentAttend = classHeld * 100 / attendedDays;

        if ( percentAttend < 75 ) {
            if ( medicalStatus == 'Y' || medicalStatus == 'y' ) {
                System.out.println ( "Your are eligible to write the Exam " + percentAttend + "%" );
            } else if ( medicalStatus == 'n' || medicalStatus == 'N' ) {
                System.out.println ( "You are not allowed to write Examination " + percentAttend + "%" );
            } else {
                System.out.println ( "Enter the right character in Y/N only" );
            }

        } else {
            System.out.println ( "Your are eligible to write the Exam " + percentAttend + "%" );

        }
    }
}
