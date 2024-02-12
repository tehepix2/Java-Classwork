import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> coordinates = new ArrayList<Integer>();
        File myCoords = new File("Coordinates.txt");
        myCoords.createNewFile();
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
    }
    public static double distanceCalc(double x, double x1, double y, double y1, double z, double z1) {
      return Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2) + Math.pow((z - z1), 2));
    }
}
