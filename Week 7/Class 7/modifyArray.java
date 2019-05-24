/* **************************************************************************
 * Name:
 *
 * Description: This program defines a number of basic functions and 
 * shows some of them in use.
 **************************************************************************** */

public class modifyArray {
    
    // adds 1 to each value in an int array
    private static void addOneArray(int [] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = a[i] + 1;
    }   
    
    // returns an int array for which each value is 1 greater
    private static int[] newArray(int [] a) {
        int [] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i] + 1;
        return b;
    }
    
    public static void main(String[] args) {

        int n = args.length;
        
        int [] intArgs = new int[n];
        
        for (int i = 0; i < n; i++)
            intArgs[i] = Integer.parseInt(args[i]);
        
        addOneArray(intArgs);
        
        for (int i = 0; i < n; i++)
            System.out.println(intArgs[i]);
        
    }
}

