package replit_project.arrays;

public class ShortestStringInArray {
    public static void main(String[] args) {
        String [] str = {"a","java", "cable", "red", "vivid", "remedy","grace"};
        String shortestStr = str[0];
        String tempStr = "";
        for (int i = 1; i < str.length; i++) {
            tempStr = str[i];
            for (int j = 0; j < tempStr.length(); j++) {
                if (tempStr.length() < shortestStr.length()){
                    shortestStr = tempStr;
                }
            }
        }
        System.out.println(shortestStr);
    }
}
