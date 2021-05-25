package day08_casting_scanner;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class CastingExample {
    public static void main (String[]args){
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
         int num8 = 3456;
         double num9 = num8;
        System.out.println(num8);//3456
        System.out.println(num9);//3456.0
        
        int num10 =22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        
        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);
        int num17 = 200;
        byte num18 = (byte)num17;
        System.out.println("num18 = " + num18);
         char letter = 'T';//97
        int numLetter = letter;
        System.out.println(numLetter);

        byte numletter1 = (byte)letter;
        System.out.println(numletter1);

        




    }
}
