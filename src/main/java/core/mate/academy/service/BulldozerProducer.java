package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Constants;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < Constants.NUMBER_OF_NEW_MACHINES; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
