import java.util.logging.Logger;

public class Calculator {

    // Метод для сложения комплексных чисел

    private int result;

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        log.info("Выпoдняется операция сложения");
        ComplexNumber result = a.add(b);
        log.info("Результат: = " + result);
        return result;
    }

    // Метод для умножения комплексных чисел

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        log.info("Выпoдняется операция умножения");
        ComplexNumber result = a.multiply(b);
        log.info("Результат: = " + result);
        return result;
    }

    // Метод для деления комплексных чисел

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
       log.info("Выпoдняется операция деления");
        ComplexNumber result = a.divide(b);
        log.info("Результат: = " + result);
        return result;
    }

    public int getResult() {
        return result;
    }

    private static Logger log = Logger.getLogger(Calculator.class.getName());

   
    

}
