
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class ClienteFBusca extends AbstractTableModel {

    private List<RNClienteFisico> ClienteF = new ArrayList<RNClienteFisico>();

    public ClienteFBusca() {
        recarregar();
    }

    @Override
    public int getRowCount() {
        return ClienteF.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return ClienteF.get(rowIndex).getNomeCompleto();
        } else if (columnIndex == 1) {
            return ClienteF.get(rowIndex).getCpf();
        } else if (columnIndex == 2) {
            return ClienteF.get(rowIndex).getEmail();
        } else if (columnIndex == 3) {
            return ClienteF.get(rowIndex).getSexo();
        } else if (columnIndex == 4) {
            return ClienteF.get(rowIndex).getTel1();
        } else {
            return ClienteF.get(rowIndex).getTel2();
        }

    }

    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "Nome";
            case 1:
                return "Email";
            case 2:
                return "CPF";
            case 3:
                return "Sexo";
            case 4:
                return "D.Nascimento";
            case 5:
                return "Fone 1";
            case 6:
                return "Fone 2";
            default:
                return "";
        }
    }

    public void recarregar() {
        ConexaoBDFisico dao = new ConexaoBDFisico();
       // ClienteF = dao.pesquisar(String Nome, String CPF);

        fireTableRowInserted(ClienteF.size() - 1, ClienteF.size() - 1);
    }

    private void fireTableRowInserted(int i, int i0) {

    }
}
