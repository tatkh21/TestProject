package replit_project.methodsFromReplits;

public class uniqueCharacters {
    public static void main(String[] args) {
               String word = "javavtac";
        System.out.println(uniqueChars(word));
    }

            public static String uniqueChars(String str) {
               char [] charArr = str.toCharArray();
               String uniqueChars = "";

                for (char each: charArr) {
                    int count = 0;

                   for (char eachChar : charArr) {
                       if (each == eachChar) {
                           count++;
                       }
                   } if (count == 1) {
                       uniqueChars += each;
                    }
                    if (!(uniqueChars.contains(""+ each))) {
                        uniqueChars += each;
                    }
               }


                return uniqueChars;
    }
}
