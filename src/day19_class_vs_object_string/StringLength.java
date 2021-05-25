package day19_class_vs_object_string;

public class StringLength {
    public static void main (String[]args){
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Nadir";
        System.out.println(firstName + " - "  + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);
        String password = "abc12";
        //WHEN PASSWORD IS AT LEAST 6 CHARACTERS: print : vali Amazon password
        if (password.length() >= 6){
            System.out.println("Valid Amazon password");
        } else {
            System.out.println("Password is too short");
        } System.out.println(word.concat(firstName).concat(word).concat(firstName));
          System.out.println(firstName.compareTo(word));
    }

}
