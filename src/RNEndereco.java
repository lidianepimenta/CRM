
/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class RNEndereco {

    String TipoEnd;
    String CEP;
    String Estado;
    String Cidade;
    String Bairro;
    String Rua;
    int Numero;
    String Complemento;

    public RNEndereco(String TipoEnd, String CEP, String Estado, String Cidade, String Bairro, String Rua, int Numero, String Complemento) {
        this.TipoEnd = TipoEnd;
        this.CEP = CEP;
        this.Estado = Estado;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Rua = Rua;
        this.Numero = Numero;
        this.Complemento = Complemento;
    }

    public String getTipoEnd() {
        return TipoEnd;
    }

    public void setTipoEnd(String TipoEnd) {
        this.TipoEnd = TipoEnd;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    
    
}
