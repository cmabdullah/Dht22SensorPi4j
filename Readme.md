### Simple implementation of DHT22 Sensor using pi4j

### just config pin number and enjoy

```java
public class Client {

    public static void main(String[] args) {

        WeatherContext weatherContextIndoor = new WeatherContext();
        weatherContextIndoor.setSensor(new Dth22Reader(PinConfig.DTH_22_PIN_CONFIG_INDOOR.getAddress()), "Dth22 Indoor");
        weatherContextIndoor.read();

    }
}
```