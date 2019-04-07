
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class jfAdministracion extends javax.swing.JFrame {

    /**
     * Creates new form jfPOO
     */
    public jfAdministracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblPregunta.setText(p.getPreguntaA(posicion));
        String[] a = r.setRespuestasA(posicion);
        buttonGroup1.clearSelection();
        no1.setText(a[0]);
        no2.setText(a[1]);
        no3.setText(a[2]);
        no1.requestFocus();
        atras.setEnabled(false);
        finalizar.setEnabled(false);
    }
    int posicion = 0;
    respuestasA r = new respuestasA();
    preguntasA p = new preguntasA();
    Object[] select = {"", "", "", "", "", "", "", "", "", ""};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        no1 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JRadioButton();
        finalizar = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        txtResultadoAdmi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblPregunta = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPeNom = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPeApe = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPeNoCo = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201, 53, 46), 2));
        jPanel1.setName("Examen"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Elije la mejor respuesta.");

        no1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(no1);
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        no2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(no2);
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        no3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(no3);
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });

        finalizar.setBackground(new java.awt.Color(255, 255, 255));
        finalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 255, 255));
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calificar.png"))); // NOI18N
        finalizar.setBorder(null);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        adelante.setBackground(new java.awt.Color(201, 53, 46));
        adelante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adelante.setForeground(new java.awt.Color(255, 255, 255));
        adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adelante.png"))); // NOI18N
        adelante.setBorder(null);
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });

        atras.setBackground(new java.awt.Color(201, 53, 46));
        atras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Atras.png"))); // NOI18N
        atras.setBorder(null);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        txtResultadoAdmi.setEditable(false);
        txtResultadoAdmi.setBackground(new java.awt.Color(255, 255, 255));
        txtResultadoAdmi.setForeground(new java.awt.Color(255, 255, 255));
        txtResultadoAdmi.setText("0");
        txtResultadoAdmi.setBorder(null);
        txtResultadoAdmi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtResultadoAdmiCaretUpdate(evt);
            }
        });

        lblPregunta.setEditable(false);
        lblPregunta.setColumns(20);
        lblPregunta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPregunta.setRows(4);
        jScrollPane1.setViewportView(lblPregunta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtResultadoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adelante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(no3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(no2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(no1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(no2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(no3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(149, 149, 149)
                        .addComponent(finalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResultadoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(201, 53, 46));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración de los Recursos y Función Informática");

        lblPeNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNom.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNom.setText(" ");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre(s):");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellidos:");

        lblPeApe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeApe.setForeground(new java.awt.Color(255, 255, 255));
        lblPeApe.setText(" ");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No. Control:");

        lblPeNoCo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNoCo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNoCo.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeNom, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeApe, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeNoCo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblPeNoCo))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblPeApe))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lblPeNom)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void sacarCalificasion() {

        datos_evaluacion datSacarCal = new datos_evaluacion();
        JOptionPane.showMessageDialog(null, "¡Hecho!" + "\n" + "Calificasión: " + datSacarCal.getAdministracion());

    }
    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        select[posicion] = no1.getLabel();
    }//GEN-LAST:event_no1ActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        select[posicion] = no2.getLabel();
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        select[posicion] = no3.getLabel();
    }//GEN-LAST:event_no3ActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed

        int calificacion = 0;

        for (int i = 0; i < 10; i++) {
            if (select[i].equals(r.getRespuestaA(i))) {
                calificacion = calificacion + 1;
            }
        }

        calificacion = calificacion * 10;

        //JOptionPane.showMessageDialog(null, "Tu calificacion es: " +  calificacion);
        this.txtResultadoAdmi.setText(String.valueOf(calificacion));

        //Muestra calificasion obtenida sustrayendo el varlo de la variable en la clase 
        sacarCalificasion();

        this.hide();

    }//GEN-LAST:event_finalizarActionPerformed

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed

        if (posicion == 8) {
            adelante.setEnabled(false);
            finalizar.setEnabled(true);
        }

        if (posicion < 10) {
            atras.setEnabled(true);
            posicion++;
            lblPregunta.setText(p.getPreguntaA(posicion));
            String[] a = r.setRespuestasA(posicion);
            buttonGroup1.clearSelection(); 
            no1.setText(a[0]);
            no2.setText(a[1]);
            no3.setText(a[2]);
            no1.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_adelanteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        if (posicion == 0) {
            atras.setEnabled(false);
        }

        if (posicion > -1) {
            posicion--;
            adelante.setEnabled(true);
            lblPregunta.setText(p.getPreguntaA(posicion));
            String[] a = r.setRespuestasA(posicion);
            buttonGroup1.clearSelection(); 
            no1.setText(a[0]);
            no2.setText(a[1]);
            no3.setText(a[2]);
            no1.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_atrasActionPerformed

    private void txtResultadoAdmiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtResultadoAdmiCaretUpdate
        datos_evaluacion datEva = new datos_evaluacion();
        datEva.setAdministracion(txtResultadoAdmi.getText().trim());
    }//GEN-LAST:event_txtResultadoAdmiCaretUpdate

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        datos dat = new datos();
        lblPeNom.setText(dat.getNombre());
        lblPeApe.setText(dat.getApellido());
        lblPeNoCo.setText(dat.getNoControl());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(jfAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPeApe;
    private javax.swing.JLabel lblPeNoCo;
    private javax.swing.JLabel lblPeNom;
    private javax.swing.JTextArea lblPregunta;
    private javax.swing.JRadioButton no1;
    private javax.swing.JRadioButton no2;
    private javax.swing.JRadioButton no3;
    private javax.swing.JTextField txtResultadoAdmi;
    // End of variables declaration//GEN-END:variables
}
