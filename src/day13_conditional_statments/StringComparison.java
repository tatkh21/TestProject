package day13_conditional_statments;

public class StringComparison {
    public static void main(String[] args) {
        String city = "LA";
        if (city.equals("Houston")) {
            System.out.println("You are in Houston");
        } else {
            System.out.println("You are not in Houston");
        }
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("Let's go outside!");
        } else {
            System.out.println("Let's code Java!");
        }
    }
}
