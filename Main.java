import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();  

        
        int sum = a + a;

        
        System.out.println(sum);
        
        scanner.close();
    }
}

