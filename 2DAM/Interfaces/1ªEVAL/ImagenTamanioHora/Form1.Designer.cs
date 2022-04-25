
namespace ImagenTamanioHora
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.Imagen = new System.Windows.Forms.PictureBox();
            this.moresize = new System.Windows.Forms.Button();
            this.lesssize = new System.Windows.Forms.Button();
            this.horaLiteral = new System.Windows.Forms.Label();
            this.hora = new System.Windows.Forms.Label();
            this.timer = new System.Windows.Forms.Timer(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.Imagen)).BeginInit();
            this.SuspendLayout();
            // 
            // Imagen
            // 
            this.Imagen.Image = ((System.Drawing.Image)(resources.GetObject("Imagen.Image")));
            this.Imagen.InitialImage = ((System.Drawing.Image)(resources.GetObject("Imagen.InitialImage")));
            this.Imagen.Location = new System.Drawing.Point(12, 12);
            this.Imagen.MaximumSize = new System.Drawing.Size(1000, 1000);
            this.Imagen.Name = "Imagen";
            this.Imagen.Size = new System.Drawing.Size(286, 283);
            this.Imagen.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.Imagen.TabIndex = 0;
            this.Imagen.TabStop = false;
            // 
            // moresize
            // 
            this.moresize.Location = new System.Drawing.Point(552, 75);
            this.moresize.Name = "moresize";
            this.moresize.Size = new System.Drawing.Size(167, 133);
            this.moresize.TabIndex = 1;
            this.moresize.Text = "+";
            this.moresize.UseVisualStyleBackColor = true;
            this.moresize.Click += new System.EventHandler(this.moresize_Click);
            // 
            // lesssize
            // 
            this.lesssize.Location = new System.Drawing.Point(552, 233);
            this.lesssize.Name = "lesssize";
            this.lesssize.Size = new System.Drawing.Size(167, 125);
            this.lesssize.TabIndex = 2;
            this.lesssize.Text = "-";
            this.lesssize.UseVisualStyleBackColor = true;
            this.lesssize.Click += new System.EventHandler(this.lesssize_Click);
            // 
            // horaLiteral
            // 
            this.horaLiteral.AutoSize = true;
            this.horaLiteral.Location = new System.Drawing.Point(549, 12);
            this.horaLiteral.Name = "horaLiteral";
            this.horaLiteral.Size = new System.Drawing.Size(33, 13);
            this.horaLiteral.TabIndex = 3;
            this.horaLiteral.Text = "Hora:";
            // 
            // hora
            // 
            this.hora.AutoSize = true;
            this.hora.Location = new System.Drawing.Point(579, 12);
            this.hora.Name = "hora";
            this.hora.Size = new System.Drawing.Size(55, 13);
            this.hora.TabIndex = 4;
            this.hora.Text = "                ";
            this.hora.Click += new System.EventHandler(this.hora_Click);
            // 
            // timer
            // 
            this.timer.Enabled = true;
            this.timer.Interval = 10;
            this.timer.Tick += new System.EventHandler(this.timer_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.hora);
            this.Controls.Add(this.horaLiteral);
            this.Controls.Add(this.lesssize);
            this.Controls.Add(this.moresize);
            this.Controls.Add(this.Imagen);
            this.Name = "Form1";
            this.Text = "TamañoYFecha";
            ((System.ComponentModel.ISupportInitialize)(this.Imagen)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox Imagen;
        private System.Windows.Forms.Button moresize;
        private System.Windows.Forms.Button lesssize;
        private System.Windows.Forms.Label horaLiteral;
        private System.Windows.Forms.Label hora;
        private System.Windows.Forms.Timer timer;
    }
}

