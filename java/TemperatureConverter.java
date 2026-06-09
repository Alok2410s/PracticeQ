//  WAP to calculate celcius when temperature is 66 Fahrenheit.

public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 66.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }
}
