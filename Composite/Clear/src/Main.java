
public class Main {

    public static void main(String[] args){

        ArquivoBase file1 = new Arquivo("File1");
        ArquivoBase file2 = new Arquivo("File2");
        ArquivoBase folder = new Pasta("Folder");

        try{
            folder.adicionar(file1);
            folder.printNomeDoArquivo();
            System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n");
            folder.printListaArquivos();
            System.out.print("\n");

            folder.adicionar(file2);
            System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n");
            folder.printListaArquivos();
            System.out.print("\n");

            folder.remover("File1");
            System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n");
            folder.printListaArquivos();
            System.out.print("\n");

            file1.adicionar(file2);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}