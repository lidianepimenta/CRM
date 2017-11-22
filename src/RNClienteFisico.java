
/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 *
 * Esta classe e reponsavel por gravar os dados introduzidos pelo usuario
 * juntando em um objeto, para que depois seja possivel a busca por filtros.
 */
public class RNClienteFisico extends Cliente {

    String nomeCompleto;
    String dataDeNascimento;
    String cpf;
    String sexo;


    public RNClienteFisico(String tel1, String tel2, String email, String nomeCompleto, String dataDeNascimento, String cpf, String sexo) {
        super(tel1, tel2, email);
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

}
