package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        toFahrenheit(14);
    }
    public static void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (double)temperatureCelsius * ((double) 9 /5) + 32;
        System.out.println(fahrenheit);
    }
}
