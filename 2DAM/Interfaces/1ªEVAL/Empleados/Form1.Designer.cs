
namespace Empleados
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
            this.nombre = new System.Windows.Forms.Label();
            this.apellido = new System.Windows.Forms.Label();
            this.dni = new System.Windows.Forms.Label();
            this.email = new System.Windows.Forms.Label();
            this.fechanac = new System.Windows.Forms.Label();
            this.fechaincor = new System.Windows.Forms.Label();
            this.puesto = new System.Windows.Forms.Label();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.textApellido = new System.Windows.Forms.TextBox();
            this.textDni = new System.Windows.Forms.TextBox();
            this.textEmail = new System.Windows.Forms.TextBox();
            this.textPuesto = new System.Windows.Forms.TextBox();
            this.guardarButton = new System.Windows.Forms.Button();
            this.filtros = new System.Windows.Forms.GroupBox();
            this.mantenimientoButton = new System.Windows.Forms.Button();
            this.jefesButton = new System.Windows.Forms.Button();
            this.operariosButton = new System.Windows.Forms.Button();
            this.cancelarButton = new System.Windows.Forms.Button();
            this.mostrarLabel = new System.Windows.Forms.Label();
            this.dateTimeNacimiento = new System.Windows.Forms.DateTimePicker();
            this.dateTimeIncorporacion = new System.Windows.Forms.DateTimePicker();
            this.filtros.SuspendLayout();
            this.SuspendLayout();
            // 
            // nombre
            // 
            this.nombre.AutoSize = true;
            this.nombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nombre.Location = new System.Drawing.Point(62, 33);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(84, 24);
            this.nombre.TabIndex = 0;
            this.nombre.Text = "Nombre:";
            // 
            // apellido
            // 
            this.apellido.AutoSize = true;
            this.apellido.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.apellido.Location = new System.Drawing.Point(62, 86);
            this.apellido.Name = "apellido";
            this.apellido.Size = new System.Drawing.Size(84, 24);
            this.apellido.TabIndex = 7;
            this.apellido.Text = "Apellido:";
            // 
            // dni
            // 
            this.dni.AutoSize = true;
            this.dni.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dni.Location = new System.Drawing.Point(62, 139);
            this.dni.Name = "dni";
            this.dni.Size = new System.Drawing.Size(46, 24);
            this.dni.TabIndex = 8;
            this.dni.Text = "DNI:";
            // 
            // email
            // 
            this.email.AutoSize = true;
            this.email.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.email.Location = new System.Drawing.Point(62, 191);
            this.email.Name = "email";
            this.email.Size = new System.Drawing.Size(60, 24);
            this.email.TabIndex = 9;
            this.email.Text = "email:";
            // 
            // fechanac
            // 
            this.fechanac.AutoSize = true;
            this.fechanac.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.fechanac.Location = new System.Drawing.Point(62, 248);
            this.fechanac.Name = "fechanac";
            this.fechanac.Size = new System.Drawing.Size(166, 24);
            this.fechanac.TabIndex = 10;
            this.fechanac.Text = "Fecha nacimiento:";
            // 
            // fechaincor
            // 
            this.fechaincor.AutoSize = true;
            this.fechaincor.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.fechaincor.Location = new System.Drawing.Point(62, 299);
            this.fechaincor.Name = "fechaincor";
            this.fechaincor.Size = new System.Drawing.Size(190, 24);
            this.fechaincor.TabIndex = 11;
            this.fechaincor.Text = "Fecha incorporación:";
            // 
            // puesto
            // 
            this.puesto.AutoSize = true;
            this.puesto.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.puesto.Location = new System.Drawing.Point(62, 358);
            this.puesto.Name = "puesto";
            this.puesto.Size = new System.Drawing.Size(73, 24);
            this.puesto.TabIndex = 12;
            this.puesto.Text = "Puesto:";
            // 
            // textNombre
            // 
            this.textNombre.Location = new System.Drawing.Point(292, 38);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(195, 20);
            this.textNombre.TabIndex = 1;
            // 
            // textApellido
            // 
            this.textApellido.Location = new System.Drawing.Point(292, 91);
            this.textApellido.Name = "textApellido";
            this.textApellido.Size = new System.Drawing.Size(195, 20);
            this.textApellido.TabIndex = 2;
            // 
            // textDni
            // 
            this.textDni.Location = new System.Drawing.Point(292, 144);
            this.textDni.Name = "textDni";
            this.textDni.Size = new System.Drawing.Size(195, 20);
            this.textDni.TabIndex = 3;
            // 
            // textEmail
            // 
            this.textEmail.Location = new System.Drawing.Point(292, 196);
            this.textEmail.Name = "textEmail";
            this.textEmail.Size = new System.Drawing.Size(195, 20);
            this.textEmail.TabIndex = 4;
            // 
            // textPuesto
            // 
            this.textPuesto.Location = new System.Drawing.Point(292, 361);
            this.textPuesto.Name = "textPuesto";
            this.textPuesto.Size = new System.Drawing.Size(195, 20);
            this.textPuesto.TabIndex = 7;
            // 
            // guardarButton
            // 
            this.guardarButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.guardarButton.Location = new System.Drawing.Point(608, 56);
            this.guardarButton.Name = "guardarButton";
            this.guardarButton.Size = new System.Drawing.Size(100, 38);
            this.guardarButton.TabIndex = 8;
            this.guardarButton.Text = "GUARDAR";
            this.guardarButton.UseVisualStyleBackColor = true;
            this.guardarButton.Click += new System.EventHandler(this.guardarButton_Click);
            // 
            // filtros
            // 
            this.filtros.Controls.Add(this.mantenimientoButton);
            this.filtros.Controls.Add(this.jefesButton);
            this.filtros.Controls.Add(this.operariosButton);
            this.filtros.Location = new System.Drawing.Point(554, 243);
            this.filtros.Name = "filtros";
            this.filtros.Size = new System.Drawing.Size(217, 139);
            this.filtros.TabIndex = 21;
            this.filtros.TabStop = false;
            this.filtros.Text = "Filtros";
            // 
            // mantenimientoButton
            // 
            this.mantenimientoButton.Location = new System.Drawing.Point(65, 97);
            this.mantenimientoButton.Name = "mantenimientoButton";
            this.mantenimientoButton.Size = new System.Drawing.Size(86, 23);
            this.mantenimientoButton.TabIndex = 11;
            this.mantenimientoButton.Text = "Mantenimiento";
            this.mantenimientoButton.UseVisualStyleBackColor = true;
            this.mantenimientoButton.Click += new System.EventHandler(this.mantenimientoButton_Click);
            // 
            // jefesButton
            // 
            this.jefesButton.Location = new System.Drawing.Point(65, 59);
            this.jefesButton.Name = "jefesButton";
            this.jefesButton.Size = new System.Drawing.Size(86, 23);
            this.jefesButton.TabIndex = 10;
            this.jefesButton.Text = "Jefes";
            this.jefesButton.UseVisualStyleBackColor = true;
            this.jefesButton.Click += new System.EventHandler(this.jefesButton_Click);
            // 
            // operariosButton
            // 
            this.operariosButton.Location = new System.Drawing.Point(65, 19);
            this.operariosButton.Name = "operariosButton";
            this.operariosButton.Size = new System.Drawing.Size(86, 23);
            this.operariosButton.TabIndex = 9;
            this.operariosButton.Text = "Operarios";
            this.operariosButton.UseVisualStyleBackColor = true;
            this.operariosButton.Click += new System.EventHandler(this.operariosButton_Click);
            // 
            // cancelarButton
            // 
            this.cancelarButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cancelarButton.Location = new System.Drawing.Point(608, 139);
            this.cancelarButton.Name = "cancelarButton";
            this.cancelarButton.Size = new System.Drawing.Size(100, 44);
            this.cancelarButton.TabIndex = 20;
            this.cancelarButton.Text = "CANCELAR";
            this.cancelarButton.UseVisualStyleBackColor = true;
            this.cancelarButton.Click += new System.EventHandler(this.cancelarButton_Click);
            // 
            // mostrarLabel
            // 
            this.mostrarLabel.AutoSize = true;
            this.mostrarLabel.Location = new System.Drawing.Point(63, 426);
            this.mostrarLabel.Name = "mostrarLabel";
            this.mostrarLabel.Size = new System.Drawing.Size(247, 13);
            this.mostrarLabel.TabIndex = 23;
            this.mostrarLabel.Text = "                                                                                ";
            // 
            // dateTimeNacimiento
            // 
            this.dateTimeNacimiento.Location = new System.Drawing.Point(292, 252);
            this.dateTimeNacimiento.MaxDate = new System.DateTime(2005, 1, 1, 0, 0, 0, 0);
            this.dateTimeNacimiento.MinDate = new System.DateTime(1950, 1, 1, 0, 0, 0, 0);
            this.dateTimeNacimiento.Name = "dateTimeNacimiento";
            this.dateTimeNacimiento.Size = new System.Drawing.Size(195, 20);
            this.dateTimeNacimiento.TabIndex = 5;
            this.dateTimeNacimiento.Value = new System.DateTime(2005, 1, 1, 0, 0, 0, 0);
            // 
            // dateTimeIncorporacion
            // 
            this.dateTimeIncorporacion.Location = new System.Drawing.Point(292, 307);
            this.dateTimeIncorporacion.MaxDate = new System.DateTime(2021, 10, 8, 0, 0, 0, 0);
            this.dateTimeIncorporacion.MinDate = new System.DateTime(1960, 1, 1, 0, 0, 0, 0);
            this.dateTimeIncorporacion.Name = "dateTimeIncorporacion";
            this.dateTimeIncorporacion.Size = new System.Drawing.Size(195, 20);
            this.dateTimeIncorporacion.TabIndex = 6;
            this.dateTimeIncorporacion.Value = new System.DateTime(2021, 10, 8, 0, 0, 0, 0);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(853, 588);
            this.Controls.Add(this.dateTimeIncorporacion);
            this.Controls.Add(this.dateTimeNacimiento);
            this.Controls.Add(this.mostrarLabel);
            this.Controls.Add(this.cancelarButton);
            this.Controls.Add(this.filtros);
            this.Controls.Add(this.guardarButton);
            this.Controls.Add(this.textPuesto);
            this.Controls.Add(this.textEmail);
            this.Controls.Add(this.textDni);
            this.Controls.Add(this.textApellido);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.puesto);
            this.Controls.Add(this.fechaincor);
            this.Controls.Add(this.fechanac);
            this.Controls.Add(this.email);
            this.Controls.Add(this.dni);
            this.Controls.Add(this.apellido);
            this.Controls.Add(this.nombre);
            this.Name = "Form1";
            this.Text = "Empleados";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.filtros.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label nombre;
        private System.Windows.Forms.Label apellido;
        private System.Windows.Forms.Label dni;
        private System.Windows.Forms.Label email;
        private System.Windows.Forms.Label fechanac;
        private System.Windows.Forms.Label fechaincor;
        private System.Windows.Forms.Label puesto;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.TextBox textApellido;
        private System.Windows.Forms.TextBox textDni;
        private System.Windows.Forms.TextBox textEmail;
        private System.Windows.Forms.TextBox textPuesto;
        private System.Windows.Forms.Button guardarButton;
        private System.Windows.Forms.GroupBox filtros;
        private System.Windows.Forms.Button cancelarButton;
        private System.Windows.Forms.Button mantenimientoButton;
        private System.Windows.Forms.Button jefesButton;
        private System.Windows.Forms.Button operariosButton;
        private System.Windows.Forms.Label mostrarLabel;
        private System.Windows.Forms.DateTimePicker dateTimeNacimiento;
        private System.Windows.Forms.DateTimePicker dateTimeIncorporacion;
    }
}

