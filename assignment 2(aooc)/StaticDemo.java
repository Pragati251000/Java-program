class StaticDemo {

    static int num;

    // Static block
    static {
        num = 10;
        System.out.println("Static Block Executed");
    }

    // Static method
    static void show() {
        System.out.println("Static Method Called");
        System.out.println("Number: " + num);
    }

    public static void main(String args[]) {
        StaticDemo.show();
    }
}