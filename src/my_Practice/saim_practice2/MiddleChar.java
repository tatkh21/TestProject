package my_Practice.saim_practice2;

public class MiddleChar {
    public static void main(String[] args) {
        String name = "cat";
        if (name.length()% 2 == 0){
            int index = name.length()/2;
            System.out.println(name.charAt(index -1) + "" + name.charAt(index));
            System.out.print(name.charAt( name.length()/2 ));
            System.out.println(name.substring(index -1, index + 1));

        } else if (name.length()% 2 != 0){
            System.out.println(name.charAt(name.length()/2));
            //System.out.println(word.substring(word.length()/2, word.length()/2 + 1);

        }
    }
}
