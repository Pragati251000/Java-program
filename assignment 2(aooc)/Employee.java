class Employee {
    String firstName, lastName;
    double monthlySalary;

    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        monthlySalary = (s > 0) ? s : 0.0;
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }

    void raise() {
        monthlySalary = monthlySalary * 1.10;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", "Sharma", 30000);
        Employee e2 = new Employee("Neha", "Patil", 40000);

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());

        e1.raise();
        e2.raise();

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
    }
}
   