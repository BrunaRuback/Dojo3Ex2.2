public class Album {
    
    private String titulo;
    private String artista;
    private int qtdMusicas;
    private String[] musicas;
    private String nomeMusica;
   
    public Album(String titulo2, String artista2, int qtdMusicas2, String[] musicas2, String nomeMusica2) {
        this.titulo = titulo;
        this.artista = artista;
        this.musicas = new String[qtdMusicas];
        this.nomeMusica = nomeMusica;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getQtdMusicas() {
        return qtdMusicas;
    }
    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }
    public String[] getMusicas() {
        return musicas;
    }
    public void setMusicas(String[] musicas) {
        this.musicas = musicas;
    }
    public String getNomeMusica() {
        return nomeMusica;
    }
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }


}
