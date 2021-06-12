package replit_project.OOP;

public class TVtest {
    public static void main(String[] args) {
        TV newTv = new TV();
        newTv.turnOn();
        System.out.println(newTv.isOn());

        newTv.setVolumeLevel(7);
        newTv.volumeUp();
       newTv.volumeUp();
        System.out.println(newTv.getVolume());
//        System.out.println("newTv.isOn() = " + newTv.isOn());
//        newTv.setVolumeLevel(8);
//        newTv.volumeDown();
//        System.out.println("volume =  " + newTv.volumeLevel);
//        System.out.println(newTv.getVolume());
    }
}
