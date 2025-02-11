import java.util.Arrays;
import java.util.Scanner;

import apple.laf.JRSUIConstants.Size;

import java.io.File;
public class DriverMH {

     /**
    * Reads 100 integers from a file, could be named "data.txt".
    * @param fileName The name of the file where the integers are.
    * @return Returns an integer array
    */
    public Integer[] read100Integers(String fileName) {
        File myfile = new File("data_sorted.txt");
        Scanner scan = new Scanner(myfile);
        Integer[] result = new Integer[100];
        int i = 0;
        result[i] = Integer.valueOf(i);

        while(scan.hasNextInt()){

            result[i++] = scan.nextInt();
       }

        scan.close();
        return result;


    }

    /**
     * Outputs first 10 integers of heap array, after heap creation, into output file.
     * @param heap The MaxHeap object, used to access the heap array values.
     */
    public static void print10Num_Creation(MaxHeap<Integer> heap, String fileName) {

    }

    /**
     * Outputs number of swaps performed, after heap creation, into output file.
     * @param heap The MaxHeap object, used to access the swaps value.
     */
    public static void printSwaps(MaxHeap<Integer> heap, String fileName) {

    }

    /**
     * Performs 10 removals on the given heap.
     * @param heap The MaxHeap object from which to perform 10 removals.
     */
    public static void perform10Removals(MaxHeap<Integer> heap) {
        
        for(int k = 0 ; k <= 10 ; k++)
        heap.removeMax();
    }

    /**
     * Output the first 10 integers of heap array, after 10 removals, into output file.
     * @param heap
     */
    public static void print10Num_Removal(MaxHeap<Integer> heap, String fileName) {
        File myfile = new File("data.txt");
        Scanner scan = new Scanner(myfile);
        Integer[] output = new Integer[100];
        int i = 0;
        output[i] = Integer.valueOf(i);

        while(scan.hasNextInt()){

            output[i++] = scan.nextInt();
       }

        scan.close();
        String outputline;
        outputline = String.valueOf(output);
        outputline.print("Heap after 10 removals:" );
        for (int i = 10; i > 0; i--) {
            heap.removeMax();
        }
         for (int i = 1; i < 11; i++) {
            int number = heap.printOut(i);
            outputline.print(number + ","); }

        
    }





    public static void main(String []args) {

        String inputFileName = "data_sorted.txt";
        String outputFileName = "data.txt";
        //Integer[] valueArray = {20,40,30,10,90,70};

        Integer[] heapValues = read100Integers(inputFileName);

        // Creating heap the sequential way
        MaxHeap<Integer> sequenHeap = new MaxHeap<>();
        sequenHeap.createHeap_Sequential(heapValues);

        // Print first 10 integers to output file, after



        // Creating heap the smart way
        MaxHeap<Integer> smartHeap = new MaxHeap<>();
        smartHeap.createHeap_SmartWay(heapValues);

        // Print first 10 integers to output file, after creation of heap
        print10Num_Creation(smartHeap, outputFileName);

        // Print number of swaps performed to output file
        printSwaps(smartHeap, outputFileName);

        // Perform 10 removals on the heap
        perform10Removals(smartHeap);

        // Print first 10 integers of heap array after 10 removals
        print10Num_Removal(smartHeap, outputFileName);

        //smartHeap.printHeap();



    }

}
