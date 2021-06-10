/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *
 * @author 20106
 */
public class BookPlayGround {
    protected int AVH;//avilable hour
    protected int PPH;//price per hour
    protected String satute;
    protected String cancelPeriod;

    public BookPlayGround(int AVH, int PPH, String satute, String cancelPeriod) {
        this.AVH = AVH;
        this.PPH = PPH;
        this.satute = satute;
        this.cancelPeriod = cancelPeriod;
    }

    public BookPlayGround() {
    }

    public int getAVH() {
        return AVH;
    }

    public void setAVH(int AVH) {
        this.AVH = AVH;
    }

    public int getPPH() {
        return PPH;
    }

    public void setPPH(int PPH) {
        this.PPH = PPH;
    }

    public String getSatute() {
        return satute;
    }

    public void setSatute(String satute) {
        this.satute = satute;
    }

    public String getCancelPeriod() {
        return cancelPeriod;
        
    }

    public void setCancelPeriod(String cancelPeriod) {
        this.cancelPeriod = cancelPeriod;
    }
    
}
