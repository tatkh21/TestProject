package my_Practice.saim_practice_loop3;

public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFindToMe";
        int count = 1;
        for (int i = 0; i < str.length(); i ++) {
            if ( str.charAt(i)>= 'A' && str.charAt(i) <= 'Z' ){
                count++;
            }

        }System.out.println("There are " + count + " words");

    }
}
