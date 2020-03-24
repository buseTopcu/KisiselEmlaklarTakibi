
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bluesemy
 */
public class Emlakci {

    String[] bolgeler_ = new String[5];
    ArrayList<Ev> evler = new ArrayList();

    public Emlakci(String bolge1, String bolge2, String bolge3) {
        bolgeler_[0] = bolge1;
        bolgeler_[1] = bolge2;
        bolgeler_[2] = bolge3;
//        bolgeler_[3] = null;
//        bolgeler_[4] = null;
    }

    void bolgeEkle(String bolge) {
        int sayac = 0;
        for (int i = 0; i < bolgeler_.length; i++) {
            if (bolgeler_[i] != (null)) {
                sayac++;
            } else if (bolgeler_[i] == null) {
                bolgeler_[i] = bolge;
                sayac--;
                System.out.println(bolge + " bölgesi eklendi!");
                break;
            } else if (bolgeler_[i].equalsIgnoreCase(bolge)) {
                System.out.println(bolge + " bölgesi zaten var!");
                break;
            }
        }
        if (sayac == 5) {
            System.out.println("Bütün bölgeleriniz dolu!");
        }
    }

    void bolgeSil(String bolge) {
        for (int i = 0; i < bolgeler_.length; i++) {
            //String b = bolgeler_[i];
            if (bolgeler_[i] == (bolge)) {
                bolgeler_[i] = null;
                System.out.println(bolge + " bölgesi silindi!");
            }
        }
        for (int j = 0; j < evler.size(); j++) {
            if (evler.get(j).ilce.equals(bolge)) {
                evler.remove(j);
                System.out.println(bolge + " bölgesine ait bütün evler silindi!");

            }
        }

    }

    void bolgeListele() {
        for (int i = 0; i < bolgeler_.length; i++) {
            String b = bolgeler_[i];
            System.out.println(b);
        }
    }

    void emlakEkle(Ev ev) {
        if (evler.contains(ev)) {
            System.out.println("Ev zaten var!");
            return;
        }
        boolean gecersiz = true;
        for (int i = 0; i < bolgeler_.length; i++) {
            if (bolgeler_[i] == null) {

            } else if (bolgeler_[i].equalsIgnoreCase(ev.ilce)) {
                evler.add(ev);
                System.out.println("Ev eklendi!");
                gecersiz = false;
                break;
            }
        }
        if (gecersiz == true) {
            System.out.println("Girilen emlağın bölgesi geçersizdir!");
        }
    }

    void emlakSil(Ev ev) {
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).equals(ev)) {
                evler.remove(i);
                System.out.println("Ev silindi.");
            }
        }
    }

    void emlakSat(Ev ev) {
        if (ev instanceof Satilik) {
            ev.setDurum("Satıldı");
        } else {
            System.out.println("Kiralık ev satılamaz!");
        }
    }

    void emlakKirala(Ev ev) {
        if (ev instanceof Kiralik) {
            ev.setDurum("Kiralandı");
        } else {
            System.out.println("Satılık ev kiralanamaz!");
        }
    }

    void emlakListele() {
        int satilik = 0, kiralik = 0, satildi = 0, kiralandi = 0;
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).getDurum().equals("Satılık")) {
                satilik++;
            } else if (evler.get(i).getDurum().equals("Kiralık")) {
                kiralik++;
            } else if (evler.get(i).getDurum().equals("Satıldı")) {
                satildi++;
            } else if (evler.get(i).getDurum().equals("Kiralandı")) {
                kiralandi++;
            }
        }

        System.out.println("Satılık: " + satilik + "\nKiralık: " + kiralik + "\nSatıldı: " + satildi + "\nKiralandı: " + kiralandi);

    }

    void emlakZamYap(String ilceAdi, int zam) {
        for (Ev ev : evler) {
            if (ev.ilce.equals(ilceAdi)) {
                ev.fiyat += zam;
            }
        }
    }

    void emlakSabitZamYap() {
        int zam = 10000;
        for (int i = 0; i < evler.size(); i++) {
            evler.get(i).fiyat += zam;
        }
    }

    int getIlceOdeme(String adres) {
        int toplam = 0;
        for (Ev e : evler) {
            if (e.ilce.equals(adres)) {
                toplam += e.fiyat;
            }
        }
        return toplam;
    }

    int getToplamSatilikEmlakFiyatOrt() {
        int toplam = 0, satilik = 0;
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).getDurum().equals("Satılık")) {
                toplam += evler.get(i).fiyat;
                satilik++;
            }
        }
        return toplam / satilik;
        }

    int getToplamEmlakFiyat() {
        int toplam = 0;
        for (int i = 0; i < evler.size(); i++) {
            toplam += evler.get(i).fiyat;
        }
        return toplam;
    }

    void ilceyeGöreEmlakGöster(String ilceAdi) {
        int kiralik = 0, satilik = 0, satildi = 0, kiralandi = 0;
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).ilce.equals(ilceAdi) && evler.get(i).getDurum().equals("Kiralık")) {
                kiralik++;
            } else if (evler.get(i).ilce.equalsIgnoreCase(ilceAdi) && evler.get(i).getDurum().equals("Satılık")) {
                satilik++;
            } else if (evler.get(i).ilce.equalsIgnoreCase(ilceAdi) && evler.get(i).getDurum().equals("Satıldı")) {
                satildi++;
            } else if (evler.get(i).ilce.equalsIgnoreCase(ilceAdi) && evler.get(i).getDurum().equals("Kiralandı")) {
                kiralandi++;
            }
        }
        System.out.println("Kiralık: " + kiralik + "\nSatılık: " + satilik + "\nSatıldı: " + satildi + "\nKiralandı: " + kiralandi);
    }

    int getToplamSatilanEmlakFiyat() {
        int satilikToplam = 0;
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).getDurum().equals("Satıldı")) {
                satilikToplam += evler.get(i).fiyat;
            }
        }
        return satilikToplam;
    }

    void toplamKomisyon() {
        int satilik = 0, komisyon = 0;
        for (int i = 0; i < evler.size(); i++) {
            if (evler.get(i).getDurum().equals("Satıldı")) {
                satilik++;
                komisyon += (((evler.get(i).fiyat) * 10) / 100);
                //komisyon = satilik * 10000;
            }
        }
        System.out.println("Toplam " + satilik + " adet evden " + komisyon + " TL komisyon alındı.");
    }

}
