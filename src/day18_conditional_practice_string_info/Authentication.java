package day18_conditional_practice_string_info;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1377;
        String pinCode = "2234";

        int expected4SSN = 2377;
        String expectedCode = "1234";

//        if (last4SSN == expected4SSN && pinCode == expectedCode){
//            System.out.println("authentication is successful");
//        } else if (last4SSN != expected4SSN){
//            System.out.println("Last 4 digits of SSN are not correct ");
//        } else if (pinCode != expectedCode) {
//            System.out.println("Your pincode is not correct");
//        }

        if (last4SSN == expected4SSN && pinCode == expectedCode) {
            System.out.println("authentication is successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expected4SSN) {
                System.out.println("Last 4 SSN number is incorrect ");
            }
            if (expectedCode != pinCode) {
                System.out.println("Pin code is incorrect");
            }
        }


    }
}
