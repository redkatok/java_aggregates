package core.association.aggregation;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        List<Human> people = List.of(human1, human2, human3);

        Human.House houseWithoutPeople = new Human.House();
        Human.House houseWithPeople = new Human.House(people);
    }
}
