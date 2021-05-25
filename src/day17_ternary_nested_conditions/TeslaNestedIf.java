package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'X';//'X', 'Y'
        String trim = "Long range";

        if (model == 'S') {
            System.out.println("Model " + model + " is selected");
            if (trim.equals("Long range")) {
                System.out.println(trim + ": range: 412 mi\npeak power: 670 hp\n0-60mph - 3.1 s");
            } else {
                System.out.println("Plaid trim : range: 390 mi\npeak power: 1,020 hp\n0-60mph- 1.99 s");
            }

        } else if (model == '3') {
            System.out.println("Model 3 : range: 390 mi\\npeak power: 1,020 hp\\n0-60mph- 1.99 s\"");

        } else if (model == 'X') {
            System.out.println("Model " + model + " is selected");
            if (trim.equals("Long range")) {
                System.out.println(trim + ": range: 360 mi\npeak power: 670 hp\n0-60mph - 3.8 s");
            } else {
                System.out.println("Plaid trim : range: 340 mi\npeak power: 1,020 hp\n0-60mph- 2.5 s");
            }
            }

        }
    }
