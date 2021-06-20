package replit_project.methods;

public class ExtractsNum {
    public static void main(String[] args) {
        String str1 = "aa2a56a3bhy#$$%";
        System.out.println(extractNumber(str1));
    }
    public static String extractNumber(String s) {
        String extrNum = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                extrNum += s.charAt(i);
            }
        }
        return  extrNum;
    }
}
