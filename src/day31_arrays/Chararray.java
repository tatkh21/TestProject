package day31_arrays;

public class Chararray {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char i : letters){
            System.out.print(i);

        } String sentence = new String(letters);

        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length()" + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String temp = "";
        for (String j : fruits) {
            temp = j + "-";
            System.out.print(temp);
        }
        System.out.println(temp.substring(0,temp.lastIndexOf("-")));

        String[] languages = {"java", "python", "c++", "sql", "ruby"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println(joinedLanguages);

    }
}
