package day51_inharitance.super_keyword;

public class Lux extends Lyft {
    @Override
    public  double calculateRate(double miles) {
        //calculateRate of Lyft + 20 %
        return super.calculateRate(miles) * 1.2;
    }

}
