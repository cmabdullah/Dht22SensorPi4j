package com.paradox.openclose;

import lombok.Data;

@Data
public class WeatherParameter {


    /**
     * PI4J Pin number.
     */
    public int pinNumber;

    /**
     * 40 bit Data from sensor
     */
    public  byte[] data ;

    /**
     * Value of last successful humidity reading.
     */
    public  Double humidity ;

    /**
     * Value of last successful temperature reading.
     */
    public  Double temperature ;

    /**
     * Last read attempt
     */
    public  Long lastRead ;

    /**
     * Constructor with pin used for signal.  See PI4J and WiringPI for
     * pin numbering systems.....
     *
     * @param pin
     */
    public WeatherParameter(int pinAddress) {
        this.pinNumber = pinAddress;
    }
}
