package pers.wesswind.learn.obsever.display;

import pers.wesswind.learn.obsever.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/9.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println(String.format("Current conditions: " +
                "%fF degrees and %f%% humidity", this.temperature, this.humidity));
    }
}
