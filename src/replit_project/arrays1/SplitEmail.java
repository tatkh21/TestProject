package replit_project.arrays1;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "info_cybertek_school.com";
        char[] letters = email.toCharArray();
        String[] emailArr = email.split("@");
        int count = 0;
        for (char each :letters ) {
            if (each == '@') {
                count++;
            }
        }
        if (count != 1) {
            System.out.println("invalid email");
        } else {
            System.out.println("Email id: " + emailArr[0]);
            System.out.println("Email domain: " + emailArr[1]);
        }

    }
}
