import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println(avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 100, 123123, 131231, 647467,75, 100000000, 1, 1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1,1, 123123, 757675, 757475, 4747474, 4563534, 534533,5345345, 34,5 ,34 ,34, 534, 53, 543543, 345345, 34, 5));
    } 

    public static double avg(double... num) {
        double total = 0; 
        for (int i = 0; i < num.length; i++) {
            total+=num[i];
        }
        return total/num.length;
    }
}
