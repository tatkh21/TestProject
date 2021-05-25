package day46_incasulassion;

public class Car {
    //encapsulated /hidden instance variable
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    //getter method for model
    public String getModel() {
        return model;
    }

    //setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //getter for year
    public int getYear() {
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

