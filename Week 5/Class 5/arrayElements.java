/* **************************************************************************
 * Name:
 *
 * Description: This program creates an array, assigns each element 
 * in the array to be equal to the index of the element, and prints the values.
 **************************************************************************** */

public class arrayElements {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        
        // this is your array
        int [] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
    }
}

