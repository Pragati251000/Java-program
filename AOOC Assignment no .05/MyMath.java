package MathOperations;

// MyMath class
class MyMath {

    static double floor(double n) {
        return Math.floor(n);
    }

    static double ceil(double n) {
        return Math.ceil(n);
    }

    static long round(double n) {
        return Math.round(n);
    }
}

// Main class
public class MathTest {
    public static void main(String[] args) {

        double num = 5.8;

        System.out.println("Number: " + num);
        System.out.println("Floor: " + MyMath.floor(num));
        System.out.println("Ceil: " + MyMath.ceil(num));
        System.out.println("Round: " + MyMath.round(num));
    }
}