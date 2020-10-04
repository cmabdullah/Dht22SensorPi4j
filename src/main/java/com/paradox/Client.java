package com.paradox;

import com.paradox.config.PinConfig;
import com.paradox.dth22.Dth22Reader;
import com.paradox.openclose.WeatherContext;

public class Client {

    public static void main(String[] args) {

        WeatherContext weatherContextIndoor = new WeatherContext();
        weatherContextIndoor.setSensor(new Dth22Reader(PinConfig.DTH_22_PIN_CONFIG_INDOOR.getAddress()), "Dth22 Indoor");
        weatherContextIndoor.read();

    }
}