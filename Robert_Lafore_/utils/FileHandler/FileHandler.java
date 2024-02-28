package Robert_Lafore_.utils.FileHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;



public class FileHandler {

    public static void readInputFromFile(String filePath, Array arr) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }
                
                try {
                    long value = Long.parseLong(line.trim());
                    arr.insert(value);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //------------------------------------------------------------------------------------------

    public void saveOutputToFile(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int j = 0; j < nElems; j++) {
                writer.println(a[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
}
