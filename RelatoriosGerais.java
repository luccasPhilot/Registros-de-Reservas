//Luccas Philot Goncalves RA: 2525879
import javax.swing.table.DefaultTableModel;

public class RelatoriosGerais extends javax.swing.JFrame {

    private static RelatoriosGerais rgUnic;
    
    public RelatoriosGerais() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //Singleton
    public static RelatoriosGerais geraRG(){
        if(rgUnic == null){
            rgUnic = new RelatoriosGerais();
        }
        return rgUnic;
    }
    
    public void listTabAcad(){
        DefaultTableModel modelo = (DefaultTableModel) tabAcad.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for(Academia a1 : GerAcad.geraGerAcad().getBdAcad()){
            modelo.insertRow(posLin, new Object[]{a1.getCpf(), a1.getNome(), a1.getData(), a1.getDuracao(), a1.getParceiros()});
            posLin++;
        }
    }
    
    public void listTabSF(){
        DefaultTableModel modelo = (DefaultTableModel) tabSF.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for(SalaoFestas sf : GerSF.geraGerSF().getBdSF()){
            modelo.insertRow(posLin, new Object[]{sf.getCpf(), sf.getNome(), sf.getData(), sf.getDuracao(), sf.getConvidados()});
            posLin++;
        }
    }
    
    public void listTabSJ(){
        DefaultTableModel modelo = (DefaultTableModel) tabSJ.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for(SalaoJogos sj : GerSJ.geraGerSJ().getBdSJ()){
            modelo.insertRow(posLin, new Object[]{sj.getCpf(), sj.getNome(), sj.getData(), sj.getDuracao(), sj.getJogo()});
            posLin++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAcad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSF = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabSJ = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Todas as Reservas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabAcad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "DATA", "DURAÇÃO", "PARCEIROS"
            }
        ));
        jScrollPane1.setViewportView(tabAcad);

        tabSF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "DATA", "DURAÇÃO", "CONVIDADOS"
            }
        ));
        jScrollPane2.setViewportView(tabSF);

        tabSJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "DATA", "DURAÇÃO", "JOGO"
            }
        ));
        jScrollPane3.setViewportView(tabSJ);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Reservas Academia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Reservas Salão de Festas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Reservas Salão de Jogos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listTabAcad();
        listTabSF();
        listTabSJ();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatoriosGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosGerais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabAcad;
    private javax.swing.JTable tabSF;
    private javax.swing.JTable tabSJ;
    // End of variables declaration//GEN-END:variables
}
