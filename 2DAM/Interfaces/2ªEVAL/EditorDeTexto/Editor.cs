using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EditorDeTexto
{
    public partial class Editor : Form
    {
        private String file;
        public Editor()
        {
            InitializeComponent();
        }

        private void nuevoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textEditor.Enabled = true;
            textEditor.Visible = true;
            guardarComoToolStripMenuItem.Enabled = true;
            fuentesToolStripMenuItem.Enabled = true;
            coloresToolStripMenuItem.Enabled = true;
            exportarPDFToolStripMenuItem.Enabled = true;
            buscarToolStripMenuItem.Enabled = true;
            buscarSiguienteToolStripMenuItem.Enabled = true;
            reemplazarToolStripMenuItem.Enabled = true;
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void fuentesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            fontDialog.ShowDialog();
            textEditor.Font = fontDialog.Font;
        }

        private void buscarEnNavegadorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            String busqueda = textEditor.SelectedText;
            System.Diagnostics.Process.Start("https://www.google.com/search?q="+busqueda);
        }

        private void textSelectionChanged(object sender, EventArgs e)
        {
            if (textEditor.SelectedText!="")
            {
                if (Clipboard.ContainsText())
                {
                    pegarToolStripMenuItem.Enabled = true;
                }
                else
                {
                    pegarToolStripMenuItem.Enabled = false;
                }
                buscarEnNavegadorToolStripMenuItem.Enabled = true;
                copiarToolStripMenuItem.Enabled = true;
                cortarToolStripMenuItem.Enabled = true;
            }
            else
            {
                buscarEnNavegadorToolStripMenuItem.Enabled = false;
                copiarToolStripMenuItem.Enabled = false;
                cortarToolStripMenuItem.Enabled = false;
            }
        }

        private void cortarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textEditor.Cut();
        }

        private void copiarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textEditor.Copy();
        }

        private void pegarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textEditor.Paste();
        }

        private void textEditorChanged(object sender, EventArgs e)
        {
            if (textEditor.Text=="")
            {
                seleccionarTodoToolStripMenuItem.Enabled = false;
            }
            else
            {
                seleccionarTodoToolStripMenuItem.Enabled = true;
            }
        }

        private void seleccionarTodoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textEditor.SelectAll();
        }

        private void enviarABuscar()
        {
            if (textEditor.SelectedText!="")
            {
                Form buscador = new Buscador(this, textEditor.SelectedText);
                buscador.Show();
            }
            else
            {
                Form buscador = new Buscador(this);
                buscador.Show();
            }
        }

        private void buscarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enviarABuscar();
        }

        private void buscarSiguienteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enviarABuscar();
        }

        private void guardarComoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            saveFileDialog.DefaultExt = "txt";
            saveFileDialog.Filter = "Text files (*.txt)|*.txt";
            saveFileDialog.InitialDirectory = "C:\\Users\\alumno\\Documents";
            saveFileDialog.ShowDialog();
        }

        private void saveFileDialog_FileOk(object sender, CancelEventArgs e)
        {
            file = saveFileDialog.FileName;
            StreamWriter sw = new StreamWriter(file);
            sw.WriteLine(fuentes.ConvertToString(textEditor.Font));
            textEditor.SelectAll();
            sw.Write(color.ConvertToString(textEditor.SelectionColor));
            textEditor.Select(0, 0);
            sw.Write(Environment.NewLine);
            sw.Write(textEditor.Text);
            sw.Close();
            guardarToolStripMenuItem.Enabled = true;
        }

        private void coloresToolStripMenuItem_Click(object sender, EventArgs e)
        {
            colorDialog.ShowDialog();
            textEditor.SelectAll();
            textEditor.SelectionColor = colorDialog.Color;
            textEditor.Select(0,0);
        }

        private void exportarPDFToolStripMenuItem_Click(object sender, EventArgs e)
        {
            saveFileDialog.DefaultExt = "pdf";
            saveFileDialog.Filter = "Text files (*.pdf)|*.pdf";
            saveFileDialog.InitialDirectory = "C:\\Users\\alumno\\Documents";
            saveFileDialog.ShowDialog();
        }

        private void Editor_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (textEditor.Enabled)
            {
                if (MessageBox.Show("¿Guardar y salir?", "SALIR", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    if (guardarToolStripMenuItem.Enabled)
                    {
                        guardar();
                    }
                    else
                    {
                        saveFileDialog.DefaultExt = "txt";
                        saveFileDialog.Filter = "Text files (*.txt)|*.txt";
                        saveFileDialog.InitialDirectory = "C:\\Users\\alumno\\Documents";
                        if (saveFileDialog.ShowDialog() == DialogResult.Cancel)
                        {
                            e.Cancel = true;
                        }
                    }
                }
                else
                {
                }
            }            
        }

        private FontConverter fuentes = new FontConverter();
        private ColorConverter color = new ColorConverter();
        private void abrirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            openFileDialog.ShowDialog();
            try
            {
                file = openFileDialog.FileName;
                StreamReader sr = new StreamReader(file);
                textEditor.Font = (Font)fuentes.ConvertFromString(sr.ReadLine());
                Color selectColor = (Color)color.ConvertFromString(sr.ReadLine());
                textEditor.Text = sr.ReadToEnd();
                textEditor.SelectAll();
                textEditor.SelectionColor = selectColor;
                textEditor.Select(0, 0);
                sr.Close();
                textEditor.Enabled = true;
                textEditor.Visible = true;
                textEditor.Enabled = true;
                textEditor.Visible = true;
                guardarComoToolStripMenuItem.Enabled = true;
                guardarToolStripMenuItem.Enabled = true;
                fuentesToolStripMenuItem.Enabled = true;
                coloresToolStripMenuItem.Enabled = true;
                exportarPDFToolStripMenuItem.Enabled = true;
            }
            catch (IOException) { 
            }
        }

        private void guardarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            guardar();
        }

        private void guardar()
        {
            StreamWriter sw = new StreamWriter(file);
            sw.WriteLine(fuentes.ConvertToString(textEditor.Font));
            textEditor.SelectAll();
            sw.Write(color.ConvertToString(textEditor.SelectionColor));
            textEditor.Select(0, 0);
            sw.Write(Environment.NewLine);
            sw.Write(textEditor.Text);
            sw.Close();
        }

        private void textEditor_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode==Keys.S && e.Control)
            {
                if (file!=null)
                {
                    guardar();
                }
            }
        }

        private void reemplazarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enviarABuscar();
        }

        private int comienzoSiguiente = 0;
        public void palabraBuscarOReemplazar(int metodo, String text, String textReemplazar)
        {
            bool encontrado = false;
            switch (metodo)
            {
                case 0:
                    for (int i=0; i<textEditor.Text.Length && !encontrado; ++i)
                    {
                        if(textEditor.Text.Substring(i, text.Length).Equals(text) )
                        {
                            textEditor.Select(i, text.Length);
                            comienzoSiguiente = i + text.Length;
                            encontrado = true;
                            textEditor.Focus();
                        }
                    }
                    break;
                case 1:
                    for (int i = comienzoSiguiente; i < textEditor.Text.Length && !encontrado; ++i)
                    {
                        if (textEditor.Text.Substring(i, text.Length).Equals(text))
                        {
                            textEditor.Select(i, text.Length);
                            encontrado = true;
                            textEditor.Focus();
                            comienzoSiguiente = i + text.Length;
                        }
                    }
                    break;
                case 2:
                    if (textEditor.Text.Substring((textEditor.Text.Substring(comienzoSiguiente, textReemplazar.Length)).Length, 1).Equals("\n"))
                    {
                        textEditor.SelectedText = textReemplazar+"\n";
                        textEditor.Select(comienzoSiguiente, textReemplazar.Length);
                    }
                    else
                    {
                        textEditor.SelectedText = textReemplazar;
                        textEditor.Select(comienzoSiguiente, textReemplazar.Length);
                    }
                    break;
            }
        }
    }
}