import java.util.ArrayList;

public class Train implements TrainRequirements {
    //Attributes
    private ArrayList<Car> carList = new ArrayList<>();
    private Engine engine;


    //Constructor
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        for (int i = 0; i < nCars; i++) {
            int carCapacity = passengerCapacity/nCars;
            //carList.add(new Car(carCapacity));
                if (i == nCars-1){
                    int lastCarCapacity = passengerCapacity/nCars + passengerCapacity%nCars;
                    carList.add(new Car(lastCarCapacity));
                } else{
                    carList.add(new Car(carCapacity));
                }   
        } 
        
    }


    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public Car getCar(int i) {
        return this.carList.get(i);
        //positive/negetive/excede num?
    }

    @Override
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : this.carList) {
            maxCapacity += car.getCapacity();
            
        }
        return maxCapacity;
    }

    @Override
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (Car car : this.carList) {
            seatsRemaining += car.seatsRemaining();
        }
        return seatsRemaining;
    }

    @Override
    public void printManifest() {
        for (Car car : this.carList) {
            car.printManifest();
        }
    }

}
