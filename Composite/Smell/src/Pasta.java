import java.util.ArrayList;

public class Pasta {

    private ArrayList<Arquivo> listaDeArquivos = new ArrayList<Arquivo>();
    private ArrayList<Pasta> listaDePastas = new ArrayList<Pasta>();
    private String nome;

    public Pasta(String nome){

        this.nome = nome;

    }

    void inserirArquivo(Arquivo x) {

        listaDeArquivos.add(x);

    }

    void inserirPasta(Pasta x) {

        listaDePastas.add(x);

    }

    void removerArquivo(Arquivo x) {

        listaDeArquivos.remove(x);

    }

    void removerPasta(Pasta x) {

        listaDePastas.remove(x);

    }

    Arquivo getArquivo(int index){

        return listaDeArquivos.get(index);

    }

    Pasta getPasta(int index){

        return listaDePastas.get(index);

    }

    int getNumArquivos(){

        return listaDeArquivos.size();

    }

    int getNumPastas(){

        return listaDePastas.size();

    }

    void printName(){

        System.out.print(this.nome + "\n");

    }

    void printFileList(){

        int i;

        System.out.print("Arquivos:\n");

        for(i=0; i<listaDeArquivos.size(); i++)
        {
            listaDeArquivos.get(i).printName();
        }
    }

    void printFolderList(){

        int i;

        System.out.print("Pastas:\n");

        for(i=0; i<listaDePastas.size(); i++)
        {
            listaDePastas.get(i).printName();
        }
    }
}