package com.paradox.openclose;

public interface Sensor {

    WeatherParameter readWeatherData() throws Exception;
}
