import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int n1, n2, total = 0;
        System.out.println("Welcome to the Calculator");

        System.out.println("Enter a command ('q' to quit): ");
        String command = scanner.next();
        while (!command.equals("q")) {
            switch (command) {
                case "add":
                    n1 = scanner.nextInt();
                    n2 = scanner.nextInt();
                    total = calculator.add(n1, n2);
                    System.out.println(total);
                    break;
                case "subtract":
                    n1 = scanner.nextInt();
                    n2 = scanner.nextInt();
                    total = calculator.subtract(n1, n2);
                    System.out.println(total);
                    break;
                case "multiply":
                    n1 = scanner.nextInt();
                    n2 = scanner.nextInt();
                    total = calculator.multiply(n1, n2);
                    System.out.println(total);
                    break;
                case "divide":
                    n1 = scanner.nextInt();
                    n2 = scanner.nextInt();
                    total = calculator.divide(n1, n2);
                    System.out.println(total);
                    break;
                case "fibonacci":
                    n1 = scanner.nextInt();
                    total = calculator.fibonacciNumberFinder(n1);
                    System.out.println(total);
                    break;
                case "binary":
                    n1 = scanner.nextInt();
                    String binTotal = calculator.intToBinaryNumber(n1);
                    System.out.println(binTotal);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
            command = scanner.next();
        }
    }
}
