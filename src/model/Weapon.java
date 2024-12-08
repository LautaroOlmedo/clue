package model;

import javax.swing.*;

public class Weapon {
    public Weapon(int ID, String weaponName, String weaponImageDir) throws Exception {
        this.ID = ID;
        this.weaponName = weaponName;
        this.weaponImage = createImage(weaponImageDir);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public ImageIcon getWeaponImage() {
        return weaponImage;
    }

    public void setWeaponImageImage(ImageIcon weaponImage) {
        this.weaponImage = weaponImage;
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
}
