/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket2;

import paket1.kütüphane;

/**
 *
 * @author TUĞÇE
 */
public class erisim3 extends kütüphane{
    public static void main(String[] args) {
        erisim3 kutuphane=new erisim3();
        kutuphane.adi="aa";
        kutuphane.yazari="bb";
        kutuphane.sayfa_sayisi=10;
        kutuphane.basim_yili=20;
        kutuphane.rezerve_et("aa", "cc", 30, 40);
        kutuphane.ad("ss");
        kutuphane.adiyazari("aa", "cc");
        kutuphane.yazari("mm");
    }
}
