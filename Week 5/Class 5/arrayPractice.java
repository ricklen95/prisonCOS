/* **************************************************************************
 * Name:
 *
 * Description: This program creates an array, changes some of the elements, 
 * and prints out the values of those elements. 
 **************************************************************************** */

public class arrayPractice {
    public static void main(String[] args) {
        
        int n = 5;
        
        // this is your array
        int [] a;
        a = new int[n];
        
        a[0] = 1;
        a[1] = 2; 
        a[2] = a[0] + a[1];
        a[3] = a[0] * a[1];
        a[0] = 5;
        
        int [] b = a;
        
        b[2] = 7;
        
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
       
    }
}

