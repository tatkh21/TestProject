package day23_string_manipulation_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] from Number<222-333-4444> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);
        System.out.println("sender = " + sender);
        sender = sender.trim();// removes extra spaces

        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());// will remove all spases


    }
}
