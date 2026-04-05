public class Passenger {
    
//fields

    private int startStation;
    private int destination;
    private int location;
    private int originalDestination;
    private boolean direction;
    private int ID;
    private static int globalID = 0;

//constructors

public Passenger(int startStation, int destination) {
    this.startStation = startStation;
    this.destination = destination;
    this.originalDestination = destination;
    this.location = startStation;
direction = startStation < destination;
ID = globalID++;

}





