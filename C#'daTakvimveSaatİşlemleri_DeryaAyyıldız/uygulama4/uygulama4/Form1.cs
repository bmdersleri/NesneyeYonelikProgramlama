using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace uygulama4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            maskedTextBox1.Mask = "00/00/0000";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DateTime dt = DateTime.Parse(maskedTextBox1.Text);
            TimeSpan fark = DateTime.Today - dt;
            label1.Text = fark.TotalDays.ToString();
        }
    }
}
