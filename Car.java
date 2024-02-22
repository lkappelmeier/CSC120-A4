import java.util.ArrayList;
public class Car {
public int maxCapacity;
public int filledSeats;
public int currentCapacity;
public int passengerIndex;


//private String passenger;
private ArrayList<String> passengerArray = new ArrayList<>();
// used ChatGpt to ask about different problems such as "ArrayList cannot be resolved to a type"
/**
 * 
 * @param filledSeats
 * @param maxCapacity
 * @param passengerArray
 */
public Car(int filledSeats, int maxCapacity, ArrayList<String> passengerArray){
    this.filledSeats = filledSeats;
    this.maxCapacity = maxCapacity;
}
//gets Current Capacity as well as prints out the list of passengers. 
public int getCurrentCapacity() {
    filledSeats = passengerArray.size();
    currentCapacity = maxCapacity - filledSeats;
    System.out.println("There are " + filledSeats + " filled seats and " + currentCapacity + " remaining seats.");
    
    
    return currentCapacity;
}
public void printManifest(){
    System.out.println("The current passengers are: ");
    for(int i = 0; i <passengerArray.size(); i++){
        System.out.println(passengerArray.get(i));
    }
}
public ArrayList<String> getPassengerArray() {
    return passengerArray;
}
public int getMaxCapacity(){
    return maxCapacity;
}

public int getFilledSeats(){
    return filledSeats;
}
public boolean addPassenger (String passenger){
if (filledSeats<maxCapacity) {
    System.out.println("Passenger " + passenger + " successfully added to car");
    passengerArray.add(passenger);
    return true;
} else {
    System.out.println("Passenger "  + passenger + " unable to be added to car");
    return false;
}
}
//I asked ChatGPT to help with the removing of a passenger from the array.
public boolean removePassenger(String passenger){
    if (filledSeats>0) {
        passengerIndex = passengerArray.indexOf(passenger);
        passengerArray.remove(passengerIndex);
        System.out.println("Passenger " + passenger + " successfully removed from car");
        return true;
    } else {

        System.out.println("Passenger "  + passenger + " unable to be removed from car");
        return false;
    }
}
public static void main(String[] args){
    ArrayList<String> passengerArray = new ArrayList<>();

    Car aCar = new Car(0,100, passengerArray);
    aCar.addPassenger("Olive");
    aCar.addPassenger("Amelia");
    aCar.addPassenger("Bella");
    aCar.getCurrentCapacity();
    aCar.printManifest();
    }

//getCurrentCapacity basically combines getCurrentCapacity that was intended + printManifest().




}