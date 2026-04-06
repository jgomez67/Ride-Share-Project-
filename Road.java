

import java.util.ArrayList;
import java.util.Random;
public class Road{
    //fields
    private ArrayList<Car> cars;
    private ArrayList<Station> stations;
    private Random rand;
    private int deliveredPassengers;
    private int totalPassengers;

    //constructors
    
    public Road() {
        cars = new ArrayList<>();
        stations = new ArrayList<>();
        rand = new Random();
        deliveredPassengers = 0;
        totalPassengers = 0;
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
    public ArrayList<Station> getStations() {
        return stations;
    }
    public int getDeliveredPassengeres() {
        return deliveredPassengers;
    }
    public int getTotalPassengers() {
        return totalPassengers;

    }
    
    }
}