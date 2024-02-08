import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
      lib.clearConsole();
      File myFile = new File("Stuff.txt");
      try {
        if (myFile.createNewFile()) {
          System.out.println("File created: " + myFile.getName());
        }
        else {
          System.out.println("File already exists.");
          myFile.delete();
        }
      }
      catch(IOException e) {
        System.out.println("Error.");
        e.printStackTrace();
      }
      
    } 

    /*public static double distanceCalc(double x, double y, double z) {
      sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2);
    }*/
}
