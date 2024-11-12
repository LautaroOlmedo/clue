package model;

public class Impostor {

    public Impostor(Player player, Tools tool) {
        this.imposterPlayer = player;
        this.imposterUsedTool = tool;
        System.out.println("Imposter created");
    }

    public Player getImposterPlayer() {
        return imposterPlayer;
    }

    public void setImposterPlayer(Player imposterPlayer) {
        this.imposterPlayer = imposterPlayer;
    }

    public Tools getImposterUsedTool() {
        return imposterUsedTool;
    }

    public void setImposterUsedTool(Tools imposterUsedTool) {
        this.imposterUsedTool = imposterUsedTool;
    }

    private Player imposterPlayer;
    private Tools imposterUsedTool;
}
