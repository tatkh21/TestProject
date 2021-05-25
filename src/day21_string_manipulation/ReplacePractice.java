package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));

        //gitlib
        //i->0  a->i  --->gotlib

        System.out.println(word.replace('i', 'o').replace('u', 'i'));

        String sentense = "java is fun";
        String withNoSpace = (sentense.replace(" ", ""));
        System.out.println(withNoSpace);
        sentense = sentense.replace("java", "selenium").
                            replace("fun", "a lot of fun");

        System.out.println(sentense);
        String result ="1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ", "").
                        replace(" results for java book", "").
                        replace(",", "");
        System.out.println(result);

        int count = Integer.parseInt(result);



    }

}
