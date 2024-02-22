public class Engine {
    public FuelType fuelType;
    public double currentFuelLevel;
    public double maxFuelLevel;
    public double refuelAmount;
    /**
     * 
     * @param fuelType
     * @param maxFuelLevel
     */
//asked Chat GPT to help set this up because I knew how to do it in Python but not Java.
public Engine(FuelType fuelType, double maxFuelLevel) {
    this.fuelType = fuelType;
    this.currentFuelLevel = maxFuelLevel;
    this.maxFuelLevel = maxFuelLevel;
}

public void refuel() {
    System.out.println("You are refueling with " + fuelType);
if (currentFuelLevel<maxFuelLevel) {
    currentFuelLevel = Math.min(currentFuelLevel + refuelAmount, maxFuelLevel);
    System.out.println("You have refueled by" +  refuelAmount + "!");
} else {
    System.out.println("You are at the maximum fuel amount!");
}
}
/**
 * 
 * @param fullFuel
 * @return
 */
public boolean go(Boolean fullFuel) {
    if (currentFuelLevel > 0) {
        System.out.println("Your train is moving!");
        return true;
    } else {
        System.out.println("You are out of fuel! You need to refuel!");
        return false;
    }
}
/**
 * Prints a message and reduces fuel level if level is not zero. 
 * @return
 */
public double useFuel(){
    currentFuelLevel = Math.max(0, currentFuelLevel - 20);
    System.out.println("Choo Choo! Your fuel level is now " + currentFuelLevel);
    return currentFuelLevel;
}

public static void main(String[] args){
    Engine newEngine = new Engine(FuelType.ELECTRIC, 100.0);
    while (newEngine.go(true)) {
        newEngine.useFuel();
    }
    }
}

