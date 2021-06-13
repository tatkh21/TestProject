package replit_project.OOP;

public class GasTankTest {
    public static void main(String[] args) {
        GasTank gasTank = new GasTank(30);
        gasTank.addGas(30);
        System.out.println(gasTank.isFull());
        gasTank.useGas(10);
        System.out.println(gasTank.isEmpty());
        gasTank.fillUp();
        System.out.println(gasTank.getGasLevel());
    }
}
