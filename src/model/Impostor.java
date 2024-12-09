package model;

public class Impostor {
    public Impostor(Player player) {
        this.imposterPlayer = player;
    }

    public Player getPlayer() {
        return imposterPlayer;
    }

    private final Player imposterPlayer;
}
