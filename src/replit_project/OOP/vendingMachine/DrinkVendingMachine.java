package replit_project.OOP.vendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkVendingMachine extends VendingMachine{
    public List<Drink> drinks;
    public Drink current;
    public double amountLeftToPay;
    public double change;
    public boolean isSelected;

    public DrinkVendingMachine(Drink... drinksParam) {
        drinks = new ArrayList();
        drinks.addAll(Arrays.asList(drinksParam));

    }



    @Override
    public void select(int itemNumber) {
        isSelected = true;
        if(itemNumber < 0 || itemNumber > drinks.size() - 1) {
            isSelected = false;
        }
        if (isSelected && drinks.get(itemNumber).getQuantity() <= 0) {
            isSelected = false;
        }
        if(isSelected) {
            current = drinks.get(itemNumber);
            amountLeftToPay = drinks.get(itemNumber).getCost();
        }
    }


    @Override
    public double pay(double money) {
        if (!isSelected) {
            return 0.0;
        }
        if (money > amountLeftToPay) {
            change = money - amountLeftToPay;
            amountLeftToPay = 0;
        } else {
            change = 0;
            amountLeftToPay = amountLeftToPay - money;
        }
        current.setQuantity(current.getQuantity()-1);

        return amountLeftToPay;
    }

    @Override
    public double returnChange() {
        double result = change;
        change = 0;
        amountLeftToPay = 0;

        return result;
    }

    @Override
    public void cancel() {
        current = null;
        amountLeftToPay = 0;
        isSelected = false;
        returnChange();

    }
}
