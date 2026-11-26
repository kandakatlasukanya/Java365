
import java.io.File;
import java.io.IOException;

public class Nov26 {
    public static void main(String[] args) {

        try {
            // Create a File object
            File f = new File("sample.txt");

            // Create a new file
            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // Display file properties
            System.out.println("File Name: " + f.getName());
            System.out.println("File Path: " + f.getAbsolutePath());
            System.out.println("File Exists: " + f.exists());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("File Size: " + f.length() + " bytes");
            System.out.println("Is Directory: " + f.isDirectory());
            System.out.println("Is File: " + f.isFile());

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
