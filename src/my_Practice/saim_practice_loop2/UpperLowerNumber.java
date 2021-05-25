package my_Practice.saim_practice_loop2;

public class UpperLowerNumber {
    public static void main(String[] args) {
        String str = "antr5620DJTeckdiSAg68302";
        int length = str.length();
        int upper = 0;
        int lower = 0;
        int number = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i)<= 'Z'&& str.charAt(i)>='A') {
                upper ++;
            } else if (str.charAt(i)<='z' && str.charAt(i)>='a') {
                lower++;
            } else {
                number++;
            }

        }
        System.out.println("number = " + number);
        System.out.println("lower = " + lower);
        System.out.println("upper = " + upper);
    }
}
