
namespace Örnek62
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtURL = new System.Windows.Forms.TextBox();
            this.btnİndir = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.btnGöster = new System.Windows.Forms.Button();
            this.folderBrowserDialog1 = new System.Windows.Forms.FolderBrowserDialog();
            this.txtKayitAdresi = new System.Windows.Forms.TextBox();
            this.indirmeBarı1 = new System.Windows.Forms.ProgressBar();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(43, 45);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "URL";
            // 
            // txtURL
            // 
            this.txtURL.Location = new System.Drawing.Point(91, 42);
            this.txtURL.Name = "txtURL";
            this.txtURL.Size = new System.Drawing.Size(654, 27);
            this.txtURL.TabIndex = 1;
            this.txtURL.TextChanged += new System.EventHandler(this.btnURL_TextChanged);
            // 
            // btnİndir
            // 
            this.btnİndir.Location = new System.Drawing.Point(43, 75);
            this.btnİndir.Name = "btnİndir";
            this.btnİndir.Size = new System.Drawing.Size(123, 38);
            this.btnİndir.TabIndex = 2;
            this.btnİndir.Text = "İndir";
            this.btnİndir.UseVisualStyleBackColor = true;
            this.btnİndir.Click += new System.EventHandler(this.btnİndir_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(53, 234);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(125, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "Kaydedilecek Yer ";
            // 
            // btnGöster
            // 
            this.btnGöster.Location = new System.Drawing.Point(50, 285);
            this.btnGöster.Name = "btnGöster";
            this.btnGöster.Size = new System.Drawing.Size(128, 35);
            this.btnGöster.TabIndex = 5;
            this.btnGöster.Text = "Seç";
            this.btnGöster.UseVisualStyleBackColor = true;
            this.btnGöster.Click += new System.EventHandler(this.btnGöster_Click);
            // 
            // txtKayitAdresi
            // 
            this.txtKayitAdresi.Location = new System.Drawing.Point(188, 231);
            this.txtKayitAdresi.Multiline = true;
            this.txtKayitAdresi.Name = "txtKayitAdresi";
            this.txtKayitAdresi.Size = new System.Drawing.Size(557, 33);
            this.txtKayitAdresi.TabIndex = 4;
            // 
            // indirmeBarı1
            // 
            this.indirmeBarı1.Location = new System.Drawing.Point(188, 139);
            this.indirmeBarı1.Name = "indirmeBarı1";
            this.indirmeBarı1.Size = new System.Drawing.Size(557, 38);
            this.indirmeBarı1.TabIndex = 6;
            this.indirmeBarı1.Click += new System.EventHandler(this.indirmeBarı1_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(51, 148);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(115, 20);
            this.label3.TabIndex = 7;
            this.label3.Text = "İndirme Çubuğu";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(757, 369);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.indirmeBarı1);
            this.Controls.Add(this.btnGöster);
            this.Controls.Add(this.txtKayitAdresi);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btnİndir);
            this.Controls.Add(this.txtURL);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "İnternet Dosya İndiricisi";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtURL;
        private System.Windows.Forms.Button btnİndir;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnGöster;
        private System.Windows.Forms.FolderBrowserDialog folderBrowserDialog1;
        private System.Windows.Forms.TextBox txtKayitAdresi;
        private System.Windows.Forms.ProgressBar indirmeBarı1;
        private System.Windows.Forms.Label label3;
    }
}

