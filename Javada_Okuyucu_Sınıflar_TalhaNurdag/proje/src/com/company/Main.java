package com.company;
import java.io.CharArrayReader;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class chararray {
    public static void main(String[] args) {
        try {
            // CharArrayReader nesnesi yarat
            char[] arr = new char[] { 'M', 'e', 'r', 'h', 'a', 'b', 'a' };
            CharArrayReader reader = new CharArrayReader(arr);
            // Arrayin öğelerini birer birer oku
            char[] c = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
            for (int i = 0; i < 5; i++) {
                c[i] = (char) reader.read();
                System.out.println(c[i]);
            }
            System.out.println("Buraya işaret konuldu");
            // işaret destekleniyorsa, buraya işaret (mark) koy
            if (reader.markSupported()) {
                reader.mark('$');
            }
            c[5] = (char) reader.read();
            c[6] = (char) reader.read();
            for (int i = 5; i < 7; i++) {
                System.out.println(c[i]);
            }
            // CharArrayReader nesnesini yeniden konuşlandır.
            reader.reset();
            // rest işleminden sonraki ilk okuma.
            char nextLetter = (char) reader.read();
            System.out.println("Reset'ten sonra ilk okunan harf : "
                    + nextLetter);
            // CharArrayReader nesnesini kapat
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}

class pipedreader {
    public static void main(String[] args) throws IOException
    {

        PipedReader okuyucu = new PipedReader();
        PipedWriter yazici = new PipedWriter();

        okuyucu.connect(yazici);

        // Use of read() method
        yazici.write(83);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(65);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(77);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(85);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(82);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(65);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
        yazici.write(89);
        System.out.println("read() Methodu : " + (char)okuyucu.read());
    }
}

class buffered_reader {

    public static void main(String[] args) {
        BufferedReader objReader = null;
        try {
            String satir;

            objReader = new BufferedReader(new FileReader("C:\\çalışma\\deneme.txt"));

            while ((satir = objReader.readLine()) != null) {

                System.out.println(satir);
            }
            
            //IOException genellikle kullanıcının programa uygunsuz veriler girdiği bir durumdur. Bu, programın işleyemediği veri türleri veya var olmayan bir dosyanın adı olabilir. Bu olduğunda, derleyiciye geçersiz girdi veya geçersiz çıktı oluştuğunu bildiren bir istisna (IOException) oluşur.
            
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
 class InputStream {
    public static void main(String[] args) {
        System.out.print("Adınız : ");
        // standart giriş akımı
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String ad = null;
        try {
            ad = br.readLine();
        } catch (IOException ioe) {
            System.out.println("Giriş hatası!");
            System.exit(1);
        }
        System.out.println("Teşekkürler, " + ad);
    }
}