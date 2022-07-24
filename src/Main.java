import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        int a;
        int b;
        a = 10;
        b = 2;
        int c;


        c = a - b;

        System.out.println(c);

 */
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac pierwsza liczbe");
        int firstVariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        int secondVariable = scanner.nextInt();
        System.out.println("Twoj wynik dodawania to " + calculator.add(firstVariable, secondVariable));

        System.out.println("Prosze podac pierwsza liczbe");
        firstVariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        secondVariable = scanner.nextInt();
        System.out.println("Twoj wynik odejmowania to " + calculator.sub(firstVariable, secondVariable));

        System.out.println("Prosze podac pierwsza liczbe");
        firstVariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        secondVariable = scanner.nextInt();
        System.out.println("Twoj wynik odejmowania to " + calculator.multiply(firstVariable, secondVariable));

    }


}

