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
        int a = scanner.nextInt();
        System.out.println("co Ty chcesz zrobic ziomus + - * /");
        String znak = scanner.next();
        System.out.println("Prosze podac druga liczbe");
        int b = scanner.nextInt();
        switch (znak) {
            case "+":
                System.out.println(calculator.add(a, b));
                break;
            case "-":
                System.out.println(calculator.sub(a, b));
                break;
            case "*":
                System.out.println(calculator.multiply(a, b));
                break;
            case "/":
                System.out.println(calculator.div(a, b));
        }

    }


}

