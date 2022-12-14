package org.example.beans;

public class WeatherBean {
    private WindBean wind;

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TempBean getMain() {
        return main;
    }

    public void setMain(TempBean main) {
        this.main = main;
    }

    private String name;
    private TempBean main;
}
