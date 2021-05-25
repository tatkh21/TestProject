package office_hours.practice_03_30_2021;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        //str.substring(0,4)
        //str.substrin(1,5)
        //str.substrin(2,6)
        for (int i =0; i < str.length()-3; i++) {
            String eachFourLetters = str.substring(i, i+4);
            if (eachFourLetters.equals("java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
