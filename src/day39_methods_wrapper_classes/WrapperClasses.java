package day39_methods_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        num += 10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 300);
        
        Integer intObject = 1000;
        System.out.println(intObject/50);
        //convert n2 to String
        String numStr = intObject + "";
        String numSt = intObject.toString();

        System.out.println("numSt = " + numSt);
        System.out.println("numStr = " + numStr);

        /*
        DECLARING AND INITIALIZING WRAPPER CLASSES
         */

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short sh1 = new Short((short)40);
        Short sh2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long (300);
        Long l2 = 3455L;

        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character ('Q');
        Character ch2 = 'V';


        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;






    }
}
