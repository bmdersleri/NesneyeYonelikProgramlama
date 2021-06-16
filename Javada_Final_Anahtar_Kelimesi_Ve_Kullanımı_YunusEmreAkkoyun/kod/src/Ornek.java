public class Ornek{

static double PI = 3.14; // burada pi sayýsýný 3,14 e sabitliyoruz. Program içerisinde deðiþtirmeye çalýþýldýðýnda hata verecektir.

int yarýçap;

static int dairecevre;

double cevrehesapla(int r) {

int yaricap = r;
PI = r;
double daireninAlaný = 2 * PI * yaricap;

return daireninAlaný;
}

public static void main(String[] args) {

Ornek d1 = new Ornek();

double sonuc = d1.cevrehesapla(3);

System.out.println(sonuc);

}
}