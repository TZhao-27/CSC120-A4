
import java.util.ArrayList;
public class Car implements CarRequirements {
    //Attributes
    private int maxCapacity;
    private ArrayList<Passenger> passengerList = new ArrayList<>();
    

    //Constructor
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int getCapacity() {
       return this.maxCapacity;
        
    }

    @Override
    public int seatsRemaining() {
       return this.maxCapacity - this.passengerList.size();
    }

    @Override
    public Boolean addPassenger(Passenger p) {
        if (this.maxCapacity > this.passengerList.size() && !this.passengerList.contains(p)) {
            passengerList.add(p);
            return true;
        } else{
            return false;
        }
    }

    @Override
    public Boolean removePassenger(Passenger p) {
         if (this.passengerList.contains(p)) {
            passengerList.remove(p);
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void printManifest() {
        if (!this.passengerList.isEmpty()) {
            System.out.println(passengerList);
        } else{
            System.out.println("This car is EMPTY.");
        }
    }

    
}