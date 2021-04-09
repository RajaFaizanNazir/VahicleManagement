import java.util.Random;

public class Engine {
	// Raja Faizan Nazir
	// F2018065101
    private int hp;

    public Engine() {
        this(new Random().nextInt(2000));
    }

    public Engine(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "hp=" + hp;
    }
}
