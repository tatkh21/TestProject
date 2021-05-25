package replit_project.arrays;
import java.util.*;
public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
        int arrLength = temps.length;
        double tempSum = 0;
        for (int i = 0; i < temps.length; i++){
            tempSum+= temps[i];

        } double average = tempSum/arrLength;
        System.out.println(average);
    }
}
