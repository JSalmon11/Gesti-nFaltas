
namespace PracticaRestaurante
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
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.textBoxNombre = new System.Windows.Forms.TextBox();
            this.textBoxPrecio = new System.Windows.Forms.TextBox();
            this.textBoxIVA = new System.Windows.Forms.TextBox();
            this.checkBoxTemp = new System.Windows.Forms.CheckBox();
            this.dateDisponible = new System.Windows.Forms.DateTimePicker();
            this.textPrecioFinal = new System.Windows.Forms.Label();
            this.buttonFirst = new System.Windows.Forms.Button();
            this.buttonPrev = new System.Windows.Forms.Button();
            this.buttonLast = new System.Windows.Forms.Button();
            this.buttonNext = new System.Windows.Forms.Button();
            this.buttonPrecios = new System.Windows.Forms.Button();
            this.textBoxPriceFilter = new System.Windows.Forms.TextBox();
            this.labelMostrar = new System.Windows.Forms.Label();
            this.labelActual = new System.Windows.Forms.Label();
            this.restauranteDataSet1 = new PracticaRestaurante.restauranteDataSet();
            this.menusBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.menusTableAdapter = new PracticaRestaurante.restauranteDataSetTableAdapters.menusTableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.restauranteDataSet1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.menusBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(235, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Restaurante PEPE - CARTA";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(12, 61);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(60, 16);
            this.label2.TabIndex = 1;
            this.label2.Text = "Nombre:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(12, 108);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(50, 16);
            this.label3.TabIndex = 2;
            this.label3.Text = "Precio:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(12, 154);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(47, 16);
            this.label4.TabIndex = 3;
            this.label4.Text = "% IVA:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(12, 197);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(130, 16);
            this.label5.TabIndex = 4;
            this.label5.Text = "Plato de temporada:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(12, 245);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(118, 16);
            this.label6.TabIndex = 5;
            this.label6.Text = "Disponible desde:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(12, 300);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(77, 16);
            this.label7.TabIndex = 6;
            this.label7.Text = "Precio final:";
            // 
            // textBoxNombre
            // 
            this.textBoxNombre.Location = new System.Drawing.Point(166, 57);
            this.textBoxNombre.Name = "textBoxNombre";
            this.textBoxNombre.Size = new System.Drawing.Size(123, 20);
            this.textBoxNombre.TabIndex = 7;
            // 
            // textBoxPrecio
            // 
            this.textBoxPrecio.Location = new System.Drawing.Point(166, 104);
            this.textBoxPrecio.Name = "textBoxPrecio";
            this.textBoxPrecio.Size = new System.Drawing.Size(70, 20);
            this.textBoxPrecio.TabIndex = 8;
            // 
            // textBoxIVA
            // 
            this.textBoxIVA.Location = new System.Drawing.Point(166, 154);
            this.textBoxIVA.Name = "textBoxIVA";
            this.textBoxIVA.Size = new System.Drawing.Size(70, 20);
            this.textBoxIVA.TabIndex = 9;
            // 
            // checkBoxTemp
            // 
            this.checkBoxTemp.AutoSize = true;
            this.checkBoxTemp.Location = new System.Drawing.Point(166, 198);
            this.checkBoxTemp.Name = "checkBoxTemp";
            this.checkBoxTemp.Size = new System.Drawing.Size(15, 14);
            this.checkBoxTemp.TabIndex = 10;
            this.checkBoxTemp.UseVisualStyleBackColor = true;
            // 
            // dateDisponible
            // 
            this.dateDisponible.Location = new System.Drawing.Point(166, 241);
            this.dateDisponible.Name = "dateDisponible";
            this.dateDisponible.Size = new System.Drawing.Size(210, 20);
            this.dateDisponible.TabIndex = 11;
            // 
            // textPrecioFinal
            // 
            this.textPrecioFinal.AutoSize = true;
            this.textPrecioFinal.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textPrecioFinal.Location = new System.Drawing.Point(163, 298);
            this.textPrecioFinal.Name = "textPrecioFinal";
            this.textPrecioFinal.Size = new System.Drawing.Size(0, 18);
            this.textPrecioFinal.TabIndex = 12;
            // 
            // buttonFirst
            // 
            this.buttonFirst.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonFirst.Location = new System.Drawing.Point(16, 398);
            this.buttonFirst.Name = "buttonFirst";
            this.buttonFirst.Size = new System.Drawing.Size(43, 23);
            this.buttonFirst.TabIndex = 13;
            this.buttonFirst.Text = "|<";
            this.buttonFirst.UseVisualStyleBackColor = true;
            this.buttonFirst.Click += new System.EventHandler(this.buttonFirst_Click);
            // 
            // buttonPrev
            // 
            this.buttonPrev.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonPrev.Location = new System.Drawing.Point(77, 398);
            this.buttonPrev.Name = "buttonPrev";
            this.buttonPrev.Size = new System.Drawing.Size(43, 23);
            this.buttonPrev.TabIndex = 14;
            this.buttonPrev.Text = "<";
            this.buttonPrev.UseVisualStyleBackColor = true;
            this.buttonPrev.Click += new System.EventHandler(this.buttonPrev_Click);
            // 
            // buttonLast
            // 
            this.buttonLast.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonLast.Location = new System.Drawing.Point(265, 398);
            this.buttonLast.Name = "buttonLast";
            this.buttonLast.Size = new System.Drawing.Size(43, 23);
            this.buttonLast.TabIndex = 16;
            this.buttonLast.Text = ">|";
            this.buttonLast.UseVisualStyleBackColor = true;
            this.buttonLast.Click += new System.EventHandler(this.buttonLast_Click);
            // 
            // buttonNext
            // 
            this.buttonNext.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonNext.Location = new System.Drawing.Point(204, 398);
            this.buttonNext.Name = "buttonNext";
            this.buttonNext.Size = new System.Drawing.Size(43, 23);
            this.buttonNext.TabIndex = 15;
            this.buttonNext.Text = ">";
            this.buttonNext.UseVisualStyleBackColor = true;
            this.buttonNext.Click += new System.EventHandler(this.buttonNext_Click);
            // 
            // buttonPrecios
            // 
            this.buttonPrecios.Location = new System.Drawing.Point(452, 55);
            this.buttonPrecios.Name = "buttonPrecios";
            this.buttonPrecios.Size = new System.Drawing.Size(142, 23);
            this.buttonPrecios.TabIndex = 17;
            this.buttonPrecios.Text = "Platos con precio < que";
            this.buttonPrecios.UseVisualStyleBackColor = true;
            this.buttonPrecios.Click += new System.EventHandler(this.buttonPrecios_Click);
            // 
            // textBoxPriceFilter
            // 
            this.textBoxPriceFilter.Location = new System.Drawing.Point(627, 57);
            this.textBoxPriceFilter.Name = "textBoxPriceFilter";
            this.textBoxPriceFilter.Size = new System.Drawing.Size(70, 20);
            this.textBoxPriceFilter.TabIndex = 18;
            // 
            // labelMostrar
            // 
            this.labelMostrar.AutoSize = true;
            this.labelMostrar.Location = new System.Drawing.Point(449, 111);
            this.labelMostrar.Name = "labelMostrar";
            this.labelMostrar.Size = new System.Drawing.Size(35, 13);
            this.labelMostrar.TabIndex = 19;
            this.labelMostrar.Text = "label8";
            // 
            // labelActual
            // 
            this.labelActual.AutoSize = true;
            this.labelActual.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelActual.Location = new System.Drawing.Point(146, 403);
            this.labelActual.Name = "labelActual";
            this.labelActual.Size = new System.Drawing.Size(31, 16);
            this.labelActual.TabIndex = 20;
            this.labelActual.Text = "1/8";
            // 
            // restauranteDataSet1
            // 
            this.restauranteDataSet1.DataSetName = "restauranteDataSet";
            this.restauranteDataSet1.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // menusBindingSource
            // 
            this.menusBindingSource.DataMember = "menus";
            this.menusBindingSource.DataSource = this.restauranteDataSet1;
            // 
            // menusTableAdapter
            // 
            this.menusTableAdapter.ClearBeforeFill = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.labelActual);
            this.Controls.Add(this.labelMostrar);
            this.Controls.Add(this.textBoxPriceFilter);
            this.Controls.Add(this.buttonPrecios);
            this.Controls.Add(this.buttonLast);
            this.Controls.Add(this.buttonNext);
            this.Controls.Add(this.buttonPrev);
            this.Controls.Add(this.buttonFirst);
            this.Controls.Add(this.textPrecioFinal);
            this.Controls.Add(this.dateDisponible);
            this.Controls.Add(this.checkBoxTemp);
            this.Controls.Add(this.textBoxIVA);
            this.Controls.Add(this.textBoxPrecio);
            this.Controls.Add(this.textBoxNombre);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "RESTAURANTE";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.restauranteDataSet1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.menusBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBoxNombre;
        private System.Windows.Forms.TextBox textBoxPrecio;
        private System.Windows.Forms.TextBox textBoxIVA;
        private System.Windows.Forms.CheckBox checkBoxTemp;
        private System.Windows.Forms.DateTimePicker dateDisponible;
        private System.Windows.Forms.Label textPrecioFinal;
        private System.Windows.Forms.Button buttonFirst;
        private System.Windows.Forms.Button buttonPrev;
        private System.Windows.Forms.Button buttonLast;
        private System.Windows.Forms.Button buttonNext;
        private System.Windows.Forms.Button buttonPrecios;
        private System.Windows.Forms.TextBox textBoxPriceFilter;
        private System.Windows.Forms.Label labelMostrar;
        private System.Windows.Forms.Label labelActual;
        private restauranteDataSet restauranteDataSet1;
        private System.Windows.Forms.BindingSource menusBindingSource;
        private restauranteDataSetTableAdapters.menusTableAdapter menusTableAdapter;
    }
}

