package day26_loop_practice;

public class multiplication {
    public static void main(String[] args) {
        //



        int num = 11;
        int result = 0;
        if (num < 1 || num > 10){
            System.out.println("ERROR: invalid input");
            return;
        }

        for (int i = 1; i<= 10; i++ ){
            if (num < 1 || num > 10){
                System.out.println("ERROR: invalid input");
                return;
            }
            result = num * i;
            System.out.println(num + " x " + i + " = "+ result);
        }
    }

}
