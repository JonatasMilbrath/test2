/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.tutorial.calculadora.View;

import br.com.tutorial.calculadora.Model.CalculadoraModel;

/**
 *
 * @author tacio_inxtpj9
 */
public class CalculadoraView extends javax.swing.JFrame {

    CalculadoraModel calculadora = new CalculadoraModel();
    boolean segundoValor = false;
    String operacao;

    public CalculadoraView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumero = new javax.swing.JLabel();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonSUM = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumero.setFont(new java.awt.Font("Nirmala UI", 1, 60)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 110));

        jButtonMultiplicacao.setContentAreaFilled(false);
        jButtonMultiplicacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, 80));

        jButtonClear.setContentAreaFilled(false);
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 80));

        jButtonPorcentagem.setContentAreaFilled(false);
        jButtonPorcentagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentagemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPorcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 80));

        jButtonSub.setContentAreaFilled(false);
        jButtonSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 90, 80));

        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, 80));

        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 80));

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 80, 80));

        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 80, 80));

        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, 80));

        jButtonSUM.setContentAreaFilled(false);
        jButtonSUM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 90, 80));

        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 80, 80));

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 80, 80));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 80));

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 80, 80));

        jButtonIgual.setContentAreaFilled(false);
        jButtonIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 90, 180));

        jButtonPonto.setContentAreaFilled(false);
        jButtonPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 80, 80));

        jButton0.setContentAreaFilled(false);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 90, 80));

        jButtonApagar.setContentAreaFilled(false);
        jButtonApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 80, 80));

        jButtonDivisao.setContentAreaFilled(false);
        jButtonDivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calculadora.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + ".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUMActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText("");
        operacao = "soma";
    }//GEN-LAST:event_jButtonSUMActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if (segundoValor == true) {
            calculadora.setValor2(Double.parseDouble(jLabelNumero.getText()));
            if (operacao == "soma") {
                calculadora.somar();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "subtracao") {
                calculadora.subtracao();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "multiplicacao") {
                calculadora.multiplicacao();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "divisao") {
                calculadora.divisao();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText("");
        operacao = "subtracao";
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText("");
        operacao = "multiplicacao";
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText("");
        operacao = "divisao";
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentagemActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        calculadora.setResultado(calculadora.getValor1() / 100);
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));

    }//GEN-LAST:event_jButtonPorcentagemActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        calculadora.setValor1(0);
        calculadora.setValor2(0);
        segundoValor = false;
        jLabelNumero.setText("");
        operacao = "";
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
       jLabelNumero.setText(jLabelNumero.getText().substring(0, jLabelNumero.getText().length() - 1)); 
    }//GEN-LAST:event_jButtonApagarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonSUM;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNumero;
    // End of variables declaration//GEN-END:variables
}
