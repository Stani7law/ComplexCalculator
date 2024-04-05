public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ComplexNumber comp =  new ComplexNumber(5, 7);
        Calculator calc = new Calculator();
        
        
       
        calc.add(comp, comp);
        System.out.println("----------------------------");
        calc.divide(comp, comp);
        System.out.println("----------------------------");
        calc.multiply(comp, comp);
        
        }

        

       
}
