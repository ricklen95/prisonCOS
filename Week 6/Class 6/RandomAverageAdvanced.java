/* *****************************************************************************
 *  Name:
 *
 *  Description:  For a given n, run multiple trials of the following 
 *  experiment: Generates an array with N random values between 0 and 1, 
 *  and calculate the average among them. Then, calculate the distance 
 *  between that average and 0.5. Among all the trials, calculate the 
 *  average distance. For number of trials, use a large number such as
 *  10000. 
 *
 **************************************************************************** */

public class RandomAverageAdvanced {
    public static void main(String[] args) {

        // read an integer from the command-line
        int n = Integer.parseInt(args[0]);

        // create an array a of n doubles
        // Hint: look back at the lecture notes for how to do this
        double [] a = new double[n];

        
        int totalTrials = 10000;
        
        double distSum = 0.0;
        
        for (int trial = 0; trial < totalTrials; trial++) {
        
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
            
            double distance = Math.abs(0.5 - average);
         
            distSum = distSum + distance;
            
        }
            
        double distAverage = distSum / totalTrials;
        
        System.out.println(distAverage);
            
            
        
    }
}