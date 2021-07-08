
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
//        System.out.println("File:");
        String fileName = scan.nextLine();
        
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<String> teamsNames = new ArrayList<>();
        
        try (Scanner f = new Scanner(Paths.get(fileName))) {
            while (f.hasNextLine()) {
                String line = f.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] input = line.split(",");
                
                if (!teamsNames.contains(input[0])) {
                    teamsNames.add(input[0]);
                    Team newTeam0 = new Team(input[0]);
                    teams.add(newTeam0);
                    
                    if (Integer.valueOf(input[2]) > Integer.valueOf(input[3])) {
                        newTeam0.updateWins();
                    } else {
                        newTeam0.updateLosses();
                    } 
                    
                } else {
                    for (Team item: teams) {
                        if (item.getName().equals(input[0])) {
                            item.updateGames();
                            
                            if (Integer.valueOf(input[2]) > Integer.valueOf(input[3])) {
                                item.updateWins();
                            } else {
                                item.updateLosses();
                            } 
                        }
                    }
                }
                
                if (!teamsNames.contains(input[1])) {
                    teamsNames.add(input[1]);
                    Team newTeam1 = new Team(input[1]);
                    teams.add(newTeam1);
                    
                    if (Integer.valueOf(input[3]) > Integer.valueOf(input[2])) {
                        newTeam1.updateWins();
                    } else {
                        newTeam1.updateLosses();
                    } 
                } else {
                    for (Team item: teams) {
                        if (item.getName().equals(input[1])) {
                            item.updateGames();
                            
                            if (Integer.valueOf(input[3]) > Integer.valueOf(input[2])) {
                                item.updateWins();
                            } else {
                                item.updateLosses();
                            } 
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
//        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        for( Team item: teams) {
            System.out.println(item);
        }
        
        if (teamsNames.contains(teamName)) {
            for (Team item: teams) {
                if (item.getName().equals(teamName)) {
                    System.out.println("Games: " + item.getGames());
                    System.out.println("Wins: " + item.getWins());
                    System.out.println("Losses: " + item.getLosses());
                    break;
                }
            }
        } else {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }
}
