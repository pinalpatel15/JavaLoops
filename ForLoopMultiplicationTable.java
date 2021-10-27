package HomeWork13Loops;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {
//Timetable for 5
        int num = 5;
        int i =1;
        for (i = 1; i<= 10; i++){
            System.out.println("5*" + i+" = " + num * i);

        }
        // Timetable for 15

        int table = 15;
        int x = 1;
        for(x=1;x<=10;x++){
            System.out.println("15*"+ x+" = "+ table*x);
        }

    }
}