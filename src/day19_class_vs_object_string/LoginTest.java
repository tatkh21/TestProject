package day19_class_vs_object_string;

import java.time.Instant;

/*
WHEN expUserName equals userName AND expPassword equals password
    -> "Pass - user successfully logged in"

OTHERWISE:
    WHEN expUserName NOT equals userName
        -> "Incorrect Username"
    OTHERWISE:
        -> "Incorrect password"
 */
public class LoginTest {
    public static void main (String[]args){
        String expUserName = "cybeRtek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "abc123";

        if (expPassword.equals(password) && userName.equalsIgnoreCase(expUserName)){
            System.out.println("Pass - user successfully logged in" + Instant.now());
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Incorrect username");
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
