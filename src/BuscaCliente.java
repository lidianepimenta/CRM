import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class BuscaCliente extends javax.swing.JInternalFrame {

    RNClienteFisico r = new RNClienteFisico(" ", " ", " ", " ", " ", " ", " ");
    ConexaoBDFisico c = new ConexaoBDFisico();
    ClienteFBusca cb = new ClienteFBusca();
    List<String> Lista;
    
    /*
     * Creates new form BuscaCliente
     */
    public BuscaCliente() {
        initComponents();
        Lista = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableBuscaC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnNomeBusca = new javax.swing.JButton();
        btnCPFBusca = new javax.swing.JButton();
        btnSairBusca = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JtableBuscaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "CPF", "Sexo", "D.Nascimento", "Fone 1", "Fone 2"
            }
        ));
        jScrollPane1.setViewportView(JtableBuscaC);
        if (JtableBuscaC.getColumnModel().getColumnCount() > 0) {
            JtableBuscaC.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Busca");

        btnNomeBusca.setText("Por Nome");
        btnNomeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeBuscaActionPerformed(evt);
            }
        });

        btnCPFBusca.setText("Por CPF");
        btnCPFBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPFBuscaActionPerformed(evt);
            }
        });

        btnSairBusca.setText("Sair");
        btnSairBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnNomeBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCPFBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSairBusca)
                        .addGap(83, 83, 83)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNomeBusca)
                    .addComponent(btnCPFBusca)
                    .addComponent(btnSairBusca))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeBuscaActionPerformed
        // Botao buscar por nome

        r.setNomeCompleto(txtBusca.getText());
        String nome = txtBusca.getText();

       cb.getColumnName(0);


    }//GEN-LAST:event_btnNomeBuscaActionPerformed

    private void btnCPFBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPFBuscaActionPerformed
        // Botao buscar por CPF

        r.setCpf(txtBusca.getText());
    }//GEN-LAST:event_btnCPFBuscaActionPerformed

    private void btnSairBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairBuscaActionPerformed
        //Botao sair da tela de busca
        this.dispose();

    }//GEN-LAST:event_btnSairBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableBuscaC;
    private javax.swing.JButton btnCPFBusca;
    private javax.swing.JButton btnNomeBusca;
    private javax.swing.JButton btnSairBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
