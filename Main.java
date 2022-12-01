import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Criar album -----");
        System.out.println("Titulo do album: ");
        String titulo = scanner.nextLine();
        System.out.println("Artista: ");
        String artista = scanner.nextLine();
        System.out.println("Numero de musicas no album: ");
        int qtdMusicas = scanner.nextInt();
        String nomeMusica;
        scanner.nextLine();
        for(int i = 0; i < qtdMusicas; i++)
        {
            System.out.println("Nome da musica #" + i + ": ");
            nomeMusica = scanner.nextLine();
        }
        String[] musicas = new String[qtdMusicas];
        menu.createAlbum(titulo, artista, qtdMusicas, args, artista);
        
        

        while(true)
        {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Checar se uma música está no álbum");
            System.out.println("2- Checar se uma música está no álbum");
            System.out.println("3- Verificar o nome da n-ésima música do álbum");
            System.out.println("4- Imprimir os dados do álbum (título, artista e lista de músicas)");
            System.out.println("5- Alterar a posição de uma música na lista");
            System.out.println("0- Sair do sistema");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                
                    break;
                case 2:
                    System.out.println("Nome da musica que deseja: ");
                    nomeMusica = scanner.nextLine();

                    menu.musicaExiste(nomeMusica, musicas);
                    break;
                case 3:
                    System.out.println("Posicao da musica que deseja: ");
                    int posMusica = scanner.nextInt();

                    //menu.checarNome(nomeMusica, musicas, posMusica);
                    break;
                case 4:
                    menu.imprimirDados();
                    break;
                case 5:
                    
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }

    }
}
