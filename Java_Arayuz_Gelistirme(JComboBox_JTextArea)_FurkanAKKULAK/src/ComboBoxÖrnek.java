import javax.swing.*;
public class ComboBoxÖrnek {
    JFrame jframe;
    ComboBoxÖrnek(){
        jframe=new JFrame("ComboBox Örneği");//pencere oluşturduk ve adını pencerenin adını koyduk
        String şehirler[]={"Adana","Ankara","İstanbul","Eskişehir","İzmir","Manisa"};//şehirler adında dizi tanımlaması yaptık
        JComboBox combobox=new JComboBox(şehirler);//bir jcombobox oluşturduk ve buna şehirler dizisinin elemanlarını ekledik
        combobox.setBounds(50,50,90,20);//jcombobox kutusunun boyutlarını ve konumunu ayarladık.
        jframe.add(combobox);//pencerenin içerisine jcombobox'u ekledik
        jframe.setSize(300,300);//pencerenin boyutlarını ayarladık
        jframe.setLayout(null);//pencerenin doldurulabilir olup olmamasını belirttik.
        jframe.setVisible(true);//pencere görünürlüğünü true olarak belirttik ve görünmesini sağladık.
    }
    public static void main(String[] args){
        new ComboBoxÖrnek();
    }}



