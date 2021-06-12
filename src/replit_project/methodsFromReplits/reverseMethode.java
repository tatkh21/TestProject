package replit_project.methodsFromReplits;

public class reverseMethode {

    public static void main(String[] args) {
        String  a = "student";
        System.out.println(reverse(a));

    }

    public static String reverse(String input) {
        String reverseStr = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverseStr += input.charAt(i);
        }
        return reverseStr;


    }

}
