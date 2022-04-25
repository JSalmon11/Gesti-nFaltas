
namespace TrabajoConFechas
{
    partial class Ventana1
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
            this.dateTimePickerCumple = new System.Windows.Forms.DateTimePicker();
            this.LabelFechaNacim = new System.Windows.Forms.Label();
            this.LabelCumpleEs = new System.Windows.Forms.Label();
            this.fecha = new System.Windows.Forms.Label();
            this.monthCalendar1 = new System.Windows.Forms.MonthCalendar();
            this.Literal = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // dateTimePickerCumple
            // 
            this.dateTimePickerCumple.Location = new System.Drawing.Point(135, 30);
            this.dateTimePickerCumple.Name = "dateTimePickerCumple";
            this.dateTimePickerCumple.Size = new System.Drawing.Size(200, 20);
            this.dateTimePickerCumple.TabIndex = 1;
            this.dateTimePickerCumple.ValueChanged += new System.EventHandler(this.dateTimePickerCumple_ValueChanged);
            // 
            // LabelFechaNacim
            // 
            this.LabelFechaNacim.AutoSize = true;
            this.LabelFechaNacim.Location = new System.Drawing.Point(20, 36);
            this.LabelFechaNacim.Name = "LabelFechaNacim";
            this.LabelFechaNacim.Size = new System.Drawing.Size(109, 13);
            this.LabelFechaNacim.TabIndex = 3;
            this.LabelFechaNacim.Text = "Fecha de nacimiento:";
            // 
            // LabelCumpleEs
            // 
            this.LabelCumpleEs.AutoSize = true;
            this.LabelCumpleEs.Location = new System.Drawing.Point(20, 73);
            this.LabelCumpleEs.Name = "LabelCumpleEs";
            this.LabelCumpleEs.Size = new System.Drawing.Size(97, 13);
            this.LabelCumpleEs.TabIndex = 4;
            this.LabelCumpleEs.Text = "Tu cumpleaños es:";
            // 
            // fecha
            // 
            this.fecha.AutoSize = true;
            this.fecha.Location = new System.Drawing.Point(114, 73);
            this.fecha.Name = "fecha";
            this.fecha.Size = new System.Drawing.Size(31, 13);
            this.fecha.TabIndex = 5;
            this.fecha.Text = "        ";
            this.fecha.Click += new System.EventHandler(this.fecha_Click);
            // 
            // monthCalendar1
            // 
            this.monthCalendar1.Location = new System.Drawing.Point(18, 210);
            this.monthCalendar1.MaxDate = new System.DateTime(2021, 12, 31, 0, 0, 0, 0);
            this.monthCalendar1.MaxSelectionCount = 10;
            this.monthCalendar1.MinDate = new System.DateTime(2021, 1, 1, 0, 0, 0, 0);
            this.monthCalendar1.Name = "monthCalendar1";
            this.monthCalendar1.TabIndex = 6;
            // 
            // Literal
            // 
            this.Literal.AutoSize = true;
            this.Literal.Location = new System.Drawing.Point(23, 188);
            this.Literal.Name = "Literal";
            this.Literal.Size = new System.Drawing.Size(187, 13);
            this.Literal.TabIndex = 7;
            this.Literal.Text = "Elige tus días de vacaciones (máx 10)";
            // 
            // Ventana1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.Literal);
            this.Controls.Add(this.monthCalendar1);
            this.Controls.Add(this.fecha);
            this.Controls.Add(this.LabelCumpleEs);
            this.Controls.Add(this.LabelFechaNacim);
            this.Controls.Add(this.dateTimePickerCumple);
            this.Name = "Ventana1";
            this.Text = "Trabajo fechas";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.DateTimePicker dateTimePickerCumple;
        private System.Windows.Forms.Label LabelFechaNacim;
        private System.Windows.Forms.Label LabelCumpleEs;
        private System.Windows.Forms.Label fecha;
        private System.Windows.Forms.MonthCalendar monthCalendar1;
        private System.Windows.Forms.Label Literal;
    }
}

