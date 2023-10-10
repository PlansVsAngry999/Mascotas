package mascotas_00;
/**
 * Programa con interfaz que solicita el llenado de un checkbox para mostrar lo seleccionado en un label.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Frame_mascotas00 extends javax.swing.JFrame {

    public Frame_mascotas00() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chkPerro = new javax.swing.JCheckBox();
        chkGato = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        chkConejo = new javax.swing.JCheckBox();
        lblChk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 41, 62));

        chkPerro.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkPerro.setForeground(new java.awt.Color(220, 235, 253));
        chkPerro.setText("Perro");
        chkPerro.setHideActionText(true);
        chkPerro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkPerro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        chkGato.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkGato.setForeground(new java.awt.Color(220, 235, 253));
        chkGato.setText("Gato");
        chkGato.setHideActionText(true);
        chkGato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkGato.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnAceptar.setBackground(new java.awt.Color(23, 19, 26));
        btnAceptar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(220, 235, 253));
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        chkConejo.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkConejo.setForeground(new java.awt.Color(220, 235, 253));
        chkConejo.setText("Conejo");
        chkConejo.setHideActionText(true);
        chkConejo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkConejo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblChk.setBackground(new java.awt.Color(153, 124, 212));
        lblChk.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        lblChk.setForeground(new java.awt.Color(255, 255, 255));
        lblChk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(63, 55, 96), new java.awt.Color(71, 70, 105), new java.awt.Color(55, 44, 73), new java.awt.Color(38, 41, 62)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkConejo)
                            .addComponent(chkGato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPerro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(70, 70, 70)
                        .addComponent(btnAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblChk, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(chkPerro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkGato)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkConejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChk, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String mensaje = "El animal seleccionado fue un ";
        if(chkPerro.isSelected()){
            mensaje+="Perro.";
        }
        //Si el chkGato es seleccionado entonces, concatena en el mensaje el animal seleccionado.
        if(chkGato.isSelected()){
            mensaje+="Gato.";
        }
        if(chkConejo.isSelected()){
            mensaje+="Conejo.";
        }
        lblChk.setText(mensaje);
    }//GEN-LAST:event_btnAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_mascotas00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_mascotas00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_mascotas00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_mascotas00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_mascotas00().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox chkConejo;
    private javax.swing.JCheckBox chkGato;
    private javax.swing.JCheckBox chkPerro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChk;
    // End of variables declaration//GEN-END:variables
}
