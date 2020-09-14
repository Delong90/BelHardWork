package by.belhard.j24.HomeWork.Class.Lesson03_04.playerTask;

public class PlayerTask {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.printPlayersInfo();
        player1.move(3, 4);
        player1.printPlayersInfo();
        player1.move(-3, -4);
        player1.printPlayersInfo();
    }
}
