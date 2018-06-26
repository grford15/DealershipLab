public class Dealer extends Person implements IBuyVehicle {


    public Dealer(String name, int age, int wallet) {
        super(name, age, wallet);
    }


    public String buyVehicle(Vehicle vehicle) {
        if(getWallet() > vehicle.getPrice()){
            return "You have bought this vehicle";}
        return null;
    }
    }

