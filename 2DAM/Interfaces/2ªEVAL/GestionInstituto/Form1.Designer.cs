
namespace GestionInstituto
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
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.matrículaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.altaAlumnoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.bajaAlumnoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator3 = new System.Windows.Forms.ToolStripSeparator();
            this.listadosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMAToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMBToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.ºDAMAToolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMBToolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator4 = new System.Windows.Forms.ToolStripSeparator();
            this.todosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.notasToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMAAToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMBToolStripMenuItem2 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.ºDAMAToolStripMenuItem2 = new System.Windows.Forms.ToolStripMenuItem();
            this.ºDAMBToolStripMenuItem3 = new System.Windows.Forms.ToolStripMenuItem();
            this.listado = new System.Windows.Forms.ListBox();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.matrículaToolStripMenuItem,
            this.notasToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // matrículaToolStripMenuItem
            // 
            this.matrículaToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.altaAlumnoToolStripMenuItem,
            this.bajaAlumnoToolStripMenuItem,
            this.toolStripSeparator3,
            this.listadosToolStripMenuItem});
            this.matrículaToolStripMenuItem.Name = "matrículaToolStripMenuItem";
            this.matrículaToolStripMenuItem.Size = new System.Drawing.Size(69, 20);
            this.matrículaToolStripMenuItem.Text = "Matrícula";
            // 
            // altaAlumnoToolStripMenuItem
            // 
            this.altaAlumnoToolStripMenuItem.Name = "altaAlumnoToolStripMenuItem";
            this.altaAlumnoToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.altaAlumnoToolStripMenuItem.Text = "Alta alumno";
            this.altaAlumnoToolStripMenuItem.Click += new System.EventHandler(this.altaAlumnoToolStripMenuItem_Click);
            // 
            // bajaAlumnoToolStripMenuItem
            // 
            this.bajaAlumnoToolStripMenuItem.Name = "bajaAlumnoToolStripMenuItem";
            this.bajaAlumnoToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.bajaAlumnoToolStripMenuItem.Text = "Baja alumno";
            this.bajaAlumnoToolStripMenuItem.Click += new System.EventHandler(this.bajaAlumnoToolStripMenuItem_Click);
            // 
            // toolStripSeparator3
            // 
            this.toolStripSeparator3.Name = "toolStripSeparator3";
            this.toolStripSeparator3.Size = new System.Drawing.Size(177, 6);
            // 
            // listadosToolStripMenuItem
            // 
            this.listadosToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.ºDAMAToolStripMenuItem,
            this.ºDAMBToolStripMenuItem,
            this.toolStripSeparator1,
            this.ºDAMAToolStripMenuItem1,
            this.ºDAMBToolStripMenuItem1,
            this.toolStripSeparator4,
            this.todosToolStripMenuItem});
            this.listadosToolStripMenuItem.Name = "listadosToolStripMenuItem";
            this.listadosToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.listadosToolStripMenuItem.Text = "Listados";
            // 
            // ºDAMAToolStripMenuItem
            // 
            this.ºDAMAToolStripMenuItem.Name = "ºDAMAToolStripMenuItem";
            this.ºDAMAToolStripMenuItem.Size = new System.Drawing.Size(123, 22);
            this.ºDAMAToolStripMenuItem.Text = "1ºDAM A";
            this.ºDAMAToolStripMenuItem.Click += new System.EventHandler(this.sacarAlumnos);
            // 
            // ºDAMBToolStripMenuItem
            // 
            this.ºDAMBToolStripMenuItem.Name = "ºDAMBToolStripMenuItem";
            this.ºDAMBToolStripMenuItem.Size = new System.Drawing.Size(123, 22);
            this.ºDAMBToolStripMenuItem.Text = "1ºDAM B";
            this.ºDAMBToolStripMenuItem.Click += new System.EventHandler(this.sacarAlumnos);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(120, 6);
            // 
            // ºDAMAToolStripMenuItem1
            // 
            this.ºDAMAToolStripMenuItem1.Name = "ºDAMAToolStripMenuItem1";
            this.ºDAMAToolStripMenuItem1.Size = new System.Drawing.Size(123, 22);
            this.ºDAMAToolStripMenuItem1.Text = "2ºDAM A";
            this.ºDAMAToolStripMenuItem1.Click += new System.EventHandler(this.sacarAlumnos);
            // 
            // ºDAMBToolStripMenuItem1
            // 
            this.ºDAMBToolStripMenuItem1.Name = "ºDAMBToolStripMenuItem1";
            this.ºDAMBToolStripMenuItem1.Size = new System.Drawing.Size(123, 22);
            this.ºDAMBToolStripMenuItem1.Text = "2ºDAM B";
            this.ºDAMBToolStripMenuItem1.Click += new System.EventHandler(this.sacarAlumnos);
            // 
            // toolStripSeparator4
            // 
            this.toolStripSeparator4.Name = "toolStripSeparator4";
            this.toolStripSeparator4.Size = new System.Drawing.Size(120, 6);
            // 
            // todosToolStripMenuItem
            // 
            this.todosToolStripMenuItem.Name = "todosToolStripMenuItem";
            this.todosToolStripMenuItem.Size = new System.Drawing.Size(123, 22);
            this.todosToolStripMenuItem.Text = "Todos";
            this.todosToolStripMenuItem.Click += new System.EventHandler(this.sacarAlumnos);
            // 
            // notasToolStripMenuItem
            // 
            this.notasToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.ºDAMAAToolStripMenuItem,
            this.ºDAMBToolStripMenuItem2,
            this.toolStripSeparator2,
            this.ºDAMAToolStripMenuItem2,
            this.ºDAMBToolStripMenuItem3});
            this.notasToolStripMenuItem.Name = "notasToolStripMenuItem";
            this.notasToolStripMenuItem.Size = new System.Drawing.Size(50, 20);
            this.notasToolStripMenuItem.Text = "Notas";
            // 
            // ºDAMAAToolStripMenuItem
            // 
            this.ºDAMAAToolStripMenuItem.Name = "ºDAMAAToolStripMenuItem";
            this.ºDAMAAToolStripMenuItem.Size = new System.Drawing.Size(123, 22);
            this.ºDAMAAToolStripMenuItem.Text = "1ºDAM A";
            // 
            // ºDAMBToolStripMenuItem2
            // 
            this.ºDAMBToolStripMenuItem2.Name = "ºDAMBToolStripMenuItem2";
            this.ºDAMBToolStripMenuItem2.Size = new System.Drawing.Size(123, 22);
            this.ºDAMBToolStripMenuItem2.Text = "1ºDAM B";
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(120, 6);
            // 
            // ºDAMAToolStripMenuItem2
            // 
            this.ºDAMAToolStripMenuItem2.Name = "ºDAMAToolStripMenuItem2";
            this.ºDAMAToolStripMenuItem2.Size = new System.Drawing.Size(123, 22);
            this.ºDAMAToolStripMenuItem2.Text = "2ºDAM A";
            // 
            // ºDAMBToolStripMenuItem3
            // 
            this.ºDAMBToolStripMenuItem3.Name = "ºDAMBToolStripMenuItem3";
            this.ºDAMBToolStripMenuItem3.Size = new System.Drawing.Size(123, 22);
            this.ºDAMBToolStripMenuItem3.Text = "2ºDAM B";
            // 
            // listado
            // 
            this.listado.FormattingEnabled = true;
            this.listado.Location = new System.Drawing.Point(12, 27);
            this.listado.Name = "listado";
            this.listado.Size = new System.Drawing.Size(776, 407);
            this.listado.TabIndex = 1;
            this.listado.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.listado);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Gestión Instituto";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem matrículaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem altaAlumnoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem notasToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem bajaAlumnoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem listadosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ºDAMAToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ºDAMBToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ºDAMAToolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem ºDAMBToolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem ºDAMAAToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ºDAMBToolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem ºDAMAToolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem ºDAMBToolStripMenuItem3;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator3;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.ListBox listado;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator4;
        private System.Windows.Forms.ToolStripMenuItem todosToolStripMenuItem;
    }
}

