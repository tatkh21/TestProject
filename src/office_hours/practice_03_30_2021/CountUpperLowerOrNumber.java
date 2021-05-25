package office_hours.practice_03_30_2021;
/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4 Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */
public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4 ";
        int upperCase = 0, lowerCase = 0 ,numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            } else if ( eachLetter >= 'a' && eachLetter <= 'z' ) {
                lowerCase++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                numbers++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("numbers = " + numbers);
    }
}
