import Drive.Drive;
import Headphones.Headphones;
import Monitor.Monitor;
import USBDevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;

    private Headphones headphones;


    List<USBDevice> usbDevices = new ArrayList<>();


    public Computer( Monitor monitor, Drive drive)
    {
        this.monitor = monitor;
        this.drive = drive;
    }

    //gettery

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Drive getDrive(){
        return drive;
    }

    public Headphones getHeadphones()
    {
        return headphones;
    }

    public List<USBDevice> getUsbDevices()
    {
        return usbDevices;
    }

    //settery

    public void setMonitor( Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void setDrive( Drive drive)
    {
        this.drive = drive;
    }

    public void setHeadphones( Headphones headphones)
    {
        this.headphones = headphones;
    }













}
