public class Passenger {
    
    private String passenger;

    //public Passenger(String passenger) {
      
   // }

    public void boardCar(Car car) {
        car.addPassenger(passenger);
    }

    public void getOffCar(Car car) {
        car.removePassenger(passenger);
    }
}
