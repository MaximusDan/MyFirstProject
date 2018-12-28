package third;

public class Game {
    public static void main(String[] args) {
        Battle [] command01 = Battle.createCommand();
        Battle [] command02 = Battle.createCommand();

        Battle.fight(command01,command02);
    }
}
