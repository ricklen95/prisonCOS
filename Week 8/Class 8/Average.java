/******************************************************************************
  *  Name:
  * 
  *  Description: Reads in a sequence of real numbers, and computes their average.
  *
  ******************************************************************************/

public class Average { 
    public static void main(String[] args) { 
        
        int count = 0;       // number input values
        double sum = 0.0;    // sum of input values
        
        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }
        
        // compute the average
        double average = sum / count;
        
        // print results
        System.out.println("Average is " + average);
    }
}