package replit_project.arrays;

public class ContainsNext {
    public static void main(String[] args) {
        int[] data = {32, 123, 543, 654,654};
        boolean containsNext = false;
        for (int i = 0; i < data.length-1; i++ ) {
            if (data[i]==data[i + 1]) {
                containsNext = true;
            }

        } System.out.println(containsNext);
    }
}
