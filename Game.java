import java.util.Scanner;

public class Game {
    private Field field;
    private Team homeTeam;
    private Team vistingTeam;
    private Ball ball;
    private Referee referee;
    private Referee[] linesmen;

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean pressStarting = false;
        boolean selectedHomeTeam = false;
        boolean selectedVistingTeam = false;
        while (scanner.hasNext()) {
            String s = scanner.next();
          //  System.out.println("You have input:" + s);
            if (s.equalsIgnoreCase("exit")) {
                System.out.println("System end.");
                System.exit(0);
            }
            if (s.equalsIgnoreCase("start")) {
                pressStarting = true;

                System.out.println("Here we go! Please select home team first:\n" +
                        "Real Madrid, Barcelona, Manchester United, Chelsea, Juventus, AC Milan");
            }
            if (s.equalsIgnoreCase("r") &&  pressStarting) {
                selectedHomeTeam = true;
                System.out.println("You have selected Real Madrid as the home team.\n" +
                        "Please select the visiting team then:\n" +
                        "Barcelona, Manchester United, Chelsea, Juventus, AC Milan");
                game.homeTeam = new Team();

            }
            if (s.equalsIgnoreCase("b")&&  pressStarting && selectedHomeTeam ) {
                selectedVistingTeam = true;
                System.out.println("You have selected Real Madrid as the visitingTeam team.\n" +
                        "Please select the stadium for the match: San Siro, Nou Camp, Bernabeu, Old Trafford:\n");

                game.vistingTeam = new Team();


            }
            if (s.equalsIgnoreCase("s") && pressStarting && selectedHomeTeam && selectedVistingTeam) {
                System.out.println("Good job! All settle down. Game started.");

                game.field = new Field();
                game.referee = new Referee();
                game.referee.visle();
                game.homeTeam.cickOff();

            }
        }
    }
}
