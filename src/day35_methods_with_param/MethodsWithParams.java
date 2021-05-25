package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(7);
        displayValue(10);
        int count = 55;
        displayValue(count);
        greetByName("Tatyana");
        greetByName("Dauren");
        String name = "Suleyman";
        greetByName("Suleyman");

    }
    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }

    public static void displayValue(int num) {
        System.out.println("Value is " + num);
    }
}
