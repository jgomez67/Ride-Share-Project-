public class Runner {

    public static void main(String[] args) {

        runScenario(20, 50); // runs simulation with 20 cars and 50 passengers

        runScenario(40, 50); // runs simulation with 40 cars and 50 passengers

    }

    public static void runScenario(int numCars, int numPassengers) { // creates a method to run different simulation scenarios

        Road road = new Road();

        road.addStations(); // adds all 32 stations to the road

        road.addCars(numCars);

        road.addPassengers(numPassengers);

        System.out.println("Scenario: " + numCars + " cars, " + numPassengers + " passengers"); // displays the current simulation setup

        System.out.println("Starting simulation...");

        System.out.println(road);

        road.runSimulation(); // runs the full rideshare simulation

        System.out.println("Simulation finished!");

        System.out.println(road); // displays the percentage of passengers delivered successfully

        System.out.println("Percent delivered: " + road.getPercentDelivered() + "%");

        System.out.println();

    }

}