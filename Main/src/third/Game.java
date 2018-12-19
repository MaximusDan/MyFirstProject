package third;

public class Game {
    public static void main(String[] args) {
        Battle [] command01 = Battle.createFirstCommand();
        Battle [] command02 = Battle.createFirstCommand();

        Battle.fight(command01,command02);
    }
}
