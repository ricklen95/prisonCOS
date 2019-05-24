/* *****************************************************************************
 *  Name:    
 * 
 *  Description:  Takes a command line argument n and prints out
 *                integers 1 through n. Your job is to convert the
 *                while loop into a for loop.
 *
 **************************************************************************** */

public class WhileToFor {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int i = 1;

        // this loop prints out the integers 1 through n
        while (i <= n) {
            System.out.println(i);
            i++;
        }

    }
}