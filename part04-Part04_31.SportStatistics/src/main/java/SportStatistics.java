
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Game> stats = new ArrayList<>();
        System.out.println("File: ");
        String file = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                
                String line = fileScanner.nextLine();                
                
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                stats.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team: ");
        String input = scan.nextLine();

        int gameCounter = 0;
        int winCounter = 0;
        int lossCounter = 0;

        for (Game game : stats) {
            
            if (game.getHomeTeam().equals(input)) {
                gameCounter++;

                if (game.getHomePoints() > game.getVisitingPoints()) {
                    winCounter++;
                } else if (game.getHomePoints() < game.getVisitingPoints()) {
                    lossCounter++;
                }

            } else if (game.getVisitingTeam().equals(input)) {
                gameCounter++;

                if (game.getVisitingPoints() > game.getHomePoints()) {
                    winCounter++;
                } else if (game.getVisitingPoints() < game.getHomePoints()) {
                    lossCounter++;
                }
            }
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossCounter);
    }
}
