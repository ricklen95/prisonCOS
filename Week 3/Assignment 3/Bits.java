/* *****************************************************************************
 *  Name:    
 *
 *  Description: Takes an integer command-line argument n and uses a while
 *               loop to compute the number of times you need to divide n
 *               by 2 until it is strictly less than 1. Print the error
 *               message "Illegal input" if n is negative.
 *
 **************************************************************************** */

public class Bits {
    public static void main(String[] args) {
        
        // read in a command-line argument n as an int

        
        // if n is negative, print an error
        if (_______) {
            System.out.println("Illegal Input");
        }
        
        else {
            
            // i starts as zero, because so far we have divided
            // n in half zero times
            int i = 0;
            
            // repeatedly divide n by 2 until n is less than 1.
            // increment i by 1 each time you do this
            while (____________) {
                ___________; // divide n in half
                ___________; // increase the value of i by 1
            }
            
            // print the final value of i, which should be the 
            // number of times we divided n before it was less than 1
            System.out.println(i); 
            
        }
        
    }
}
