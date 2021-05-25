package replit_project.loops;

public class Loop1 {
    public static void main(String[] args) {
        int apples = 1;
        while(apples < 10 ){
        //System.out.println("eating apple " + apples);
        apples++;
        }
        System.out.println("No more apples");

        int num = 2, count = 1;
        while (count < 10) {
            System.out.println(num + " * " + count + " = " + num*count);
            count++;
        }
    }
}
