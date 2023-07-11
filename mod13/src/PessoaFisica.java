import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String dataDeNasc;

    public PessoaFisica(String nome, String cpf, String dataDeNasc) {
        setNome(nome);
        this.cpf = cpf;
        this.dataDeNasc = dataDeNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("CPF: " + getCpf());
        System.out.println("Nascimento: " + getDataDeNasc());

    }
}
