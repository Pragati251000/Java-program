// Shape Interface
interface Shape {
    double area();
}

// Rectangle Class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

// Triangle Class
class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Test Class
class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(6, 3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}