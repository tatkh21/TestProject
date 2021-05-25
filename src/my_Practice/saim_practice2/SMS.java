package my_Practice.saim_practice2;

public class SMS {
    public static void main(String[] args) {
        String messageSMS = "Sender:<James Bond>.From Number:[202-123-3456].+" +
                "Message:{\"I love programing and problem solving}\"";
        String sender = messageSMS.substring(messageSMS.indexOf("<")+1,messageSMS.indexOf(">"));
        String number = messageSMS.substring(messageSMS.indexOf("[")+1, messageSMS.indexOf("]"));
        String message = messageSMS.substring(messageSMS.indexOf("\"")+1, messageSMS.indexOf("}"));
        System.out.println("sender = " + sender);
        System.out.println("number = " + number);
        System.out.println("message = " + message);
        

    }
}
