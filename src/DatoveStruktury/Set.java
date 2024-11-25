package DatoveStruktury;
import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Domin");
        names.add("Peter");
        names.add("Peter");

        for(String name: names){
            System.out.println(name);
        }

    }
}
