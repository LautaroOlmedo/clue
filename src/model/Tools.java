package model;

import javax.swing.*;

public class Tools {
    public Tools(int ID, String toolName, String toolImageDir) throws Exception {
        this.ID = ID;
        this.toolName = toolName;
        this.toolImage = createImage(toolName);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public ImageIcon getToolImage() {
        return toolImage;
    }

    public void setToolImage(ImageIcon toolImage) {
        this.toolImage = toolImage;
    }

    public ImageIcon createImage(String image) throws Exception{
        try {
            this.toolImage = new ImageIcon(image);
        } catch (Exception e) {
            System.out.println("Failed to load image: " + image);
            throw e;
        }
        return this.toolImage;
    }

    private int ID;
    private String toolName;
    private ImageIcon toolImage;
}
