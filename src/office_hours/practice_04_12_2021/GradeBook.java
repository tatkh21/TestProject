package office_hours.practice_04_12_2021;

public class GradeBook {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sara"};
        int [] scores = {90, 75, 80};
        char [] grade = new char[names.length];
        for(int i= 0; i < scores.length; i++) {
            int eachScore = scores[i];

            if (eachScore >= 85) {
                grade[i] = 'A';
            } else if (eachScore >= 75) {
                grade[i] = 'B';
            }else if (eachScore >= 65) {
                grade[i] = 'C';
            }else  {
                grade[i] = 'D';
            }

    }
        System.out.println("GRADEBOOK");
        for( int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "| " + scores[i] + " | " + grade[i]);
        }


    }
}
