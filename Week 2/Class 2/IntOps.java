/* *****************************************************************************
 *  Name:    
 *
 *  Description:  Takes two command-line arguments, saves them as ints,
 *  and performs a number of operations on them. Then, prints the results.
 *  
 *  % java IntOps 1234 99
 *  1234 * 99 = 122166
 *  1234 / 99 = 12
 *  1234 % 99 = 46
 *  1234 = 12 * 99 + 46
 *
 **************************************************************************** */

public class IntOps {
    public static void main(String[] args) {
        
        // read in the two command-line arguments and convert them to ints
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // perform some routine operations and save the results as ints
        int p = a * b;
        int q = a / b;
        int r = a % b;
        
        // print statements that describe the operations and their results
        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q);
        System.out.println(a + " % " + b + " = " + r);
        System.out.println(a + " = " + q + " * " + b + " + " + r);
    }
}