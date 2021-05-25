package day33_multidimentional_aarays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String [3][2];
        users[0][0] = "Theodora Tsvetanova";
        users[0][1] = "Theodot123";
        users[1][0] = "anna Ziyaeva";
        users[1][1] = "anna123";
        users[2][0]= "Parvin Alt";
        users[2][1]= "Parvin123";

        String[][] userDate = {{"Theodora Tsvetanova","Theodot123" },
                              {  "anna Ziyaeva",    "anna123"   },
                                { "Parvin Alt",    "Parvin123" }};
        System.out.println("-----NAMES---------");
        System.out.println(userDate[0][0].split(" ")[0]);
        System.out.println(userDate[1][0]);
        System.out.println(userDate[2][0]);
        System.out.println("-----PASSWORDS---------");
        System.out.println(userDate[0][1]);
        System.out.println(userDate[1][1]);
        System.out.println(userDate[2][1]);

        System.out.println(Arrays.deepToString(userDate));
    }
}
