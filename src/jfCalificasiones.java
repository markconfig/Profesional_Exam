
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import utils.WindowsUtils;

public class jfCalificasiones extends javax.swing.JFrame {

    /**
     * Creates new form jfCalificasiones
     */
    public jfCalificasiones() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPeNoCo = new javax.swing.JLabel();
        lblPeApe = new javax.swing.JLabel();
        lblPeNom = new javax.swing.JLabel();
        btnGraficar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        lblHead = new javax.swing.JLabel();

        setTitle("Calificasiones");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(50, 161, 117));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre(s):");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Control:");

        lblPeNoCo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNoCo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNoCo.setText(" ");

        lblPeApe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeApe.setForeground(new java.awt.Color(255, 255, 255));
        lblPeApe.setText(" ");

        lblPeNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNom.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNom.setText(" ");

        btnGraficar.setBackground(new java.awt.Color(255, 255, 255));
        btnGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Grafica.png"))); // NOI18N
        btnGraficar.setText("Graficar");
        btnGraficar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnGraficar.setBorderPainted(false);
        btnGraficar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficar.setFocusPainted(false);
        btnGraficar.setOpaque(false);
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salvar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Printer (2).png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPeApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeNoCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeNom, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPeNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPeApe))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPeNoCo))
                .addGap(31, 31, 31)
                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 161, 117), 2, true));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PC.png"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PC.png"))); // NOI18N
        jPanel4.add(jLabel9);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PC.png"))); // NOI18N
        jPanel4.add(jLabel11);

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(500);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 790, 520));

        jPanel3.setBackground(new java.awt.Color(50, 161, 117));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 161, 117), 2));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(50, 161, 117));
        jButton4.setText("x");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 20, 20));

        lblHead.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setText("Tabla de calificaciones finales de ");
        jPanel3.add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 14));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        datos dat = new datos();
        lblPeNom.setText(dat.getNombre());

        lblPeApe.setText(dat.getApellido());

        lblPeNoCo.setText(dat.getNoControl());

        lblHead.setText("Calificaciones finales de: " + dat.getNombre() + " " + dat.getApellido());

        //DATOS DE LA CALIFICASION
        datos_evaluacion date = new datos_evaluacion();
        //I.setText(dateI.getInglesCal());

        /* datos_evaluacion date2 = new datos_evaluacion();
        MD.setText(date2.getMateCal());

        datos_evaluacion date3 = new datos_evaluacion();
        POO.setText(date3.getPOOCal());

        datos_evaluacion date4 = new datos_evaluacion();
        FI.setText(date4.getFisicaCal());

        datos_evaluacion date5 = new datos_evaluacion();
        Cal.setText(date5.getCalculoCal());
         */
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        //if(I.getText().trim().equals(""))
        //{
        model.addRow(new Object[]{
            "Inglés", date.getInglesCal(),});

        model.addRow(new Object[]{
            "Matemáticas Discretas", date.getMateCal(),});

        model.addRow(new Object[]{
            "Física", date.getFisicaCal(),});

        model.addRow(new Object[]{
            "Contabilidad", date.getContabilidadCal(),});

        model.addRow(new Object[]{
            "Cálculo Integral", date.getCalculoCal(),});

        model.addRow(new Object[]{
            "Admin. de los R. y F. Informática", date.getAdministracion(),});

        model.addRow(new Object[]{
            "Programación Orientada a Objetos", date.getPOOCal(),});
        //} 


    }//GEN-LAST:event_formWindowOpened

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        datos_evaluacion date = new datos_evaluacion();
        /*
        try {
            float Cal1 = Float.parseFloat(date.getInglesCal());
            float Cal2 = Float.parseFloat(date.getMateCal());
            float Cal3 = Float.parseFloat(date.getPOOCal());
            float Cal4 = Float.parseFloat(date.getFisicaCal());
            float Cal5 = Float.parseFloat(date.getCalculoCal());

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            dataset.addValue(Cal1, "CALIFICACION", "Inglés");
            dataset.addValue(Cal2, "CALIFICACION", "Matemáticas Discretas");
            dataset.addValue(Cal3, "CALIFICACION", "Programacion Orientada a objetos");
            dataset.addValue(Cal4, "CALIFICACION", "Física para Informática");
            dataset.addValue(Cal5, "CALIFICACION", "Cálculo Integral");

            JFreeChart chart = ChartFactory.createLineChart(
                    "Gráfica de calificaciones", // Titulo
                    "Materias", // Etiqueta de datos
                    "Calificaciones", // Etiqueta de valores
                    dataset, // Datos
                    PlotOrientation.VERTICAL, // orientacion
                    true, // Incluye leyenda
                    true, // Incluye tooltips
                    true // urls
            );

            //ChartFrame frame = new ChartFrame("Graficador", chart);
            //frame.pack();
            //frame.setVisible(true);
            ChartPanel Panel = new ChartPanel(chart);
            jPanel4.removeAll();
            jPanel4.add(Panel);
            jPanel4.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Para mostrar Gráficos debes de terminar cada una de las evaluaciones");
        }
         */
        if (date.getAdministracion().equals("") || date.getInglesCal().equals("") || date.getMateCal().equals("") || date.getPOOCal().equals("") || date.getFisicaCal().equals("") || date.getCalculoCal().equals("") || date.getCalculoCal().equals("")) {
            if (date.getInglesCal().equals("")) {
                date.setInglesCal("0");
            }
            if (date.getMateCal().equals("")) {
                date.setMateCal("0");
            }
            if (date.getPOOCal().equals("")) {
                date.setPOOCal("0");
            }
            if (date.getFisicaCal().equals("")) {
                date.setFisicaCal("0");
            }
            if (date.getCalculoCal().equals("")) {
                date.setCalculoCal("0");
            }
            if (date.getContabilidadCal().equals("")) {
                date.setContabilidadCal("0");

            }
            if (date.getAdministracion().equals("")) {
                date.setAdministracion("0");

            }

            float Cal1 = Float.parseFloat(date.getInglesCal());
            float Cal2 = Float.parseFloat(date.getMateCal());
            float Cal3 = Float.parseFloat(date.getPOOCal());
            float Cal4 = Float.parseFloat(date.getFisicaCal());
            float Cal5 = Float.parseFloat(date.getCalculoCal());
            float Cal6 = Float.parseFloat(date.getContabilidadCal());
            float Cal7 = Float.parseFloat(date.getAdministracion());

            JFreeChart Grafica;

            DefaultCategoryDataset Datos = new DefaultCategoryDataset();

            Datos.addValue(Cal1, "Inglés", "Inglés");
            Datos.addValue(Cal2, "Matemáticas Discretas", "Matemáticas Discretas");
            Datos.addValue(Cal3, "Programación Orientada a objetos", "Programación Orientada a objetos");
            Datos.addValue(Cal4, "Física para Informática", "Física para Informática");
            Datos.addValue(Cal5, "Cálculo Integral", "Cálculo Integral");
            Datos.addValue(Cal6, "Contabilidad", "Contabilidad");
            Datos.addValue(Cal7, "Admin. de los Re. y F. I.", "Admin. de los Re. y F. I.");

            Grafica = ChartFactory.createBarChart3D("GRÁFICA DE CALIFICACIONES",
                    "Mis materias",
                    "Rango de calificaciones",
                    Datos,
                    PlotOrientation.VERTICAL,
                    true, //Por colores
                    true, //Titulos de las graficas
                    true); // Las url de internet

            ChartPanel Panel = new ChartPanel(Grafica);
            jPanel4.removeAll();
            jPanel4.add(Panel);
            jPanel4.updateUI();

        } else {
            float Cal1 = Float.parseFloat(date.getInglesCal());
            float Cal2 = Float.parseFloat(date.getMateCal());
            float Cal3 = Float.parseFloat(date.getPOOCal());
            float Cal4 = Float.parseFloat(date.getFisicaCal());
            float Cal5 = Float.parseFloat(date.getCalculoCal());
            float Cal6 = Float.parseFloat(date.getContabilidadCal());
            float Cal7 = Float.parseFloat(date.getAdministracion());

            JFreeChart Grafica;

            DefaultCategoryDataset Datos = new DefaultCategoryDataset();

            Datos.addValue(Cal1, "Inglés", "Inglés");
            Datos.addValue(Cal2, "Matemáticas Discretas", "Matemáticas Discretas");
            Datos.addValue(Cal3, "Programación Orientada a objetos", "Programación Orientada a objetos");
            Datos.addValue(Cal4, "Física para Informática", "Física para Informática");
            Datos.addValue(Cal5, "Cálculo Integral", "Cálculo Integral");
            Datos.addValue(Cal6, "Contabilidad", "Contabilidad");
            Datos.addValue(Cal7, "Admin. de los Re. y F. I.", "Admin. de los Re. y F. I.");

            Grafica = ChartFactory.createBarChart3D("GRÁFICA DE CALIFICACIONES",
                    "Mis materias",
                    "Rango de calificaciones",
                    Datos,
                    PlotOrientation.VERTICAL,
                    true, //Por colores
                    true, //Titulos de las graficas
                    true); // Las url de internet

            ChartPanel Panel = new ChartPanel(Grafica);
            jPanel4.removeAll();
            jPanel4.add(Panel);
            jPanel4.updateUI();
            /* JFrame Ventana = new JFrame("GRAFICA DE RESULTADOS");
        Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ventana.add(Panel);
        Ventana.setSize(700,400);
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
             */

            //ChartFrame Ventana = new ChartFrame("MI GRAFICA DE RESULTADOS", Grafica);
            //Ventana.getContentPane().add(Panel);
            //Ventana.add(Panel);
            //Ventana.pack();
            //Ventana.setVisible(true);
            //Ventana.setDefaultCloseOperation(jdCal.EXIT_ON_CLOSE);
            //ChartPanel Panel = new ChartPanel(Grafica);
            //jPanel1.removeAll();
            //jPanel1.add(Panel);
            //jPanel1.validate();
        }
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        datos_evaluacion e = new datos_evaluacion();

        datos dat = new datos();
        //lblPeApe.setText(ape.getApellido());
        generarPDF pdf = new generarPDF();
        WindowsUtils wu = new WindowsUtils();
        String ruta = wu.getCurrentUserDesktopPath();
        String rutaEscritorio = ruta.replace('\\', '/');
        pdf.generarPDF("Evaluation",
                "Calificasiones de " + dat.getNombre() + " " + dat.getApellido() + "\n" + "Semestre: " + dat.getNoSemestre() + "   Grupo: " + dat.getItemGrupo() + "\n" + "\n" + "\n",
                "Inglés:                                      " + e.getInglesCal() + "\n"
                + "Matemáticas Discretas:                       " + e.getMateCal() + "\n"
                + "Física:                                      " + e.getFisicaCal() + "\n"
                + "Progrmación Orientada a Objetos:             " + e.getPOOCal() + "\n"
                + "Contabilidad:                                " + e.getContabilidadCal() + "\n"
                + "Admin. de los Re. y F. I.:                   " + e.getAdministracion() + "\n"
                + "Cálculo Integral:                            " + e.getCalculoCal() + "\n" + "\n" + "\n",
                "Sin otro particular y con la seguridad de seguir contando con su apoyo en el esfuerzo brindar una mejor educación, reciba un cordeal saludo.\n",
                "Evaluation version: 1.0. Prohibida su reproducción parcial o total. \n Todos los derechos reservados." + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n",
                "Firma y nombre del alumno" + "\n" + "_____________________________" + "\n" + dat.getNombre() + " " + dat.getApellido() + " " + dat.getNoControl(),
                "src/Images/PC.png",
                rutaEscritorio + "/" + dat.getNombre() + "_" + dat.getApellido() + "_" + dat.getNoControl() + ".pdf");

        JOptionPane.showMessageDialog(null, "¡Guardado!" + "\n" + rutaEscritorio + "/" + dat.getNombre() + "_" + dat.getApellido() + "_" + dat.getNoControl() + ".pdf" + "\n" + "(Escritorio)");
        btnImprimir.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        datos dat = new datos();
        Imprimir d = new Imprimir();
        WindowsUtils wu = new WindowsUtils();
        String ruta = wu.getCurrentUserDesktopPath();
        String rutaEscritorio = ruta.replace('\\', '/');
        d.Imprimir(rutaEscritorio + "/" + dat.getNombre() + "_" + dat.getApellido() + "_" + dat.getNoControl() + ".pdf");
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(jfCalificasiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCalificasiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCalificasiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCalificasiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCalificasiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblPeApe;
    private javax.swing.JLabel lblPeNoCo;
    private javax.swing.JLabel lblPeNom;
    // End of variables declaration//GEN-END:variables
}
