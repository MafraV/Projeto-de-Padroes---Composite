import java.util.ArrayList;
import java.util.Objects;

public class Pasta extends ArquivoBase {

    ArrayList<ArquivoBase> arquivos = new ArrayList<ArquivoBase>();

    public Pasta(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo + "\n");
    }

    @Override
    public void adicionar(ArquivoBase novoArquivo) {
        this.arquivos.add(novoArquivo);
    }

    @Override
    public void remover(String nomeDoArquivo) throws Exception {
        for (ArquivoBase arquivoTmp : arquivos) {
            if (Objects.equals(arquivoTmp.getNomeDoArquivo(), nomeDoArquivo)) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

    @Override
    public ArquivoBase getArquivo(String nomeDoArquivo) throws Exception {
        for (ArquivoBase arquivoTmp : arquivos) {
            if (Objects.equals(arquivoTmp.getNomeDoArquivo(), nomeDoArquivo)) {
                return arquivoTmp;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

    @Override
    public int getNumArquivos(){
        return arquivos.size();
    }

    @Override
    public void printListaArquivos(){
        int i;

        System.out.print("Arquivos:\n");

        for(i=0; i<arquivos.size(); i++)
        {
            arquivos.get(i).printNomeDoArquivo();
        }
    }

}