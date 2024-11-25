package DatoveStruktury;

import java.util.ArrayList;
import java.util.Iterator;

public class itrtr {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banan");
        fruits.add("Jahoda");
        fruits.add("Hruska");
        fruits.add("Jablko");

        Iterator <String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            if (fruit.equals("Jahoda")){
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
