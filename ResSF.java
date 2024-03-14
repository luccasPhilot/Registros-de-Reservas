//Luccas Philot Goncalves RA: 2525879
import javax.swing.JOptionPane;

public class ResSF extends javax.swing.JFrame {
    
    private SalaoFestas salaoF = new SalaoFestas();
    private GerSF sf = GerSF.geraGerSF();
    private static ResSF SFUnic;

    private ResSF() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //Método singleton
    public static ResSF geraResSF(){
        if(SFUnic == null){
            SFUnic = new ResSF();
        }
        return SFUnic;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btReservar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        cxData = new javax.swing.JFormattedTextField();
        Duracao = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCpf = new javax.swing.JTextField();
        cxDuracao = new javax.swing.JTextField();
        Convidados = new javax.swing.JLabel();
        cxConvidados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva Salao de Festas");

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

        btReservar.setText("Reservar");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        Data.setText("DATA:");

        Duracao.setText("DURAÇÃO:");

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

        Nome.setText("NOME:");

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt1.setText("RESERVAR SALÃO DE FESTAS");

        Cpf.setText("CPF:");

        Convidados.setText("CONVIDADOS:");

        cxConvidados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxConvidadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txt1)
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nome)
                            .addComponent(Cpf)
                            .addComponent(Data)
                            .addComponent(Duracao)
                            .addComponent(Convidados)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btReservar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair)
                                .addGap(23, 23, 23))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1)
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
                    .addComponent(Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Convidados)
                    .addComponent(cxConvidados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
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
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            excluirResSF();
        } catch (CpfException e) {
         JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();   
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            alterarResSF();
            limpar();
        } catch (CpfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed
        try {
        insResSF();
        limpar();
    } catch (DuracaoException | CpfException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btReservarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            consResSFCpf();
            limpar();
        } catch (CpfException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxConvidadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxConvidadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxConvidadosActionPerformed

    public void limpar(){
        cxCpf.setText("");
        cxNome.setText("");
        cxData.setText("");
        cxDuracao.setText("");
        cxConvidados.setText("");
        cxCpf.requestFocus();
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "SAIR", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }
    
    public void insResSF() throws DuracaoException, CpfException {
    try {
        salaoF = new SalaoFestas();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        } 
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoF.setCpf(Integer.parseInt(cpfText));
        salaoF.setNome(cxNome.getText());
        salaoF.setData(cxData.getText());
        int duracao = 0;
        try {
            duracao = Integer.parseInt(cxDuracao.getText());
            if (duracao <= 0) {
                throw new DuracaoException("DuracaoException -> A duração não pode ser menor que ou igual a 0.");
            }
        } catch (NumberFormatException e) {
            throw new DuracaoException("DuracaoException -> A duração deve ser um número inteiro.");
        }
        salaoF.setDuracao(duracao);
        salaoF.setConvidados(Integer.parseInt(cxConvidados.getText()));
        salaoF = sf.insSF(salaoF);
        if (salaoF != null) {
            JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!", "RESERVA DO SALAO DE FESTAS", 1);
        } else {
            JOptionPane.showMessageDialog(null, "CPF Duplicado!", "RESERVA DO SALAO DE FESTAS", 0);
        }
    } catch (DuracaoException e) {
        System.out.println("Erro na duração da reserva: " + e.getMessage());
        throw e;
    } catch (CpfException e) {
        System.out.println("Erro no CPF: " + e.getMessage());
        throw e;
    } catch (NumberFormatException e) {
        System.out.println("Erro na conversão de número: " + e.getMessage());
        throw new DuracaoException("DuracaoException -> A duração deve ser um número inteiro.");
    }
}

    public void excluirResSF() throws CpfException{
        try {
        salaoF = new SalaoFestas();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoF.setCpf(Integer.parseInt(cpfText));
        salaoF = sf.delSFCpf(salaoF);
        if (salaoF == null) {
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
    
    public void consResSFCpf() throws CpfException{
        try {
        salaoF = new SalaoFestas();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoF.setCpf(Integer.parseInt(cpfText));
        salaoF = sf.consResSF(salaoF);
        if (salaoF != null) {
            cxCpf.setText(Integer.toString(salaoF.getCpf()));
            cxNome.setText(salaoF.getNome());
            cxData.setText(salaoF.getData());
            cxDuracao.setText(Integer.toString(salaoF.getDuracao()));
            cxConvidados.setText(Integer.toString(salaoF.getConvidados()));
            JOptionPane.showMessageDialog(null, "Confira os Dados", "CONSULTA DE RESERVA", 1);
        } else {
            JOptionPane.showMessageDialog(null, "CPF inexistente", "CONSULTA DE RESERVA", 0);
        }
    } catch (NumberFormatException e) {
        throw new CpfException("CpfException -> O CPF deve ser um número inteiro.");
    }
    }
    
    public void alterarResSF() throws CpfException {
    try {
        salaoF = new SalaoFestas();
        salaoF.setCpf(Integer.parseInt(cxCpf.getText()));
        String cpfText = cxCpf.getText();
            if (!cpfText.matches("[0-9]+")) {
                throw new CpfException("CpfException -> O CPF deve conter apenas números.");
            }
        salaoF = sf.atualizaSFCpf(salaoF);
        if(salaoF != null){
            cxCpf.setText(Integer.toString(salaoF.getCpf()));
            cxNome.setText(salaoF.getNome());
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!", "ALTERAÇÂO DE DADOS DA RESERVA", 1);
            limpar();
        }else{
            JOptionPane.showMessageDialog(null, "Cpf inexistente", "ALTERAÇÂO DE DADOS DA RESERVA", 0);
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
            java.util.logging.Logger.getLogger(ResSF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResSF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResSF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResSF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResSF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Convidados;
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Duracao;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btReservar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxConvidados;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JFormattedTextField cxData;
    private javax.swing.JTextField cxDuracao;
    private javax.swing.JTextField cxNome;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
