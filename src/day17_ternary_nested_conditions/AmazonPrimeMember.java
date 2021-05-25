package day17_ternary_nested_conditions;

public class AmazonPrimeMember {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = true;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice > 20) {
                System.out.println("Eligible for free regular shipping");
                } else {
                    System.out.println("Not eligible for free shipping. Fee = 10$");
                }
            }
        }
    }

