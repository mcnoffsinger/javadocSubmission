/**
 * Maxwell Noffsinger
 * Course: Java I
 * Date: 12/5/25
 * Prints a welcome message to the screen, then solves some simple math questions. Utilizes four submethods.
 */
public class JavadocPractice {

 
   



    /**
     * Entrance to the program. 
     * @param args command line arguments passed to the program are unused
     */
    public static void main(String[] args) {
        printWelcome();
        int result = add(4, 9);
        System.out.println("4 + 9 = " + result);
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 3 and 7 is " + max(3, 7));
    }


    /**
     * Adds two numbers (a and b) together and returns the result.
     * 
     * @param a the first number
     * @param b the second number
     * @return sum of a and b
     * 
     */
    public static int add(int a, int b) {
        return a + b;
    }


    /**
     * Checks if a number is even.
     * 
     * @param value the value to check
     * @return if the value is even
     * 
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * Prints a welocme message to the terminal. no input or output.
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * returns the larger of two integers. Essentially finding the max of an array of two integers.
     * @param x the first integer
     * @param y the second integer
     * @return x if x is the largest, y if y is the largest.
     * 
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
