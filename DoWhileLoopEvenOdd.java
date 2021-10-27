package HomeWork13Loops;

public class DoWhileLoopEvenOdd {
    // write a program to print 10 even numbers and 10 add numbers
    //write a program to generate tables of your choice

    public static void main(String[] args) {

// Even numbers

        int E = 0;
        do {
            System.out.println("Even number is " + E * 2);
            E++;
        }
        while (E <= 10);

        //Odd numbers

        // int O = 1;
        //do {
        //  System.out.println("Odd number is " + O );
        //O=O+2;
        //}
        //while(O<=20);

        int Y = 1;
        do {
                System.out.println("Test odd is " + Y++);
                Y++;

        }
        while (Y <= 11);


    }
}









