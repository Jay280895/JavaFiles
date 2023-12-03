package classes;

public class numberReverse {
    public void number_Reverse(int Number ){
        int first_digit = Number%10;
        int second_digit = (Number/10)%10;
        int third_digit = (Number/100)%10;
        int fourth_digit = (Number/1000)%10;
        int new_number = (first_digit*1000)+(second_digit*100)+(third_digit*10)+(fourth_digit*1);
        System.out.println(new_number);

    }
}

