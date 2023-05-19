import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
        
        double[] randomNums = new double[10];
        int[] floorNums = new int[10];
        int[] ceilingNums = new int[10];

        for (int i = 0; i < 10; i++) {
            randomNums[i] = randomNumber(4, 14);
            floorNums[i] = (int)Math.floor(randomNums[i]);
            ceilingNums[i] = (int)Math.ceil(randomNums[i]);
        }
        
        lib.print("Random Numbers: ");
        lib.print(randomNums);
        lib.print("Numbers rounded down: ");
        lib.print(floorNums);
        lib.print("Numbers rounded up: ");
        lib.print(ceilingNums);
        
        
    } 

    public static double randomNumber(int min, int max) {
        return min + (Math.random() * ((max - min) + 1));
    }
    

}
