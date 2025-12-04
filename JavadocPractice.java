public class JavadocPractice {

    // ------------------------------------------------------------
    // TODO: Write a class-level Javadoc comment here.
    // Describe the purpose of this class in 1–2 sentences.
    /*
     * This is a 
     * 
     * 
     * 
     * 
     */
    // ------------------------------------------------------------


    /**
     * Prints a welcome message to the terminal. 
     * Prints the answer to some simple math questions using three methods.
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
     * 
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * returns the larger of two integers. Essentially finidng the max of an array of two integers.
     * @param x the first integer
     * @param y the second integer
     * @return x if x is the largest, y if y is the largest.
     * 
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
