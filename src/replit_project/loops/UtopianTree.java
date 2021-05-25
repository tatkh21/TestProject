package replit_project.loops;

public class UtopianTree {
    public static void main(String[] args) {
        int growth = 0;

        for(int year = 1; year <= 10; year++) {
            if(year >= 4 )  {
                int cantimitersLastYears = 2;
                growth+= cantimitersLastYears;
                System.out.println("year " + year + " - growth " + cantimitersLastYears + "cm");
                System.out.println("tree size: " + growth + " cm");
            } else {
                int cantimitersFirstyears = 1;
                growth += cantimitersFirstyears;
                System.out.println("year " + year + " - growth " + cantimitersFirstyears + "cm");
                System.out.println("tree size: " + growth + " cm");
            }



        }
    }
}
