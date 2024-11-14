package model;

public class Impostor {
    public Impostor(Player player) {
        this.imposterPlayer = player;
    }

    public Player getImposterPlayer() {
        return imposterPlayer;
    }

    private final Player imposterPlayer;
}
