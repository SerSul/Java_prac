package task6.task11;

public class TemperatureConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        return kelvin;
    }

    public static void main(String[] args) {
        double celsius = 26.0; 

        TemperatureConverter converter = new TemperatureConverter();
        double kelvin = converter.convert(celsius);

        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
    }
}