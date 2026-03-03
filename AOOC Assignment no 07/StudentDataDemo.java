import java.io.*;
import java.util.Scanner;

public class StudentDataDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Weight: ");
        float weight = sc.nextFloat();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();
        sc.nextLine(); // consume newline
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();
        
        // Write data
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("studentdata.dat"))) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeLong(phone);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        
        // Read data
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("studentdata.dat"))) {
            String rName = dis.readUTF();
            int rAge = dis.readInt();
            float rWeight = dis.readFloat();
            float rHeight = dis.readFloat();
            String rCity = dis.readUTF();
            long rPhone = dis.readLong();
            
            System.out.println("\n--- Student Information ---");
            System.out.println("Name: " + rName);
            System.out.println("Age: " + rAge);
            System.out.println("Weight: " + rWeight);
            System.out.println("Height: " + rHeight);
            System.out.println("City: " + rCity);
            System.out.println("Phone: " + rPhone);
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        sc.close();
    }
}