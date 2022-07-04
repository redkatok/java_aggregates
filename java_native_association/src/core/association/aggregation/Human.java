package core.association.aggregation;

import java.util.List;

public class Human {

    public Human() {

    }

    public static class House {

        private List<Human> peopleInHouse;

        public House() {
        }

        public House(List<Human> peopleInHouse) {
            this.peopleInHouse = peopleInHouse;
        }

    }
}
