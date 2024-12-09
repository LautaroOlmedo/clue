package model;

import javax.swing.*;

public class Weapon {
    public Weapon(int ID, String weaponName, String weaponImageDir) throws Exception {
        this.ID = ID;
        this.weaponName = weaponName;
        this.weaponImage = createImage(weaponImageDir);
        this.clueAdded = false;
    }

    public int getID() {
        return ID;
    }

    public void setClueAdded(boolean clueAdded) {
        this.clueAdded = clueAdded;
    }

    public boolean getClueAdded() {
        return this.clueAdded;
    }



    public ImageIcon getWeaponImage() {
        return weaponImage;
    }



    public ImageIcon createImage(String image) throws Exception{
        try {
            this.weaponImage = new ImageIcon(image);
        } catch (Exception e) {
            System.out.println("Failed to load image: " + image);
            throw e;
        }
        return this.weaponImage;
    }

    private int ID;
    private String weaponName;
    private ImageIcon weaponImage;
    private boolean clueAdded;
}
