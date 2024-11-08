package org.geekbrains;
public class ComplexCalculator implements Calculator {
    private final Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        logger.log("Сложение " + a + " и " + b + " = " + real + " + " + imaginary + "i");
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        logger.log("Умножение " + a + " и " + b + " = " + real + " + " + imaginary + "i");
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        logger.log("Деление " + a + " на " + b + " = " + real + " + " + imaginary + "i");
        return new ComplexNumber(real, imaginary);
    }
}
