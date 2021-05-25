package day04_variables_intro;

public class VariableNamingRules {
    public static void main (String[]args){
        System.out.println();
        //int static = 22;-> error, static raserved by java
        int static1 = 22;
        int _static = 23;
        int $tatic = 10;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthSalary = 3000;->error, can not start with number
        int $ = 3; // not recomended
        int d = 2; // not recomended

    }
}
