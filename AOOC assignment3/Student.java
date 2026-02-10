class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }
}

class Test extends Student {
    int marks1, marks2;

    void setMarks(int m1, int m2) {
        marks1 = m1;
        marks2 = m2;
    }
}

class Result extends Test {
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + (marks1 + marks2));
    }
}

class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(40, 45);
        r.display();
    }
}