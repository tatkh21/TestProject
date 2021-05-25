package my_Practice.string_practice;

public class Message {
    public static void main(String[] args) {
        String message = "Hello, today is a beautiful day!";
        if (message.toLowerCase().contains("idiot") || message.toLowerCase().contains("dumb")
                || message.toLowerCase().contains("heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message send");
        }
    }
}
