package karalama2;

public class Karalama2 {
    
    enum Aylar{ 
    Ocak(1),
    Subat(2),
    Mart(3),
    Nisan(4),
    Mayis(5),
    Haziran(6),
    Temmuz(7),
    Agustos(8),
    Eylul(9),
    Ekim(10),
    Kasim(11),
    Aralik(12); //yine nesnelerimizi tanımlıyoruz ay ay ve sırası ile.
                        //noktalı virgül koymak zorundayız yoksa constructor belirleyemeyiz.
    int sirasi;
    
    Aylar(int sirasi) //constructorumuzu oluşturuyor ve ayin sirasini tanımladığımız değişkeni çağırıyoruz.
    {
        this.sirasi = sirasi; // iki "sirasi" isimli değişkeni birbirine bağladık.
    }

}  
        public static void main(String[] args) 
    {
        Aylar aylar = Aylar.Nisan; // Nisan ayının özelliklerini aylar değişkenine atıyoruz.
        System.out.println(aylar + " yilin " + aylar.sirasi +". ayidir."); //ekrana yazdırıyoruz.
    }
}
