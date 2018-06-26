public class Customer extends Person implements IBuyVehicle {


    public Customer(String name, int age, int wallet) {
        super(name, age, wallet);
    }



    public String buyVehicle(Vehicle vehicle) {
        if(getWallet() > vehicle.getPrice()){
            return "You have bought this vehicle";}

        return null;
    }

}
