

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

    //methods

    public void addStations() {
        for(int i = 0; i< 32; i++) {
            stations.add(new Station(i));
        }
    }

    public void addCars(int num) {
        for(int i = 0; i< num; i++){
            int start =rand.nextInt(32);
            int end = rand.nextInt(32);
            while(end == start){
                end = rand.nextInt(32);
            }
            cars.add(new Car(start, end));
        }
    }

    public void addPassengers(int num){
        totalPassengers = num;
        for(int i = 0; i< num; i++){
            int start = rand.nextInt(32);
            int end = rand.nextInt(32);
        while (end == start) {
            end = rand.nextInt(32);
        }
        Passenger p = new Passenger(start, end);
        stations.get(start).spawnPerson(p);
        }
    }

    //board them

    public void pickupPassengers()
 {
    for(Car car : cars) {
        Station currentStation = stations.get(car.getStationNumber());
        ArrayList<Passenger> waiting = currentStation.getPeople();
        ArrayList<Passenger> toRemove = new ArrayList<>();

        for(Passenger p : waiting) {
            if(car.getPeople().size() < 3 && p.getDirection()) == car.getDirection()){
                car.pickup(p);
                toRemove.add(p);
            }
        }
        for(Passenger p: toRemove) {
            currentStation.removePerson(p);
        }
    }
 }

 




    }
}