package my_Practice.saim_practice_loop3;
/*
Given a String, find and print the duplicate characters.
A character is duplicate if it appears more than once in the String.
Ex:AAABCCDEEF
Output:ACE
 */
public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "QAAABCCDEEFGIVV";
        String tempStr = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            } if (count == 1){
                tempStr += str.charAt(i);
            }
        }
        System.out.println(tempStr);

    }
}
