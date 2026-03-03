import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) {
        try {
            // Replace path with actual path to your file
            File file = new File("C:\\Users\\Public\\sample.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}