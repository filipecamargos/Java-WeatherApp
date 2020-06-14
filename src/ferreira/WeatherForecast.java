package ferreira;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast {

    List<WeatherForecastItem> list = new ArrayList<WeatherForecastItem>();


    public String toString(int index) {
        return "\nWeatherForecast: " +
                list.get(index) +
                "\n********************************************";
    }
}
