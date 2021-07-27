package ObserverPattern.WeatherApp;

import ObserverPattern.WeatherApp.Data.WeatherData;
import ObserverPattern.WeatherApp.DisplayElements.CurrentConditionsDisplay;
import ObserverPattern.WeatherApp.DisplayElements.ForecastDisplay;
import ObserverPattern.WeatherApp.DisplayElements.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 80, 75);
        weatherData.setMeasurements(35, 40, 10);
        weatherData.setMeasurements(30, 120, 40);
    }
}
