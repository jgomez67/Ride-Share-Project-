import java.util.ArrayList;


public class Station {

    //fields
    private int stationNumber;
    private ArrayList<Passenger> people;
    
    //constructors

public Station(int stationNumber) {

   this.stationNumber = stationNumber;
   this.people = new ArrayList<>();
}

   public int getStationNumber() {
       return stationNumber;
   }

   public ArrayList<Passenger> getPeople() {
       return people;
   }

   public void spawnPerson(Passenger passenger){
       people.add(passenger);
   }

   public void removePerson(Passenger passenger) {
       people.remove(passenger);

   }
   public void removePerson(int index) {
       people.remove(index);
   }

   public String toString() {
    return "Station " + stationNumber + " Passengers: " + people.size();
   }

}
