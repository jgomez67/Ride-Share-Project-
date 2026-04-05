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



public int getStartStation() {
    return startStation;
}

public int getDestination() {
    return destination;
}

public int getOriginalDestination() {
    return originalDestination;
}

public int getLocation() {
    return location;
}

public int getID() {
    return ID;
}

public boolean getDirection() {
    return direction;
}

public String toString() {
    return "Passenger " + ID + " Start: " + startStation + " Destination: " + destination + " Current: " + location;

}


}












