package visao;

import controle.Calculadora;
import controle.Formatador;
import controle.Operacoes;


public class Interface extends javax.swing.JFrame {
    
    private final Calculadora calculadora;
    private final Formatador formatador;
    private Operacoes ultimaOperacao;
    
    public Interface() {
        initComponents();
        calculadora = new Calculadora();
        formatador = new Formatador();
        ultimaOperacao = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btLimpeza = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfVisor = new javax.swing.JTextField();
        lbAux = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        bt7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);

        bt8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);

        bt9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);

        btSoma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSoma.setText("+");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });
        jPanel1.add(btSoma);

        bt4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);

        bt5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);

        bt6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);

        btSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSubtracao.setText("-");
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btSubtracao);

        bt1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);

        bt2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);

        bt3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);

        btMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMultiplicacao.setText("x");
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btMultiplicacao);

        bt0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);

        btLimpeza.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btLimpeza.setText("CE");
        btLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpezaActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpeza);

        btIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btIgual);

        btDivisao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btDivisao.setText("/");
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btDivisao);

        tfVisor.setEditable(false);
        tfVisor.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tfVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfVisor.setText("0");

        lbAux.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAux.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAux.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfVisor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbAux, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        digitarNoVisor(bt0.getText());
    }//GEN-LAST:event_bt0ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        digitarNoVisor(bt1.getText());
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        digitarNoVisor(bt2.getText());
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        digitarNoVisor(bt3.getText());
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        digitarNoVisor(bt4.getText());
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        digitarNoVisor(bt5.getText());
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        digitarNoVisor(bt6.getText());
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        digitarNoVisor(bt7.getText());
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        digitarNoVisor(bt8.getText());
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        digitarNoVisor(bt9.getText());
    }//GEN-LAST:event_bt9ActionPerformed

    private void btLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpezaActionPerformed
        limparVisor();
        limparLbAux();
        calculadora.zerar();
        ultimaOperacao = null;
    }//GEN-LAST:event_btLimpezaActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        if(ultimaOperacao != null && ultimaOperacao != Operacoes.SOMA){
            calculadora.realizarOperacao(ultimaOperacao, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else{
            calculadora.realizarOperacao(Operacoes.SOMA, formatador.converterStringParaInteiro(tfVisor.getText()));
        }
        digitarNaLbAux(formatador.converterInteiroParaString(calculadora.getTotal()), Operacoes.SOMA);
        ultimaOperacao = Operacoes.SOMA;
    }//GEN-LAST:event_btSomaActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        if(ultimaOperacao != null){
            calculadora.realizarOperacao(ultimaOperacao, formatador.converterStringParaInteiro(tfVisor.getText()));
            imprimirResultadoNoVisor(formatador.converterInteiroParaString(calculadora.getTotal()));
            limparLbAux();
            calculadora.zerar();
            ultimaOperacao = null;
        }
    }//GEN-LAST:event_btIgualActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
        if(ultimaOperacao == null){
            calculadora.realizarOperacao(Operacoes.SOMA, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else if(ultimaOperacao != Operacoes.SUBTRACAO){
            calculadora.realizarOperacao(ultimaOperacao, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else{
            calculadora.realizarOperacao(Operacoes.SUBTRACAO, formatador.converterStringParaInteiro(tfVisor.getText()));
        }
        digitarNaLbAux(formatador.converterInteiroParaString(calculadora.getTotal()), Operacoes.SUBTRACAO);
        ultimaOperacao = Operacoes.SUBTRACAO;
    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
        if(ultimaOperacao == null){
            calculadora.realizarOperacao(Operacoes.SOMA, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else if(ultimaOperacao != Operacoes.MULTIPLICACAO){
            calculadora.realizarOperacao(ultimaOperacao, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else{
            calculadora.realizarOperacao(Operacoes.MULTIPLICACAO, formatador.converterStringParaInteiro(tfVisor.getText()));
        }
        digitarNaLbAux(formatador.converterInteiroParaString(calculadora.getTotal()), Operacoes.MULTIPLICACAO);
        ultimaOperacao = Operacoes.MULTIPLICACAO;
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        if(ultimaOperacao == null){
            calculadora.realizarOperacao(Operacoes.SOMA, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else if(ultimaOperacao != Operacoes.DIVISAO){
            calculadora.realizarOperacao(ultimaOperacao, formatador.converterStringParaInteiro(tfVisor.getText()));
        } else{
            calculadora.realizarOperacao(Operacoes.DIVISAO, formatador.converterStringParaInteiro(tfVisor.getText()));
        }
        digitarNaLbAux(formatador.converterInteiroParaString(calculadora.getTotal()), Operacoes.DIVISAO);
        ultimaOperacao = Operacoes.DIVISAO;
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void digitarNoVisor(String caractere){
        if(tfVisor.getText().length() < 3){
            if(tfVisor.getText().equals("0"))
                tfVisor.setText(caractere);
            else
                tfVisor.setText(tfVisor.getText().concat(caractere));
        }
    }
    
    private void imprimirResultadoNoVisor(String resultado){
        tfVisor.setText(resultado);
    }
    
    private void digitarNaLbAux(String total, Operacoes operacao){
        String operador = "";
        switch(operacao){
            case SOMA:
                operador = " +";
                break;
            case SUBTRACAO:
                operador = " -";
                break;
            case MULTIPLICACAO:
                operador = " x";
                break;
            case DIVISAO:
                operador = " /";
                break;
        }
        lbAux.setText(total.concat(operador));
        limparVisor();
    }
    
    private void limparVisor(){
        tfVisor.setText("0");
    }
    
    private void limparLbAux(){
        lbAux.setText(" ");
    }
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLimpeza;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAux;
    private javax.swing.JTextField tfVisor;
    // End of variables declaration//GEN-END:variables
}
