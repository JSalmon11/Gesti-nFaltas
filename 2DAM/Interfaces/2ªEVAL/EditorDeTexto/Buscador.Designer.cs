
namespace EditorDeTexto
{
    partial class Buscador
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBuscarPalabra = new System.Windows.Forms.TextBox();
            this.buttonBuscar = new System.Windows.Forms.Button();
            this.buttonBuscarSiguiente = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.buttonReemplazar = new System.Windows.Forms.Button();
            this.textAReemplazar = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // textBuscarPalabra
            // 
            this.textBuscarPalabra.Location = new System.Drawing.Point(82, 36);
            this.textBuscarPalabra.Name = "textBuscarPalabra";
            this.textBuscarPalabra.Size = new System.Drawing.Size(185, 20);
            this.textBuscarPalabra.TabIndex = 0;
            // 
            // buttonBuscar
            // 
            this.buttonBuscar.Location = new System.Drawing.Point(112, 75);
            this.buttonBuscar.Name = "buttonBuscar";
            this.buttonBuscar.Size = new System.Drawing.Size(131, 20);
            this.buttonBuscar.TabIndex = 1;
            this.buttonBuscar.Text = "BUSCAR";
            this.buttonBuscar.UseVisualStyleBackColor = true;
            this.buttonBuscar.Click += new System.EventHandler(this.buttonBuscar_Click);
            // 
            // buttonBuscarSiguiente
            // 
            this.buttonBuscarSiguiente.Location = new System.Drawing.Point(112, 123);
            this.buttonBuscarSiguiente.Name = "buttonBuscarSiguiente";
            this.buttonBuscarSiguiente.Size = new System.Drawing.Size(131, 20);
            this.buttonBuscarSiguiente.TabIndex = 3;
            this.buttonBuscarSiguiente.Text = "BUSCAR SIGUIENTE";
            this.buttonBuscarSiguiente.UseVisualStyleBackColor = true;
            this.buttonBuscarSiguiente.Click += new System.EventHandler(this.buttonBuscarSiguiente_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(24, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 20);
            this.label1.TabIndex = 4;
            this.label1.Text = "Texto:";
            // 
            // buttonReemplazar
            // 
            this.buttonReemplazar.Location = new System.Drawing.Point(112, 197);
            this.buttonReemplazar.Name = "buttonReemplazar";
            this.buttonReemplazar.Size = new System.Drawing.Size(131, 20);
            this.buttonReemplazar.TabIndex = 6;
            this.buttonReemplazar.Text = "REEMPLAZAR";
            this.buttonReemplazar.UseVisualStyleBackColor = true;
            this.buttonReemplazar.Click += new System.EventHandler(this.buttonReemplazar_Click);
            // 
            // textAReemplazar
            // 
            this.textAReemplazar.Location = new System.Drawing.Point(135, 161);
            this.textAReemplazar.Name = "textAReemplazar";
            this.textAReemplazar.Size = new System.Drawing.Size(132, 20);
            this.textAReemplazar.TabIndex = 7;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(24, 161);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(99, 20);
            this.label2.TabIndex = 8;
            this.label2.Text = "Reemplazar:";
            // 
            // Buscador
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(325, 229);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textAReemplazar);
            this.Controls.Add(this.buttonReemplazar);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.buttonBuscarSiguiente);
            this.Controls.Add(this.buttonBuscar);
            this.Controls.Add(this.textBuscarPalabra);
            this.Name = "Buscador";
            this.Text = "Buscador";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBuscarPalabra;
        private System.Windows.Forms.Button buttonBuscar;
        private System.Windows.Forms.Button buttonBuscarSiguiente;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button buttonReemplazar;
        private System.Windows.Forms.TextBox textAReemplazar;
        private System.Windows.Forms.Label label2;
    }
}