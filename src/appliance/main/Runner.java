package appliance.main;

import appliance.bl.*;
import appliance.entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Домашние электроприборы. Определить иерархию электроприборов. Включить
 * некоторые в розетку. Посчитать потребляемую мощность Провести сортировку
 * приборов в квартире на основе мощности. Найти прибор в квартире,
 * соответствующий заданному диапазону параметров.
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<appliance.entity.Device> devices = new ArrayList();

        Refrigerator refrigerator = (Refrigerator) SimpleDeviceFactory
                .createAppliance(DeviceType.REFRIGERATOR);
                                      // refrigerator.setPowerConsumption(660);
        refrigerator.setPowerOn(true);

        Toaster toaster = (Toaster) SimpleDeviceFactory
                .createAppliance(DeviceType.TOASTER);
        toaster.setPowerConsumption(350);

        TV tv = (TV) SimpleDeviceFactory
                .createAppliance(DeviceType.TVSET);
        tv.setPowerConsumption(150);
        tv.setPowerOn(true);

        Washer washer = (Washer) SimpleDeviceFactory
                .createAppliance(DeviceType.WASHER);
        washer.setPowerConsumption(700);
        washer.setPowerOn(true);

        devices.add(refrigerator);
        devices.add(toaster);
        devices.add(tv);
        devices.add(washer);

        DeviceWorker deviceWorker = new DeviceWorker(devices);
        System.out.println("Total power consumption: " + deviceWorker.getTotalPowerConsumption() + "W"); //текущее энергопотребление
        List<appliance.entity.Device> sortedDevices = deviceWorker.sortAppliances();                     //сортировка электроприборов
        for (appliance.entity.Device applience : sortedDevices)
        {
            System.out.println(applience.toString());
        }

        List<appliance.entity.Device> selectedApplienceList = deviceWorker.selectByPowerConsumption(300, 660); //выборка электроприборов по потреблению
        System.out.println("Appliances with the power consumption in selected range:");
        for (appliance.entity.Device applience : selectedApplienceList) {
            System.out.println(applience.toString());
        }
    }

}
