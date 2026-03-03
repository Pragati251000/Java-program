import java.io.*;

public class FileAnalysisDemo {
    public static void main(String[] args) {
        int vowelCount = 0, wordCount = 0, aCount = 0;
        
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Public\\sample.txt"));
            String line;
            
            while ((line = br.readLine()) != null) {
                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
                
                // Count vowels and 'a'
                for (char ch : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) vowelCount++;
                    if (ch == 'a') aCount++;
                }
            }
            
            br.close();
            
            System.out.println("Total vowels: " + vowelCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Number of 'a': " + aCount);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}