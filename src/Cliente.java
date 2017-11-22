


/*Essa classe é responsavel em armazenar as informações em comum entre o cadastro 
 do cliente fisico e o cliente juridico*/
/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class Cliente {

  
    String tel1;
    String tel2;   
    String email;
 //   int idCliente;

    public Cliente(String tel1, String tel2, String email) {
        this.tel1 = tel1;
        this.tel2 = tel2;    
        this.email = email;
        //this.idCliente = idCliente;
    }

   /* public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
*/
    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
