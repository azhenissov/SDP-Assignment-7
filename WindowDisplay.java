// Concrete Observer: WindowDisplay
public class WindowDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display() {
        System.out.println("Window Display Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + "hPa");
    }
}
