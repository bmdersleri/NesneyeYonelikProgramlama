using System;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Diagnostics;

namespace DosyaİşlemAracı
{
    public partial class DosyaİşlemAracı : Form
    {
        public DosyaİşlemAracı()
        {
            InitializeComponent();
        }

        HakkındaButonu hakkında = new HakkındaButonu();

        FolderBrowserDialog dizinSeç = new FolderBrowserDialog();
        FolderBrowserDialog değiştirmekİçinDizinSeç = new FolderBrowserDialog();

        DialogResult lokasyon;
       
        string dosyaDizini;
        string seçDizini_sadeceİsim; // C:\belgelerim\dosya.txt  => dosya.txt 

        string seçDizini; // C:\belgelerim\dosya.txt

        // Değiştir ve Yedekle butonu için nesneler
        OpenFileDialog dosyaSeç = new OpenFileDialog();
        OpenFileDialog değiştirmekİçinDosyaSeç = new OpenFileDialog();
        string değiştirilecekDosya;
        string yedekSadeceDosyaAdı;

        private void btnGöster_Click(object sender, EventArgs e)
        {            
            lokasyon = dizinSeç.ShowDialog();
            if (lokasyon == DialogResult.OK && !string.IsNullOrWhiteSpace(dizinSeç.SelectedPath))
            {
                dosyaDizini = dizinSeç.SelectedPath;
            }            
        }

