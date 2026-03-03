// Student Class
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Test Class (inherits Student)
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Marks: " + sub1 + ", " + sub2);
    }
}

// Sports Interface
interface Sports {
    int sMarks = 10;
    void set();
}

// Result Class
class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        getMarks();
        set();
        System.out.println("Total: " + (sub1 + sub2 + sMarks));
    }
}

// Main Class
class ResultTest {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(1);
        r.setMarks(80, 90);
        r.display();
    }
}