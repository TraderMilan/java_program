package DatoveStruktury;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Domin");
        names.add("Peter");
        names.add("Peter");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
