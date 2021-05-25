package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main (String[]args){
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCode by 1
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        // type 4 different ways of deckreasing by 1
        int icecream = 20;
        icecream = icecream - 1;
        icecream -= 1;
        icecream--;
        --icecream;
        System.out.println("icecream = " + icecream);

        char letter = 'a';
        System.out.println(letter);
        letter++;
        System.out.println(letter);
        ++letter;
        System.out.println(letter);
        letter--;
        --letter;
        System.out.println(letter);
        letter--;
        System.out.println(letter);
        letter--;
        System.out.println(letter);
                        
        
        long a = 30L;
        long b = (short)a;
        System.out.println(a);
        
        float s = 100.987_6543f;
        short v = (byte)s;
        byte c = (byte)v;
        System.out.println(c);


    }
}
