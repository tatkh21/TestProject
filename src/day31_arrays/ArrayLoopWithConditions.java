package day31_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double [] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};
        System.out.println(countries.length);
        System.out.println("\n--- prices more then 100-------");
        int count = 0;
        for (double n : prices) {
            if (n >= 100) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n--- prices between 10 and 70 ----");

        for (double a : prices ) {
            if (a >= 10 && a <=70) {
                System.out.print(a + " ");
            }
        }
        System.out.println("\n --------count of the prices more than 50-------");
        for (double j : prices) {
            if (j > 50){
                count++;
            }

        }System.out.println(" There are " + count + " items");
        System.out.println("\n --------countries with name more than 7 inclusive ");

        for (String b : countries) {
            if (b.length() >= 7){
                System.out.println(b + ", ");

            }
        }

    }
}
