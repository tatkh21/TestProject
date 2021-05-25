package my_Practice.saim_practice_loop3;
/*Given a String, find and print the unique characters.
A character is unique if it only appears once in the String.
Ex:AAABCCDEEF
Output:BDF

 */
public class UniqueCharacter {
    public static void main (String[] args) {
        String str = "ABCCDEEFGRTTTS";
        int count = 0;
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count ++;
                }
            }if (count > 1) {
                continue;
            }else if (count == 1) {
                tempStr += str.charAt(i)+"";
            }
        } System.out.println(tempStr);
    }
}
