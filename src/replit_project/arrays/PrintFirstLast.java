package replit_project.arrays;

public class PrintFirstLast {
    public static void main(String[] args) {
        String [] str = {"hello", "why", "by", "apple" , "note"};
        String temp = "";
        for (int i = 0; i < str.length; i++){
            temp = new String(str[i]);
            System.out.println("" + temp.charAt(0)+ temp.charAt(temp.length()-1));
        }

    }
}
