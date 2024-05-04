import java.util.Random;
import java.util.ArrayList;

public class Engine {
    public Engine(ArrayList<String> names){
        Random generator = new Random();
        new AI(names.get(generator.nextInt(5)));
    }
}
