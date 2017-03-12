package pers.westland.learn.observer;

import org.testng.annotations.Test;
import pers.wesswind.learn.obsever.WeatherData;
import pers.wesswind.learn.obsever.display.CurrentConditionsDisplay;
import pers.wesswind.learn.obsever.display.ForecastDisplay;

/**
 * Created by Administrator on 2017/3/9.
 */
public class TestWeatherDataObservable {
    @Test
    public void testSmoke() {
        WeatherData weatherData = new WeatherData();

        new ForecastDisplay(weatherData);
        new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10, 10, 10);
    }
}
