// Custom Exception
class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

public class OddDemo {

    static void check(int num) throws OddNumberException {
        if (num % 2 != 0)
            throw new OddNumberException("Number is Odd");
        else
            System.out.println("Number is Even");
    }

    public static void main(String[] args) {
        try {
            check(5);   // Change number to test
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}