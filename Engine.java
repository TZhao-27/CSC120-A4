
public class Engine implements EngineRequirements{
    //Attributes
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;
    
    //constructor
    public Engine(FuelType type, double currentFuel, double maxFuel) {
        this.fuelType = type;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    @Override
    public FuelType getFuelType() {
       return fuelType;
    }

    @Override
    public double getMaxFuel() {
        return maxFuel;
    }

    @Override
    public double getCurrentFuel() {
       return currentFuel;
    }

    @Override
    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    @Override
    public Boolean go() {
        if (this.currentFuel>0) {
            this.currentFuel -= 0.5;
            System.out.print("Remaining fuel level is " + this.currentFuel );
            return true;

        } else{
            return false;
        }
    
        }
    }

    
    



    //constructor





