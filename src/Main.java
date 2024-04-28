import Drive.Drive;
import Headphones.Headphones;
import Monitor.Monitor;
import USBDevice.USBDevice;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setWLowResolution();
        System.out.println(monitor.getResolution());




    }
}