using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace uygulama7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string tarih1;
            bool sonuc;
            tarih1 = String.Format("{0:d}", textBox1.Text);
            string tarih2;
            tarih2 = string.Format("{0:d}", textBox2.Text);
            sonuc = tarih1.Equals(tarih2);
            if (sonuc == true)
                label3.Text = "her iki tarih değeri birbirine eşit";
            else
                label3.Text = "tarih değerleri birbirinden farklı";

        }
    }
}
