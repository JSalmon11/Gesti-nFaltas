
namespace BilletesBus
{
    partial class pantallaPrincipal
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
            this.regUsu = new System.Windows.Forms.Button();
            this.compraBill = new System.Windows.Forms.Button();
            this.compro = new System.Windows.Forms.Button();
            this.labelUsuarios = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // regUsu
            // 
            this.regUsu.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.regUsu.Location = new System.Drawing.Point(65, 33);
            this.regUsu.Name = "regUsu";
            this.regUsu.Size = new System.Drawing.Size(274, 98);
            this.regUsu.TabIndex = 0;
            this.regUsu.Text = "Registro de usuario";
            this.regUsu.UseVisualStyleBackColor = true;
            this.regUsu.Click += new System.EventHandler(this.regUsu_Click);
            // 
            // compraBill
            // 
            this.compraBill.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compraBill.Location = new System.Drawing.Point(65, 158);
            this.compraBill.Name = "compraBill";
            this.compraBill.Size = new System.Drawing.Size(274, 98);
            this.compraBill.TabIndex = 1;
            this.compraBill.Text = "Comprar billetes";
            this.compraBill.UseVisualStyleBackColor = true;
            // 
            // compro
            // 
            this.compro.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compro.Location = new System.Drawing.Point(65, 285);
            this.compro.Name = "compro";
            this.compro.Size = new System.Drawing.Size(274, 98);
            this.compro.TabIndex = 2;
            this.compro.Text = "Comprobación";
            this.compro.UseVisualStyleBackColor = true;
            this.compro.Click += new System.EventHandler(this.compro_Click);
            // 
            // labelUsuarios
            // 
            this.labelUsuarios.AutoSize = true;
            this.labelUsuarios.Location = new System.Drawing.Point(366, 33);
            this.labelUsuarios.MaximumSize = new System.Drawing.Size(400, 0);
            this.labelUsuarios.MinimumSize = new System.Drawing.Size(400, 0);
            this.labelUsuarios.Name = "labelUsuarios";
            this.labelUsuarios.Size = new System.Drawing.Size(400, 13);
            this.labelUsuarios.TabIndex = 3;
            // 
            // pantallaPrincipal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.labelUsuarios);
            this.Controls.Add(this.compro);
            this.Controls.Add(this.compraBill);
            this.Controls.Add(this.regUsu);
            this.Name = "pantallaPrincipal";
            this.Text = "BILLETES AUTOBUS";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button regUsu;
        private System.Windows.Forms.Button compraBill;
        private System.Windows.Forms.Button compro;
        private System.Windows.Forms.Label labelUsuarios;
    }
}

