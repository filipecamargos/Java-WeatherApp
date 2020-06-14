package ferreira;

import com.google.gson.Gson;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class GettingWeather {

    public GettingWeather(String _city) {
        this._city = _city;
    }

    private String _city;
    private float _maximumTem;
    private float _maximumWind;

    public float get_maximumTem() {
        return _maximumTem;
    }

    public float get_maximumWind() {
        return _maximumWind;
    }

    public String get_city() {
        return _city;
    }



    public void gettingWeather() throws IOException {


        //Uncomment it and change the url after _city instead of "us" we can concatenate a country
        //and get info around the globe
        /*System.out.println("Please Enter the Country Name as the format (us or uk): ");
        String _country = input.nextLine();
        System.out.println(_city);
        System.out.println(_country);*/

        //Get the API for the Weather Condition
        String url = "http://api.openweathermap.org/data/2.5/weather?q="+_city+",us&units=metric&APPID=0233531e8ce8334d12cd3f791c6588b1";
        URLConnection connection = new URL(url).openConnection();
        InputStream response = connection.getInputStream();

        //String that will hold the incoming data
        String responseBody;

        //Save the data into the string
        Scanner scanner = new Scanner(response);
        responseBody = scanner.useDelimiter("\\A").next();


        //Use Gson to pass the data into the object
        Gson json = new Gson();
        WeatherConditions weatherData = json.fromJson(responseBody, WeatherConditions.class);

        //Print the Weather Condition for the City
        System.out.println(weatherData);

        /**
         * This Part will handle the second part for the weather forecast
         */
        //Get the API for the Weather Condition
        String url1 = "http://api.openweathermap.org/data/2.5/forecast?q="+_city+",us&units=metric&APPID=0233531e8ce8334d12cd3f791c6588b1";
        URLConnection connection1 = new URL(url1).openConnection();
        InputStream response1 = connection1.getInputStream();

        //String that will hold the incoming data
        String responseBody1;

        //Save the data into the string
        Scanner scanner1 = new Scanner(response1);
        responseBody1 = scanner1.useDelimiter("\\A").next();

        WeatherForecast cityForecast = json.fromJson(responseBody1, WeatherForecast.class);

        System.out.println(cityForecast.toString(0));

        //Get the maximums here
        _maximumTem = weatherData.main.get("temp");
        _maximumWind = weatherData.wind.get("speed");

    }

}
