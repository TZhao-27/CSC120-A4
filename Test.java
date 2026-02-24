public class Test {
        public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 2, 2, 6, 34);
        Passenger a = new Passenger("A");
        Passenger b = new Passenger("B");
        Passenger c = new Passenger("C");

        for(int i = 0;i<6;i++){
            System.out.println("car"+i+": "+train.getCar(i).getCapacity());

        }
        
        c.boardCar(train.getCar(0));
        
    }
}
