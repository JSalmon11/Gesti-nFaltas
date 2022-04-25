
namespace ExamenGestionAlumnos
{
    partial class Registro
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
            this.labelUser = new System.Windows.Forms.Label();
            this.labelPass = new System.Windows.Forms.Label();
            this.labelNombre = new System.Windows.Forms.Label();
            this.labelFechaNac = new System.Windows.Forms.Label();
            this.textUser = new System.Windows.Forms.TextBox();
            this.textPass = new System.Windows.Forms.TextBox();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.dateFechaNacimiento = new System.Windows.Forms.DateTimePicker();
            this.errorUserVacio = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorPassVacio = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorUserMax5 = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorPassMax8 = new System.Windows.Forms.ErrorProvider(this.components);
            this.errorMenorEdad = new System.Windows.Forms.ErrorProvider(this.components);
            this.buttonGuardar = new System.Windows.Forms.Button();
            this.buttonVolver = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.errorUserVacio)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorPassVacio)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorUserMax5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorPassMax8)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorMenorEdad)).BeginInit();
            this.SuspendLayout();
            // 
            // labelUser
            // 
            this.labelUser.AutoSize = true;
            this.labelUser.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelUser.Location = new System.Drawing.Point(95, 63);
            this.labelUser.Name = "labelUser";
            this.labelUser.Size = new System.Drawing.Size(66, 24);
            this.labelUser.TabIndex = 0;
            this.labelUser.Text = "USER:";
            // 
            // labelPass
            // 
            this.labelPass.AutoSize = true;
            this.labelPass.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelPass.Location = new System.Drawing.Point(404, 63);
            this.labelPass.Name = "labelPass";
            this.labelPass.Size = new System.Drawing.Size(55, 24);
            this.labelPass.TabIndex = 1;
            this.labelPass.Text = "Pass:";
            // 
            // labelNombre
            // 
            this.labelNombre.AutoSize = true;
            this.labelNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelNombre.Location = new System.Drawing.Point(95, 145);
            this.labelNombre.Name = "labelNombre";
            this.labelNombre.Size = new System.Drawing.Size(84, 24);
            this.labelNombre.TabIndex = 2;
            this.labelNombre.Text = "Nombre:";
            // 
            // labelFechaNac
            // 
            this.labelFechaNac.AutoSize = true;
            this.labelFechaNac.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelFechaNac.Location = new System.Drawing.Point(95, 228);
            this.labelFechaNac.Name = "labelFechaNac";
            this.labelFechaNac.Size = new System.Drawing.Size(193, 24);
            this.labelFechaNac.TabIndex = 3;
            this.labelFechaNac.Text = "Fecha de nacimiento:";
            // 
            // textUser
            // 
            this.textUser.Location = new System.Drawing.Point(185, 67);
            this.textUser.Name = "textUser";
            this.textUser.Size = new System.Drawing.Size(163, 20);
            this.textUser.TabIndex = 1;
            this.textUser.TextChanged += new System.EventHandler(this.textUser_TextChanged);
            // 
            // textPass
            // 
            this.textPass.Location = new System.Drawing.Point(465, 67);
            this.textPass.Name = "textPass";
            this.textPass.PasswordChar = '*';
            this.textPass.Size = new System.Drawing.Size(157, 20);
            this.textPass.TabIndex = 2;
            this.textPass.TextChanged += new System.EventHandler(this.textPass_TextChanged);
            // 
            // textNombre
            // 
            this.textNombre.Location = new System.Drawing.Point(185, 149);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(163, 20);
            this.textNombre.TabIndex = 3;
            // 
            // dateFechaNacimiento
            // 
            this.dateFechaNacimiento.Location = new System.Drawing.Point(294, 232);
            this.dateFechaNacimiento.MaxDate = new System.DateTime(2003, 11, 19, 0, 0, 0, 0);
            this.dateFechaNacimiento.MinDate = new System.DateTime(1910, 1, 1, 0, 0, 0, 0);
            this.dateFechaNacimiento.Name = "dateFechaNacimiento";
            this.dateFechaNacimiento.Size = new System.Drawing.Size(200, 20);
            this.dateFechaNacimiento.TabIndex = 4;
            this.dateFechaNacimiento.Value = new System.DateTime(2003, 1, 1, 0, 0, 0, 0);
            // 
            // errorUserVacio
            // 
            this.errorUserVacio.ContainerControl = this;
            // 
            // errorPassVacio
            // 
            this.errorPassVacio.ContainerControl = this;
            // 
            // errorUserMax5
            // 
            this.errorUserMax5.ContainerControl = this;
            // 
            // errorPassMax8
            // 
            this.errorPassMax8.ContainerControl = this;
            // 
            // errorMenorEdad
            // 
            this.errorMenorEdad.ContainerControl = this;
            // 
            // buttonGuardar
            // 
            this.buttonGuardar.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonGuardar.Location = new System.Drawing.Point(323, 300);
            this.buttonGuardar.Name = "buttonGuardar";
            this.buttonGuardar.Size = new System.Drawing.Size(118, 42);
            this.buttonGuardar.TabIndex = 5;
            this.buttonGuardar.Text = "GUARDAR";
            this.buttonGuardar.UseVisualStyleBackColor = true;
            this.buttonGuardar.Click += new System.EventHandler(this.buttonGuardar_Click);
            // 
            // buttonVolver
            // 
            this.buttonVolver.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonVolver.Location = new System.Drawing.Point(504, 300);
            this.buttonVolver.Name = "buttonVolver";
            this.buttonVolver.Size = new System.Drawing.Size(118, 42);
            this.buttonVolver.TabIndex = 6;
            this.buttonVolver.Text = "VOLVER";
            this.buttonVolver.UseVisualStyleBackColor = true;
            this.buttonVolver.Click += new System.EventHandler(this.buttonVolver_Click);
            // 
            // Registro
            // 
            this.AcceptButton = this.buttonGuardar;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.buttonVolver;
            this.ClientSize = new System.Drawing.Size(725, 370);
            this.Controls.Add(this.buttonVolver);
            this.Controls.Add(this.buttonGuardar);
            this.Controls.Add(this.dateFechaNacimiento);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.textPass);
            this.Controls.Add(this.textUser);
            this.Controls.Add(this.labelFechaNac);
            this.Controls.Add(this.labelNombre);
            this.Controls.Add(this.labelPass);
            this.Controls.Add(this.labelUser);
            this.Name = "Registro";
            this.Text = "Registro";
            this.Load += new System.EventHandler(this.Registro_Load);
            ((System.ComponentModel.ISupportInitialize)(this.errorUserVacio)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorPassVacio)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorUserMax5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorPassMax8)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.errorMenorEdad)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelUser;
        private System.Windows.Forms.Label labelPass;
        private System.Windows.Forms.Label labelNombre;
        private System.Windows.Forms.Label labelFechaNac;
        private System.Windows.Forms.TextBox textUser;
        private System.Windows.Forms.TextBox textPass;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.DateTimePicker dateFechaNacimiento;
        private System.Windows.Forms.ErrorProvider errorUserVacio;
        private System.Windows.Forms.ErrorProvider errorPassVacio;
        private System.Windows.Forms.ErrorProvider errorUserMax5;
        private System.Windows.Forms.ErrorProvider errorPassMax8;
        private System.Windows.Forms.ErrorProvider errorMenorEdad;
        private System.Windows.Forms.Button buttonVolver;
        private System.Windows.Forms.Button buttonGuardar;
    }
}