package office_hours.practice_03_30_2021;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun. java class today, java";
        int count = 0;
        while (str.contains("java")) {
           count++;
           str = str.replaceFirst("java", "");
        }
        System.out.println("Java was found " + count + " times");
    }
}
