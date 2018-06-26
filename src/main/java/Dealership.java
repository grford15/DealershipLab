import java.util.ArrayList;

public class Dealership implements IRepair {

    private ArrayList<Vehicle> vehicleStock;

    public Dealership() {
        this.vehicleStock = new ArrayList<Vehicle>();
    }


    public void repairVehicle(Vehicle vehicle) {
        if(vehicle.getCondition() == Condition.BAD){
            vehicle.setCondition(Condition.GOOD);
        }
    }

    public int getVehicleCount() {
        return vehicleStock.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleStock.add(vehicle);
    }
}
