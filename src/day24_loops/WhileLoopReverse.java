package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 10;

        while (count >= 0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finishad the count");

        int unreadSMS = 10;
        System.out.println("I have " + unreadSMS + "\uD83D\uDCE7" + " unread messages ");

        while (unreadSMS > 0) {
            System.out.println("Reading message " + unreadSMS + " \uD83D\uDCE7 ");
            unreadSMS--;
        }
        System.out.println("No uread messages" + "\uD83D\uDCE7");


    }
}
