package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars = cars + 2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        //6 cars left parking lot
        cars -= 6;
        System.out.println("cars = " + cars);
        cars = cars - 1;
        cars -= 1;
        System.out.println("cars = " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        word = word + "programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun";
        word += selenium;
        System.out.println("word = " + word);

        word += 123;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add letter 'J' to letter
        letter += '!';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird is 50 off
        parkingFee /= 2;
        System.out.println("early bird parkingFee = " + parkingFee);
        // weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);


    }
}
