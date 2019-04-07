
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jfIngles extends javax.swing.JFrame {

    int ResultadoI;
    float PromedioTotal;
    int Errores;

    /**
     * Creates new form jfIngles
     */
    public jfIngles() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/_0012_Books.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo1 = new javax.swing.ButtonGroup();
        btnGrupo2 = new javax.swing.ButtonGroup();
        btnGrupo3 = new javax.swing.ButtonGroup();
        btnGrupo4 = new javax.swing.ButtonGroup();
        btnGrupo5 = new javax.swing.ButtonGroup();
        btnGrupo6 = new javax.swing.ButtonGroup();
        btnGrupo7 = new javax.swing.ButtonGroup();
        btnGrupo8 = new javax.swing.ButtonGroup();
        btnGrupo9 = new javax.swing.ButtonGroup();
        btnGrupo10 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblPeNom = new javax.swing.JLabel();
        lblPeApe = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPeNoCo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radio4 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radio8 = new javax.swing.JRadioButton();
        radio7 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();
        radio5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radio9 = new javax.swing.JRadioButton();
        radio10 = new javax.swing.JRadioButton();
        radio11 = new javax.swing.JRadioButton();
        radio12 = new javax.swing.JRadioButton();
        radio16 = new javax.swing.JRadioButton();
        radio15 = new javax.swing.JRadioButton();
        radio14 = new javax.swing.JRadioButton();
        radio13 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radio20 = new javax.swing.JRadioButton();
        radio19 = new javax.swing.JRadioButton();
        radio18 = new javax.swing.JRadioButton();
        radio17 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        radio24 = new javax.swing.JRadioButton();
        radio23 = new javax.swing.JRadioButton();
        radio22 = new javax.swing.JRadioButton();
        radio21 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radio25 = new javax.swing.JRadioButton();
        radio26 = new javax.swing.JRadioButton();
        radio27 = new javax.swing.JRadioButton();
        radio28 = new javax.swing.JRadioButton();
        radio32 = new javax.swing.JRadioButton();
        radio31 = new javax.swing.JRadioButton();
        radio29 = new javax.swing.JRadioButton();
        radio30 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        radio36 = new javax.swing.JRadioButton();
        radio35 = new javax.swing.JRadioButton();
        radio34 = new javax.swing.JRadioButton();
        radio33 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        radio40 = new javax.swing.JRadioButton();
        radio39 = new javax.swing.JRadioButton();
        radio38 = new javax.swing.JRadioButton();
        radio37 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Inglés");
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(10, 160, 171));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 160, 171), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre(s):");

        lblPeNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNom.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNom.setText(" ");

        lblPeApe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeApe.setForeground(new java.awt.Color(255, 255, 255));
        lblPeApe.setText(" ");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellidos:");

        lblPeNoCo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPeNoCo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeNoCo.setText(" ");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No. Control:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Inglés II");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(463, 463, 463)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeNom, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeApe, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(87, 87, 87)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeNoCo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblPeNoCo))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblPeApe)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lblPeNom)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 160, 171), 2));

        radio4.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(radio4);
        radio4.setText("Few");

        radio3.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(radio3);
        radio3.setText("Some");

        radio2.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(radio2);
        radio2.setText("A little");

        radio1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(radio1);
        radio1.setText("Any");

        jLabel2.setText("1.- We have____pineapples and pears in the fridge.");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Choose the best responce.");

        radio8.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo2.add(radio8);
        radio8.setText("Me");

        radio7.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo2.add(radio7);
        radio7.setText("My");

        radio6.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo2.add(radio6);
        radio6.setText("Mine");

        radio5.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo2.add(radio5);
        radio5.setText("I");

        jLabel3.setText("2.- Don´t blame ____ for what happened yesterday.");

        jLabel4.setText("3.- Did he tell you____name?");

        radio9.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo3.add(radio9);
        radio9.setText("His");

        radio10.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo3.add(radio10);
        radio10.setText("Him");

        radio11.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo3.add(radio11);
        radio11.setText("You");

        radio12.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo3.add(radio12);
        radio12.setText("Us");

        radio16.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo4.add(radio16);
        radio16.setText("Him");

        radio15.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo4.add(radio15);
        radio15.setText("It");

        radio14.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo4.add(radio14);
        radio14.setText("Me");

        radio13.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo4.add(radio13);
        radio13.setText("Your");

        jLabel5.setText("4.- Mary close _____ windows because it was raining.");

        radio20.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo5.add(radio20);
        radio20.setText("me");

        radio19.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo5.add(radio19);
        radio19.setText("Theirs");

        radio18.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo5.add(radio18);
        radio18.setText("Their");

        radio17.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo5.add(radio17);
        radio17.setText("Them");

        jLabel6.setText("5.- The kids asked ____ parents a question.");

        radio24.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo6.add(radio24);
        radio24.setText("Food ");

        radio23.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo6.add(radio23);
        radio23.setText("Woman");

        radio22.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo6.add(radio22);
        radio22.setText("Pineapples");

        radio21.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo6.add(radio21);
        radio21.setText("International driver´s license ");

        jLabel7.setText("6.- You need an ___ to drive a car in a foreign country");

        jLabel8.setText("7.- In some countries you need a ___ to enter.");

        radio25.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo7.add(radio25);
        radio25.setText("Drink");

        radio26.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo7.add(radio26);
        radio26.setText("Visa");

        radio27.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo7.add(radio27);
        radio27.setText("Airline ticket");

        radio28.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo7.add(radio28);
        radio28.setText("Mexican food ");

        radio32.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo8.add(radio32);
        radio32.setText("Passport");

        radio31.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo8.add(radio31);
        radio31.setText("Rock´s group");

        radio29.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo8.add(radio29);
        radio29.setText("Church");

        radio30.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo8.add(radio30);
        radio30.setText("She");

        jLabel9.setText("8.- Your___ is your photo ID in any foreign country.");

        radio36.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo9.add(radio36);
        radio36.setText("Direction");

        radio35.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo9.add(radio35);
        radio35.setText("Travel insurance");

        radio34.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo9.add(radio34);
        radio34.setText("Medical");

        radio33.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo9.add(radio33);
        radio33.setText("Jeans");

        jLabel10.setText("9.- It´s a good idea to buy ____. Medical bills are expensive");

        radio40.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo10.add(radio40);
        radio40.setText("Beans");

        radio39.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo10.add(radio39);
        radio39.setText("Be");

        radio38.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo10.add(radio38);
        radio38.setText("Do");

        radio37.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo10.add(radio37);
        radio37.setText("Does");

        jLabel11.setText("10.- ____ you like smook?");

        btnFinalizar.setBackground(new java.awt.Color(10, 160, 171));
        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setBorder(null);
        txtResultado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtResultadoCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio5)
                            .addComponent(radio6)
                            .addComponent(radio7)
                            .addComponent(radio1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio8)
                                    .addComponent(jLabel3)
                                    .addComponent(radio4)
                                    .addComponent(radio3)
                                    .addComponent(radio2)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio16)
                                    .addComponent(jLabel5)
                                    .addComponent(radio13)
                                    .addComponent(radio14)
                                    .addComponent(radio15))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio28)
                                    .addComponent(jLabel8)
                                    .addComponent(radio25)
                                    .addComponent(radio26)
                                    .addComponent(radio27))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio40)
                                            .addComponent(radio37)
                                            .addComponent(radio38)
                                            .addComponent(radio39))
                                        .addGap(69, 69, 69))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio20)
                                            .addComponent(jLabel6)
                                            .addComponent(radio19))
                                        .addGap(79, 79, 79))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(radio18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radio17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio32)
                                    .addComponent(jLabel9)
                                    .addComponent(radio29)
                                    .addComponent(radio30)
                                    .addComponent(radio31))))
                        .addGap(652, 652, 652))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio12)
                                    .addComponent(jLabel4)
                                    .addComponent(radio9)
                                    .addComponent(radio11)
                                    .addComponent(radio10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio21)
                                    .addComponent(jLabel7)
                                    .addComponent(radio22)
                                    .addComponent(radio23)
                                    .addComponent(radio24))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio33, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio34, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio35, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio36, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(115, 115, 115)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFinalizar)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(radio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio2))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio4)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(radio5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(radio13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio16))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(radio25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio28))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(radio37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio40)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(radio29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio32))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(radio17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio20)))))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(radio21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radio9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radio33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio36))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFinalizar)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(10, 160, 171));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu2.setText("Ayuda");

        jMenuItem2.setText("Instrucciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1241, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo para sacar una calificasion guardada en una variable en la clase "Datos evaluacion"
    private void sacarCalificasion() {

        datos_evaluacion datSacarCal = new datos_evaluacion();
        JOptionPane.showMessageDialog(null, "Tu porcentaje es de: " + datSacarCal.getInglesCal());

    }
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
float R1I = 0, R2I = 0, R3I = 0, R4I = 0, R5I = 0, R6I = 0, R7I = 0, R8I = 0, R9I = 0, R10I = 0;
        int Err1 = 0, Err2 = 0, Err3 = 0, Err4 = 0, Err5 = 0, Err6 = 0, Err7 = 0, Err8 = 0, Err9 = 0, Err10 = 0;
        //Pregunta 1
        if (radio3.isSelected() == true) {
            R1I = 1;
        } else {
            R1I = 0;
            Err1 = 1;
        }
        //pregunta 2
        if (radio8.isSelected() == true) {
            R2I = 1;
        } else {
            R2I = 0;
            Err2 = 1;
        }
        //pregunta 3
        if (radio9.isSelected() == true) {
            R3I = 1;
        } else {
            R3I = 0;
            Err3 = 1;
        }
        //pregunta 4
        if (radio13.isSelected() == true) {
            R4I = 1;
        } else {
            R4I = 0;
            Err4 = 1;
        }
        //pregunta5
        if (radio18.isSelected() == true) {
            R5I = 1;
        } else {
            R5I = 0;
            Err5 = 1;
        }
        //prefunta6
        if (radio21.isSelected() == true) {
            R6I = 1;
        } else {
            R6I = 0;
            Err6 = 1;
        }
        //pregunta7
        if (radio26.isSelected() == true) {
            R7I = 1;
        } else {
            R7I = 0;
            Err7 = 1;
        }
        //pregunta8
        if (radio32.isSelected() == true) {
            R8I = 1;
        } else {
            R8I = 0;
            Err8 = 1;
        }
        //pregunta9
        if (radio35.isSelected() == true) {
            R9I = 1;
        } else {
            R9I = 0;
            Err9 = 1;
        }
        //pregunta10
        if (radio38.isSelected() == true) {
            R10I = 1;
        } else {
            R10I = 0;
            Err10 = 1;
        }

        ResultadoI = (int) ((R1I + R2I + R3I + R4I + R5I + R6I + R7I + R8I + R9I + R10I) * 100) / 10;
        Errores = (Err1 + Err2 + Err3 + Err4 + Err5 + Err6 + Err7 + Err8 + Err9 + Err10);
        this.txtResultado.setText(String.valueOf(ResultadoI));

        sacarCalificasion();
        // JOptionPane.showMessageDialog(this,", tu calificasion es de: " + ResultadoI +  "\n" + "Tuviste: "+ Errores +" errores" ,"Informacion", JOptionPane.INFORMATION_MESSAGE); 

        this.hide();
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        datos dat = new datos();
        lblPeNom.setText(dat.getNombre());

        datos ape = new datos();
        lblPeApe.setText(ape.getApellido());

        datos noCo = new datos();
        lblPeNoCo.setText(noCo.getNoControl());
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "A continución, tienes que seleccionar la respuesta correcta.\n" + "Para terminar da click en el botón Finalizar\n" + "Éxito", "Intrucciones", JOptionPane.INFORMATION_MESSAGE); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtResultadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtResultadoCaretUpdate
        datos_evaluacion dat = new datos_evaluacion();
        dat.setInglesCal(txtResultado.getText());
    }//GEN-LAST:event_txtResultadoCaretUpdate

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
            java.util.logging.Logger.getLogger(jfIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup btnGrupo1;
    private javax.swing.ButtonGroup btnGrupo10;
    private javax.swing.ButtonGroup btnGrupo2;
    private javax.swing.ButtonGroup btnGrupo3;
    private javax.swing.ButtonGroup btnGrupo4;
    private javax.swing.ButtonGroup btnGrupo5;
    private javax.swing.ButtonGroup btnGrupo6;
    private javax.swing.ButtonGroup btnGrupo7;
    private javax.swing.ButtonGroup btnGrupo8;
    private javax.swing.ButtonGroup btnGrupo9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPeApe;
    private javax.swing.JLabel lblPeNoCo;
    private javax.swing.JLabel lblPeNom;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio10;
    private javax.swing.JRadioButton radio11;
    private javax.swing.JRadioButton radio12;
    private javax.swing.JRadioButton radio13;
    private javax.swing.JRadioButton radio14;
    private javax.swing.JRadioButton radio15;
    private javax.swing.JRadioButton radio16;
    private javax.swing.JRadioButton radio17;
    private javax.swing.JRadioButton radio18;
    private javax.swing.JRadioButton radio19;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio20;
    private javax.swing.JRadioButton radio21;
    private javax.swing.JRadioButton radio22;
    private javax.swing.JRadioButton radio23;
    private javax.swing.JRadioButton radio24;
    private javax.swing.JRadioButton radio25;
    private javax.swing.JRadioButton radio26;
    private javax.swing.JRadioButton radio27;
    private javax.swing.JRadioButton radio28;
    private javax.swing.JRadioButton radio29;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio30;
    private javax.swing.JRadioButton radio31;
    private javax.swing.JRadioButton radio32;
    private javax.swing.JRadioButton radio33;
    private javax.swing.JRadioButton radio34;
    private javax.swing.JRadioButton radio35;
    private javax.swing.JRadioButton radio36;
    private javax.swing.JRadioButton radio37;
    private javax.swing.JRadioButton radio38;
    private javax.swing.JRadioButton radio39;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio40;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    private javax.swing.JRadioButton radio7;
    private javax.swing.JRadioButton radio8;
    private javax.swing.JRadioButton radio9;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
