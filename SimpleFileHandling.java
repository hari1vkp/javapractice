package scratch1;

import java.io.*;

public class SimpleFileHandling {
    public static void main(String[] args) {
        String filename = "example.txt";
        try {
            // Create & Open file
            File file = new File(filename);
            file.createNewFile();

            // Write to file
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, Java File Handling!");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println("File Content: " + reader.readLine());
            reader.close();

            // Seek (lseek equivalent)
            RandomAccessFile raf = new RandomAccessFile(filename, "r");
            raf.seek(7); // Move to position 7
            System.out.println("Seek Position 7: " + (char) raf.read());
            raf.close();

            // Delete (unlink) file
            file.delete();
            System.out.println("File deleted.");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

