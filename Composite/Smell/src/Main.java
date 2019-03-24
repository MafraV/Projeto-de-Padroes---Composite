
public class Main {

    public static void main(String[] args){

        Arquivo file1 = new Arquivo("File1");
        Arquivo file2 = new Arquivo("File2");
        Pasta folder = new Pasta("Folder");

        folder.inserirArquivo(file1);
        folder.printName();
        System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n" + "Número de Pastas: " + folder.getNumPastas() + "\n");
        folder.printFileList();
        System.out.print("\n");

        folder.inserirArquivo(file2);
        System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n");
        folder.printFileList();
        System.out.print("\n");

        folder.removerArquivo(file1);
        System.out.print("Número de Arquivos: " + folder.getNumArquivos() + "\n");
        folder.printFileList();
        System.out.print("\n");


    }
}
