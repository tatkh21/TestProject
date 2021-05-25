package day18_conditional_practice_string_info;
/*
Make => Mercedes
    Model =>  E
        leasePrice = 500
    Model => A
        leasePrice = 400

Make => Audi
    Model =>  SQ5
        leasePrice = 552
    Model => A3
        leasePrice = 412
 */
public class CarLeasing {
    public static void main (String[]args){
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0;

//        if (make.equals(  "Mercedes") && model.equals("E")){
//            leasePrice = 500.0;
//        } else if (make.equals(  "Mercedes") && model.equals("A")){
//            leasePrice = 400.0;
        if (make.equals("Mercedes")){
            if (model.equals("E")){
                leasePrice = 500.0;
            } else if (model.equals("A")){
                leasePrice = 400.0;
            }
        } else {

        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }

}
