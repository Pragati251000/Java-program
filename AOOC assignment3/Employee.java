class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println(jobTitle + " performance is satisfactory.");
    }

    void manageProjects() {
        System.out.println(jobTitle + " is managing projects.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }
}

class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", "Mumbai", 80000);
        Developer d = new Developer("Neha", "Pune", 60000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        d.performanceReport();
    }
}