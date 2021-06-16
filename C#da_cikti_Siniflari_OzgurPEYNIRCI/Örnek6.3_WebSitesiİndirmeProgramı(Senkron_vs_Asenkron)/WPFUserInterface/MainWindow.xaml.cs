using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using System.Windows;
using System.Diagnostics;

namespace WPFUserInterface
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Sync_Calis_Click(object sender, RoutedEventArgs e)
        {
            var süre = Stopwatch.StartNew();

            Senkİndir();

            süre.Stop();
            var geçenMs = süre.ElapsedMilliseconds;

            sonuçPenceresi.Text += $"Toplam süre: { geçenMs }";
        }

        private async void Async_Calis_Click(object sender, RoutedEventArgs e)
        {
            var süre = Stopwatch.StartNew();

            await ParalelAsyncİndir();

            süre.Stop();
            var geçenMs = süre.ElapsedMilliseconds;

            sonuçPenceresi.Text += $"Toplam süre: { geçenMs }";
        }

        // Async_Calis_Click

        private List<string> VeriHazırla()
        {
            List<string> çıktı = new List<string>();

            sonuçPenceresi.Text = "";

            çıktı.Add("https://www.yahoo.com");
            çıktı.Add("https://www.google.com");
            çıktı.Add("https://www.microsoft.com");
            çıktı.Add("https://www.cnn.com");
            çıktı.Add("https://www.codeproject.com");
            çıktı.Add("https://www.stackoverflow.com");

            return çıktı;
        }

        private void Senkİndir()
        {
            List<string> websiteler = VeriHazırla();

            foreach (string site in websiteler)
            {
                WebsiteDataModel sonuçlar = Websiteİndir(site);
                WebsiteBilgiRapor(sonuçlar);
            }
        }

        //Asyncİndir

        private async Task Asyncİndir()
        {
            List<string> websiteler = VeriHazırla();

            foreach (string site in websiteler)
            {
                WebsiteDataModel sonuçlar = await Task.Run( () => Websiteİndir(site));
                WebsiteBilgiRapor(sonuçlar);
            }
        }


        // ParalelAsyncİndir

        private async Task ParalelAsyncİndir()
        {
            List<string> websiteler = VeriHazırla();
            List<Task<WebsiteDataModel>> tasklar = new List<Task<WebsiteDataModel>>();

            foreach(string site in websiteler)
            {
                tasklar.Add(WebsiteİndirAsync(site)); // yahoo'yu indir, google'ı indir
            }

            var sonuçlar = await Task.WhenAll(tasklar); 

            foreach(var sonuç in sonuçlar)
            {
                WebsiteBilgiRapor(sonuç);
            }
        }


        private WebsiteDataModel Websiteİndir(string websiteURL)
        {
            WebsiteDataModel çıktı = new WebsiteDataModel();
            WebClient client = new WebClient();

            çıktı.WebsiteUrl = websiteURL;
            çıktı.WebsiteData = client.DownloadString(websiteURL);

            return çıktı;
        }

        // WebsiteİndirAsync 

        private async Task<WebsiteDataModel> WebsiteİndirAsync(string websiteURL)
        {
            WebsiteDataModel çıktı = new WebsiteDataModel();
            WebClient client = new WebClient();

            çıktı.WebsiteUrl = websiteURL;
            çıktı.WebsiteData = await client.DownloadStringTaskAsync(websiteURL);

            return çıktı;
        }

        private void WebsiteBilgiRapor(WebsiteDataModel data)
        {
            sonuçPenceresi.Text += $"{ data.WebsiteUrl } indirildi: { data.WebsiteData.Length } karakter uzunluğunda.{ Environment.NewLine }";
        }
    }
}
