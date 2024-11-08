package org.geekbrains;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        Calculator calculator = new ComplexCalculator(logger);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        int choice = scanner.nextInt();

        System.out.println("Введите действительную часть первого числа:");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Введите действительную часть второго числа:");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа:");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber a = new ComplexNumber(real1, imaginary1);
        ComplexNumber b = new ComplexNumber(real2, imaginary2);

        ComplexNumber result = null;
        switch (choice) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.multiply(a, b);
                break;
            case 3:
                result = calculator.divide(a, b);
                break;
            default:
                System.out.println("Неверный выбор операции.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
