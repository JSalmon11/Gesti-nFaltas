package libreria;

public class Libros {
    private String LibroId;
    private String tematica;
    private String Editorial;
    private String FPublicacion;
    private String Idioma;

    public String getLibroId() {
        return LibroId;
    }

    public void setLibroId(String LibroId) {
        this.LibroId = LibroId;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getFPublicacion() {
        return FPublicacion;
    }

    public void setFPublicacion(String FPublicacion) {
        this.FPublicacion = FPublicacion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    @Override
    public String toString() {
        return "Libros{" + "LibroId=" + LibroId + ", tematica=" + tematica + ", Editorial=" + Editorial + ", FPublicacion=" + FPublicacion + ", Idioma=" + Idioma + '}';
    }

}// Libros