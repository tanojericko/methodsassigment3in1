/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodassignment;
import java.util.*;
/**
 *
 * @author Jericko James Tano
 */
public class MethodAssignment {

    public static void printMenu() {
        System.out.println("           (¯`·.¸¸.·´¯`·.¸¸.·´¯`·.¸¸.-> Choose a program from the option <-.¸¸.·´¯`·.¸¸.·´¯`·.¸¸.·´¯)");
        System.out.println("                           Press 1 for program that calculates the area of a circle");
        System.out.println("               Press 2 for program that calculates the sum of all integers up to given number");
        System.out.println("                Press 3 for a program that converts a temperature from Celsius to Fahrenheit");
        System.out.println("             (¯`·.¸¸.·´¯`·.¸¸.·´¯`·.¸¸.-> Type your selection below  <-.¸¸.·´¯`·.¸¸.·´¯`·.¸¸.·´¯)");
        System.out.print("> ");
    }
    public static void getUserIput(int getres) {
        if (getres == 1) AreaofCirle();
        else if (getres == 2) sumOfIntegers();
        else if (getres == 3) CelciustoFarenheight();
        else System.out.print("Not from the option!");
    }
    public static void AreaofCirle() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = myScan.nextDouble();
        double area = circleFormula(radius);
        System.out.printf("The area of the circle is: %.2f",area);
        System.out.println();
        askToReturnToMainMenu();
    }
    public static double circleFormula(double radius) {
        return Math.PI * radius * radius;
    }
    public static void sumOfIntegers() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Type your chosen integer: ");
        int getInteger = myScan.nextInt();
        int sum = integerSumFormula(getInteger);
        System.out.println("The sum of integers from 1 to " + getInteger + " is " + sum);
        askToReturnToMainMenu();
    }
    public static int integerSumFormula(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void CelciustoFarenheight() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = myScan.nextDouble();
        double fahrenheit = CtoFformula(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit\n", celsius, fahrenheit);
        askToReturnToMainMenu();
    }
    public static double CtoFformula(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void askToReturnToMainMenu() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Would you like to return to the main menu? Type Yes or No: ");
        System.out.print("> ");
        String response = myScan.next();
        if (response.equalsIgnoreCase("Yes")) main(new String[] {});
        else if (response.equalsIgnoreCase("No")) System.exit(0);
        else System.out.println("Not from the option!");askToReturnToMainMenu();
    }
    public static void main(String[] args) {
        Scanner myScan = new Scanner (System.in);
        printMenu();
        int getres = myScan.nextInt();
        getUserIput(getres);
    }
}
