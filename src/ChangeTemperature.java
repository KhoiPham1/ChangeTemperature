
import java.util.Scanner;

public class ChangeTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9/5)*celsius+32;
        return fahrenheit;

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9)*(fahrenheit-32);
        return celsius;
    }
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+ celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice!=0);
        System.out.println("Enter fahrenheit: ");
        }
    }


