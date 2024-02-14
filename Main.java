import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        lib.clearConsole();
        File myCoords = new File("Coordinates.txt");
        
        Scanner input = new Scanner(System.in);
        List<Integer> coordinates = new ArrayList<Integer>();
        
        System.out.print("Enter an X coordinate: ");
        String xcoord = input.next();
        writeCoords(myCoords, xcoord);
        lib.clearConsole();
        
        
        System.out.print("Enter a Y coordinate: ");
        String ycoord = input.next();
        writeCoords(myCoords, ycoord);
        lib.clearConsole();
        
        
        System.out.print("Enter a Z coordinate: ");
        String zcoord = input.next();
        writeCoords(myCoords, zcoord);
        lib.clearConsole(); 

        System.out.print("Enter an X coordinate: ");
        xcoord = input.next();
        writeCoords(myCoords, xcoord);
        lib.clearConsole();
        
        
       System.out.print("Enter a Y coordinate: ");
        ycoord = input.next();
        writeCoords(myCoords, ycoord);
        lib.clearConsole();
        
        
        System.out.print("Enter a Z coordinate: ");
        zcoord = input.next();
        writeCoords(myCoords, zcoord);
        lib.clearConsole(); 
        
        
        Scanner scanner = new Scanner(myCoords);
        scanner.useDelimiter(" ");
        
        while (scanner.hasNext()) {
            String next = scanner.next();
            coordinates.add(Integer.valueOf(next));
        }
        
        scanner.close();
        
        for (Integer i : coordinates) {
          System.out.println(i.intValue());
        }
        myCoords.delete();
       
    }
    public static double distanceCalc(double x, double x1, double y, double y1, double z, double z1) {
      return Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2) + Math.pow((z - z1), 2));
    }
    public static void writeCoords(File file, String coordinate) {
      try {
        FileWriter myWriter = new FileWriter(file, true);
        myWriter.write(coordinate + " ");
        myWriter.close();
      } 

      catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

}
