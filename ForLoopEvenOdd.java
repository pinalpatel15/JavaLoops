
package HomeWork13Loops;

public class ForLoopEvenOdd {
    //Write a program to print 10 even numbers and 10 add numbers.
    //Write a program to generate tables of your choice.
    public static void main(String[] args) {

        // Even numbers

        int p;
        for (p = 1; p < 20; p++)
        {
            if (p % 2 == 0)
            System.out.println(p + " is even number");
        }

        // Odd numbers

        int x;
        for(x=1;x<20;x++){
            if(x%2!=0)
                System.out.println(x+" is odd number");

    }
    }
}
