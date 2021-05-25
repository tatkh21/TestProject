package replit_project.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class deliveriesAndFuel {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,7,7,1));
        int fuel = 7;
        System.out.println(refuel_times(list, fuel));
    }
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int refuelTime = 0;
        int result = 0;
        for (Integer num : deliveries) {
            result += num;
            if (result%max_fuel != 0)
            { refuelTime += num/max_fuel + 1;
            } else {
                refuelTime += num/max_fuel;
            }

        }
        return refuelTime;
    }
}
