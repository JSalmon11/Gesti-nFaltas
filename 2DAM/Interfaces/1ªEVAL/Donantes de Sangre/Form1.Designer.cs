
namespace Donantes_de_Sangre
{
    partial class GestionDonantes
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
            this.menuRegistroDonantes = new System.Windows.Forms.MenuStrip();
            this.registroToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.nuevoDonanteToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.bajaDonanteToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.buscarDonanteToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.solicitudesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.tiposDisponiblesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.disponibilidadPorTipoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.groupRegistro = new System.Windows.Forms.GroupBox();
            this.groupSangre = new System.Windows.Forms.GroupBox();
            this.buttonBuscar = new System.Windows.Forms.Button();
            this.grupo = new System.Windows.Forms.Label();
            this.checkA = new System.Windows.Forms.CheckBox();
            this.aceptar = new System.Windows.Forms.Button();
            this.radioButtonNegativo = new System.Windows.Forms.RadioButton();
            this.checkB = new System.Windows.Forms.CheckBox();
            this.radioButtonPositivo = new System.Windows.Forms.RadioButton();
            this.check0 = new System.Windows.Forms.CheckBox();
            this.factor = new System.Windows.Forms.Label();
            this.groupDatosDonante = new System.Windows.Forms.GroupBox();
            this.checkBoxActivo = new System.Windows.Forms.CheckBox();
            this.buttonBaja = new System.Windows.Forms.Button();
            this.nombre = new System.Windows.Forms.Label();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.direccion = new System.Windows.Forms.Label();
            this.tlf = new System.Windows.Forms.Label();
            this.textDireccion = new System.Windows.Forms.TextBox();
            this.textTlf = new System.Windows.Forms.TextBox();
            this.groupBusqueda = new System.Windows.Forms.GroupBox();
            this.mostrarLabel = new System.Windows.Forms.Label();
            this.menuRegistroDonantes.SuspendLayout();
            this.groupRegistro.SuspendLayout();
            this.groupSangre.SuspendLayout();
            this.groupDatosDonante.SuspendLayout();
            this.groupBusqueda.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuRegistroDonantes
            // 
            this.menuRegistroDonantes.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.registroToolStripMenuItem,
            this.solicitudesToolStripMenuItem});
            this.menuRegistroDonantes.Location = new System.Drawing.Point(0, 0);
            this.menuRegistroDonantes.Name = "menuRegistroDonantes";
            this.menuRegistroDonantes.Size = new System.Drawing.Size(805, 24);
            this.menuRegistroDonantes.TabIndex = 0;
            this.menuRegistroDonantes.Text = "menuStrip1";
            // 
            // registroToolStripMenuItem
            // 
            this.registroToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.nuevoDonanteToolStripMenuItem,
            this.bajaDonanteToolStripMenuItem,
            this.buscarDonanteToolStripMenuItem});
            this.registroToolStripMenuItem.Name = "registroToolStripMenuItem";
            this.registroToolStripMenuItem.Size = new System.Drawing.Size(62, 20);
            this.registroToolStripMenuItem.Text = "Registro";
            // 
            // nuevoDonanteToolStripMenuItem
            // 
            this.nuevoDonanteToolStripMenuItem.Name = "nuevoDonanteToolStripMenuItem";
            this.nuevoDonanteToolStripMenuItem.Size = new System.Drawing.Size(156, 22);
            this.nuevoDonanteToolStripMenuItem.Text = "Nuevo donante";
            this.nuevoDonanteToolStripMenuItem.Click += new System.EventHandler(this.nuevoDonanteToolStripMenuItem_Click);
            // 
            // bajaDonanteToolStripMenuItem
            // 
            this.bajaDonanteToolStripMenuItem.Name = "bajaDonanteToolStripMenuItem";
            this.bajaDonanteToolStripMenuItem.Size = new System.Drawing.Size(156, 22);
            this.bajaDonanteToolStripMenuItem.Text = "Baja donante";
            this.bajaDonanteToolStripMenuItem.Click += new System.EventHandler(this.bajaDonanteToolStripMenuItem_Click);
            // 
            // buscarDonanteToolStripMenuItem
            // 
            this.buscarDonanteToolStripMenuItem.Name = "buscarDonanteToolStripMenuItem";
            this.buscarDonanteToolStripMenuItem.Size = new System.Drawing.Size(156, 22);
            this.buscarDonanteToolStripMenuItem.Text = "Buscar donante";
            this.buscarDonanteToolStripMenuItem.Click += new System.EventHandler(this.buscarDonanteToolStripMenuItem_Click);
            // 
            // solicitudesToolStripMenuItem
            // 
            this.solicitudesToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tiposDisponiblesToolStripMenuItem,
            this.disponibilidadPorTipoToolStripMenuItem});
            this.solicitudesToolStripMenuItem.Name = "solicitudesToolStripMenuItem";
            this.solicitudesToolStripMenuItem.Size = new System.Drawing.Size(76, 20);
            this.solicitudesToolStripMenuItem.Text = "Solicitudes";
            // 
            // tiposDisponiblesToolStripMenuItem
            // 
            this.tiposDisponiblesToolStripMenuItem.Name = "tiposDisponiblesToolStripMenuItem";
            this.tiposDisponiblesToolStripMenuItem.Size = new System.Drawing.Size(195, 22);
            this.tiposDisponiblesToolStripMenuItem.Text = "Tipos disponibles";
            this.tiposDisponiblesToolStripMenuItem.Click += new System.EventHandler(this.tiposDisponiblesToolStripMenuItem_Click);
            // 
            // disponibilidadPorTipoToolStripMenuItem
            // 
            this.disponibilidadPorTipoToolStripMenuItem.Name = "disponibilidadPorTipoToolStripMenuItem";
            this.disponibilidadPorTipoToolStripMenuItem.Size = new System.Drawing.Size(195, 22);
            this.disponibilidadPorTipoToolStripMenuItem.Text = "Disponibilidad por tipo";
            this.disponibilidadPorTipoToolStripMenuItem.Click += new System.EventHandler(this.disponibilidadPorTipoToolStripMenuItem_Click);
            // 
            // groupRegistro
            // 
            this.groupRegistro.Controls.Add(this.groupSangre);
            this.groupRegistro.Controls.Add(this.groupDatosDonante);
            this.groupRegistro.Location = new System.Drawing.Point(12, 27);
            this.groupRegistro.Name = "groupRegistro";
            this.groupRegistro.Size = new System.Drawing.Size(411, 411);
            this.groupRegistro.TabIndex = 1;
            this.groupRegistro.TabStop = false;
            this.groupRegistro.Visible = false;
            // 
            // groupSangre
            // 
            this.groupSangre.Controls.Add(this.buttonBuscar);
            this.groupSangre.Controls.Add(this.grupo);
            this.groupSangre.Controls.Add(this.checkA);
            this.groupSangre.Controls.Add(this.aceptar);
            this.groupSangre.Controls.Add(this.radioButtonNegativo);
            this.groupSangre.Controls.Add(this.checkB);
            this.groupSangre.Controls.Add(this.radioButtonPositivo);
            this.groupSangre.Controls.Add(this.check0);
            this.groupSangre.Controls.Add(this.factor);
            this.groupSangre.Location = new System.Drawing.Point(6, 249);
            this.groupSangre.Name = "groupSangre";
            this.groupSangre.Size = new System.Drawing.Size(399, 138);
            this.groupSangre.TabIndex = 3;
            this.groupSangre.TabStop = false;
            // 
            // buttonBuscar
            // 
            this.buttonBuscar.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonBuscar.Location = new System.Drawing.Point(237, 19);
            this.buttonBuscar.Name = "buttonBuscar";
            this.buttonBuscar.Size = new System.Drawing.Size(122, 39);
            this.buttonBuscar.TabIndex = 12;
            this.buttonBuscar.Text = "BUSCAR";
            this.buttonBuscar.UseVisualStyleBackColor = true;
            this.buttonBuscar.Visible = false;
            this.buttonBuscar.Click += new System.EventHandler(this.buttonBuscar_Click);
            // 
            // grupo
            // 
            this.grupo.AutoSize = true;
            this.grupo.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grupo.Location = new System.Drawing.Point(6, 17);
            this.grupo.Name = "grupo";
            this.grupo.Size = new System.Drawing.Size(48, 16);
            this.grupo.TabIndex = 14;
            this.grupo.Text = "Grupo:";
            // 
            // checkA
            // 
            this.checkA.AutoSize = true;
            this.checkA.Checked = true;
            this.checkA.CheckState = System.Windows.Forms.CheckState.Checked;
            this.checkA.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.checkA.Location = new System.Drawing.Point(9, 36);
            this.checkA.Name = "checkA";
            this.checkA.Size = new System.Drawing.Size(42, 28);
            this.checkA.TabIndex = 11;
            this.checkA.Text = "A";
            this.checkA.UseVisualStyleBackColor = true;
            // 
            // aceptar
            // 
            this.aceptar.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.aceptar.Location = new System.Drawing.Point(237, 64);
            this.aceptar.Name = "aceptar";
            this.aceptar.Size = new System.Drawing.Size(122, 57);
            this.aceptar.TabIndex = 18;
            this.aceptar.Text = "REGISTRAR";
            this.aceptar.UseVisualStyleBackColor = true;
            this.aceptar.Click += new System.EventHandler(this.aceptar_Click);
            // 
            // radioButtonNegativo
            // 
            this.radioButtonNegativo.AutoSize = true;
            this.radioButtonNegativo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.radioButtonNegativo.Location = new System.Drawing.Point(160, 93);
            this.radioButtonNegativo.Name = "radioButtonNegativo";
            this.radioButtonNegativo.Size = new System.Drawing.Size(34, 28);
            this.radioButtonNegativo.TabIndex = 17;
            this.radioButtonNegativo.Text = "-";
            this.radioButtonNegativo.UseVisualStyleBackColor = true;
            // 
            // checkB
            // 
            this.checkB.AutoSize = true;
            this.checkB.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.checkB.Location = new System.Drawing.Point(9, 70);
            this.checkB.Name = "checkB";
            this.checkB.Size = new System.Drawing.Size(41, 28);
            this.checkB.TabIndex = 12;
            this.checkB.Text = "B";
            this.checkB.UseVisualStyleBackColor = true;
            // 
            // radioButtonPositivo
            // 
            this.radioButtonPositivo.AutoSize = true;
            this.radioButtonPositivo.Checked = true;
            this.radioButtonPositivo.Cursor = System.Windows.Forms.Cursors.No;
            this.radioButtonPositivo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.radioButtonPositivo.Location = new System.Drawing.Point(160, 47);
            this.radioButtonPositivo.Name = "radioButtonPositivo";
            this.radioButtonPositivo.Size = new System.Drawing.Size(39, 28);
            this.radioButtonPositivo.TabIndex = 16;
            this.radioButtonPositivo.TabStop = true;
            this.radioButtonPositivo.Text = "+";
            this.radioButtonPositivo.UseVisualStyleBackColor = true;
            // 
            // check0
            // 
            this.check0.AutoSize = true;
            this.check0.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.check0.Location = new System.Drawing.Point(9, 104);
            this.check0.Name = "check0";
            this.check0.Size = new System.Drawing.Size(39, 28);
            this.check0.TabIndex = 13;
            this.check0.Text = "0";
            this.check0.UseVisualStyleBackColor = true;
            // 
            // factor
            // 
            this.factor.AutoSize = true;
            this.factor.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.factor.Location = new System.Drawing.Point(157, 17);
            this.factor.Name = "factor";
            this.factor.Size = new System.Drawing.Size(49, 16);
            this.factor.TabIndex = 15;
            this.factor.Text = "Factor:";
            // 
            // groupDatosDonante
            // 
            this.groupDatosDonante.Controls.Add(this.checkBoxActivo);
            this.groupDatosDonante.Controls.Add(this.buttonBaja);
            this.groupDatosDonante.Controls.Add(this.nombre);
            this.groupDatosDonante.Controls.Add(this.textNombre);
            this.groupDatosDonante.Controls.Add(this.direccion);
            this.groupDatosDonante.Controls.Add(this.tlf);
            this.groupDatosDonante.Controls.Add(this.textDireccion);
            this.groupDatosDonante.Controls.Add(this.textTlf);
            this.groupDatosDonante.Location = new System.Drawing.Point(6, 16);
            this.groupDatosDonante.Name = "groupDatosDonante";
            this.groupDatosDonante.Size = new System.Drawing.Size(399, 227);
            this.groupDatosDonante.TabIndex = 3;
            this.groupDatosDonante.TabStop = false;
            // 
            // checkBoxActivo
            // 
            this.checkBoxActivo.AutoSize = true;
            this.checkBoxActivo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.checkBoxActivo.Location = new System.Drawing.Point(10, 190);
            this.checkBoxActivo.Name = "checkBoxActivo";
            this.checkBoxActivo.Size = new System.Drawing.Size(153, 28);
            this.checkBoxActivo.TabIndex = 13;
            this.checkBoxActivo.Text = "Donante activo";
            this.checkBoxActivo.UseVisualStyleBackColor = true;
            // 
            // buttonBaja
            // 
            this.buttonBaja.Enabled = false;
            this.buttonBaja.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonBaja.Location = new System.Drawing.Point(197, 190);
            this.buttonBaja.Name = "buttonBaja";
            this.buttonBaja.Size = new System.Drawing.Size(93, 23);
            this.buttonBaja.TabIndex = 11;
            this.buttonBaja.Text = "BAJA";
            this.buttonBaja.UseVisualStyleBackColor = true;
            this.buttonBaja.Visible = false;
            this.buttonBaja.Click += new System.EventHandler(this.buttonBaja_Click);
            // 
            // nombre
            // 
            this.nombre.AutoSize = true;
            this.nombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nombre.Location = new System.Drawing.Point(6, 26);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(84, 24);
            this.nombre.TabIndex = 4;
            this.nombre.Text = "Nombre:";
            // 
            // textNombre
            // 
            this.textNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textNombre.Location = new System.Drawing.Point(161, 26);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(170, 24);
            this.textNombre.TabIndex = 0;
            // 
            // direccion
            // 
            this.direccion.AutoSize = true;
            this.direccion.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.direccion.Location = new System.Drawing.Point(6, 80);
            this.direccion.Name = "direccion";
            this.direccion.Size = new System.Drawing.Size(95, 24);
            this.direccion.TabIndex = 5;
            this.direccion.Text = "Dirección:";
            // 
            // tlf
            // 
            this.tlf.AutoSize = true;
            this.tlf.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tlf.Location = new System.Drawing.Point(6, 135);
            this.tlf.Name = "tlf";
            this.tlf.Size = new System.Drawing.Size(90, 24);
            this.tlf.TabIndex = 6;
            this.tlf.Text = "Teléfono:";
            // 
            // textDireccion
            // 
            this.textDireccion.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textDireccion.Location = new System.Drawing.Point(161, 80);
            this.textDireccion.Name = "textDireccion";
            this.textDireccion.Size = new System.Drawing.Size(170, 24);
            this.textDireccion.TabIndex = 8;
            // 
            // textTlf
            // 
            this.textTlf.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textTlf.Location = new System.Drawing.Point(161, 135);
            this.textTlf.Name = "textTlf";
            this.textTlf.Size = new System.Drawing.Size(170, 24);
            this.textTlf.TabIndex = 9;
            // 
            // groupBusqueda
            // 
            this.groupBusqueda.AutoSize = true;
            this.groupBusqueda.Controls.Add(this.mostrarLabel);
            this.groupBusqueda.Location = new System.Drawing.Point(429, 27);
            this.groupBusqueda.Name = "groupBusqueda";
            this.groupBusqueda.Size = new System.Drawing.Size(362, 411);
            this.groupBusqueda.TabIndex = 2;
            this.groupBusqueda.TabStop = false;
            this.groupBusqueda.Text = "Búsqueda";
            this.groupBusqueda.Visible = false;
            // 
            // mostrarLabel
            // 
            this.mostrarLabel.AutoSize = true;
            this.mostrarLabel.Location = new System.Drawing.Point(6, 16);
            this.mostrarLabel.MaximumSize = new System.Drawing.Size(350, 0);
            this.mostrarLabel.MinimumSize = new System.Drawing.Size(350, 0);
            this.mostrarLabel.Name = "mostrarLabel";
            this.mostrarLabel.Size = new System.Drawing.Size(350, 13);
            this.mostrarLabel.TabIndex = 0;
            // 
            // GestionDonantes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(805, 450);
            this.Controls.Add(this.groupBusqueda);
            this.Controls.Add(this.groupRegistro);
            this.Controls.Add(this.menuRegistroDonantes);
            this.MainMenuStrip = this.menuRegistroDonantes;
            this.Name = "GestionDonantes";
            this.Text = "Gestión de donantes";
            this.menuRegistroDonantes.ResumeLayout(false);
            this.menuRegistroDonantes.PerformLayout();
            this.groupRegistro.ResumeLayout(false);
            this.groupSangre.ResumeLayout(false);
            this.groupSangre.PerformLayout();
            this.groupDatosDonante.ResumeLayout(false);
            this.groupDatosDonante.PerformLayout();
            this.groupBusqueda.ResumeLayout(false);
            this.groupBusqueda.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuRegistroDonantes;
        private System.Windows.Forms.ToolStripMenuItem registroToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem nuevoDonanteToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem bajaDonanteToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem buscarDonanteToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem solicitudesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem tiposDisponiblesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem disponibilidadPorTipoToolStripMenuItem;
        private System.Windows.Forms.GroupBox groupRegistro;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.Label nombre;
        private System.Windows.Forms.Label tlf;
        private System.Windows.Forms.Label direccion;
        private System.Windows.Forms.TextBox textTlf;
        private System.Windows.Forms.TextBox textDireccion;
        private System.Windows.Forms.CheckBox check0;
        private System.Windows.Forms.CheckBox checkB;
        private System.Windows.Forms.CheckBox checkA;
        private System.Windows.Forms.Button aceptar;
        private System.Windows.Forms.RadioButton radioButtonNegativo;
        private System.Windows.Forms.RadioButton radioButtonPositivo;
        private System.Windows.Forms.Label factor;
        private System.Windows.Forms.Label grupo;
        private System.Windows.Forms.GroupBox groupBusqueda;
        private System.Windows.Forms.Label mostrarLabel;
        private System.Windows.Forms.GroupBox groupDatosDonante;
        private System.Windows.Forms.GroupBox groupSangre;
        private System.Windows.Forms.Button buttonBaja;
        private System.Windows.Forms.CheckBox checkBoxActivo;
        private System.Windows.Forms.Button buttonBuscar;
    }
}

