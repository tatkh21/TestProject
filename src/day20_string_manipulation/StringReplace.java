package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentense = "java strings are fun";
        System.out.println(sentense);
        System.out.println(sentense.replace("a", "u"));
        System.out.println(sentense.replace("java", "python"));
        System.out.println(sentense.replace("java", ""));

        String str = "An";
        int n = 3;
        char a = str.charAt(n);
        System.out.println(a);
        //str = str.substring(n,n+1);
//        str = str.replace(str.charAt(n)+"","");
//        System.out.println(str);

        String str1 = str.charAt(0)+"";
        String strMiddle = str.substring(1, str.length()-1);
        String str2 = str.charAt(str.length()-1)+"";
        str = str2+strMiddle+str1;
        System.out.println(str);


    }
}
