/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;
 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author Tiago
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        Locale locale = new Locale("pt","BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' são 'HH':'mm''",locale);
        lblHora.setText("Hoje é "+formatador.format(calendar.getTime()));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Equacao = new javax.swing.JButton();
        Triangulo = new javax.swing.JButton();
        Circunferencia = new javax.swing.JButton();
        Quadrado = new javax.swing.JButton();
        Trapezio = new javax.swing.JButton();
        Hipotenusa = new javax.swing.JButton();
        Calculadora = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Matemáticos");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(600, 418));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 580));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CÁLCULOS MATEMÁTICOS");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculos/foto-matematica.jpg"))); // NOI18N

        Equacao.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Equacao.setText("EQUAÇÃO 2º GRAU");
        Equacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Equacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquacaoActionPerformed(evt);
            }
        });

        Triangulo.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Triangulo.setText("ÁREA DO TRIÂNGULO");
        Triangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrianguloActionPerformed(evt);
            }
        });

        Circunferencia.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Circunferencia.setText("ÁREA DA CIRCUNFERÊNCIA");
        Circunferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Circunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircunferenciaActionPerformed(evt);
            }
        });

        Quadrado.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Quadrado.setText("ÁREA DO QUADRADO");
        Quadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuadradoActionPerformed(evt);
            }
        });

        Trapezio.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Trapezio.setText("ÁREA DO TRAPÉZIO");
        Trapezio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Trapezio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapezioActionPerformed(evt);
            }
        });

        Hipotenusa.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Hipotenusa.setText("HIPOTENUSA");
        Hipotenusa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HipotenusaActionPerformed(evt);
            }
        });

        Calculadora.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Calculadora.setText("CALCULADORA");
        Calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        Sair.setText("SAIR");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Trapezio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Circunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Hipotenusa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Equacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Circunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Trapezio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Desenvolvido por Mila e Tiago");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Como projeto da disciplina de Desenvolvimento de Software I");

        lblHora.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblHora.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblHora))
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(616, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TrapezioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapezioActionPerformed
        // TODO add your handling code here:
        new Trapezio().setVisible(true);
    }//GEN-LAST:event_TrapezioActionPerformed

    private void EquacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquacaoActionPerformed
        // TODO add your handling code here:
        new Equacao().setVisible(true);
    }//GEN-LAST:event_EquacaoActionPerformed

    private void TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrianguloActionPerformed
        // TODO add your handling code here:
        new Triangulo().setVisible(true);
    }//GEN-LAST:event_TrianguloActionPerformed

    private void CircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircunferenciaActionPerformed
        // TODO add your handling code here:
        new Circunferencia().setVisible(true);
        
    }//GEN-LAST:event_CircunferenciaActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void QuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadradoActionPerformed
        // TODO add your handling code here:
        new Quadrado().setVisible(true);
    }//GEN-LAST:event_QuadradoActionPerformed

    private void HipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HipotenusaActionPerformed
        // TODO add your handling code here:
        new Hipot().setVisible(true);
    }//GEN-LAST:event_HipotenusaActionPerformed

    private void CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraActionPerformed
        // TODO add your handling code here:
        new Calculadora().setVisible(true);
    }//GEN-LAST:event_CalculadoraActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);                         
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculadora;
    private javax.swing.JButton Circunferencia;
    private javax.swing.JButton Equacao;
    private javax.swing.JButton Hipotenusa;
    private javax.swing.JButton Quadrado;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Trapezio;
    private javax.swing.JButton Triangulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}