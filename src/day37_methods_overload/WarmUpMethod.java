package day37_methods_overload;



/*method:
    loginVoid
params:
    String username, String password

return type:
    VOID

in the method:
    Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"
 */
public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");//POSITIVE TEST / SUNNY DAY
        loginVoid("CybertekStudent", "abcd123");
        //System.out.println( loginVoid("Cybertekstudent", "abc123"));ERROR void method
        System.out.println(login("cybertek", "abc123"));

        if (login("cybertek", "abc123")) {
            System.out.println("login successful, welcome to Canvas");
        } else {
            System.out.println("Login failed");
        }
        boolean isLoginSuccess = login("nadit", "mountain");
        System.out.println("is Login successful = " + isLoginSuccess );

        if (login("nadit", "mountain")) {
            System.out.println("welcome to Canvas");
        } else {
            System.out.println("something is wrong check your credentials");
        }
    }

    public static void loginVoid (String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome CybertekStudent!");
        } else {
            System.out.println("incorrect username or password");
        }
    }
    public static boolean login (String username, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        return username.equalsIgnoreCase(secretUserName )&& password.equals(secretPassword);



    }
}
