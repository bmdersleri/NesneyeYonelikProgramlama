using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace uygulama5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DateTime ilkdeger = dateTimePicker1.Value;
            DateTime sondeger = dateTimePicker2.Value;
            System.TimeSpan zaman ;
            zaman = sondeger.Subtract(ilkdeger);
            int toplamgun = Convert.ToInt32(zaman.TotalDays);
            int toplamdakika = Convert.ToInt32(zaman.TotalMinutes);

            int toplamsaat = Convert.ToInt32(zaman.TotalHours);
            int toplamsaniye = Convert.ToInt32(zaman.TotalSeconds);

            label7.Text = toplamgun.ToString();
            label8.Text = toplamdakika.ToString();
            label9.Text = toplamsaat.ToString();
            label10.Text = toplamsaniye.ToString();




        }
    }
}
