package replit_project.methodsFromReplits;

import java.util.Arrays;

public class LameDb {
    public static void main(String[] args) {
        String db = "1etsy#2wooden#3spoon";
        String op = "add";
        String id = "4";
        String data = "aaa";
        System.out.println(lameDb(db,op,id,data));

    }
    public static String lameDb(String db, String op, String id, String data) {
        //String newDb = db;
        String [] strArr = db.split("#");
        if (op == "add") {
            strArr = new String[strArr.length + 1];
            System.out.println(strArr);



        } else if (op == "edit") {

        } else if (op == "remove") {

        }

        return Arrays.toString(strArr);
    }

}
