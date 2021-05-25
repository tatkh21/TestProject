package my_Practice.saim_practice2;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentense = "Java is a fun language";
        String firstPart = sentense.substring(0, sentense.indexOf(" "));
        String secondPart = sentense.substring(sentense.indexOf(" ")); // sentense.indexOf(sentense.length()-1));
        System.out.println(secondPart +" " + firstPart);


    }
}
