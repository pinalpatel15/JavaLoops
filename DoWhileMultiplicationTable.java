package HomeWork13Loops;

public class DoWhileMultiplicationTable {
    public static void main (String[] args){

        //Table for 101

        int num = 101;
        int T = 1;

        do {
            System.out.println("101 * " + T + " = " + num * T);
            T++;
        }
        while(T<=10);

    }
}
