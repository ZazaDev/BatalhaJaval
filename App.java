import java.util.ArrayList;

public class App{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Allan");
        names.add("Eduardo");
        names.add("Pedro");
        names.add("Rafael");
        names.add("Cirno");
        new Engine(names);
        new GUI();
    }
}