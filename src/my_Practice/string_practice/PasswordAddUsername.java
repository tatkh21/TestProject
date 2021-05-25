package my_Practice.string_practice;

public class PasswordAddUsername {
    public static void main(String[] args) {
        String username = "jamesbond";
        String password = "123456";

        if (password.length() >= 5) {
            if (password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
            }

        } else {
            System.out.println("Password cannot be less than 5 characters");
        }


        

    }
}
