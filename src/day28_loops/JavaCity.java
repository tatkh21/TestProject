package day28_loops;

public class JavaCity {
    public static void main(String[] args) {
        //loop day = 1 till day 30
        int totalCases = 0;
        for (int day = 1; day <= 30; day++ ) {
            if (day % 7 == 0) {
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("Day " + day + " | total cases : " + totalCases);

            }
        System.out.println("JavaCity 11/2021 Total Cases: " + totalCases);

        }
    }

