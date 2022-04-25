
namespace DatosClientes
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
            this.datoscliente = new System.Windows.Forms.Label();
            this.titular = new System.Windows.Forms.Label();
            this.cuenta = new System.Windows.Forms.Label();
            this.saldo = new System.Windows.Forms.Label();
            this.texttitular = new System.Windows.Forms.TextBox();
            this.textcuenta = new System.Windows.Forms.TextBox();
            this.textsaldo = new System.Windows.Forms.TextBox();
            this.aceptar = new System.Windows.Forms.Button();
            this.mostrar = new System.Windows.Forms.Button();
            this.cancelar = new System.Windows.Forms.Button();
            this.mostrarArray = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // datoscliente
            // 
            this.datoscliente.AutoSize = true;
            this.datoscliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datoscliente.Location = new System.Drawing.Point(62, 52);
            this.datoscliente.Name = "datoscliente";
            this.datoscliente.Size = new System.Drawing.Size(152, 29);
            this.datoscliente.TabIndex = 0;
            this.datoscliente.Text = "Datos cliente";
            // 
            // titular
            // 
            this.titular.AutoSize = true;
            this.titular.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.titular.Location = new System.Drawing.Point(63, 120);
            this.titular.Name = "titular";
            this.titular.Size = new System.Drawing.Size(66, 24);
            this.titular.TabIndex = 1;
            this.titular.Text = "Titular:";
            // 
            // cuenta
            // 
            this.cuenta.AutoSize = true;
            this.cuenta.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cuenta.Location = new System.Drawing.Point(63, 163);
            this.cuenta.Name = "cuenta";
            this.cuenta.Size = new System.Drawing.Size(75, 24);
            this.cuenta.TabIndex = 2;
            this.cuenta.Text = "Cuenta:";
            // 
            // saldo
            // 
            this.saldo.AutoSize = true;
            this.saldo.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.saldo.Location = new System.Drawing.Point(63, 208);
            this.saldo.Name = "saldo";
            this.saldo.Size = new System.Drawing.Size(63, 24);
            this.saldo.TabIndex = 3;
            this.saldo.Text = "Saldo:";
            // 
            // texttitular
            // 
            this.texttitular.Location = new System.Drawing.Point(163, 123);
            this.texttitular.Name = "texttitular";
            this.texttitular.Size = new System.Drawing.Size(100, 20);
            this.texttitular.TabIndex = 1;
            this.texttitular.TextChanged += new System.EventHandler(this.texttitular_TextChanged);
            this.texttitular.KeyDown += new System.Windows.Forms.KeyEventHandler(this.enter_aceptar);
            // 
            // textcuenta
            // 
            this.textcuenta.Location = new System.Drawing.Point(163, 168);
            this.textcuenta.Name = "textcuenta";
            this.textcuenta.Size = new System.Drawing.Size(100, 20);
            this.textcuenta.TabIndex = 2;
            this.textcuenta.TextChanged += new System.EventHandler(this.textcuenta_TextChanged);
            this.textcuenta.KeyDown += new System.Windows.Forms.KeyEventHandler(this.enter_aceptar);
            // 
            // textsaldo
            // 
            this.textsaldo.Location = new System.Drawing.Point(163, 212);
            this.textsaldo.Name = "textsaldo";
            this.textsaldo.Size = new System.Drawing.Size(100, 20);
            this.textsaldo.TabIndex = 3;
            this.textsaldo.TextChanged += new System.EventHandler(this.textsaldo_TextChanged);
            this.textsaldo.KeyDown += new System.Windows.Forms.KeyEventHandler(this.enter_aceptar);
            // 
            // aceptar
            // 
            this.aceptar.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.aceptar.Location = new System.Drawing.Point(358, 375);
            this.aceptar.Name = "aceptar";
            this.aceptar.Size = new System.Drawing.Size(95, 40);
            this.aceptar.TabIndex = 4;
            this.aceptar.Text = "Aceptar";
            this.aceptar.UseVisualStyleBackColor = true;
            this.aceptar.Click += new System.EventHandler(this.aceptar_Click);
            this.aceptar.KeyDown += new System.Windows.Forms.KeyEventHandler(this.enter_aceptar);
            // 
            // mostrar
            // 
            this.mostrar.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mostrar.Location = new System.Drawing.Point(67, 375);
            this.mostrar.Name = "mostrar";
            this.mostrar.Size = new System.Drawing.Size(95, 40);
            this.mostrar.TabIndex = 5;
            this.mostrar.Text = "Mostrar";
            this.mostrar.UseVisualStyleBackColor = true;
            this.mostrar.Click += new System.EventHandler(this.mostrar_Click);
            // 
            // cancelar
            // 
            this.cancelar.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cancelar.Location = new System.Drawing.Point(628, 375);
            this.cancelar.Name = "cancelar";
            this.cancelar.Size = new System.Drawing.Size(95, 40);
            this.cancelar.TabIndex = 6;
            this.cancelar.Text = "Cancelar";
            this.cancelar.UseVisualStyleBackColor = true;
            this.cancelar.Click += new System.EventHandler(this.cancelar_Click);
            // 
            // mostrarArray
            // 
            this.mostrarArray.AutoSize = true;
            this.mostrarArray.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mostrarArray.Location = new System.Drawing.Point(331, 52);
            this.mostrarArray.Name = "mostrarArray";
            this.mostrarArray.Size = new System.Drawing.Size(405, 20);
            this.mostrarArray.TabIndex = 10;
            this.mostrarArray.Text = "                                                                                 " +
    "                  ";
            this.mostrarArray.Click += new System.EventHandler(this.mostrarArray_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.mostrarArray);
            this.Controls.Add(this.cancelar);
            this.Controls.Add(this.mostrar);
            this.Controls.Add(this.aceptar);
            this.Controls.Add(this.textcuenta);
            this.Controls.Add(this.textsaldo);
            this.Controls.Add(this.texttitular);
            this.Controls.Add(this.saldo);
            this.Controls.Add(this.cuenta);
            this.Controls.Add(this.titular);
            this.Controls.Add(this.datoscliente);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label datoscliente;
        private System.Windows.Forms.Label titular;
        private System.Windows.Forms.Label cuenta;
        private System.Windows.Forms.Label saldo;
        private System.Windows.Forms.TextBox texttitular;
        private System.Windows.Forms.TextBox textcuenta;
        private System.Windows.Forms.TextBox textsaldo;
        private System.Windows.Forms.Button aceptar;
        private System.Windows.Forms.Button mostrar;
        private System.Windows.Forms.Button cancelar;
        private System.Windows.Forms.Label mostrarArray;
    }
}

