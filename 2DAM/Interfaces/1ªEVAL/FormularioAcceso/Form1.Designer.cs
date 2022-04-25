
namespace FormularioAcceso
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
            this.login = new System.Windows.Forms.Label();
            this.pass = new System.Windows.Forms.Label();
            this.textlogin = new System.Windows.Forms.TextBox();
            this.textpass = new System.Windows.Forms.TextBox();
            this.aceptar = new System.Windows.Forms.Button();
            this.literal = new System.Windows.Forms.Label();
            this.error = new System.Windows.Forms.Label();
            this.max3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // login
            // 
            this.login.AutoSize = true;
            this.login.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.login.Location = new System.Drawing.Point(150, 72);
            this.login.Name = "login";
            this.login.Size = new System.Drawing.Size(95, 31);
            this.login.TabIndex = 0;
            this.login.Text = "Login: ";
            // 
            // pass
            // 
            this.pass.AutoSize = true;
            this.pass.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pass.Location = new System.Drawing.Point(150, 174);
            this.pass.Name = "pass";
            this.pass.Size = new System.Drawing.Size(149, 31);
            this.pass.TabIndex = 1;
            this.pass.Text = "Password: ";
            // 
            // textlogin
            // 
            this.textlogin.Location = new System.Drawing.Point(305, 83);
            this.textlogin.Name = "textlogin";
            this.textlogin.Size = new System.Drawing.Size(100, 20);
            this.textlogin.TabIndex = 2;
            this.textlogin.TextChanged += new System.EventHandler(this.textlogin_TextChanged);
            // 
            // textpass
            // 
            this.textpass.Location = new System.Drawing.Point(305, 185);
            this.textpass.Name = "textpass";
            this.textpass.PasswordChar = '*';
            this.textpass.Size = new System.Drawing.Size(100, 20);
            this.textpass.TabIndex = 3;
            this.textpass.UseSystemPasswordChar = true;
            this.textpass.TextChanged += new System.EventHandler(this.textpass_TextChanged);
            // 
            // aceptar
            // 
            this.aceptar.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.aceptar.Location = new System.Drawing.Point(537, 122);
            this.aceptar.Name = "aceptar";
            this.aceptar.Size = new System.Drawing.Size(147, 54);
            this.aceptar.TabIndex = 4;
            this.aceptar.Text = "Aceptar";
            this.aceptar.UseVisualStyleBackColor = true;
            this.aceptar.Click += new System.EventHandler(this.aceptar_Click);
            // 
            // literal
            // 
            this.literal.AutoSize = true;
            this.literal.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.literal.Location = new System.Drawing.Point(151, 308);
            this.literal.Name = "literal";
            this.literal.Size = new System.Drawing.Size(63, 29);
            this.literal.TabIndex = 5;
            this.literal.Text = "Hola";
            this.literal.Visible = false;
            // 
            // error
            // 
            this.error.AutoSize = true;
            this.error.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.error.Location = new System.Drawing.Point(226, 263);
            this.error.Name = "error";
            this.error.Size = new System.Drawing.Size(347, 39);
            this.error.TabIndex = 6;
            this.error.Text = "ERROR campo vacío";
            this.error.Visible = false;
            // 
            // max3
            // 
            this.max3.AutoSize = true;
            this.max3.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.max3.ForeColor = System.Drawing.Color.Red;
            this.max3.Location = new System.Drawing.Point(300, 383);
            this.max3.Name = "max3";
            this.max3.Size = new System.Drawing.Size(187, 25);
            this.max3.TabIndex = 7;
            this.max3.Text = "Máximo 3 intentos";
            this.max3.Visible = false;
            this.max3.Click += new System.EventHandler(this.label1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.max3);
            this.Controls.Add(this.error);
            this.Controls.Add(this.literal);
            this.Controls.Add(this.aceptar);
            this.Controls.Add(this.textpass);
            this.Controls.Add(this.textlogin);
            this.Controls.Add(this.pass);
            this.Controls.Add(this.login);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label login;
        private System.Windows.Forms.Label pass;
        private System.Windows.Forms.TextBox textlogin;
        private System.Windows.Forms.TextBox textpass;
        private System.Windows.Forms.Button aceptar;
        private System.Windows.Forms.Label literal;
        private System.Windows.Forms.Label error;
        private System.Windows.Forms.Label max3;
    }
}

