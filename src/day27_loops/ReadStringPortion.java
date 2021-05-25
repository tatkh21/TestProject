package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat, car, cat, red_car, java, selenium";
        for (int i = 0; i < list.length()- 2; i++ ){
            System.out.println(list.substring(i,i+3));
            String part = list.substring(i,i+3);
            if (part.equals("cat") || part.equals("car")) {
                System.out.println("Cat or car found");
            }
        }

//        System.out.println(list.substring(i,i+3));
//        i++;
//        System.out.println(list.substring(i,i+3));
//        System.out.println(list.substring(2,5));
//        System.out.println(list.substring(3,6));

//        String str = "cat, car, cat, black_car, red car";
//        for (int i = 0; i < list.length()- 2; i++ ){
//            System.out.println(list.substring(i,i+3));

        }


    }

