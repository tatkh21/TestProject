package replit_project.OOP;

public class GasTank {
    double amount = 0;
    double capacity;

    GasTank (double c) {
        capacity = c;
    }
    public void addGas(double a) {
        amount += a;
        if (amount > capacity) {
            amount = capacity;
        }
    }
    public void useGas(double a) {
        amount -= a;
        if (amount < 0) {
            amount = 0;
        }
    }
    public boolean isEmpty () {
       if (amount < 0.1)  {
           return true;
       } return false;
    }
    public boolean isFull () {
        if (amount > capacity - 0.1) {
            return true;
        } return false;
    }
    public double getGasLevel () {
        return amount;
    }
    public double fillUp() {
        double refill = capacity - amount;
        amount+= refill;
        return refill;
    }

}
