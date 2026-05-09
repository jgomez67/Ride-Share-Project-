public class Runner {

    public static void main(String[] args) {

        Road road = new Road();

        road.addStations();

        road.addCars(10);

        road.addPassengers(50);

        System.out.println("Starting simulation...");

        System.out.println(road);

        road.runSimulation();

        System.out.println("Simulation finished!");

        System.out.println(road);

        System.out.println("Percent delivered: " + road.getPercentDelivered() + "%");

    }

}