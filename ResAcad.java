//Luccas Philot Goncalves RA: 2525879
import javax.swing.JOptionPane;

public class ResAcad extends javax.swing.JFrame {
    
    private Academia acad1 = new Academia();
    private GerAcad ga = GerAcad.geraGerAcad();
    private static ResAcad raUnic;
    
    private ResAcad() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //Método singleton
    public static ResAcad geraResAcad(){
        if(raUnic == null){
            raUnic = new ResAcad();
        }
        return raUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btReservar = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        cxData = new javax.swing.JFormattedTextField();
        Duracao = new javax.swing.JLabel();
        cxDuracao = new javax.swing.JTextField();
        Nome = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCpf = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        Parceiros = new javax.swing.JLabel();
        cxParceiros = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva Academia");

        btReservar.setText("Reservar");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });

        Data.setText("DATA:");

        Duracao.setText("DURAÇÃO:");

        cxDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDuracaoActionPerformed(evt);
            }
        });

        Nome.setText("NOME:");

        Cpf.setText("CPF:");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        Parceiros.setText("PARCEIROS:");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt1.setText("RESERVAR ACADEMIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nome)
                            .addComponent(Cpf)
                            .addComponent(Data)
                            .addComponent(Duracao)
                            .addComponent(Parceiros))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCpf)
                            .addComponent(cxNome)
                            .addComponent(cxData)
                            .addComponent(cxDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cxParceiros))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReservar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(txt1)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cpf)
                            .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Data)
                            .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Parceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxParceiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair))))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed
    try {
        insResAcad();
        limpar();
    } catch (DuracaoException | CpfException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btReservarActionPerformed

    private void cxDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDuracaoActionPerformed
        
    }//GEN-LAST:event_cxDuracaoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            excluirResAcad();
        } catch (CpfException e) {
         JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            consResAcadCpf();
        } catch (CpfException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            alterarResAcad();
            limpar();
        } catch (CpfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed
    
    public void limpar(){
        cxCpf.setText("");
        cxNome.setText("");
        cxData.setText("");
        cxDuracao.setText("");
        cxParceiros.setText("");
        cxCpf.requestFocus();
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "SAIR", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }
    
    public void insResAcad() throws DuracaoException, CpfException {
        try {
            acad1 = new Academia();
            String cpfText = cxCpf.getText();
            if (!cpfText.matches("[0-9]+")) {
                throw new CpfException("CpfException -> O CPF deve conter apenas números.");
            }
            if (cpfText.length() != 11) {
                throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
            }
            acad1.setCpf(Integer.parseInt(cxCpf.getText()));
            acad1.setNome(cxNome.getText());
            acad1.setData(cxData.getText());
            int duracao = 0;
            try {
                duracao = Integer.parseInt(cxDuracao.getText());
                if (duracao <= 0) {
                    throw new DuracaoException("DuracaoException -> A duração não pode ser menor que ou igual a 0.");
                }
            } catch (NumberFormatException e) {
                throw new DuracaoException("DuracaoException -> A duração deve ser um número inteiro.");
            }
            acad1.setDuracao(duracao);
            acad1.setParceiros(Integer.parseInt(cxParceiros.getText()));
            acad1 = ga.insAcad(acad1);
            if (acad1 != null) {
                JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!", "RESERVA DE ACADEMIA", 1);
            } else {
                JOptionPane.showMessageDialog(null, "CPF Duplicado!", "RESERVA DE ACADEMIA", 0);
            }
        } catch (DuracaoException e) {
            System.out.println("Erro na duração da reserva: " + e.getMessage());
            throw e;
        } catch (CpfException e) {
            System.out.println("Erro no CPF: " + e.getMessage());
            throw e;
        }
    }

    public void excluirResAcad() throws CpfException {
    try {
        acad1 = new Academia();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        acad1.setCpf(Integer.parseInt(cpfText));
        acad1 = ga.delAcadCpf(acad1);
        if (acad1 == null) {
            JOptionPane.showMessageDialog(null, "Reserva excluída com sucesso!", "EXCLUSÃO DE RESERVA", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "CPF inexistente", "EXCLUSÃO DE RESERVA", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    } catch (NumberFormatException e) {
        throw new CpfException("CpfException -> O CPF deve ser um número inteiro.");
    }
    }
    
    public void consResAcadCpf() throws CpfException {
    try {
        acad1 = new Academia();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        acad1.setCpf(Integer.parseInt(cpfText));
        acad1 = ga.consResAcad(acad1);
        if (acad1 != null) {
            cxCpf.setText(Integer.toString(acad1.getCpf()));
            cxNome.setText(acad1.getNome());
            cxData.setText(acad1.getData());
            cxDuracao.setText(Integer.toString(acad1.getDuracao()));
            cxParceiros.setText(Integer.toString(acad1.getParceiros()));
            JOptionPane.showMessageDialog(null, "Confira os Dados", "CONSULTA DE RESERVA", 1);
        } else {
            JOptionPane.showMessageDialog(null, "CPF inexistente", "CONSULTA DE RESERVA", 0);
        }
    } catch (NumberFormatException e) {
        throw new CpfException("CpfException -> O CPF deve ser um número inteiro.");
    }
}
    
    public void alterarResAcad() throws CpfException {
    try {
        acad1 = new Academia();
        acad1.setCpf(Integer.parseInt(cxCpf.getText()));
        acad1 = ga.atualizaAcadCpf(acad1);
        
        String cpfText = cxCpf.getText();
            if (!cpfText.matches("[0-9]+")) {
                throw new CpfException("CpfException -> O CPF deve conter apenas números.");
            }
        if (acad1 != null) {
            cxCpf.setText(Integer.toString(acad1.getCpf()));
            cxNome.setText(acad1.getNome());
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!", "ALTERAÇÃO DE DADOS DA RESERVA", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "CPF inexistente", "ALTERAÇÃO DE DADOS DA RESERVA", 0);
        }
    } catch (NumberFormatException e) {
        throw new CpfException("Erro: O Cpf e/ou a Duração devem ser um número inteiro.");
    } catch (CpfException e) {
            System.out.println("Erro no CPF: " + e.getMessage());
            throw e;
        }        
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResAcad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Duracao;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Parceiros;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btReservar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JFormattedTextField cxData;
    private javax.swing.JTextField cxDuracao;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxParceiros;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables


}
