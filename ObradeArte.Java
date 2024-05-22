public class ObradeArte{
    private String Titulo;
    private String Artista;
    private int Ano;
    private String TipodeObra;
    private String Localizada;

    public ObradeArte (String Titulo, String Artista, int Ano, String TipodeObra, String Localizada) {
        this.Titulo = titulo;
        this.Artista = artista;
        this.Ano = ano;
        this.TipodeObra = tipodeobra;
        this.Localizada = localizada;
    }

}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String Titulo) {
    this.Titulo = titulo;
}

public String getArtista() {
    return artista;
}

public void setArtista(String Artista) {
    this.Artista = artista;
}

public int getAno() {
    return ano;
}

public void setAno(int Ano) {
    this.Ano = ano;
}

public String getTipodeObra() {
    return tipodeobra;
}

public void setTipoObra(String tipoObra) {
    this.tipodeObra = tipodeobra;
}

public String getLocalizada() {
    return localizada;
}

public void setLocalizada(String localizada) {
    this.localizada = localizada;
}

@Override
public String toString() {
    return "Título=" + titulo + ", Artista=" + artista + ", Ano=" + ano + ", Tipo de Obra="
    + tipodeobra + ", Localizada=" + localizada;
}