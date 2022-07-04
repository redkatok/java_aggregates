package core.association.simpleassociation;

public class App {

    public static void main(String[] args) {
        Car car = new Car();
        Parking parking = new Parking();
        Person person = new Person();

        person.addCar(car);
        parking.addCar(car);
    }
}
