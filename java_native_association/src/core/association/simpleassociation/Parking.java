package core.association.simpleassociation;

import java.util.List;

public class Parking {

    private List<Car> cars;

    public void addCar(Car car){
        this.cars.add(car);
    }
}
