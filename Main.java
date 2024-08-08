import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();  

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();  

        int sum = a + b;

        
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        
        scanner.close();
    }
}

