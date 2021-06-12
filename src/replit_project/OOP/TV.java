package replit_project.OOP;

public class TV {
    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    TV() {
        System.out.println("Creating TV object using no args-constructor");
    }
    TV(String brand) {
        this.brand = brand;
        System.out.println(" Creating TV object using 1 arg - constructor");
    }
    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel > -1 && (this.volumeLevel + volumeLevel) < 8 && isOn() == true) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void setChannel(int channel) {
        if (channel > 0 && channel <= 120 && on == true ){
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getVolume() {
        return volumeLevel;
    }
    public int getChannel() {
        return channel;
    }
    public String getBrand() {
        return brand;
    }
    public void volumeUp() {
        if (volumeLevel > -1 && this.volumeLevel <= 7 && isOn() == true) {
            this.volumeLevel++;
            if (this.volumeLevel > 7) {
                System.out.println(("ERROR: TV is either OFF or invalid Volume level"));
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }
    public  void volumeDown() {
        if (volumeLevel > -1 && volumeLevel < 8 && isOn() == true) {
            volumeLevel--;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public boolean isOn() {
        return on;
    }
    public void turnOn() {
        if (on == true) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }
    public void turnOff() {
        if (on == false) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }

    }


}
