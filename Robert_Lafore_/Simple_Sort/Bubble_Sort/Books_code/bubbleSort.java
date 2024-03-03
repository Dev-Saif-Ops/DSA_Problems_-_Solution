package Robert_Lafore_.Simple_Sort.Bubble_Sort.Books_code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ArrayBub {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    //-------------------------------------------------

    public ArrayBub(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    //-------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; //increment size
    }

    //-------------------------------------------------

    public void display()  // displays array contents
    {
        for(int j = 0; j < nElems; j++)  // for each element,
        {
            System.out.print(a[j] + " "); // display it
        }
        System.out.println(" ");
    }

    //-------------------------------------------------

    public void bubbleSort()
    {
        int out, in;

        for(out = nElems -1; out > 1; out--) // outer loop (backward)
        {
            for(in = 0; in < out; in++)  // inner loop (forward)
            {
                if(a[in] > a [in + 1]) // out of order?
                {
                    swap(in, in+1); // swap them
                }
            }
        }
    }

    //-------------------------------------------------

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    //------------------------------------------------------------------------------------------  

    public static void readInputFromFile(String filePath, ArrayBub arr) {
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

//---------------------------------------------------------------------------------------------------------

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        ArrayBub arr = new ArrayBub(maxSize); // create the array

        // Provide the file paths for input and output
        String inputFilePath = "/home/hi-tech/DSA_learning/input.txt";
        String outputFileName = "output.txt"; // Change the output file name if needed

        // Read input from file
        System.out.println("Input File Detected");
        arr.readInputFromFile(inputFilePath, arr);

        System.out.println("Original Array:");
        arr.display(); // display items

        arr.bubbleSort(); // bubble sort them

        System.out.println("Sorted Array:");
        arr.display(); // display them again

        // Save sorted output to file in the same directory
        System.out.println("Output File created");
        String outputFilePath = outputFileName;
        arr.saveOutputToFile(outputFilePath);
    } // end main()
}