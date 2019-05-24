/* *****************************************************************************
 *  Name:
 *
 *  Description:  Generates an array with N random values between 0 and 1
 *
 **************************************************************************** */

public class RandomAverage {
    public static void main(String[] args) {

        // read an integer from the command-line
        int n = Integer.parseInt(args[0]);

        // create an array a of n doubles
        // Hint: look back at the lecture notes for how to do this
        double [] a = new double[n];

        // use a for loop to populate the array with random doubles
        for (int i = 0; i < n; i++)
            a[i] = Math.random();

        // initialize sum to 0
        double sum = 0.0;
            
        // use a for loop to tally the sum of the values in a
        for (int i = 0; i < n; i++)
            sum = sum + a[i];

        // calculate the average based on the sum and n
        double average = sum/n;
        
        // print the average
        System.out.println(average);
        
    }
}