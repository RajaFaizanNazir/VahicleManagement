import java.util.Random;

public class Truck extends Vehicle {
	// Raja Faizan Nazir
	// F2018065101
    public Truck() {
        this(new Random().nextInt(2000), Guide.getTruckModels()[new Random().nextInt(Guide.getTruckModels().length)], new Random().nextInt(4), new Random().nextInt(200), new Engine());
    }

    public Truck(int number, String model, int seats, int loadCapacity, Engine engine) {
        super(number, model, seats, loadCapacity, engine);
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "}";
    }
}
