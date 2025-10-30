// Demo Class
public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer window = new WindowDisplay();

        station.registerObserver(phone);
        station.registerObserver(window);


        station.setMeasurements(25.3f, 65.0f, 1012.5f);
        System.out.println("-------------");
        station.setMeasurements(26.7f, 60.0f, 1010.2f);

        station.registerObserver(phone);
        station.registerObserver(window);
    }
}
