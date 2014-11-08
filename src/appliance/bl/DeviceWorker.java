package appliance.bl;

import appliance.entity.Device;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

                                                        /**
                                                         * Класс, содержащий методы бизнес-логики для работы с
                                                         * объектами класса Appliance
                                                         * @author Alex
                                                         */

public class DeviceWorker {

    private List<Device> devices;

    public DeviceWorker(List<Device> devices) {

        this.devices = new ArrayList<Device>(devices);
    }
  
    public int getTotalPowerConsumption() {
        int totalPowerConsumption = 0;
        for (Device device : devices) {
            if (device.isPowerOn()) {
                totalPowerConsumption += device.getPowerConsumption();
            }
        }
        return totalPowerConsumption;
    }
        
    public List<Device> sortAppliances() {
        Collections.sort(devices);
        return devices;
    }
    
    public List<Device> selectByPowerConsumption(int minValue, int maxValue) {
        Iterator<Device> iterator = devices.iterator();
        while(iterator.hasNext()) {
            Device device = iterator.next();
            if (device.getPowerConsumption() < minValue || device.getPowerConsumption() > maxValue) {
                iterator.remove();
            }
        }
        return devices;
    }
}
