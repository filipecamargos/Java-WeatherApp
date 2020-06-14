package ferreira;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class WeatherConditions {


    private  String name;

    private int id;

    @SerializedName("main")
    Map<String, Float> main = new HashMap<String, Float>();

    Map<String, Float> wind = new HashMap<String, Float>();


    public String toString() {
        return "********************************************" +
                "\nWeatherConditions: " +
                "\nid: " + id +
                "\nname: " + name +
                "\nTemperature: " + main.get("temp") +
                "\nFeels Like: " + main.get("feels_like") +
                "\nMinimum Of: " + main.get("temp_min") +
                "\nMaximum Of: " + main.get("temp_max") +
                "\nWind: " + wind.get("speed") +
                "\nHumidity: " + main.get("humidity");


    }
}
