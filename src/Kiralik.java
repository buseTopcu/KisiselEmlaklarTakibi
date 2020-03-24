/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bluesemy
 */
public class Kiralik extends Ev {

    public Kiralik(int odaSayisi, int katNo, int metreKare, int fiyat, String ilce, String durum) {
        super(odaSayisi, katNo, metreKare, fiyat, ilce, durum);
    }

    @Override
    void setDurum(String yeniDurum) {
        if (this.getDurum().equals("Kiralandı")) {
            System.out.println("Ev daha önce kiralandı!");
        } else if (this.getDurum().equals("Kiralık")) {
            super.setDurum("Kiralandı");
            System.out.println("Ev kiralandı!");
        }
    }

}
