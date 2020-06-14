package ferreira;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecastItem {

    private String dt_txt;
    @SerializedName("main")
    Map<String, Float> main = new HashMap<String, Float>();
    WeatherWind wind = new WeatherWind();
    List<WeatherDescription> weather = new ArrayList<WeatherDescription>();

    @Override
    public String toString() {
        return  "\nTime: " + dt_txt +
                "\nTemperature: " + main.get("temp") +
                "\nWind Speed: " + wind +
                "\nDescription: " + weather;
    }
}
