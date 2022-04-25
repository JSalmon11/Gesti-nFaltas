
namespace BilletesBus
{
    partial class RegistroUsuario
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
            this.components = new System.ComponentModel.Container();
            this.nombre = new System.Windows.Forms.Label();
            this.dni = new System.Windows.Forms.Label();
            this.tlf = new System.Windows.Forms.Label();
            this.email = new System.Windows.Forms.Label();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.textDni = new System.Windows.Forms.TextBox();
            this.textTlf = new System.Windows.Forms.TextBox();
            this.textEmail = new System.Windows.Forms.TextBox();
            this.aceptar = new System.Windows.Forms.Button();
            this.errorProvider1 = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderDNIcorto = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderDNIlargo = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProvider8primerosDigitos = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderDNIinexistente = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderEmailInvalido = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderTelefonoInvalido = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorProviderNombreInvalido = new System.Windows.Forms.ErrorProvider(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIcorto)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIlargo)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider8primerosDigitos)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIinexistente)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderEmailInvalido)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderTelefonoInvalido)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderNombreInvalido)).BeginInit();
            this.SuspendLayout();
            // 
            // nombre
            // 
            this.nombre.AutoSize = true;
            this.nombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nombre.Location = new System.Drawing.Point(43, 39);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(151, 39);
            this.nombre.TabIndex = 0;
            this.nombre.Text = "Nombre:";
            // 
            // dni
            // 
            this.dni.AutoSize = true;
            this.dni.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dni.Location = new System.Drawing.Point(43, 129);
            this.dni.Name = "dni";
            this.dni.Size = new System.Drawing.Size(86, 39);
            this.dni.TabIndex = 1;
            this.dni.Text = "DNI:";
            // 
            // tlf
            // 
            this.tlf.AutoSize = true;
            this.tlf.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tlf.Location = new System.Drawing.Point(43, 220);
            this.tlf.Name = "tlf";
            this.tlf.Size = new System.Drawing.Size(161, 39);
            this.tlf.TabIndex = 2;
            this.tlf.Text = "Teléfono:";
            // 
            // email
            // 
            this.email.AutoSize = true;
            this.email.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.email.Location = new System.Drawing.Point(43, 307);
            this.email.Name = "email";
            this.email.Size = new System.Drawing.Size(115, 39);
            this.email.TabIndex = 3;
            this.email.Text = "Email:";
            // 
            // textNombre
            // 
            this.textNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textNombre.Location = new System.Drawing.Point(223, 47);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(271, 31);
            this.textNombre.TabIndex = 4;
            this.textNombre.TextChanged += new System.EventHandler(this.textNombre_TextChanged_1);
            // 
            // textDni
            // 
            this.textDni.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textDni.Location = new System.Drawing.Point(223, 137);
            this.textDni.Name = "textDni";
            this.textDni.Size = new System.Drawing.Size(271, 31);
            this.textDni.TabIndex = 5;
            this.textDni.TextChanged += new System.EventHandler(this.textDni_TextChanged);
            // 
            // textTlf
            // 
            this.textTlf.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textTlf.Location = new System.Drawing.Point(223, 228);
            this.textTlf.Name = "textTlf";
            this.textTlf.Size = new System.Drawing.Size(271, 31);
            this.textTlf.TabIndex = 6;
            this.textTlf.TextChanged += new System.EventHandler(this.textTlf_TextChanged);
            // 
            // textEmail
            // 
            this.textEmail.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textEmail.Location = new System.Drawing.Point(223, 315);
            this.textEmail.Name = "textEmail";
            this.textEmail.Size = new System.Drawing.Size(271, 31);
            this.textEmail.TabIndex = 7;
            this.textEmail.TextChanged += new System.EventHandler(this.textEmail_TextChanged);
            // 
            // aceptar
            // 
            this.aceptar.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.aceptar.Location = new System.Drawing.Point(637, 307);
            this.aceptar.Name = "aceptar";
            this.aceptar.Size = new System.Drawing.Size(151, 58);
            this.aceptar.TabIndex = 8;
            this.aceptar.Text = "ACEPTAR";
            this.aceptar.UseVisualStyleBackColor = true;
            this.aceptar.Click += new System.EventHandler(this.aceptar_Click);
            // 
            // errorProvider1
            // 
            this.errorProvider1.ContainerControl = this;
            // 
            // errorProviderDNIcorto
            // 
            this.errorProviderDNIcorto.ContainerControl = this;
            // 
            // errorProviderDNIlargo
            // 
            this.errorProviderDNIlargo.ContainerControl = this;
            // 
            // errorProvider8primerosDigitos
            // 
            this.errorProvider8primerosDigitos.ContainerControl = this;
            // 
            // errorProviderDNIinexistente
            // 
            this.errorProviderDNIinexistente.ContainerControl = this;
            // 
            // errorProviderEmailInvalido
            // 
            this.errorProviderEmailInvalido.ContainerControl = this;
            // 
            // errorProviderTelefonoInvalido
            // 
            this.errorProviderTelefonoInvalido.ContainerControl = this;
            // 
            // errorProviderNombreInvalido
            // 
            this.errorProviderNombreInvalido.ContainerControl = this;
            // 
            // RegistroUsuario
            // 
            this.AcceptButton = this.aceptar;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.aceptar);
            this.Controls.Add(this.textEmail);
            this.Controls.Add(this.textTlf);
            this.Controls.Add(this.textDni);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.email);
            this.Controls.Add(this.tlf);
            this.Controls.Add(this.dni);
            this.Controls.Add(this.nombre);
            this.Name = "RegistroUsuario";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "REGISTRO DE USUARIO";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.cierre);
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIcorto)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIlargo)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProvider8primerosDigitos)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderDNIinexistente)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderEmailInvalido)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderTelefonoInvalido)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorProviderNombreInvalido)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label nombre;
        private System.Windows.Forms.Label dni;
        private System.Windows.Forms.Label tlf;
        private System.Windows.Forms.Label email;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.TextBox textDni;
        private System.Windows.Forms.TextBox textTlf;
        private System.Windows.Forms.TextBox textEmail;
        private System.Windows.Forms.Button aceptar;
        private System.Windows.Forms.ErrorProvider errorProvider1;
        private System.Windows.Forms.ErrorProvider errorProviderDNIcorto;
        private System.Windows.Forms.ErrorProvider errorProviderDNIlargo;
        private System.Windows.Forms.ErrorProvider errorProvider8primerosDigitos;
        private System.Windows.Forms.ErrorProvider errorProviderDNIinexistente;
        private System.Windows.Forms.ErrorProvider errorProviderEmailInvalido;
        private System.Windows.Forms.ErrorProvider errorProviderTelefonoInvalido;
        private System.Windows.Forms.ErrorProvider errorProviderNombreInvalido;
    }
}