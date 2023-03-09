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
                    boolean songLoop = true;
                    while (songLoop) {
                        int listCounter = 1;
                        System.out.println("Choose the song you want to view.");
                        System.out.println("Your songs: ");
                        System.out.println("0 -- Go Back");
                        
                        for (Song i:songList) {
                            System.out.println(listCounter + " -- " + i.getName());
                            listCounter++;
                        }
                        int songChoice = input.nextInt();
                        boolean songViewLoop = true;
                        if (songChoice == 0) {
                            songLoop = false;
                        }
                        else {
                            while (songViewLoop) {
                                System.out.println("What would you like to do?");
                                System.out.println("Song name: " + songList(songChoice).songName);
                                System.out.println("Author: " + ongList(songChoice).songAuthor);
                                System.out.println("Your rating: " + songList(songChoice).songRating);
                                System.out.println("Release date: " + songList(songChoice).songMonth + "/" + songList(songChoice).songDay + "/" + songList(songChoice).songYear);
                                System.out.println("0 -- Go Back\n1 -- Edit Name\n2 -- Edit Rating\n3 -- Edit Author\n4 -- Edit Song Cost\n5 -- Edit Release Date");

                            }
                        }

                    }

                }
            }
            else if(userChoice == 2) {
                
                System.out.print("Song name: ");
                String songNameChoice = input.next();
                lib.clearConsole();
                System.out.print("Song cost: ");
                double songCostChoice = input.nextDouble();
                lib.clearConsole();
                System.out.print("Your rating (0 - 10): ");
                double songRatingChoice = input.nextDouble();
                lib.clearConsole();
                System.out.print("Song author: ");
                String songAuthorChoice = input.next();
                lib.clearConsole();
                System.out.println("Release date");
                System.out.print("Day: ");
                int songDayChoice = input.nextInt();
                lib.clearConsole();
                System.out.println("Release date");
                System.out.print("Month: ");
                int songMonthChoice = input.nextInt();
                lib.clearConsole();
                System.out.println("Release date: ");
                System.out.print("Year: ");
                int songYearChoice = input.nextInt();
                lib.clearConsole();
                songList.add(new Song(songNameChoice, songCostChoice, songRatingChoice, songAuthorChoice, songDayChoice, songMonthChoice, songYearChoice));
                System.out.print("Song added!");
                lib.sleep(2000);
                lib.clearConsole();

            }
        }
    } 
}
