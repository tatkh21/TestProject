package my_Practice.saim_practice2;

public class Initials {
    public static void main(String[] args) {
        String fullName = "james bond";
        String initials = "" + fullName.charAt(0) + fullName.charAt(fullName.indexOf(" ")+ 1);
        System.out.println(initials.toUpperCase());
    }
}
