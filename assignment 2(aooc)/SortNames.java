import java.util.Arrays;
class SortNames {
    public static void main(String args[]) {

        String names[] = {"Rahul", "Sneha", "Amit", "Priya", "Karan",
                          "Neha", "Rohit", "Anita", "Sonal", "Vikas"};

        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}