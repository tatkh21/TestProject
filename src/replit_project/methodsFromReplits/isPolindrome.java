package replit_project.methodsFromReplits;

public class isPolindrome {
    public static void main(String[] args) {
        int num = 101;
        isPalindrome(num);
    }
    public static void isPalindrome(int num) {
        int reversedNum = 0;
        int temp = num;
        while(temp != 0) {
           reversedNum = (reversedNum*10) + temp % 10;
           temp/=10;
        }
        if (reversedNum==num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
