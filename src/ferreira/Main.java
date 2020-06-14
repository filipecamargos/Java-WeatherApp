package ferreira;

import com.google.gson.Gson;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("********************************************\nHERE ARE THE FIVE CITIES:");

        //City 1 to Display
        String _city1 = "Rexburg";
        GettingWeather weatherCity1 = new GettingWeather(_city1);
        try {
            weatherCity1.gettingWeather();
        } catch (Exception e) {
            System.out.println("City " + _city1 + " Not found");
        }

        //City 2 to Display
        String _city2 = "Denver";
        GettingWeather weatherCity2 = new GettingWeather(_city2);
        try {
            weatherCity2.gettingWeather();
        } catch (Exception e) {
            System.out.println("City " + _city2 + " Not found");
        }

        //City 3 to Display
        String _city3 = "New York";
        GettingWeather weatherCity3 = new GettingWeather(_city3);
        try {
            weatherCity3.gettingWeather();
        } catch (Exception e) {
            System.out.println("City " + _city3 + " Not found");
        }

        //City 4 to Display
        String _city4 = "Colorado";
        GettingWeather weatherCity4 = new GettingWeather(_city4);
        try {
            weatherCity4.gettingWeather();
        } catch (Exception e) {
            System.out.println("City " + _city4 + " Not found");
        }

        //City 5 to Display
        String _city5 = "Boise";
        GettingWeather weatherCity5 = new GettingWeather(_city5);
        try {
            weatherCity5.gettingWeather();
        } catch (Exception e) {
            System.out.println("City " + _city5 + " Not found");
        }

        System.out.println("CITIES SORTED BY LOWEST TEMPERATURE:\n********************************************");

        Map<String, Float> sortedtemp = Comparator.sortTemp(weatherCity1, weatherCity2, weatherCity3, weatherCity4, weatherCity5);
        Comparator.displaySorted(sortedtemp);


        System.out.println("********************************************" +
                "\nCITIES SORTED BY SLOWEST WIND:\n********************************************");
        Map<String, Float> sortedWind = Comparator.sortWind(weatherCity1, weatherCity2, weatherCity3, weatherCity4, weatherCity5);
        Comparator.displaySorted(sortedWind);



    }
}
