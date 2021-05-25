package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethod {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays().get(0));
        System.out.println("getDays().size() =  " + getDays().size());
        List <String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("Java Day");

        dayNames.removeIf(day -> day.length() == 6 );
        System.out.println("dayName after removeIf = " + dayNames);
        List <Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(1);
        nums.add(23);
        nums.removeIf(n-> n >10);
        System.out.println(nums);

        System.out.println(randomeList(5));
        List <Integer> nums1 = randomeList(100);
        System.out.println("size = " + nums1.size());
        System.out.println("nums1 = " + nums1);
        nums1.removeIf((n -> n <90)); //remve nums less than 90
        System.out.println("nums1 = " + nums1);




    }
    public static List<String> getDays(){
        List <String> days = new ArrayList<> (Arrays.asList("Monday, Tuesday, Wendesday, Thursday," +
                " Friday, Saturday, Sunday"));
        return days;

        }
        /*
        get RandomeList
        param:int size
        return List<Integer>
        generate random numbers(0-100) the count of size,
        and assing to List then return
        getRandomList(3) -> 43,12,54
         */
    public static List<Integer> randomeList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();//generate randome numbers
        for(int i = 1; i <= size; i++) {
            int n =random.nextInt(101);
            if(!list.contains(n)){
                list.add(n);
            }
            list.add(random.nextInt(101));//generate randome number 0-100 and add to list
        }

        return list;
    }
    }

