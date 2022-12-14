package org.example;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.example.beans.WeatherBean;

import java.io.IOException;
import java.util.Scanner;

public class RequestUtils {

    public static String sendGet(String url) throws Exception {
        System.out.println("url : " + url);
        OkHttpClient client = new OkHttpClient();

        //Création de la requête
        Request request = new Request.Builder().url(url).build();

        //Le try-with ressource doc ici
        //Nous permet de fermer la réponse en cas de succès ou d'échec (dans le finally)
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }

    public static WeatherBean loadWeather(String city) throws Exception {
        if (city=="" || city.isBlank()){
            throw new Exception("Mauvaise Input");
        }
        String json = sendGet("https://api.openweathermap.org/data/2.5/weather?appid=b80967f0a6bd10d23e44848547b26550&units=metric&lang=fr&q=" + city);
        WeatherBean data = new Gson().fromJson(json, WeatherBean.class);
        return data;
    }

    public static void main(String[] args) {
/*        try {
            System.out.println(sendGet("https://aaa"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("une erreur est survenue");

        }*/System.out.print("Veuillez entrer un nom de ville : ");
        Scanner scanner = new Scanner(System.in);
        String Ville = scanner.nextLine();

        try {
            System.out.println("Dans la ville de : " + loadWeather(Ville).getName()+"\nIl fait "+  loadWeather(Ville).getMain().getTemp() + " °C avec un vent de " + loadWeather(Ville).getWind().getSpeed() + " km/h") ;
        } catch (Exception e) {
            System.out.println("Erreur ");
        }


    }

}