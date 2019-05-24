/* *****************************************************************************
 *  Name:
 *
 *  Description:  Generates an array with N random values between 0 and 1
 *
 **************************************************************************** */

public class RandomMax {
    public static void main(String[] args) {

        // read an integer from the command-line
        ___________________________;

        // create an array a of n doubles
        // Hint: look back at the lecture notes for how to do this
        ___________________________;

        // use a for loop to populate the array with random ints
        // between 1 and 100
        for (int i = 0; i < n; i++) {
            
            // recall that to get a random int between 0 and 99, 
            // we write (int) (Math.random()*100). 
            // Modify this so that we have a random int 
            // between 1 and 100, and assign a[i] to that value
            a[i] = _______________;

        }
        
        // initialize max to 0
        int max = 0;
            
        // use a for loop to keep track of the max value in the array
        for (int i = 0; i < n; i++)
            // recall that Math.max(a, b) gives you the max
            // of the two numbers a and b. 
            max = ______________;

        
        // print the max
        System.out.println(_______);
        
    }
}