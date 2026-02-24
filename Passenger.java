public class Passenger implements PassengerRequirements {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public void boardCar(Car c) {
        if(c.addPassenger(this)){
            System.out.println("On board");
        } else {
            System.out.println("Not on board");
        }
    }

    @Override
    public void getOffCar(Car c) {
        if(c.removePassenger(this)){
            System.out.println("out success");
        } else {
            System.out.println("not out success");
        }
        
    }
}
