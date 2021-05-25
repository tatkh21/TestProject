package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /* below is infinite loop
        for(;;){
            System.out.println("Juva is fun!");
           }
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world!");
        }

        //     1)        2)      4)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello world " + i);//3)
        }
        String myStars = "";
        for (int stars = 1; stars <=5; stars++) {

            myStars += "* ";
        }System.out.println("my stars = " + myStars);
    }
}
