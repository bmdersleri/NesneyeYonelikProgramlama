using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace uygulama11
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string sonuc;
            sonuc = string.Format("{0:hh:mm:ss}", DateTime.Now);
            MessageBox.Show(sonuc + "\n");

            sonuc = string.Format("{0:HH:mm:ss}", DateTime.Now);
            MessageBox.Show(sonuc + "\n");

            sonuc = string.Format("{0:dd:MM:yyyy}", DateTime.Now);
            MessageBox.Show(sonuc + "\n");


            sonuc = string.Format("{0:dd:MMM:yyyy}", DateTime.Now);
            MessageBox.Show(sonuc + "\n");


            sonuc = string.Format("{0:HH:mm:ss:dd:MMM:yyyy}", DateTime.Now);
            MessageBox.Show(sonuc + "\n");
        }
    }
}
