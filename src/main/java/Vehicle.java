public abstract class Vehicle {

    private final int price;
    private final String colour;
    private final int engine;
    private Condition condition;

    public Vehicle(int price, String colour, int engine, Condition condition) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.condition = condition;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getEngine() {
        return engine;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String driving(String location) {
        return "You are driving to " + location;
    }
}
