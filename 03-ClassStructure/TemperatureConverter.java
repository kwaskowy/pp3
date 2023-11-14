public class TemperatureConverter {
    public static String CelsciusToKelvin(double c){
        return String.format("%.2f",(c+273.15));
    }
    public static String KelvinToCelsius(double k){
        return String.format("%.2f",(k-273.15));
    }
    public static String CelsiusToFahrenheit(double c){
        return String.format("%.2f",(c*(9.0f/5.0f)+32));
    }
    public static  String  FahrenheitToCelsius(double f){
        return String.format("%.2f",((f-32)*(5.0f/9.0f)));
    }
    public static  String  KelvinToFahrenheit(double k){
        return String.format("%.2f",(((k*(9.0f/5.0f))-459.67f)));
    }
    public static  String  FahrenheitToKelvin(double f){
        return String.format("%.2f",((f+459.67)*(5.0f/9.0f)));
    }

}
