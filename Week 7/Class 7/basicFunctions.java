/* **************************************************************************
 * Name:
 *
 * Description: This program defines a number of basic functions and 
 * shows some of them in use.
 **************************************************************************** */

public class basicFunctions {
    
    // takes an int n and returns n+1
    private static int addOne(int a) {
        return a + 1;
    }
    
    // returns 4 no matter what
    private static int returnFour() {
        return 4;
    }
    
    // adds two numbers
    private static int add(int a, int b) {
        return a + b;
    }
    
    // multiplies two numbers
    private static int multiply(int a, int b) {
        return a * b;
    }
    
    // adds one to two numbers, and then multiplies them
    private static int addOneAndMultiply(int a, int b) {
        int x =  addOne(a);
        int y =  addOne(b);
        int z = multiply(x, y);
        return z;
    }
    
    // print a number
    private static void printNumber(int a) {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        
        int firstNumber = returnFour();
        int secondNumber = 7;
        int result = addOneAndMultiply(firstNumber, secondNumber);
        
        printNumber(result);
    }
}

