package day34_methods;

public class FirstMethods {
    public static void main(String[] args) {
        displayMessage();//1st call the methods
        displayMessage();//2nd call the methods
        for ( int i = 1; i <= 100; i++) {
            displayMessage();
        }

    }
    //first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");
    }
}
