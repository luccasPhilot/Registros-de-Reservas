//Luccas Philot Goncalves RA: 2525879
import javax.swing.JOptionPane;

public class ResSJ extends javax.swing.JFrame {
    
    private SalaoJogos salaoJ = new SalaoJogos();
    private GerSJ sj = GerSJ.geraGerSJ();
    private static ResSJ SJUnic;
    
    private ResSJ() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //Método singleton
    public static ResSJ geraResSJ(){
        if(SJUnic == null){
            SJUnic = new ResSJ();
        }
        return SJUnic;
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JogosGroup = new javax.swing.ButtonGroup();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        Jogo = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        btReservar = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        cxData = new javax.swing.JFormattedTextField();
        Duracao = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCpf = new javax.swing.JTextField();
        cxSinuca = new javax.swing.JRadioButton();
        cxTenisMesa = new javax.swing.JRadioButton();
        cxPebolim = new javax.swing.JRadioButton();
        cxDuracao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva Salao de Jogos");

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

        Jogo.setText("JOGO:");

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
        txt1.setText("RESERVAR SALÃO DE JOGOS");

        btReservar.setText("Reservar");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });

        Data.setText("DATA:");

        Duracao.setText("DURAÇÃO:");

        Nome.setText("NOME:");

        Cpf.setText("CPF:");

        JogosGroup.add(cxSinuca);
        cxSinuca.setText("Sinuca");

        JogosGroup.add(cxTenisMesa);
        cxTenisMesa.setText("Tênis de Mesa");

        JogosGroup.add(cxPebolim);
        cxPebolim.setText("Pebolim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nome)
                            .addComponent(Cpf)
                            .addComponent(Data)
                            .addComponent(Duracao))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cxNome)
                            .addComponent(cxData)
                            .addComponent(cxDuracao))
                        .addContainerGap(204, Short.MAX_VALUE))
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
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txt1)
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Jogo)
                .addGap(53, 53, 53)
                .addComponent(cxSinuca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxTenisMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPebolim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxSinuca)
                    .addComponent(cxTenisMesa)
                    .addComponent(cxPebolim))
                .addGap(38, 38, 38)
                .addComponent(btReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimpar)
                        .addComponent(btSair))
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            excluirResSJ();
        } catch (CpfException e) {
         JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            alterarResSJ();
            limpar();
        } catch (CpfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            consResSJCpf();
        } catch (CpfException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed
        try {
        insResSJ();
        limpar();
    } catch (DuracaoException | CpfException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btReservarActionPerformed

    public void limpar(){
        cxCpf.setText("");
        cxNome.setText("");
        cxData.setText("");
        cxDuracao.setText("");
        cxCpf.requestFocus();
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "SAIR", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }
    
    public void alterarResSJ() throws CpfException{
        try {
        salaoJ = new SalaoJogos();
        salaoJ.setCpf(Integer.parseInt(cxCpf.getText()));
        salaoJ = sj.atualizaSJCpf(salaoJ);
        String cpfText = cxCpf.getText();
            if (!cpfText.matches("[0-9]+")) {
                throw new CpfException("CpfException -> O CPF deve conter apenas números.");
            }
        if (salaoJ != null) {
            cxCpf.setText(Integer.toString(salaoJ.getCpf()));
            cxNome.setText(salaoJ.getNome());
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
    
    public void insResSJ() throws CpfException, DuracaoException {
    salaoJ = new SalaoJogos();
    String cpfText = cxCpf.getText();
    try {
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoJ.setCpf(Integer.parseInt(cxCpf.getText()));
        salaoJ.setNome(cxNome.getText());
        salaoJ.setData(cxData.getText());
        int duracao = Integer.parseInt(cxDuracao.getText());
        if (duracao <= 0) {
            throw new DuracaoException("DuracaoException -> A duração não pode ser menor que ou igual a 0.");
        }
        salaoJ.setDuracao(duracao);
        if (cxSinuca.isSelected()) {
            salaoJ.setJogo("sinuca");
        } else if (cxTenisMesa.isSelected()) {
            salaoJ.setJogo("Tenis de Mesa");
        } else {
            salaoJ.setJogo("Pebolim");
        }
        salaoJ = sj.insSJ(salaoJ);
        if (salaoJ != null) {
            JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!", "RESERVA DO SALÃO DE JOGOS", 1);
        } else {
            JOptionPane.showMessageDialog(null, "CPF Duplicado!", "RESERVA DO SALÃO DE JOGOS", 0);
        }
    } catch (NumberFormatException e) {
        throw new DuracaoException("DuracaoException -> A duração deve ser um número inteiro.");
    } catch (DuracaoException e) {
        System.out.println("Erro na duração da reserva: " + e.getMessage());
        throw e;
    } catch (CpfException e) {
        System.out.println("Erro no CPF: " + e.getMessage());
        throw e;
    }
}

    public void excluirResSJ() throws CpfException{
        try {
        salaoJ = new SalaoJogos();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoJ.setCpf(Integer.parseInt(cpfText));
        salaoJ = sj.delSJCpf(salaoJ);
        if (salaoJ == null) {
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
    
    public void consResSJCpf() throws CpfException {
    try {
        salaoJ = new SalaoJogos();
        String cpfText = cxCpf.getText();
        if (!cpfText.matches("[0-9]+")) {
            throw new CpfException("CpfException -> O CPF deve conter apenas números.");
        }
        if (cpfText.length() != 11) {
            throw new CpfException("CpfException -> O CPF deve ter exatamente 11 dígitos.");
        }
        salaoJ.setCpf(Integer.parseInt(cxCpf.getText()));
        salaoJ = sj.consResSJ(salaoJ);
        if (salaoJ != null) {
            cxCpf.setText(Integer.toString(salaoJ.getCpf()));
            cxNome.setText(salaoJ.getNome());
            cxData.setText(salaoJ.getData());
            cxDuracao.setText(Integer.toString(salaoJ.getDuracao()));

            if (salaoJ.getJogo().equalsIgnoreCase("sinuca")) {
                cxSinuca.setSelected(true);
            } else if (salaoJ.getJogo().equalsIgnoreCase("Tenis de Mesa")) {
                cxTenisMesa.setSelected(true);
            } else {
                cxPebolim.setSelected(true);
            }
            JOptionPane.showMessageDialog(null, "Confira os Dados", "CONSULTA DE RESERVA", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Cpf inexistente", "CONSULTA DE RESERVA", 0);
        }
    } catch (NumberFormatException e) {
        throw new CpfException("CpfException -> O CPF deve ser um número inteiro.");
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
            java.util.logging.Logger.getLogger(ResSJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResSJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResSJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResSJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResSJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Duracao;
    private javax.swing.JLabel Jogo;
    private javax.swing.ButtonGroup JogosGroup;
    private javax.swing.JLabel Nome;
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
    private javax.swing.JRadioButton cxPebolim;
    private javax.swing.JRadioButton cxSinuca;
    private javax.swing.JRadioButton cxTenisMesa;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
