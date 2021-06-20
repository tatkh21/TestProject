package replit_project.arrays;

public class getDup {


    public static int getDuplicates(String[]a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    count++;
                }
            } if (count <= 1) {
                count = 0;
            } else {
                break;
            }
        } return count;


    }

    public static void main(String[] args) {
        String[] strArr = {"1","g","aabb","7","7","2","aa","7", "7", "7"};
        System.out.println(getDuplicates(strArr));

    }
}
