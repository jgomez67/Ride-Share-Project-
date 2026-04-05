import java.util.ArrayList;
public class Car{
    //Fields

    private ArrayList<Passenger> people;
    private int destination;
    private int initialStation;
    private boolean forward;
    private int currentStation;
    private boolean moveable;
    private int revenue;
    private int distanceTraceled;

    //Constructors

    public Car(int myInitialStation, int my Destination) {

        initialStation = myInitialStation;
        destination = myDestination;
        people= new ArrayList<>();
        currentStation = myInitialStation;


        forward = initialStation < destination;
        moveable = true;
    }
    
//Getters


   public int getInitialStation() {
       return initialStation;
   }


   public int getDestination() {


       return destination;
   }
  
   public int getStationNumber() {
       return currentStation;
   }


   public boolean getMoveable() {
       return moveable;
   }


   public boolean getDirection() {
       return forward;
   }
}



  