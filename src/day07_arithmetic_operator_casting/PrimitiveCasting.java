package day07_arithmetic_operator_casting;

public class PrimitiveCasting {
    public static void main (String[]args){
        int n1 = 4;
        //byte b1 = (byte)n1; It will not work
//        byte b1 = (byte)n1;// Now the above line will convert to bite and assing to value
//        byte b2 = 55;
//        int n2 = b2;// this will work because int > byte

        int num1 = 100;//100
        byte b1 = (byte) num1;//100
        short num3 = (short)num1;//100
        long num4 = num1;//100


        System.out.println(num1);
        System.out.println(b1);
        System.out.println(num3);
        System.out.println(num4);
        //TODO: continue more practice




    }
}
