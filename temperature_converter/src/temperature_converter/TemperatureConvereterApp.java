package temperature_converter;

import java.util.Scanner;

public class TemperatureConvereterApp {
public static void main(String[] args) {
 Scanner scan=new  Scanner(System.in);
 System.out.println("enter fahrenheit");
 double fahrenheit = scan.nextDouble();
 System.out.println("enter temp in celscuis");
 double celcuis=scan.nextDouble();
 TemperatureConverter t= new TemperatureConverter();
 System.out.println("temperature in fahrenheint is "+ t.convertFahrenheitToCelsius(fahrenheit));
 System.out.println("temperature in celcius is "+ t.FtoC(celcuis));
}
}
