
namespace asynctestapp
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
            this.btnİşlem = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnİşlem
            // 
            this.btnİşlem.Location = new System.Drawing.Point(23, 12);
            this.btnİşlem.Name = "btnİşlem";
            this.btnİşlem.Size = new System.Drawing.Size(181, 29);
            this.btnİşlem.TabIndex = 0;
            this.btnİşlem.Text = "Uzun İşlem";
            this.btnİşlem.UseVisualStyleBackColor = true;
            this.btnİşlem.Click += new System.EventHandler(this.btnİşlem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(379, 102);
            this.Controls.Add(this.btnİşlem);
            this.Name = "Form1";
            this.Text = "Async Örneği";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnİşlem;
    }
}

