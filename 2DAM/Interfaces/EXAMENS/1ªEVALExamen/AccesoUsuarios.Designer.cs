
namespace ExamenGestionAlumnos
{
    partial class accesoUsuarios
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
            this.labelUsr = new System.Windows.Forms.Label();
            this.labelPass = new System.Windows.Forms.Label();
            this.textUser = new System.Windows.Forms.TextBox();
            this.textPass = new System.Windows.Forms.TextBox();
            this.buttonAcceso = new System.Windows.Forms.Button();
            this.buttonSalir = new System.Windows.Forms.Button();
            this.labelUsuariosRegistrado = new System.Windows.Forms.Label();
            this.errorContraseniaIncorrecta = new System.Windows.Forms.ErrorProvider(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.errorContraseniaIncorrecta)).BeginInit();
            this.SuspendLayout();
            // 
            // labelUsr
            // 
            this.labelUsr.AutoSize = true;
            this.labelUsr.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelUsr.Location = new System.Drawing.Point(57, 46);
            this.labelUsr.Name = "labelUsr";
            this.labelUsr.Size = new System.Drawing.Size(38, 20);
            this.labelUsr.TabIndex = 0;
            this.labelUsr.Text = "Usr:";
            // 
            // labelPass
            // 
            this.labelPass.AutoSize = true;
            this.labelPass.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelPass.Location = new System.Drawing.Point(57, 98);
            this.labelPass.Name = "labelPass";
            this.labelPass.Size = new System.Drawing.Size(48, 20);
            this.labelPass.TabIndex = 1;
            this.labelPass.Text = "Pass:";
            // 
            // textUser
            // 
            this.textUser.Location = new System.Drawing.Point(144, 46);
            this.textUser.Name = "textUser";
            this.textUser.Size = new System.Drawing.Size(100, 20);
            this.textUser.TabIndex = 1;
            // 
            // textPass
            // 
            this.textPass.Location = new System.Drawing.Point(144, 98);
            this.textPass.Name = "textPass";
            this.textPass.PasswordChar = '*';
            this.textPass.Size = new System.Drawing.Size(100, 20);
            this.textPass.TabIndex = 2;
            // 
            // buttonAcceso
            // 
            this.buttonAcceso.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonAcceso.Location = new System.Drawing.Point(80, 161);
            this.buttonAcceso.Name = "buttonAcceso";
            this.buttonAcceso.Size = new System.Drawing.Size(91, 42);
            this.buttonAcceso.TabIndex = 3;
            this.buttonAcceso.Text = "ACCESO";
            this.buttonAcceso.UseVisualStyleBackColor = true;
            this.buttonAcceso.Click += new System.EventHandler(this.buttonAcceso_Click);
            // 
            // buttonSalir
            // 
            this.buttonSalir.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.buttonSalir.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonSalir.Location = new System.Drawing.Point(246, 161);
            this.buttonSalir.Name = "buttonSalir";
            this.buttonSalir.Size = new System.Drawing.Size(91, 42);
            this.buttonSalir.TabIndex = 4;
            this.buttonSalir.Text = "SALIR";
            this.buttonSalir.UseVisualStyleBackColor = true;
            this.buttonSalir.Click += new System.EventHandler(this.buttonSalir_Click);
            // 
            // labelUsuariosRegistrado
            // 
            this.labelUsuariosRegistrado.AutoSize = true;
            this.labelUsuariosRegistrado.Location = new System.Drawing.Point(243, 224);
            this.labelUsuariosRegistrado.Name = "labelUsuariosRegistrado";
            this.labelUsuariosRegistrado.Size = new System.Drawing.Size(108, 13);
            this.labelUsuariosRegistrado.TabIndex = 5;
            this.labelUsuariosRegistrado.Text = "Usuarios registrados: ";
            // 
            // errorContraseniaIncorrecta
            // 
            this.errorContraseniaIncorrecta.ContainerControl = this;
            // 
            // accesoUsuarios
            // 
            this.AcceptButton = this.buttonAcceso;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.buttonSalir;
            this.ClientSize = new System.Drawing.Size(418, 256);
            this.Controls.Add(this.labelUsuariosRegistrado);
            this.Controls.Add(this.buttonSalir);
            this.Controls.Add(this.buttonAcceso);
            this.Controls.Add(this.textPass);
            this.Controls.Add(this.textUser);
            this.Controls.Add(this.labelPass);
            this.Controls.Add(this.labelUsr);
            this.Name = "accesoUsuarios";
            this.Text = "Acceso usuarios";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.cierre);
            this.Load += new System.EventHandler(this.accesoUsuarios_Load);
            ((System.ComponentModel.ISupportInitialize)(this.errorContraseniaIncorrecta)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelUsr;
        private System.Windows.Forms.Label labelPass;
        private System.Windows.Forms.TextBox textUser;
        private System.Windows.Forms.TextBox textPass;
        private System.Windows.Forms.Button buttonAcceso;
        private System.Windows.Forms.Button buttonSalir;
        private System.Windows.Forms.Label labelUsuariosRegistrado;
        private System.Windows.Forms.ErrorProvider errorContraseniaIncorrecta;
    }
}

