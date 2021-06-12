import javax.swing.*;
public class TextAreaÖrnek {
        TextAreaÖrnek(){
            JFrame jframe= new JFrame("TextArea Örneği");//pencere oluşturduk ve adını pencerenin adını koyduk
            JTextArea textarea=new JTextArea("Bu bir TextArea");//jtextarea'nın içerisinde yazacak standart yazı.
            textarea.setBounds(10,30,200,200);//jtextarea kutusunun boyutlarını ve konumunu ayarladık.
            jframe.add(textarea);//pencerenin içerisine jtextarea'yı ekledik
            jframe.setSize(300,300);//pencerenin boyutlarını ayarladık
            jframe.setLayout(null);//pencerenin doldurulabilir olup olmamasını belirttik.
            jframe.setVisible(true);//pencere görünürlüğünü true olarak belirttik ve görünmesini sağladık.
            }
            public static void main(String args[]){ new TextAreaÖrnek();}}
