package office_hours.practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {
        // charAt(number) -> gives your character
        // indexOf(char) -> gives you a number of character
        String s = "java";
        //          0123
        System.out.println(s.charAt(s.length()));// -1 because no char with index 4 (StringIndexOfOutOfBound)
        System.out.println((s.charAt(s.length()- 1)));
        String upper = "" + s.toUpperCase().charAt(0) + s.charAt(3);
    }
}
