package Slides_303_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {

        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("key", "value");
        stringMap.put("key2", " value2");
        stringMap.put(null, " actual value");
        stringMap.put("null value", null);
        stringMap.put("null value1", null);

        // this is adding null a 2nd time which will overwrite the existing value
        stringMap.put(null, " actual value 1234");


        String value = stringMap.get("key");
        System.out.println(value);

//        common way for looping over and print out each value
        for (String key : stringMap.keySet()){
            System.out.println(key + " ==" + stringMap.get(key));

            // in this case the key is an integer and the value is a string
            Map<Integer, String> intMap = new HashMap<>();
            intMap.put(10,"ten");

            //this happens sometimes, but usually there are other ways of
//            solving problems,
//            this would be a work around or a hack for allowing duplicate values for key
            Map<String, List<String>> listMap = new HashMap<>();
            listMap.put("streets", new ArrayList<String>());
            listMap.get("streets").add("Street 1");
            listMap.get("streets").add("Street 2");

            listMap.put("avenues", new ArrayList<String>());

            //this happens when working with ad hoc queries
//            this is going to happen far more often than the map of list
//            when it comes back from the database this way we just treat it as read onlu object
            List<Map<String,Object>> queryResult;
        }
    }
}
