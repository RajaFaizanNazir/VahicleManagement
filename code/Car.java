import java.util.Random;

public class Car extends Vehicle {
	// Raja Faizan Nazir
	// F2018065101
    public Car() {
        this(new Random().nextInt(2000), Guide.getCarsModels()[new Random().nextInt(Guide.getCarsModels().length)], new Random().nextInt(4), new Random().nextInt(200), new Engine());
    }

    public Car(int number, String model, int seats, int loadCapacity, Engine engine) {
        super(number, model, seats, loadCapacity, engine);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "}";
    }
}
