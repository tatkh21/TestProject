package office_hours.practice_03_03_2021;
/*
  - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer
 */
public class Computer {
    public static void main (String[]args){
        String name = "27\" iMac with retina 5K display";
        String brand = "Apple";
        String prosessorSpeed = "3.8 GHz";
        String prossesorModel = "Intel 10th Generation Core i7";
        String memory = "8 GB";
        boolean hasWiFiCard = true;
        double price = 2299.99;
        String color = "Silver";
        byte screenSize = 27;
        byte numberOfUsb = 6;
        boolean hasCamera = true;
        System.out.println("_______________________________________________");
        System.out.println("\t\t\t\t\tTODAY ON SALE!!!");
        System.out.println("================================================");
        System.out.println("PRODUCT NAME:\t" + name);
        System.out.println("PRODUCT BRAND:\t\t\t\t\t\t\t" + brand);
        System.out.println("SCREEN SIZE:\t\t\t\t\t\t\t" + screenSize + "\"");
        System.out.println("PROCESSOR MODEL:\t" + prossesorModel);
        System.out.println("PROCESSOR SPEED:\t\t\t\t\t\t" + prosessorSpeed );
        System.out.println("HAS CAMERA:\t\t\t\t\t\t\t\t" + hasCamera);
        System.out.println("HAS WIFI CARD:\t\t\t\t\t\t\t" + hasWiFiCard);
        System.out.println("SYSTEM MEMORY (RAM):\t\t\t\t\t" + memory);
        System.out.println("COLOR:\t\t\t\t\t\t\t\t\t" + color);
        System.out.println("NUMBER OF USB PORTS:\t\t\t\t\t" + numberOfUsb);
        System.out.println("================================================");
        System.out.println("\t\t\tPRODUCT PRICE - $" + price );
        System.out.println("------------------------------------------------");



    }
}
