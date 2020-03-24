/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bluesemy
 */
public class Ev {

    int odaSayisi, katNo, metreKare, fiyat;
    String ilce;
    private String durum;

    public Ev(int odaSayisi, int katNo, int metreKare, int fiyat, String ilce, String durum) {
        this.odaSayisi = odaSayisi;
        this.katNo = katNo;
        this.metreKare = metreKare;
        this.fiyat = fiyat;
        this.ilce = ilce;
        this.durum = durum;
    }
    
    void setDurum(String yeniDurum){
        this.durum=yeniDurum;
    }

    public String getDurum() {
        return durum;
    }
 
    
}
