/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo n
 *  
 *  This program takes a command-line argument n and prints a table of
 *  the powers of 2 that are less than or equal to 2^n.
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  Remarks
 *  ------------
 *  Only works if 0 <= n < 31 since 2^31 overflows an int.
 *
 ******************************************************************************/

public class printI {
    public static void main(String[] args) {
        
        int n = 5;
        int i = 0;    

        // repeat until i equals n
        while (i < n) {
            System.out.println("i");
            i = i + 1;
        }

    }
}