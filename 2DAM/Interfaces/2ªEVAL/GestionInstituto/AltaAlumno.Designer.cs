
namespace GestionInstituto
{
    partial class AltaAlumno
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.groupPrimero = new System.Windows.Forms.GroupBox();
            this.entornos = new System.Windows.Forms.CheckBox();
            this.fol = new System.Windows.Forms.CheckBox();
            this.sist = new System.Windows.Forms.CheckBox();
            this.marcas = new System.Windows.Forms.CheckBox();
            this.bbdd = new System.Windows.Forms.CheckBox();
            this.prog = new System.Windows.Forms.CheckBox();
            this.groupSegundo = new System.Windows.Forms.GroupBox();
            this.procesos = new System.Windows.Forms.CheckBox();
            this.ingles = new System.Windows.Forms.CheckBox();
            this.eie = new System.Windows.Forms.CheckBox();
            this.progMultimedia = new System.Windows.Forms.CheckBox();
            this.interfaces = new System.Windows.Forms.CheckBox();
            this.sge = new System.Windows.Forms.CheckBox();
            this.labelModulos = new System.Windows.Forms.Label();
            this.textBoxNombre = new System.Windows.Forms.TextBox();
            this.textBoxApellido = new System.Windows.Forms.TextBox();
            this.textBoxDNI = new System.Windows.Forms.TextBox();
            this.textBoxEmail = new System.Windows.Forms.TextBox();
            this.listCursos = new System.Windows.Forms.ListBox();
            this.buttonRegistrar = new System.Windows.Forms.Button();
            this.errorAlumnoRepetido = new System.Windows.Forms.ErrorProvider(this.components);
            this.groupPrimero.SuspendLayout();
            this.groupSegundo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorAlumnoRepetido)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(31, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(93, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nombre:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(183, 32);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(95, 25);
            this.label2.TabIndex = 1;
            this.label2.Text = "Apellido:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(354, 32);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 25);
            this.label3.TabIndex = 2;
            this.label3.Text = "DNI:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(481, 32);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(71, 25);
            this.label4.TabIndex = 3;
            this.label4.Text = "Email:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(619, 32);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(75, 25);
            this.label5.TabIndex = 4;
            this.label5.Text = "Curso:";
            // 
            // groupPrimero
            // 
            this.groupPrimero.Controls.Add(this.entornos);
            this.groupPrimero.Controls.Add(this.fol);
            this.groupPrimero.Controls.Add(this.sist);
            this.groupPrimero.Controls.Add(this.marcas);
            this.groupPrimero.Controls.Add(this.bbdd);
            this.groupPrimero.Controls.Add(this.prog);
            this.groupPrimero.Location = new System.Drawing.Point(24, 173);
            this.groupPrimero.Name = "groupPrimero";
            this.groupPrimero.Size = new System.Drawing.Size(325, 139);
            this.groupPrimero.TabIndex = 8;
            this.groupPrimero.TabStop = false;
            this.groupPrimero.Text = "Primero";
            this.groupPrimero.Visible = false;
            // 
            // entornos
            // 
            this.entornos.AutoSize = true;
            this.entornos.Location = new System.Drawing.Point(200, 69);
            this.entornos.Name = "entornos";
            this.entornos.Size = new System.Drawing.Size(68, 17);
            this.entornos.TabIndex = 5;
            this.entornos.Text = "Entornos";
            this.entornos.UseVisualStyleBackColor = true;
            // 
            // fol
            // 
            this.fol.AutoSize = true;
            this.fol.Location = new System.Drawing.Point(103, 69);
            this.fol.Name = "fol";
            this.fol.Size = new System.Drawing.Size(40, 17);
            this.fol.TabIndex = 4;
            this.fol.Text = "Fol";
            this.fol.UseVisualStyleBackColor = true;
            // 
            // sist
            // 
            this.sist.AutoSize = true;
            this.sist.Location = new System.Drawing.Point(6, 69);
            this.sist.Name = "sist";
            this.sist.Size = new System.Drawing.Size(68, 17);
            this.sist.TabIndex = 3;
            this.sist.Text = "Sistemas";
            this.sist.UseVisualStyleBackColor = true;
            // 
            // marcas
            // 
            this.marcas.AutoSize = true;
            this.marcas.Location = new System.Drawing.Point(200, 20);
            this.marcas.Name = "marcas";
            this.marcas.Size = new System.Drawing.Size(122, 17);
            this.marcas.TabIndex = 2;
            this.marcas.Text = "Lenguaje de marcas";
            this.marcas.UseVisualStyleBackColor = true;
            // 
            // bbdd
            // 
            this.bbdd.AutoSize = true;
            this.bbdd.Location = new System.Drawing.Point(103, 20);
            this.bbdd.Name = "bbdd";
            this.bbdd.Size = new System.Drawing.Size(96, 17);
            this.bbdd.TabIndex = 1;
            this.bbdd.Text = "Base de Datos";
            this.bbdd.UseVisualStyleBackColor = true;
            // 
            // prog
            // 
            this.prog.AutoSize = true;
            this.prog.Location = new System.Drawing.Point(6, 20);
            this.prog.Name = "prog";
            this.prog.Size = new System.Drawing.Size(91, 17);
            this.prog.TabIndex = 0;
            this.prog.Text = "Programación";
            this.prog.UseVisualStyleBackColor = true;
            // 
            // groupSegundo
            // 
            this.groupSegundo.Controls.Add(this.procesos);
            this.groupSegundo.Controls.Add(this.ingles);
            this.groupSegundo.Controls.Add(this.eie);
            this.groupSegundo.Controls.Add(this.progMultimedia);
            this.groupSegundo.Controls.Add(this.interfaces);
            this.groupSegundo.Controls.Add(this.sge);
            this.groupSegundo.Location = new System.Drawing.Point(400, 173);
            this.groupSegundo.Name = "groupSegundo";
            this.groupSegundo.Size = new System.Drawing.Size(325, 139);
            this.groupSegundo.TabIndex = 12;
            this.groupSegundo.TabStop = false;
            this.groupSegundo.Text = "Segundo";
            this.groupSegundo.Visible = false;
            // 
            // procesos
            // 
            this.procesos.AutoSize = true;
            this.procesos.Location = new System.Drawing.Point(200, 68);
            this.procesos.Name = "procesos";
            this.procesos.Size = new System.Drawing.Size(70, 17);
            this.procesos.TabIndex = 11;
            this.procesos.Text = "Procesos";
            this.procesos.UseVisualStyleBackColor = true;
            // 
            // ingles
            // 
            this.ingles.AutoSize = true;
            this.ingles.Location = new System.Drawing.Point(103, 68);
            this.ingles.Name = "ingles";
            this.ingles.Size = new System.Drawing.Size(54, 17);
            this.ingles.TabIndex = 10;
            this.ingles.Text = "Inglés";
            this.ingles.UseVisualStyleBackColor = true;
            // 
            // eie
            // 
            this.eie.AutoSize = true;
            this.eie.Location = new System.Drawing.Point(6, 68);
            this.eie.Name = "eie";
            this.eie.Size = new System.Drawing.Size(43, 17);
            this.eie.TabIndex = 9;
            this.eie.Text = "EIE";
            this.eie.UseVisualStyleBackColor = true;
            // 
            // progMultimedia
            // 
            this.progMultimedia.AutoSize = true;
            this.progMultimedia.Location = new System.Drawing.Point(200, 19);
            this.progMultimedia.Name = "progMultimedia";
            this.progMultimedia.Size = new System.Drawing.Size(101, 17);
            this.progMultimedia.TabIndex = 8;
            this.progMultimedia.Text = "Prog.Multimedia";
            this.progMultimedia.UseVisualStyleBackColor = true;
            // 
            // interfaces
            // 
            this.interfaces.AutoSize = true;
            this.interfaces.Location = new System.Drawing.Point(103, 19);
            this.interfaces.Name = "interfaces";
            this.interfaces.Size = new System.Drawing.Size(73, 17);
            this.interfaces.TabIndex = 7;
            this.interfaces.Text = "Interfaces";
            this.interfaces.UseVisualStyleBackColor = true;
            // 
            // sge
            // 
            this.sge.AutoSize = true;
            this.sge.Location = new System.Drawing.Point(6, 19);
            this.sge.Name = "sge";
            this.sge.Size = new System.Drawing.Size(48, 17);
            this.sge.TabIndex = 6;
            this.sge.Text = "SGE";
            this.sge.UseVisualStyleBackColor = true;
            // 
            // labelModulos
            // 
            this.labelModulos.AutoSize = true;
            this.labelModulos.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelModulos.Location = new System.Drawing.Point(33, 136);
            this.labelModulos.Name = "labelModulos";
            this.labelModulos.Size = new System.Drawing.Size(100, 25);
            this.labelModulos.TabIndex = 7;
            this.labelModulos.Text = "Módulos:";
            this.labelModulos.Visible = false;
            // 
            // textBoxNombre
            // 
            this.textBoxNombre.Location = new System.Drawing.Point(24, 80);
            this.textBoxNombre.Name = "textBoxNombre";
            this.textBoxNombre.Size = new System.Drawing.Size(109, 20);
            this.textBoxNombre.TabIndex = 7;
            // 
            // textBoxApellido
            // 
            this.textBoxApellido.Location = new System.Drawing.Point(178, 80);
            this.textBoxApellido.Name = "textBoxApellido";
            this.textBoxApellido.Size = new System.Drawing.Size(109, 20);
            this.textBoxApellido.TabIndex = 8;
            // 
            // textBoxDNI
            // 
            this.textBoxDNI.Location = new System.Drawing.Point(327, 80);
            this.textBoxDNI.Name = "textBoxDNI";
            this.textBoxDNI.Size = new System.Drawing.Size(109, 20);
            this.textBoxDNI.TabIndex = 9;
            this.textBoxDNI.TextChanged += new System.EventHandler(this.textBoxDNI_TextChanged);
            // 
            // textBoxEmail
            // 
            this.textBoxEmail.Location = new System.Drawing.Point(464, 80);
            this.textBoxEmail.Name = "textBoxEmail";
            this.textBoxEmail.Size = new System.Drawing.Size(109, 20);
            this.textBoxEmail.TabIndex = 10;
            // 
            // listCursos
            // 
            this.listCursos.FormattingEnabled = true;
            this.listCursos.Items.AddRange(new object[] {
            "1 DAM A",
            "1 DAM B",
            "2 DAM A",
            "2 DAM B"});
            this.listCursos.Location = new System.Drawing.Point(605, 80);
            this.listCursos.Name = "listCursos";
            this.listCursos.Size = new System.Drawing.Size(120, 56);
            this.listCursos.TabIndex = 13;
            this.listCursos.SelectedIndexChanged += new System.EventHandler(this.listCursos_SelectedIndexChanged);
            // 
            // buttonRegistrar
            // 
            this.buttonRegistrar.Location = new System.Drawing.Point(313, 328);
            this.buttonRegistrar.Name = "buttonRegistrar";
            this.buttonRegistrar.Size = new System.Drawing.Size(123, 51);
            this.buttonRegistrar.TabIndex = 14;
            this.buttonRegistrar.Text = "Registrar";
            this.buttonRegistrar.UseVisualStyleBackColor = true;
            this.buttonRegistrar.Click += new System.EventHandler(this.buttonRegistrar_Click);
            // 
            // errorAlumnoRepetido
            // 
            this.errorAlumnoRepetido.ContainerControl = this;
            // 
            // AltaAlumno
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(750, 391);
            this.Controls.Add(this.buttonRegistrar);
            this.Controls.Add(this.labelModulos);
            this.Controls.Add(this.groupPrimero);
            this.Controls.Add(this.groupSegundo);
            this.Controls.Add(this.listCursos);
            this.Controls.Add(this.textBoxEmail);
            this.Controls.Add(this.textBoxDNI);
            this.Controls.Add(this.textBoxApellido);
            this.Controls.Add(this.textBoxNombre);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "AltaAlumno";
            this.Text = "AltaAlumno";
            this.groupPrimero.ResumeLayout(false);
            this.groupPrimero.PerformLayout();
            this.groupSegundo.ResumeLayout(false);
            this.groupSegundo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.errorAlumnoRepetido)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label labelModulos;
        private System.Windows.Forms.TextBox textBoxNombre;
        private System.Windows.Forms.TextBox textBoxApellido;
        private System.Windows.Forms.TextBox textBoxDNI;
        private System.Windows.Forms.TextBox textBoxEmail;
        private System.Windows.Forms.GroupBox groupPrimero;
        private System.Windows.Forms.CheckBox entornos;
        private System.Windows.Forms.CheckBox fol;
        private System.Windows.Forms.CheckBox sist;
        private System.Windows.Forms.CheckBox marcas;
        private System.Windows.Forms.CheckBox bbdd;
        private System.Windows.Forms.CheckBox prog;
        private System.Windows.Forms.GroupBox groupSegundo;
        private System.Windows.Forms.CheckBox procesos;
        private System.Windows.Forms.CheckBox ingles;
        private System.Windows.Forms.CheckBox eie;
        private System.Windows.Forms.CheckBox progMultimedia;
        private System.Windows.Forms.CheckBox interfaces;
        private System.Windows.Forms.CheckBox sge;
        private System.Windows.Forms.ListBox listCursos;
        private System.Windows.Forms.Button buttonRegistrar;
        private System.Windows.Forms.ErrorProvider errorAlumnoRepetido;
    }
}