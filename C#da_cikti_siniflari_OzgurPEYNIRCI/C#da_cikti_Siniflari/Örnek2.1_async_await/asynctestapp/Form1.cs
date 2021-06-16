using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;

namespace asynctestapp
{

    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private int Ağırİşlem()
        {
            for (long i = 0; i <= 1000000000000; i += 500)
            {

            }
            return 0;
        }
        private async void btnİşlem_Click(object sender, EventArgs e)
        { 
            Stopwatch sw = new Stopwatch();
            sw.Start();
            var görev = Task.Run(() => Ağırİşlem());
            int toplam = 3 + 2;
            var bitmişGörev = await görev;
            sw.Stop();
            MessageBox.Show("bitti " + sw.Elapsed);
        }
    }
}
