import java.util.*;

 /**Program: NFLPlayerManager
 * File: NFLPlayerManager.java
 * Summary: Create a NFL player array from the NFLPlayer
 * class 
 * Author: Eric George
 * Date: December 9, 2018
 */
public class NFLPlayerManager {
    //Set array list for NFLPlayers
    final private static ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<NFLPlayer>();
    //Create no arg NFLPlayerManager object
    public NFLPlayerManager() {
        createPlayers();
    }
    public static void createPlayers() {
        //Create players
        NFLPlayer rodgers = new NFLPlayer("Aaron Rodgers", 35, 74, 225, 23, 495, 35, 0, 3700, 212, 6, 3, 307, 99.6);
        NFLPlayer brady = new NFLPlayer("Tom Brady", 41, 76, 225, 23, 477, 23, 2, 3700, 35, 4, 2, 313, 98.2);
        NFLPlayer cook = new NFLPlayer("Connor Cook", 24, 76, 217, 1, 21, 0, 0, 150, 0, 2, 1, 14, 83.4);
        NFLPlayer williams = new NFLPlayer("Jonathan Williams", 23, 72, 223, 0, 1, 27, 1, 0, 94, 2, 2, 0, 39.6);
        NFLPlayer landry = new NFLPlayer("Jarvis Landry", 24, 71, 206, 0, 1, 5, 0, 0, 17, 2, 2, 0, 39.6);
        NFLPlayer bell = new NFLPlayer("Le'Veon Bell", 25, 73, 225, 0, 1, 261, 7, 0, 1268, 4, 1, 0, 39.6);
        NFLPlayer mallett = new NFLPlayer("Ryan Mallett", 29, 78, 250, 0, 6, 5, 0, 26, -6, 0, 0, 3, 22.2);
        NFLPlayer whitehurst = new NFLPlayer("Charlie Whitehurst", 34, 77, 226, 1, 24, 2, 0, 182, 1, 0, 0, 14, 78.8);
        NFLPlayer savage = new NFLPlayer("Tom Savage", 27, 76, 230, 0, 73, 6, 0, 461, 12, 1, 1, 46, 80.9);
        NFLPlayer mccown = new NFLPlayer("Josh McCown", 38, 76, 218, 6, 165, 7, 0, 1100, 21, 7, 4, 90, 72.3);
        //Add the players to array
        LIST_OF_PLAYERS.add(rodgers);
	LIST_OF_PLAYERS.add(brady);
	LIST_OF_PLAYERS.add(cook);
	LIST_OF_PLAYERS.add(williams);
	LIST_OF_PLAYERS.add(landry);
	LIST_OF_PLAYERS.add(bell);
	LIST_OF_PLAYERS.add(mallett);
	LIST_OF_PLAYERS.add(whitehurst);
	LIST_OF_PLAYERS.add(savage);
	LIST_OF_PLAYERS.add(mccown);
    }
    //Override toString method
    public String toString() {
        String list = "";
        for (NFLPlayer n : LIST_OF_PLAYERS)
            list += (n.name + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");
        return list;
    }
    // Main method for testing
    public static void main(String[] args) {
        NFLPlayerManager test = new NFLPlayerManager();
        // Testing toString
        System.out.println(test.toString());
        // Testing Getters
	System.out.println("\nMalletts's Stats:\nPassing TD%: " + NFLPlayerManager.LIST_OF_PLAYERS.get(6).getPassingTouchDownPercent()
                + "%\nPassing YDS AVG:" + NFLPlayerManager.LIST_OF_PLAYERS.get(6).getPassingYardAverage() + "\nRushing YDS AVG: "
                + NFLPlayerManager.LIST_OF_PLAYERS.get(6).getRushingYardAverage() + "\nComp%: "
                + NFLPlayerManager.LIST_OF_PLAYERS.get(6).getCompletionPercent() + "%");
	// Testing Setters
	NFLPlayerManager.LIST_OF_PLAYERS.get(6).setPassingAttempts(20);
	NFLPlayerManager.LIST_OF_PLAYERS.get(6).setPassingTouchDowns(100);
	System.out.println("Setter Test: Malletts Passing TD% now equals " + NFLPlayerManager.LIST_OF_PLAYERS.get(6).getPassingTouchDownPercent() + "%");
    }
}

