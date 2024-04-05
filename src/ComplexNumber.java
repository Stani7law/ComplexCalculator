public class ComplexNumber {
    private double real;

    private double imaginary;

    // Конструктор класса ComplexNumber
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Метод сложения комплексных чисел

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    // Метод деления комплексных чисел

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary + other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }

    // Метод умножения комплексных чисел

    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = this.real + other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    // Метод для получения стокового представления комплексных чисел
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";

        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }

    }

}
