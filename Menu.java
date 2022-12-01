public class Menu{

    Album album;
    int n = 1;

    //public Menu(){
    //    this.album = new Album(null, null, 0, null, null);
    //}

    public void createAlbum(String titulo, String artista, int qtdMusicas, String[] musicas, String nomeMusica)
    {
       this.album = new Album(titulo, artista, qtdMusicas, musicas, nomeMusica);
       //(titulo, artista, qtdMusicas, musicas, nomeMusica);
    }

    public int procurarMusica(String nomeMusica, String[] musicas)
    {
        int indice = -1;

        for(int i = 0; i < album.getMusicas().length; i++)
        if (this.album.getNomeMusica() != nomeMusica) {
            return -1;
        }
        else{
            //index = 1;
            return i;
        }

        return -1;
    }

    public void musicaExiste(String nomeMusica, String[] musicas)
    {
        int index = procurarMusica(nomeMusica, musicas);

        if(index == -1)
        {
            System.out.println("Musica nao esta no album");
        }
        else
        {
            System.out.println("Musica esta no album");
        }
    }

    public void checarNome(String nomeMusica, String[] musicas, int posMusica)
    {
        int index = procurarMusica(nomeMusica, musicas);

        if (index == posMusica)
        {
            System.out.println("O nome da musica e: " + album.getNomeMusica());
        }
        else{
            System.out.println("Musica nao esta no album"); 
        }

    }

    public void imprimirDados()
    {
        System.out.println(album.getTitulo());
        System.out.println(album.getArtista());
        System.out.println(album.getQtdMusicas());
        System.out.println(album.getMusicas());
        for(int i = 0; i < album.getMusicas().length; i++){
            System.out.println(this.album.getNomeMusica());
        }
    }

}