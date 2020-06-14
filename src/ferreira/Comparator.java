package ferreira;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Comparator {


    /**
    * This Function will Sort the Temperature
    */
    public static Map sortTemp(GettingWeather city1, GettingWeather city2, GettingWeather city3,
                      GettingWeather city4, GettingWeather city5) {

        Map<String, Float> dataToBeSorted =  new HashMap<>();
        LinkedHashMap<String, Float> sortedMap = new LinkedHashMap<>();

        //Populate our Map
        dataToBeSorted.put(city1.get_city(), city1.get_maximumTem());
        dataToBeSorted.put(city2.get_city(), city2.get_maximumTem());
        dataToBeSorted.put(city3.get_city(), city3.get_maximumTem());
        dataToBeSorted.put(city4.get_city(), city4.get_maximumTem());
        dataToBeSorted.put(city5.get_city(), city5.get_maximumTem());

        /**
         * Sort it by using API details found on https://howtodoinjava.com/sort/java-sort-map-by-values/
         */
        dataToBeSorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    /**
     * This Function will Sort the Temperature
     */
   public static Map sortWind(GettingWeather city1, GettingWeather city2, GettingWeather city3,
                         GettingWeather city4, GettingWeather city5) {

       Map<String, Float> dataToBeSorted =  new HashMap<>();
       LinkedHashMap<String, Float> sortedMap = new LinkedHashMap<>();

       //Populate the Map
       dataToBeSorted.put(city1.get_city(), city1.get_maximumWind());
       dataToBeSorted.put(city2.get_city(), city2.get_maximumWind());
       dataToBeSorted.put(city3.get_city(), city3.get_maximumWind());
       dataToBeSorted.put(city4.get_city(), city4.get_maximumWind());
       dataToBeSorted.put(city5.get_city(), city5.get_maximumWind());

        /**
         * Sort it by using API details found on https://howtodoinjava.com/sort/java-sort-map-by-values/
        */
        dataToBeSorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;

    }

    public static void  displaySorted(Map<String, Float> sortedMap) {
        for (Map.Entry<String, Float> entry : sortedMap.entrySet()){
            System.out.println( entry.getKey() + ": " + entry.getValue());
        }
    }

}

