// task 1

import java.util.Scanner;

public class TemperatureConversion {

   
    public static void celsiusToOther(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "° Celsius is " + fahrenheit + "° Fahrenheit and " + kelvin + " Kelvin.");
    }

    
    public static void fahrenheitToOther(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println(fahrenheit + "° Fahrenheit is " + celsius + "° Celsius and " + kelvin + " Kelvin.");
    }

  
    public static void kelvinToOther(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println(kelvin + " Kelvin is " + celsius + "° Celsius and " + fahrenheit + "° Fahrenheit.");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the original unit (Celsius, Fahrenheit, Kelvin): ");
        String unit = scanner.next().toLowerCase();

        
        if (unit.equals("celsius")) {
            celsiusToOther(temperature);
        } else if (unit.equals("fahrenheit")) {
            fahrenheitToOther(temperature);
        } else if (unit.equals("kelvin")) {
            kelvinToOther(temperature);
        } else {
            System.out.println("Invalid unit entered. Please enter one of the following: Celsius, Fahrenheit, Kelvin.");
        }

        scanner.close();
    }
}

