import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();

        Scanner input = new Scanner(System.in);
        
        ArrayList<Song> songList = new ArrayList<Song>();
        
        while (true) {
            System.out.println("Spitofy");
            System.out.println("What would you like to do?\n1 -- Song List\n2 -- Add a new song\n3 -- Most expensive song\n4 -- Cheapest Song\n5 -- Search songs by an artist\n6 -- Leave Program");
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
                        lib.clearConsole();
                        boolean songViewLoop = true;
                        if (songChoice == 0) {
                            songLoop = false;
                        }
                        else {
                            while (songViewLoop) {
                                System.out.println("What would you like to do?");
                                System.out.println("Song name: " + songList.get(songChoice - 1).getName());
                                System.out.println("Author: " + songList.get(songChoice - 1).getAuthorF() + " " + songList.get(songChoice - 1).getAuthorL());
                                System.out.println("Price: $" + songList.get(songChoice - 1).getCost());
                                System.out.println("Your rating: " + songList.get(songChoice - 1).getRating());
                                System.out.println("Release date: " + songList.get(songChoice - 1).getMonth() + "/" + songList.get(songChoice - 1).getDay() + "/" + songList.get(songChoice - 1).getYear());
                                System.out.println("0 -- Go Back\n1 -- Edit Song Name\n2 -- Edit Rating\n3 -- Edit Author Name\n4 -- Edit Song Cost\n5 -- Edit Release Date");
                                int songViewChoice = input.nextInt();
                                lib.clearConsole();
                                if (songViewChoice == 0) {
                                    songViewLoop = false;
                                }
                                else if (songViewChoice == 1) {
                                    System.out.print("Enter a new song name: ");
                                    String newSongName = input.next();
                                    lib.clearConsole();
                                    songList.get(songChoice - 1).newName(newSongName);
                                    System.out.println("Name successfully changed!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
                                else if (songViewChoice == 2) {
                                    System.out.print("Enter a new rating: ");
                                    double newSongRating = input.nextDouble();
                                    lib.clearConsole();
                                    songList.get(songChoice - 1).newRating(newSongRating);
                                    System.out.println("Rating successfully changed!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
                                else if (songViewChoice == 3) {
                                    System.out.print("Enter a new first name: ");
                                    String newSongFName = input.next();
                                    lib.clearConsole();
                                    System.out.print("Enter a new last name: ");
                                    String newSongLName = input.next();
                                    lib.clearConsole();
                                    songList.get(songChoice - 1).newAuthorFN(newSongFName);
                                    songList.get(songChoice - 1).newAuthorLN(newSongLName);
                                    System.out.println("Name successfully changed!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
                                else if (songViewChoice == 4) {
                                    System.out.print("Enter a new price: ");
                                    double newSongPrice = input.nextDouble();
                                    lib.clearConsole();
                                    songList.get(songChoice - 1).newCost(newSongPrice);
                                    System.out.println("Price successfully changed!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
                                else if (songViewChoice == 5){
                                    System.out.println("Enter a new day: ");
                                    int newSongDay = input.nextInt();
                                    lib.clearConsole();
                                    System.out.println("Enter a new month: ");
                                    int newSongMonth = input.nextInt();
                                    lib.clearConsole();
                                    System.out.println("Enter a new year: ");
                                    int newSongYear = input.nextInt();
                                    lib.clearConsole();
                                    songList.get(songChoice - 1).newDate(newSongDay, newSongMonth, newSongYear);
                                    System.out.println("Date successfully changed!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
                                else {
                                    System.out.println("Invalid input!");
                                    lib.sleep(2000);
                                    lib.clearConsole();
                                }
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
                System.out.print("Author's first name: ");
                String songAuthorFChoice = input.next();
                lib.clearConsole();
                System.out.print("Author's last name: ");
                String songAuthorLChoice = input.next();
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
                songList.add(new Song(songNameChoice, songCostChoice, songRatingChoice, songAuthorFChoice, songAuthorLChoice, songDayChoice, songMonthChoice, songYearChoice));
                System.out.print("Song added!");
                lib.sleep(2000);
                lib.clearConsole();

            }
            else if (userChoice == 3) {
                if (songList.size() == 0) {
                    System.out.println("You have no songs...");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else {
                    Song expSong = songList.get(0);
                    for (Song i:songList) {
                        if (i.getCost() > expSong.getCost()) {
                            expSong = i;
                        }
                    }
                    System.out.println("Your most expensive song is: " + expSong.getName() + ", by " + expSong.getAuthorF() + " " + expSong.getAuthorL() + ".");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
            }
            else if (userChoice == 4) {
                if (songList.size() == 0) {
                    System.out.println("You have no songs...");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else {
                    Song expSong = songList.get(0);
                    for (Song i:songList) {
                        if (i.getCost() < expSong.getCost()) {
                            expSong = i;
                        }
                    }
                    System.out.println("Your cheapest song is: " + expSong.getName() + ", by " + expSong.getAuthorF() + " " + expSong.getAuthorL() + ".");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
            }
            else if (userChoice == 5) {
                if (songList.size() == 0) {
                    System.out.println("You have no songs...");
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else {
                    
                    System.out.print("Search by: \n1 -- First name\n2 -- Last Name");
                    int authorSearchChoice = input.nextInt();
                    lib.clearConsole();
                    if (authorSearchChoice == 1) {
                        System.out.print("Enter first name: ");
                        String authorSearchF = input.next();
                        lib.clearConsole();
                        int songCount = 0;
                        for (Song i:songList) {
                            if (i.getAuthorF().equals(authorSearchF)) {
                                songCount++;
                                System.out.println(i.getName() + " by " + i.getAuthorF() + " " + i.getAuthorL());
                            }
                        }
                        
                        if (songCount == 0) {
                            System.out.println("No songs found.");
                            lib.sleep(2000);
                            lib.clearConsole();
                        }
                        else {
                            System.out.print("Enter any letter to continue...");
                            String confirm = input.next();
                            lib.clearConsole();
                        }
                    }
                    else if (authorSearchChoice == 2) {
                        System.out.print("Enter last name: ");
                        String authorSearchL = input.next();
                        lib.clearConsole();
                        int songCount = 0;
                        for (Song i:songList) {
                            if (i.getAuthorL().equals(authorSearchL)) {
                                songCount++;
                                System.out.println(i.getName() + " by " + i.getAuthorF() + " " + i.getAuthorL());
                            }
                        }
                        
                        if (songCount == 0) {
                            System.out.println("No songs found.");
                            lib.sleep(2000);
                            lib.clearConsole();
                        }
                        else {
                            System.out.print("Enter any letter to continue...");
                            String confirm = input.next();
                            lib.clearConsole();
                        }
                    }
                    else {
                        System.out.println("Invalid input!");
                        lib.sleep(2000);
                        lib.clearConsole();
                    }
                    
                }
            }
        }
    } 
}
