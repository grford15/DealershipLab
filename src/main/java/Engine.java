public class Engine {


    private final int engineSize;
    private final String type;

    public Engine(int engineSize, String type) {


        this.engineSize = engineSize;
        this.type = type;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return type;
    }
}