        private string DosyaDiziniOluştur(string dizin, string dosyaismi)
        {
            StringBuilder yeniDizin = new StringBuilder(dizin);
            yeniDizin.Append(@"\").Append(dosyaismi);
            return yeniDizin.ToString();
        }

        private void btnOluştur_Click(object sender, EventArgs e)
        {
            string yeniAdres = DosyaDiziniOluştur(dosyaDizini, txtOluştur.Text); // C:\belgelerim\dosya.txt
            using (FileStream dosya = File.Create(yeniAdres)) { }
            MessageBox.Show("Dosya oluşturuldu: " + yeniAdres, "Oluşturucu", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnTaşı_Click(object sender, EventArgs e)
        {
            string yeniAdres = DosyaDiziniOluştur(dosyaDizini, "taşınmışDosya.txt");
            if (File.Exists(yeniAdres))
            {
                MessageBox.Show("Hata! Bu isimde bir dosya bulunmaktadır", "Taşıyıcı", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            File.Move(seçDizini, yeniAdres);
            MessageBox.Show("Dosya taşındı: " + yeniAdres, "Taşıyıcı", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnSil_Click(object sender, EventArgs e)
        {
            File.Delete(seçDizini);
            MessageBox.Show("Dosya silindi: " + seçDizini, "Silici", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnAç_Click(object sender, EventArgs e)
        {
            var işlem = new Process();
            işlem.StartInfo = new ProcessStartInfo(@seçDizini)
            {
                UseShellExecute = true
            };
            işlem.Start();
        }

        private void btnDeğiştirVeYedekle_Click(object sender, EventArgs e)
        {
            StringBuilder yedekDiziniDüzeltilmiş = new StringBuilder(dosyaDizini);
            yedekDiziniDüzeltilmiş.Append(@"\" + yedekSadeceDosyaAdı + ".YEDEK"); // Örneğin; C:\klasör + \dosya.txt.YEDEK 

            File.Replace(seçDizini, değiştirilecekDosya, yedekDiziniDüzeltilmiş.ToString());
        }

        private void btnDosyaSeç_Click(object sender, EventArgs e)
        {
            lokasyon = dosyaSeç.ShowDialog();
            if (lokasyon == DialogResult.OK && !string.IsNullOrWhiteSpace(dosyaSeç.FileName))
            {
                seçDizini = dosyaSeç.FileName; // C:\belgelerim\dosya.txt
                seçDizini_sadeceİsim = dosyaSeç.SafeFileName; // dosya.txt
            }
        }

        private void btnAsılDosya_Click(object sender, EventArgs e)
        {
            btnDosyaSeç_Click(sender, e); // Göster butonuyla aynı işlev
        }

        private void btnDeğiştirilecekDosya_Click(object sender, EventArgs e)
        {
            lokasyon = değiştirmekİçinDosyaSeç.ShowDialog();
            if (lokasyon == DialogResult.OK && !string.IsNullOrWhiteSpace(dosyaSeç.FileName))
            {
                değiştirilecekDosya = değiştirmekİçinDosyaSeç.FileName;
                yedekSadeceDosyaAdı = değiştirmekİçinDosyaSeç.SafeFileName;
            }
        }

        private void btnYedekDizin_Click(object sender, EventArgs e)
        {
            //lokasyon = değiştirmekİçinDizinSeç.ShowDialog();
            //if (lokasyon == DialogResult.OK && !string.IsNullOrWhiteSpace(değiştirmekİçinDizinSeç.SelectedPath))
            //{
            //    değiştirilecekDizin = değiştirmekİçinDizinSeç.SelectedPath;
            //}
            btnGöster_Click(sender, e); // Dizin Seç butonunu çalıştır
        }

        private void btnÖzellikAyarla_Click(object sender, EventArgs e)
        {
            FileAttributes özellikler = File.GetAttributes(seçDizini);
            if ((özellikler & FileAttributes.Hidden) != FileAttributes.Hidden)
            {
                File.SetAttributes(seçDizini, FileAttributes.Hidden);
            }
        }

        private void btnŞifrele_Click(object sender, EventArgs e)
        {            
            File.Encrypt(seçDizini);
            MessageBox.Show("Dosya şifrelendi: " + seçDizini, "Şifreleyici", MessageBoxButtons.OK, MessageBoxIcon.Information);            
        }

        private void btnŞifreÇöz_Click(object sender, EventArgs e)
        {
            File.Decrypt(seçDizini);
            MessageBox.Show("Şifresi çözüldü: " + seçDizini, "Şifreleyici", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnDisk_Click(object sender, EventArgs e)
        {
            DriveInfo[] tümDiskler = DriveInfo.GetDrives();
            StringBuilder sonuç = new StringBuilder();
            
            foreach(DriveInfo disk in tümDiskler)
            {
                sonuç.Append("Disk adı: " + disk.Name);
                sonuç.Append("\nDisk tipi: " + disk.DriveType);
                if(disk.IsReady == true)
                {
                    sonuç.Append("\nDisk Uzun İsmi: " + disk.VolumeLabel);
                    sonuç.Append("\nDosya Sistemi: " + disk.DriveFormat);
                    sonuç.Append(String.Format("\nKullanılabilir alan: {0} BYTE", disk.AvailableFreeSpace));
                    sonuç.Append(String.Format("\nToplam kullanılabilir alan: {0} BYTE", disk.TotalFreeSpace));
                    sonuç.Append(String.Format("\nToplam disk boyutu: {0} BYTE" , disk.TotalSize));
                }
                sonuç.Append("\n=====================\n");
            }           

            MessageBox.Show(sonuç.ToString(), "Disk Bilgisi", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnDosyaSeçKopya2_Click(object sender, EventArgs e)
        {
            btnDosyaSeç_Click(sender, e);
            txtTaşı_TextChanged(sender, e);
        }

        private void btnDosyaSeçKopya3_Click(object sender, EventArgs e)
        {
            btnDosyaSeç_Click(sender, e);
        }

        private void btnDosyaSeçKopya4_Click(object sender, EventArgs e)
        {
            btnDosyaSeç_Click(sender, e);
        }

        private void btnDosyaSeçKopya5_Click(object sender, EventArgs e)
        {
            btnDosyaSeç_Click(sender, e);
        }

        private void btnDizinSeçKopya1_Click(object sender, EventArgs e)
        {
            btnGöster_Click(sender, e);
        }

        private void txtTaşı_TextChanged(object sender, EventArgs e)
        {
            txtTaşı.Text = seçDizini_sadeceİsim;
        }

        private void DosyaİşlemAracı_Load(object sender, EventArgs e)
        {
            
        }

        private void btnHakkında_Click(object sender, EventArgs e)
        {
            hakkında.Show();
        }
    }
}
