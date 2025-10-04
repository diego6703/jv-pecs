package core.mate.academy.service;

import core.mate.academy.model.Constants;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < Constants.NUMBER_OF_NEW_MACHINES; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
