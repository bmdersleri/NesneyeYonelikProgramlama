package paket2;

import paket1.kütüphane;

public class erisim2 extends kütüphane{
  public static void main(String[] args) {
        erisim2 kutuphane=new erisim2();
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
