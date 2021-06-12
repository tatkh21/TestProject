package day51_inharitance_static_block.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        Lux lyftLuxRide = new Lux();

        System.out.println("lyftDRide for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("lyftXLDRide for 5 miles = $" + lyftXLRide.calculateRate(5));
        System.out.println("lyftLuxDRide for 5 miles = $" + lyftLuxRide.calculateRate(5));
    }
}
