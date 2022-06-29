//Part 2 - Weight Guru Challenge
// Create a Java program that tells whether your body to weight ratio is good or could be better.
// The java app should take in your weight and height from the console and calculate your body to weight ratio.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: "); //prompt user to enter weight in pounds
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in inches: "); //prompt user to enter height in inches
        
        //Calculatation of body to weight ratio
        double height = scanner.nextDouble(); //store user input in variables
        double bodyToWeightRatio = weight / (height * height); //calculate body to weight ratio (BMI) using formula
        System.out.println("Your Body Mass Index is: " + bodyToWeightRatio);
        //BMI 19 to 24 is considered normal
        if (bodyToWeightRatio >= 19 && bodyToWeightRatio <= 24) {
            System.out.println("Your BMI is normal.");
        } else if (bodyToWeightRatio >= 25 && bodyToWeightRatio <= 29) {
            System.out.println("You are overweight.");
        } else if (bodyToWeightRatio >= 30 && bodyToWeightRatio <= 39) {
            System.out.println("You are obese.");
        } else {
            System.out.println("You are in a very unhealthy condition.");
        }
       
    }
}
