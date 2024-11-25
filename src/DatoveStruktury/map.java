package DatoveStruktury;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Jablko", "dobré ovocie");
        dictionary.put("Hruska", "podobne jablku");
        System.out.println(dictionary);

        System.out.println(dictionary.get("Jablko"));

        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }


    }
}
