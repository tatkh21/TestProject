package day37_methods_overload;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(23,45,5,43,76,23,45);
        addNumbers();
    }
    public static void addNumbers(int... nums) {
        // inside the method, it is used as regular array
        int sum = 0;
        for (int n : nums) {
            sum += n
;        }
        System.out.println("sum = " + sum);
    }
}
