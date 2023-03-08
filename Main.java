import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();

        Scanner input = new Scanner(System.in);
        
        ArrayList<Song> songList = new ArrayList<Song>();
        
        while (true) {
            System.out.println("Spitofy");
            System.out.println("What would you like to do?\n1 -- Song List\n2 -- Add a new song\n3 -- Most expensive song\n4 -- Cheapest Song\n5 -- Search songs by an artist\n6 -- Search earliest release\n7 -- Search latest release");
            int userChoice = input.nextInt();
            lib.clearConsole();
            if (userChoice == 1) {
                if (songList.size() == 0) {
                    System.out.println("You have no songs...");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else {
                    for (Song i:songList) {
                        System.out.println(i.getName());
                    }
                }
            }
            else if(userChoice == 2) {
                
                System.out.print("Song name: ");

            }
        }
    } 
}
