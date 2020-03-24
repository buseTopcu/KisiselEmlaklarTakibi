
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bluesemy
 */
public class Test {

    public static void main(String[] args) {
        Emlakci e1 = new Emlakci("Kadıköy", "Kartal", "Pendik");
        Emlakci e2 = new Emlakci("Etiler", "Şişli", "Levent");

        Ev ev1 = new Satilik(3, 5, 95, 400000, "Kadıköy", "Satılık");
        Ev ev2 = new Satilik(3, 5, 120, 600000, "Kadıköy", "Satılık");
        Ev ev3 = new Kiralik(3, 5, 120, 800000, "Pendik", "Kiralık");
        Ev ev4 = new Kiralik(2, 3, 90, 400000, "Kavacık", "Kiralık");
        Ev ev5 = new Kiralik(2, 3, 90, 600000, "Pendik", "Kiralık");

        Ev ev6 = new Kiralik(2, 3, 90, 500000, "Etiler", "Kiralık");
        Ev ev7 = new Kiralik(2, 3, 90, 70000, "Şişli", "Kiralık");
        Ev ev8 = new Kiralik(2, 3, 90, 600000, "Levent", "Kiralık");
        Ev ev9 = new Satilik(2, 3, 90, 20000, "Levent", "Satılık");
        Ev ev10 = new Satilik(2, 3, 90, 800000, "Sütlüce", "Satılık");

        e1.emlakEkle(ev1);
        e1.emlakEkle(ev2);
        e1.emlakEkle(ev3);
        e1.emlakEkle(ev4);
        e1.emlakEkle(ev5);
        System.out.println("-----");
        e2.emlakEkle(ev6);
        e2.emlakEkle(ev7);
        e2.emlakEkle(ev8);
        e2.emlakEkle(ev9);
        e2.emlakEkle(ev10);
        System.out.println("1-----");
        e1.bolgeListele();
        System.out.println("2-----");
        e2.bolgeListele();
        System.out.println("3-----");
        e1.bolgeEkle("Tuzla");
        e2.bolgeEkle("Sütlüce");
        e1.bolgeListele();
        e2.bolgeListele();
        e2.emlakEkle(ev10);
        e1.emlakSil(ev1);
        System.out.println("4-----");
        e1.emlakListele();
        e1.emlakKirala(ev3);
        e1.emlakSat(ev2);
        e1.emlakListele();
        System.out.println("5-----");
        System.out.println(e1.getIlceOdeme("Kadıköy"));
        e1.emlakEkle(ev1);
        System.out.println(e1.getIlceOdeme("Kadıköy"));
        e1.emlakKirala(ev1);
        e2.emlakSat(ev6);
        System.out.println("6-----");
        System.out.println(e1.getToplamEmlakFiyat());
        e1.emlakSat(ev1);
        e1.emlakZamYap("Kadıköy", 10000);
        System.out.println(e1.getToplamEmlakFiyat());
        e1.toplamKomisyon();
        System.out.println("7-----");
        e1.emlakEkle(ev4);
        System.out.println(e1.getToplamEmlakFiyat());
        e1.emlakSabitZamYap();
        System.out.println(e1.getToplamEmlakFiyat());
        System.out.println("8-----");
        e1.ilceyeGöreEmlakGöster("Pendik");
        System.out.println(e1.getToplamSatilanEmlakFiyat());
        System.out.println(e2.getToplamSatilikEmlakFiyatOrt());
        System.out.println("9-----");
        e2.emlakListele();
        e2.bolgeSil("Levent");
        e2.emlakListele();
        
    }
}
