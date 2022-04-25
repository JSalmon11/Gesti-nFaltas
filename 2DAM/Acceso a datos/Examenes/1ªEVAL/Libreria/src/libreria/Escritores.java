package libreria;

public class Escritores {
    private String IdLibro;
    private String Titulo;
    private String Autor;

    public String getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(String IdLibro) {
        this.IdLibro = IdLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Escritores{" + "IdLibro=" + IdLibro + ", Titulo=" + Titulo + ", Autor=" + Autor + '}';
    }
    
}// Escritores