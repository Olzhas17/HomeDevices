package appliance.bl;

import appliance.entity.*;

public  class SimpleDeviceFactory {
                                                             /**
                                                              * Фабрика электроприборов
                                                              * @param type Тип электроприбора
                                                              * @return Новый электроприбор
                                                              */
    public static Device createAppliance(Enum type) {
        if (type == DeviceType.REFRIGERATOR) {
            return new Refrigerator();
        } else if (type == DeviceType.TOASTER) {
            return new Toaster();
        } else if (type == DeviceType.TVSET) {
            return new TV();
        } else if (type == DeviceType.WASHER) {
            return new Washer();
        }
        throw new IllegalArgumentException("No such appliance " + type.toString());

    }
}
