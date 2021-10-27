
package HomeWork13Loops;

public class WhileLoopEvenOdd {
    //write a program to print 10 even numbers and 10 add numbers
    //write a program to generate tables of your choice
    public static void main(String[] args) {

        //Even Numbers

        int N = 1;
        while (N <= 20) {
            if (N % 2 == 0) {
                System.out.println("Even number is " + N);
            }
            N++;
        }

        int O = 1;
        while (O <= 20) {
            if (O % 2 != 0) {
                System.out.println("Odd number is " + O);
            }
            O++;

            // Odd Numbers


        }
    }
}

