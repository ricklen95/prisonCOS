/* **************************************************************************
 * Name:
 *
 * Description: This program defined the method addOne and shows an example
 * of it in use.
 **************************************************************************** */

public class useAddOne {
    
    // this method takes an int n and returns n+1
    private static int addOne(int n) {
        int oneMore = n + 1;
        return oneMore;
    }
    
    public static void main(String[] args) {

        int number = addOne(5);
        
        System.out.println(number);
    }
}

