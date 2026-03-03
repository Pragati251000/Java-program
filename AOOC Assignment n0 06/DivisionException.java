// Custom Exception
class DivisionException extends Exception {
    DivisionException(String msg) {
        super(msg);
    }
}

// Calculator Class
class Calculator {
    int divide(int a, int b) throws DivisionException {
        if (b == 0)
            throw new DivisionException("Cannot divide by zero");
        return a / b;
    }
}

// Main Class
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            int result = calc.divide(10, 0); // Change divisor to test
            System.out.println("Result: " + result);
        } 
        catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}