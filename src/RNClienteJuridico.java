

/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class RNClienteJuridico extends Cliente {
    String nomeEmpresa;
    String razaoSocial;
    String cnpj;
    String inscricaoEstadual;
    String informacaoTributaria;
    String responsavel;

    public RNClienteJuridico(String tel1, String tel2, String email) {
        super(tel1, tel2, email);
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInformacaoTributaria() {
        return informacaoTributaria;
    }

    public void setInformacaoTributaria(String informacaoTributaria) {
        this.informacaoTributaria = informacaoTributaria;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
  
}
