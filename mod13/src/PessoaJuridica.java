import java.util.Date;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String dataDeFundacao;
    private PessoaFisica proprietario;

    public PessoaJuridica(String nome, String cnpj, String dataDeFundacao, PessoaFisica proprietario) {
        setNome(nome);
        this.cnpj = cnpj;
        this.dataDeFundacao = dataDeFundacao;
        this.proprietario = proprietario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public PessoaFisica getProprietario() {
        return proprietario;
    }

    public void setProprietario(PessoaFisica proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Fundada em: " + getDataDeFundacao());
        System.out.println("\nDados do Proprietário: ");
        proprietario.imprimirDados();
    }
}
