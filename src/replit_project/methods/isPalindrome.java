package replit_project.methods;

public class isPalindrome {
    public static void main(String[] args) {
        String str = "Nurses Run";
        System.out.println(palindromeStr(str));
    }
    public static boolean palindromeStr(String check) {
        String newString = check.toLowerCase().replace(" ", "");
        String temp = "";
        for (int i = newString.length() - 1; i >= 0; i--) {
           temp += "" + newString.charAt(i);
        } if (newString.equals(temp)) {
            return true;
        }

        return false;
    }
}
