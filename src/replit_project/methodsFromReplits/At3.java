package replit_project.methodsFromReplits;

public class At3 {
    public static void main(String[] args) {
        String str1 ="longword";
        String str2 = "foo";
        System.out.println(at3(str1, str2));

    } public static String at3(String target,String word){
        String newString = target.substring(0,3).concat(word).concat(target.substring(3));
        return newString;
    }
}
