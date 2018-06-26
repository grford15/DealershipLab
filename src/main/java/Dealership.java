public class Dealership implements IRepair {


    public void repairVehicle(Vehicle vehicle) {
        if(vehicle.getCondition() == Condition.BAD){
            vehicle.setCondition(Condition.GOOD);
        }
    }
}
