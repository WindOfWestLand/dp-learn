package pers.wesswind.learn.obsever.display;

import pers.wesswind.learn.obsever.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/9.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            this.display();
        }
    }

    public void display() {
        System.out.println("Current Pressure:" + currentPressure);
    }
}
