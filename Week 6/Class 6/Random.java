/* *****************************************************************************
 *  Name:    
 *
 *  Description:  Generates an array with N random values between 0 and 1
 *
 **************************************************************************** */

public class Random {
    public static void main(String[] args) {

        // read an integer from the command-line
        int n = Integer.parseInt(args[0]);

        // create an array a of n doubles
        // Hint: look back at the lecture notes for how to do this
        double [] a = new double[n];

        // use a for loop to populate the array with random doubles
        for (int i = 0; i < n; i++)
            a[i] = Math.random();

        // use a for loop to print out the value of each double
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);

    }
}