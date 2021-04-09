public abstract class Vehicle {
	// Raja Faizan Nazir
	// F2018065101
    private int number;
    private String model;
    private int seats;
    private int loadCapacity;
    private Engine engine;

    public Vehicle() {
        this(0, "", 0, 0, null);
    }

    public Vehicle(int number, String model, int seats, int loadCapacity, Engine engine) {
        this.number = number;
        this.model = model;
        this.seats = seats;
        this.loadCapacity = loadCapacity;
        this.engine = engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                ", loadCapacity=" + loadCapacity +
                ", Engine " + engine.toString();
    }
}
