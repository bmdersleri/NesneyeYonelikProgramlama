using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Net;

namespace Örnek62
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        long dosya_uzunluğu = -1;
        byte[] dosyaİçeriği;
        string dosya_yolu;
        int indirilenDosyaSayısı = 0;
        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnURL_TextChanged(object sender, EventArgs e)
        {

        }     

        private void btnGöster_Click(object sender, EventArgs e)
        {
            DialogResult dosyaLokasyonu = folderBrowserDialog1.ShowDialog(); // yükleme yeri seç
            if (dosyaLokasyonu == DialogResult.OK) 
            {
                dosya_yolu = folderBrowserDialog1.SelectedPath;
                txtKayitAdresi.Text = dosya_yolu;
            }         
        }

        private void btnİndir_Click(object sender, EventArgs e)
        {
            using (WebClient wc = new WebClient())
            {
                wc.DownloadProgressChanged += indirmeBarıDeğişti;

                System.Uri link = new System.Uri(txtURL.Text);
                string düzenlenmişKaydedilecekYer = DosyaİsmiOluştur(txtURL.Text, dosya_yolu);

                wc.DownloadFileAsync(                    
                    link,                               // Dosya linki
                    düzenlenmişKaydedilecekYer          // İndirilecek adres
                );

                indirilenDosyaSayısı++;
            }
        }

        private string DosyaİsmiOluştur(string indirmeLinki, string kaydedilecekYer)
        {
            StringBuilder sb = new StringBuilder(indirmeLinki);
            string yeni_uzantı = "";
            StringBuilder uzantı = new StringBuilder();
            int i = sb.Length - 1;
            for (; i>=0; i--)
            {
                if (sb[i] == '.') { // . bulursan aramayı durdur

                    yeni_uzantı = TersineÇevir(uzantı.ToString());
                    System.Diagnostics.Debug.WriteLine("uzantı= " + uzantı.ToString());
                    break;
                } 
                uzantı.Append(sb[i]);
            }

            string uzantı_str = new string(uzantı.ToString());

            StringBuilder düzenlenmişKaydedilecekYer = new StringBuilder(kaydedilecekYer);
            düzenlenmişKaydedilecekYer.Append(String.Format("\\dosya {0}", indirilenDosyaSayısı)).Append('.').Append(yeni_uzantı);           

            return @düzenlenmişKaydedilecekYer.ToString();
        }

        public static string TersineÇevir(string s)
        {
            char[] charArray = s.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }


        private void indirmeBarıDeğişti(object sender, DownloadProgressChangedEventArgs e)
        {
            indirmeBarı1.Value = e.ProgressPercentage;
        }

        private void indirmeBarı1_Click(object sender, EventArgs e)
        {

        }
    }
 
}
