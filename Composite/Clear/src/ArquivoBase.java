public abstract class ArquivoBase {

    String nomeDoArquivo;

    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo + "\n");
    }

    public String getNomeDoArquivo() {
        return this.nomeDoArquivo;
    }

    public void adicionar(ArquivoBase novoArquivo) throws Exception {
        throw new Exception("Não pode inserir arquivos em: "
                + this.nomeDoArquivo + " - Não é uma pasta");
    }

    public void remover(String nomeDoArquivo) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.nomeDoArquivo + " - Não é uma pasta");
    }

    public ArquivoBase getArquivo(String nomeDoArquivo) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.nomeDoArquivo + " - Não é uma pasta");
    }

    public int getNumArquivos() throws Exception {
            throw new Exception("Não existem arquivos em: "
                    + this.nomeDoArquivo + " - Não é uma pasta");
    }

    public void printListaArquivos() throws Exception {
        throw new Exception("Não existem arquivos em: "
                + this.nomeDoArquivo + " - Não é uma pasta");
    }
}
