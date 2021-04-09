import java.util.ArrayList;

public class MAIN {
	// Raja Faizan Nazir
	// F2018065101
    public static void main(String[] str){
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Car());
        list.add(new Bus());
        list.add(new Truck());
        list.add(new Car());
        list.add(new Bus());
        list.add(new Truck());
        list.add(new Car());

        for (Vehicle i :list){
            System.out.println(i);
        }
    }
}
