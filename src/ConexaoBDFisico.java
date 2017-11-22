
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class ConexaoBDFisico {

    RNClienteFisico r = new RNClienteFisico(null, null, null, null, null, null, null);

    List<RNClienteFisico> pessoaf;

    public ConexaoBDFisico() {
        pessoaf = new ArrayList<RNClienteFisico>();
        RNClienteFisico pessoa1 = new RNClienteFisico(null, null, null, null, null, null, null);
        RNClienteFisico pessoa2 = new RNClienteFisico(null, null, null, null, null, null, null);
        pessoaf.add(pessoa1);
        pessoaf.add(pessoa2);

    }

    public Connection conectar() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = null;
        try {
            /* Coneção do banco na facet metodista
           
             Connection conn = DriverManager.getConnection(  
             "jdbc:oracle:thin:@10.20.250.13:1521:dbfacet",    
             "TESTE",                                   
             "TESTE");*/
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "AL235610",
                    "AL235610");

            return conn;
        } catch (SQLException exception) {
            // throw new Exception("Não foi possivel encontrar o banco de dados!!",
            // exception);
            exception.printStackTrace();
            System.out.println("Erro: " + exception);

        }
        return conn;

    }

    //Deletar um usuario do banco de dados
    public void DeletaUsuario(int rollNo) {
        Connection conn = null;

        try {
            conn = conectar();
            String insert = "DELETE /*o que quiser deletar*/ WHERE rollNo = ?";
            PreparedStatement stm = conn.prepareStatement(insert);
            stm.setInt(1, rollNo);
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //salvar infomações pessoais do cliente no banco de dados
    public void salvarCliente(RNClienteFisico clientef) {
        Connection conn = null;
        RNClienteFisico s = null;
        try {
            conn = conectar();
            String insert = "INSERT INTO CLIENTEF(IDCLIENTEF,NOME,EMAIL,CPF,SEXO,DATANASCIMENTO,TELEFONE1,TELEFONE2)"
                    + "VALUES (SQ_CLIENTE_IDCLIENTE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conn.prepareStatement(insert);
            stm.setString(1, clientef.getNomeCompleto());
            stm.setString(2, clientef.getEmail());
            stm.setString(3, clientef.getCpf());
            stm.setString(4, clientef.getSexo());
            stm.setString(5, clientef.getDataDeNascimento());
            stm.setString(6, clientef.getTel1());
            stm.setString(7, clientef.getTel2());
            stm.execute();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // salvar informações de endereço do canco de dados
    public void salvarEnd(RNEndereco clientef) {
        Connection conn = null;
        RNClienteFisico s = null;
        try {
            conn = conectar();
            String insert = "INSERT INTO CLIENTEF(IDENDERECO,RUA,CEP,ESTADO,CIDADE,BAIRRO,NUMERO,COMPLEMENTO)"
                    + "VALUES (SQ_ENDERECO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conn.prepareStatement(insert);
            stm.setString(1, clientef.getRua());
            stm.setString(2, clientef.getCEP());
            stm.setString(3, clientef.getEstado());
            stm.setString(4, clientef.getCidade());
            stm.setString(5, clientef.getBairro());
            stm.setInt(6, clientef.getNumero());
            stm.setString(7, clientef.getComplemento());
            stm.execute();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /*
     // pesquisa informações do cliente fisico no banco de dados
     public RNClienteFisico getRNClienteFisico(int CPF, String Nome) {
     Connection conn = null;
     RNClienteFisico r = null;

     try {
     conn = conectar();

     String consulta = "SELECT * FROM CLIENTEF WHERE CPF = ? OR Nome like '?%'";
     PreparedStatement stm = conn.prepareStatement(consulta);
     stm.setInt(1, CPF);
     stm.setString(2, Nome);

     ResultSet rs = stm.executeQuery();
     if (rs != null && rs.next()) {
     r = new RNClienteFisico(rs.getString("NOME"), rs.getString("EMAIL"),
     rs.getString("CPF"), rs.getString("SEXO"), rs.getString("DATANASCIMENTO"),
     rs.getString("TELEFONE1"), rs.getString("TELEFONE2"));
     }
     } catch (Exception e) {
     e.printStackTrace();
     } finally {
     if (conn != null) {
     try {
     conn.close();
     } catch (Exception e) {
     e.printStackTrace();
     }
     }
     }
     return r;
     }

     //Pesquisa todos os dados do banco de dados
     public List<RNClienteFisico> getAllCliente() {
     Connection conn = null;
     List<RNClienteFisico> Clientef = new ArrayList<RNClienteFisico>();
     try {
     conn = conectar();
     String consulta = "SELECT * FROM CLIENTEF ORDER BY NOME";
     PreparedStatement stm = conn.prepareStatement(consulta);

     ResultSet rs = stm.executeQuery();

     while (rs != null && rs.next()) {
                
     RNClienteFisico c = new RNClienteFisico(rs.getString("NOME"), rs.getString("EMAIL"),
     rs.getString("CPF"), rs.getString("SEXO"), rs.getString("DATANASCIMENTO"),
     rs.getString("TELEFONE1"), rs.getString("TELEFONE2"));
     Clientef.add(c);
     }
     } catch (Exception e) {
     e.printStackTrace();
     } finally {
     if (conn != null) {
     try {
     conn.close();
     } catch (Exception e) {
     e.printStackTrace();
     }
     }
     }
     return Clientef;
     }
    
    
     */

    // public RNClienteFisico pesquisar(String CPF, String NOME) {
    public RNClienteFisico pesquisar(ClienteFBusca cliente) {
        Connection conn = null;
        RNClienteFisico ClienteF = null;

        try {
            conn = conectar();
            String consulta1 = "SELECT * FROM CLIENTEF WHERE CPF = ?";
            PreparedStatement stm = conn.prepareStatement(consulta1);
            stm.setString(1, ClienteF.cpf);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                
                ClienteF.setNomeCompleto(rs.getString("NOME"));
                ClienteF.setEmail(rs.getString("EMAIL"));
                ClienteF.setSexo(rs.getString("SEXO"));
                ClienteF.setDataDeNascimento(rs.getString("DATANASCIMENTO"));
                ClienteF.setEmail(rs.getString("EMAIL"));
            }

            if (rs != null && rs.next()) {

                String id = rs.getString("NOME");

                String consulta2 = "SELECT * FROM CLIENTE WHERE NOME %?%";
                PreparedStatement stm2 = conn.prepareStatement(consulta2);
                stm2.setString(1, ClienteF.nomeCompleto);
                ResultSet rs2 = stm2.executeQuery();

                if (rs2 != null && rs2.next()) {

                    ClienteF = new RNClienteFisico(id, id, id, consulta2, consulta2, id, id);
                    ClienteF.setNomeCompleto(rs2.getString("NOME"));
                    ClienteF.setEmail(rs.getString("EMAIL"));
                    ClienteF.setSexo(rs.getString("SEXO"));
                    ClienteF.setDataDeNascimento(rs.getString("DATANASCIMENTO"));
                    ClienteF.setEmail(rs2.getString("EMAIL"));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na localização dos dados: " + e);

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro na localização dos dados2: " + e);
                    e.printStackTrace();
                }
            }

        }
        return ClienteF;
    }

    //FAZER UPDATE NA TABLE DE CLIENTE FISICO
    public void updateStudent(RNClienteFisico CPF) {
        Connection conn = null;

        try {
            conn = conectar();

            String insert = "UPDATE Student SET ? = ? WHERE CPF = ?";
            PreparedStatement stm = conn.prepareStatement(insert);
            stm.setString(1, r.getCpf());
            stm.setString(2, r.getDataDeNascimento());
            stm.setString(3, r.getEmail());
            stm.setString(4, r.getNomeCompleto());
            stm.setString(5, r.getSexo());
            stm.setString(6, r.getTel1());
            stm.setString(7, r.getTel2());
            stm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
