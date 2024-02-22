import java.util.ArrayList;

public class Train {

private Engine engine;
private ArrayList<Car> cars;
public Engine getEngine(){
    return engine;
}
/**
 * 
 * @param fuelType
 * @param maxFuelLevel
 * @param nCars
 * @param maxCapacity
 */
//creating the train. 
public Train(FuelType fuelType, double maxFuelLevel, int nCars, int maxCapacity){
    this.engine = new Engine(fuelType, maxFuelLevel);
    this.cars = new ArrayList<Car>();
    for (int i = 0; i < nCars; i++){
        this.cars.add(new Car(0, maxCapacity, new ArrayList<>()));
    }

}

public Car getCar(int i){
    return cars.get(i);
}
// Was really confused and had Chat GPT to help me get the maximum capacity. 
//I used this same approach to getFilledSeats and getCurrentCapacity. 
public int getMaxCapacity(){
    int maxCapacity = 0;
    for (Car car : cars) {
        maxCapacity += car.getMaxCapacity();
    }
    System.out.println("The maximum capacity is " + maxCapacity);
    return maxCapacity;
}
//gets current number of filled setas and prints it. 
public int getFilledSeats(){
    int filledSeats = 0;
    for (Car car: cars) {
        filledSeats += car.getFilledSeats();
    }
    System.out.println("There are " + filledSeats + " filled seats.");
    return filledSeats;
}
//gets current Capacity and prints the amount of empty seats. 
public int getCurrentCapacity(){
    int currentCapacity = 0;
    for (Car car: cars) {
        currentCapacity += car.getCurrentCapacity();
    }
    System.out.println("There are " + currentCapacity + " empty seats.");
    return currentCapacity;
}
//prints Total Array
public void printManifest(){
    ArrayList<String> totalPassengerArray = new ArrayList<>();
    for (Car car : cars) {
        totalPassengerArray.addAll(car.getPassengerArray());
    }

    for(int i = 0; i <totalPassengerArray.size(); i++){
        System.out.println(totalPassengerArray.get(i));
    }
}}

//** 
//## Step 4: the `Train` class
//Now we're in the home stretch! To assemble your `Train`, you'll need (at minimum):

 //-  an `Engine`
 //-  an `ArrayList` to keep track of the `Car`s currently attached
 //-  a constructor `Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)` which will initialize the `Engine` and `Car`s and store them
 //-  a few accessors: 
 //    -  `public Engine getEngine()`
 //    -  `public Car getCar(int i)` to return the `i`th car
 //    -  `public int getMaxCapacity()` which will return the maximum total capacity across all `Car`s
  //   -  `public int seatsRemaining()` which will return the number of remaining open seats across all `Car`s
//- and finally, its own `printManifest()` that prints a roster of all `Passenger`s onboard (_Hint: ask your `Car`s to help!_)



