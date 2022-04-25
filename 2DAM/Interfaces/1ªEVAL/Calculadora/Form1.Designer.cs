
namespace Calculadora
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
            this.resultado = new System.Windows.Forms.Label();
            this.button0 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.button8 = new System.Windows.Forms.Button();
            this.button9 = new System.Windows.Forms.Button();
            this.Cborrar1 = new System.Windows.Forms.Button();
            this.CEborrar = new System.Windows.Forms.Button();
            this.mas = new System.Windows.Forms.Button();
            this.menos = new System.Windows.Forms.Button();
            this.multiplica = new System.Windows.Forms.Button();
            this.divide = new System.Windows.Forms.Button();
            this.igual = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // resultado
            // 
            this.resultado.AutoSize = true;
            this.resultado.BackColor = System.Drawing.SystemColors.InactiveCaption;
            this.resultado.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.resultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 36F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.resultado.Location = new System.Drawing.Point(22, 37);
            this.resultado.MaximumSize = new System.Drawing.Size(344, 55);
            this.resultado.MinimumSize = new System.Drawing.Size(344, 55);
            this.resultado.Name = "resultado";
            this.resultado.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.resultado.Size = new System.Drawing.Size(344, 55);
            this.resultado.TabIndex = 0;
            this.resultado.Text = "5+8";
            this.resultado.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // button0
            // 
            this.button0.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button0.Location = new System.Drawing.Point(22, 235);
            this.button0.Name = "button0";
            this.button0.Size = new System.Drawing.Size(273, 41);
            this.button0.TabIndex = 1;
            this.button0.Text = "0";
            this.button0.UseVisualStyleBackColor = true;
            this.button0.Click += new System.EventHandler(this.escribe);
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(22, 193);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(87, 36);
            this.button1.TabIndex = 2;
            this.button1.Text = "1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.escribe);
            // 
            // button3
            // 
            this.button3.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button3.Location = new System.Drawing.Point(208, 193);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(87, 36);
            this.button3.TabIndex = 3;
            this.button3.Text = "3";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.escribe);
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Location = new System.Drawing.Point(115, 193);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(87, 36);
            this.button2.TabIndex = 4;
            this.button2.Text = "2";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.escribe);
            // 
            // button4
            // 
            this.button4.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button4.Location = new System.Drawing.Point(22, 151);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(87, 36);
            this.button4.TabIndex = 5;
            this.button4.Text = "4";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.escribe);
            // 
            // button5
            // 
            this.button5.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button5.Location = new System.Drawing.Point(115, 151);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(87, 36);
            this.button5.TabIndex = 6;
            this.button5.Text = "5";
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.escribe);
            // 
            // button6
            // 
            this.button6.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button6.Location = new System.Drawing.Point(208, 151);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(87, 36);
            this.button6.TabIndex = 7;
            this.button6.Text = "6";
            this.button6.UseVisualStyleBackColor = true;
            this.button6.Click += new System.EventHandler(this.escribe);
            // 
            // button7
            // 
            this.button7.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button7.Location = new System.Drawing.Point(22, 109);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(87, 36);
            this.button7.TabIndex = 8;
            this.button7.Text = "7";
            this.button7.UseVisualStyleBackColor = true;
            this.button7.Click += new System.EventHandler(this.escribe);
            // 
            // button8
            // 
            this.button8.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button8.Location = new System.Drawing.Point(115, 109);
            this.button8.Name = "button8";
            this.button8.Size = new System.Drawing.Size(87, 36);
            this.button8.TabIndex = 9;
            this.button8.Text = "8";
            this.button8.UseVisualStyleBackColor = true;
            this.button8.Click += new System.EventHandler(this.escribe);
            // 
            // button9
            // 
            this.button9.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button9.Location = new System.Drawing.Point(208, 109);
            this.button9.Name = "button9";
            this.button9.Size = new System.Drawing.Size(87, 36);
            this.button9.TabIndex = 10;
            this.button9.Text = "9";
            this.button9.UseVisualStyleBackColor = true;
            this.button9.Click += new System.EventHandler(this.escribe);
            // 
            // Cborrar1
            // 
            this.Cborrar1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Cborrar1.Location = new System.Drawing.Point(81, 291);
            this.Cborrar1.Name = "Cborrar1";
            this.Cborrar1.Size = new System.Drawing.Size(75, 33);
            this.Cborrar1.TabIndex = 11;
            this.Cborrar1.Text = "C";
            this.Cborrar1.UseVisualStyleBackColor = true;
            this.Cborrar1.Click += new System.EventHandler(this.Cborrar1_Click);
            // 
            // CEborrar
            // 
            this.CEborrar.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CEborrar.Location = new System.Drawing.Point(162, 291);
            this.CEborrar.Name = "CEborrar";
            this.CEborrar.Size = new System.Drawing.Size(75, 33);
            this.CEborrar.TabIndex = 12;
            this.CEborrar.Text = "CE";
            this.CEborrar.UseVisualStyleBackColor = true;
            this.CEborrar.Click += new System.EventHandler(this.CEborrar_Click);
            // 
            // mas
            // 
            this.mas.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mas.Location = new System.Drawing.Point(324, 109);
            this.mas.Name = "mas";
            this.mas.Size = new System.Drawing.Size(42, 36);
            this.mas.TabIndex = 13;
            this.mas.Text = "+";
            this.mas.UseVisualStyleBackColor = true;
            this.mas.Click += new System.EventHandler(this.mas_Click);
            // 
            // menos
            // 
            this.menos.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.menos.Location = new System.Drawing.Point(324, 151);
            this.menos.Name = "menos";
            this.menos.Size = new System.Drawing.Size(42, 36);
            this.menos.TabIndex = 14;
            this.menos.Text = "-";
            this.menos.UseVisualStyleBackColor = true;
            this.menos.Click += new System.EventHandler(this.menos_Click);
            // 
            // multiplica
            // 
            this.multiplica.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.multiplica.Location = new System.Drawing.Point(324, 193);
            this.multiplica.Name = "multiplica";
            this.multiplica.Size = new System.Drawing.Size(42, 36);
            this.multiplica.TabIndex = 15;
            this.multiplica.Text = "x";
            this.multiplica.UseVisualStyleBackColor = true;
            this.multiplica.Click += new System.EventHandler(this.multiplica_Click);
            // 
            // divide
            // 
            this.divide.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.divide.Location = new System.Drawing.Point(324, 235);
            this.divide.Name = "divide";
            this.divide.Size = new System.Drawing.Size(42, 41);
            this.divide.TabIndex = 16;
            this.divide.Text = "/";
            this.divide.UseVisualStyleBackColor = true;
            this.divide.Click += new System.EventHandler(this.divide_Click);
            // 
            // igual
            // 
            this.igual.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.igual.Location = new System.Drawing.Point(324, 288);
            this.igual.Name = "igual";
            this.igual.Size = new System.Drawing.Size(42, 36);
            this.igual.TabIndex = 17;
            this.igual.Text = "=";
            this.igual.UseVisualStyleBackColor = true;
            this.igual.Click += new System.EventHandler(this.igual_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(394, 346);
            this.Controls.Add(this.igual);
            this.Controls.Add(this.divide);
            this.Controls.Add(this.multiplica);
            this.Controls.Add(this.menos);
            this.Controls.Add(this.mas);
            this.Controls.Add(this.CEborrar);
            this.Controls.Add(this.Cborrar1);
            this.Controls.Add(this.button9);
            this.Controls.Add(this.button8);
            this.Controls.Add(this.button7);
            this.Controls.Add(this.button6);
            this.Controls.Add(this.button5);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.button0);
            this.Controls.Add(this.resultado);
            this.MaximizeBox = false;
            this.MaximumSize = new System.Drawing.Size(410, 385);
            this.MinimumSize = new System.Drawing.Size(410, 385);
            this.Name = "Form1";
            this.Text = "Calculadora";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label resultado;
        private System.Windows.Forms.Button button0;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Button button8;
        private System.Windows.Forms.Button button9;
        private System.Windows.Forms.Button Cborrar1;
        private System.Windows.Forms.Button CEborrar;
        private System.Windows.Forms.Button mas;
        private System.Windows.Forms.Button menos;
        private System.Windows.Forms.Button multiplica;
        private System.Windows.Forms.Button divide;
        private System.Windows.Forms.Button igual;
    }
}

