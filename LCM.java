import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the LCM using the formula: 
        // LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = findLCM(num1, num2);
        
        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
    
    // Method to find the LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);  // LCM formula
    }

    // Method to find the Greatest Common Divisor (GCD)
    public static int findGCD(int a, int b) {
        // Using Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

