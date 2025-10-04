package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer;
    private final ExcavatorProducer excavatorProducer;
    private final TruckProducer truckProducer;

    public MachineServiceImpl() {
        this.bulldozerProducer = new BulldozerProducer();
        this.excavatorProducer = new ExcavatorProducer();
        this.truckProducer = new TruckProducer();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer": {
                return (List<Machine>) bulldozerProducer.get();
            }
            case "Excavator": {
                return (List<Machine>) excavatorProducer.get();
            }
            case "Truck": {
                return (List<Machine>) truckProducer.get();
            }
            default: {
                return List.of();
            }
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
