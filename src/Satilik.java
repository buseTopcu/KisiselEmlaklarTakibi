/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bluesemy
 */
public class Satilik extends Ev {

    public Satilik(int odaSayisi, int katNo, int metreKare, int fiyat, String ilce, String durum) {
        super(odaSayisi, katNo, metreKare, fiyat, ilce, durum);
    }

    @Override
    void setDurum(String yeniDurum) {
            if (this.getDurum().equals("Satıldı")) {
            System.out.println("Ev daha önce satıldı!");
        } else if (this.getDurum().equals("Satılık")) {
            super.setDurum("Satıldı");
            System.out.println("Ev satıldı!");
        }
    }
}
