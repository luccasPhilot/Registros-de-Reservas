//Product Version: Apache NetBeans IDE 18
//Luccas Philot Goncalves RA: 2525879
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuReservar = new javax.swing.JMenu();
        MenuResAcad = new javax.swing.JMenuItem();
        MenuResSF = new javax.swing.JMenuItem();
        MenuResSJ = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TodasReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Reservas");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Programa De Reservas ");

        MenuReservar.setText("RESERVAR");

        MenuResAcad.setText("Academia");
        MenuResAcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuResAcadActionPerformed(evt);
            }
        });
        MenuReservar.add(MenuResAcad);

        MenuResSF.setText("Salao de Festas");
        MenuResSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuResSFActionPerformed(evt);
            }
        });
        MenuReservar.add(MenuResSF);

        MenuResSJ.setText("Salao de Jogos");
        MenuResSJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuResSJActionPerformed(evt);
            }
        });
        MenuReservar.add(MenuResSJ);

        jMenuBar1.add(MenuReservar);

        jMenu2.setText("CONSULTAR");

        TodasReservas.setText("Todas Reservas");
        TodasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodasReservasActionPerformed(evt);
            }
        });
        jMenu2.add(TodasReservas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuResAcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuResAcadActionPerformed
       ResAcad.geraResAcad().setVisible(true);
    }//GEN-LAST:event_MenuResAcadActionPerformed

    private void MenuResSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuResSFActionPerformed
        ResSF.geraResSF().setVisible(true);
    }//GEN-LAST:event_MenuResSFActionPerformed

    private void MenuResSJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuResSJActionPerformed
        ResSJ.geraResSJ().setVisible(true);
    }//GEN-LAST:event_MenuResSJActionPerformed

    private void TodasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodasReservasActionPerformed
        RelatoriosGerais.geraRG().setVisible(true);
    }//GEN-LAST:event_TodasReservasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuResAcad;
    private javax.swing.JMenuItem MenuResSF;
    private javax.swing.JMenuItem MenuResSJ;
    private javax.swing.JMenu MenuReservar;
    private javax.swing.JMenuItem TodasReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
