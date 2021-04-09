import java.util.Random;

public class Bus extends Vehicle {
	// Raja Faizan Nazir
	// F2018065101
    public Bus() {
        this(new Random().nextInt(2000), Guide.getBusModels()[new Random().nextInt(Guide.getBusModels().length)], new Random().nextInt(4), new Random().nextInt(200), new Engine());
    }

    public Bus(int number, String model, int seats, int loadCapacity, Engine engine) {
        super(number, model, seats, loadCapacity, engine);
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "}";
    }
}
