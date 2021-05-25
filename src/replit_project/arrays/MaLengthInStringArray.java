package replit_project.arrays;

public class MaLengthInStringArray {
    public static void main(String[] args) {
        String[] words = { "jaaaaavvaaaaaaaaaa","aaa", "bbbbbhhhhnnnnnlllljjjjooooo", "whasstupppp", "longg"};
        String tempStr = "";
        String largestLength = "";
        for (String each : words) {
            tempStr = each;
            for (int i = 0; i < tempStr.length(); i++) {
                if (tempStr.length() > largestLength.length()) {
                    largestLength = tempStr;
                }
            }
        }
        System.out.println(largestLength);
    }
}
