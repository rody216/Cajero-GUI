

package Interfaces;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        
    }
    
     double saldo = 0;
     int retiro = 0;
     int consigna = 0;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsaldo = new javax.swing.JButton();
        btnretiro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDisplay = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        lblretiro = new javax.swing.JLabel();
        lblavance = new javax.swing.JLabel();
        lblconsignar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnavance = new javax.swing.JButton();
        btnconsigna = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnenter = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Operaciones = new javax.swing.JTabbedPane();
        Avance = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtreport = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtrate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblcuota = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        btncalcavance = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnavanceback = new javax.swing.JButton();
        Consignacion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnconsignaback = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblsaldoactual = new javax.swing.JLabel();
        btnconsultaback = new javax.swing.JButton();
        Retiro = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnretiroback = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnsaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lArrow.png"))); // NOI18N
        btnsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaldoActionPerformed(evt);
            }
        });

        btnretiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lArrow.png"))); // NOI18N
        btnretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnretiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnretiro))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblDisplay.setBackground(new java.awt.Color(0, 153, 153));
        lblDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblsaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsaldo.setText("Saldo");

        lblretiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblretiro.setText("Retiro");

        lblavance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblavance.setText("Avance");

        lblconsignar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblconsignar.setText("Consignacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ABC");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Banking of Colombia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblretiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblconsignar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblsaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblavance))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavance)
                    .addComponent(lblsaldo))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblconsignar)
                    .addComponent(lblretiro))
                .addGap(24, 24, 24))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnavance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rArrow.png"))); // NOI18N
        btnavance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavanceActionPerformed(evt);
            }
        });

        btnconsigna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rArrow.png"))); // NOI18N
        btnconsigna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsignaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnconsigna, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnavance, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnavance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnconsigna))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/one.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/two.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/three.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/four.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/five.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/six.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clear.png"))); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seven.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eight.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nine.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enter.png"))); // NOI18N
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empty.png"))); // NOI18N

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zero.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empty.png"))); // NOI18N

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empty.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenter, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setEnabled(false);

        Operaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtreport.setColumns(20);
        txtreport.setRows(5);
        jScrollPane1.setViewportView(txtreport);

        jLabel1.setText("Interés");

        jLabel2.setText("Años");

        jLabel3.setText("Monto");

        jLabel4.setText("Cuota");

        jLabel5.setText("Total");

        lblcuota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btncalcavance.setText("Calcular");
        btncalcavance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcavanceActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnprint.setText("Realizar");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnavanceback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnavanceback.setText("<<");
        btnavanceback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavancebackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AvanceLayout = new javax.swing.GroupLayout(Avance);
        Avance.setLayout(AvanceLayout);
        AvanceLayout.setHorizontalGroup(
            AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvanceLayout.createSequentialGroup()
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtrate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvanceLayout.createSequentialGroup()
                        .addComponent(btnavanceback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncalcavance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprint)
                        .addGap(92, 92, 92))))
        );
        AvanceLayout.setVerticalGroup(
            AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvanceLayout.createSequentialGroup()
                .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AvanceLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(lblcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(AvanceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(AvanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalcavance)
                    .addComponent(btnreset)
                    .addComponent(btnprint)
                    .addComponent(btnavanceback))
                .addContainerGap())
        );

        Operaciones.addTab("Avance", Avance);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ingrese el Monto a Consignar:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("El Monto Consignado fue:  $");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Su Nuevo Saldo es: $");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnconsignaback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnconsignaback.setText("<<");
        btnconsignaback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsignabackActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");

        javax.swing.GroupLayout ConsignacionLayout = new javax.swing.GroupLayout(Consignacion);
        Consignacion.setLayout(ConsignacionLayout);
        ConsignacionLayout.setHorizontalGroup(
            ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignacionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ConsignacionLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ConsignacionLayout.createSequentialGroup()
                            .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnconsignaback)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ConsignacionLayout.setVerticalGroup(
            ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignacionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsignacionLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel11))
                    .addGroup(ConsignacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ConsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnconsignaback)
                .addGap(23, 23, 23))
        );

        Operaciones.addTab("Consignacion", Consignacion);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Su Saldo Actual es:  $");

        lblsaldoactual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsaldoactual.setText("2500000");
        lblsaldoactual.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnconsultaback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnconsultaback.setText("<<");
        btnconsultaback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultabackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaLayout = new javax.swing.GroupLayout(Consulta);
        Consulta.setLayout(ConsultaLayout);
        ConsultaLayout.setHorizontalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnconsultaback)
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsaldoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8))
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblsaldoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnconsultaback)
                .addGap(29, 29, 29))
        );

        Operaciones.addTab("Consulta", Consulta);
        Consulta.getAccessibleContext().setAccessibleDescription("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Ingrese el Monto a Retirar:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("El monto Retirado fue: $");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Aceptar");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Su Nuevo Saldo es: $");

        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnretiroback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnretiroback.setText("<<");
        btnretiroback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretirobackActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("$");

        javax.swing.GroupLayout RetiroLayout = new javax.swing.GroupLayout(Retiro);
        Retiro.setLayout(RetiroLayout);
        RetiroLayout.setHorizontalGroup(
            RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetiroLayout.createSequentialGroup()
                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(RetiroLayout.createSequentialGroup()
                                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RetiroLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RetiroLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnretiroback)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RetiroLayout.setVerticalGroup(
            RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetiroLayout.createSequentialGroup()
                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel15))
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RetiroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnretiroback)
                .addContainerGap())
        );

        Operaciones.addTab("Retiro", Retiro);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Operaciones)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {                                      

        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Deseas Abandonar la Aplicación.", 
                "Sistema Gestión de Préstamos",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
        //---------------------------------------------------------------------
    }
    
    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {                                            
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }                                           

    private void txttimeKeyTyped(java.awt.event.KeyEvent evt) {                                           
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }            
    
    private void btnsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaldoActionPerformed
        //lblsaldoactual.setText(saldo);        
        Operaciones.setSelectedIndex(2);
        jPanel5.setVisible(true);
        //saldo = Double.toString(saldo);
        //saldo = String.format("$", saldo);
        //lblsaldoactual.setText(saldo);
        //lblsaldoactual.setText(saldo);
       //Double.parseDouble(lblsaldoactual.setText());
    }//GEN-LAST:event_btnsaldoActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String Enternumber = lblDisplay.getText() + "8";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String Enternumber = lblDisplay.getText() + "9";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn9ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       jPanel5.setVisible(false);
       btnsaldo.setEnabled(false);
       btnavance.setEnabled(false);
       btnretiro.setEnabled(false);
       btnconsigna.setEnabled(false);
       btncalcavance.setEnabled(false);
       btnreset.setEnabled(false);
       btnavanceback.setEnabled(false);
       btnprint.setEnabled(false);        
      
      
       jPanel2.setVisible(true);
       lblavance.setVisible(false);
       lblsaldo.setVisible(false);
       lblretiro.setVisible(false);
       lblconsignar.setVisible(false);
       
       //jlblDisplay.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //lblDisplay.setText("")  ;
        String Enternumber = lblDisplay.getText() + "1";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnavanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavanceActionPerformed
       Operaciones.setSelectedIndex(0);
       jPanel5.setVisible(true);
       Consulta.setVisible(false);
       Retiro.setVisible(false);
       Consignacion.setVisible(false);
       btncalcavance.setEnabled(true);
       btnreset.setEnabled(true);
       btnavanceback.setEnabled(true);
       btnprint.setEnabled(true);
    }//GEN-LAST:event_btnavanceActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String Enternumber = lblDisplay.getText() + "2";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String Enternumber = lblDisplay.getText() + "3";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       String Enternumber = lblDisplay.getText() + "4";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String Enternumber = lblDisplay.getText() + "5";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String Enternumber = lblDisplay.getText() + "6";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String Enternumber = lblDisplay.getText() + "7";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String Enternumber = lblDisplay.getText() + "0";
        lblDisplay.setText(Enternumber);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       lblDisplay.setText("");
       btncalcavance.setEnabled(false);
       btnreset.setEnabled(false);
       btnavanceback.setEnabled(false);
       btnprint.setEnabled(false);
       btnsaldo.setEnabled(false);
       btnavance.setEnabled(false);
       btnretiro.setEnabled(false);
       btnconsigna.setEnabled(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "¿Realmente deseas Salir?", 
                "ATM Systems",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncalcavanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcavanceActionPerformed
        double annualInterestRate = Double.parseDouble(txtrate.getText());
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfYears = Integer.parseInt(txttime.getText());
        double loanAmount = Double.parseDouble(txtcantidad.getText());
//---------------------------------------------------------------------
        double  monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1 /Math.pow(1 + 
        monthlyInterestRate, 
        numberOfYears * 12 ));
        String imonthlyPayment;
        imonthlyPayment = Double.toString(monthlyPayment);
        imonthlyPayment = String.format("$%.2f",monthlyPayment);
        lblcuota.setText(imonthlyPayment);
//---------------------------------------------------------------------
        double  totalPayment = monthlyPayment * numberOfYears * 12;
        String itotalPayment;
        itotalPayment = String.format("$%.2f",totalPayment);
        lbltotal.setText(itotalPayment);
    }                                        

    private void jLoanCalMouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (txtrate.equals("0"))
        {
            JOptionPane.showMessageDialog(null, "Debes Ingresar una Cantidad","Sistema de Avance",
                    JOptionPane.YES_NO_OPTION);
            
        }
       
    }//GEN-LAST:event_btncalcavanceActionPerformed

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
       int pin1 = Integer.parseInt(lblDisplay.getText());
       int pin2 = Integer.parseInt(lblDisplay.getText());
       int pin3 = Integer.parseInt(lblDisplay.getText());
      
        
       if (pin1 == 1234){
       saldo = 2000000;
       btnsaldo.setEnabled(true);
       btnavance.setEnabled(true);
       btnretiro.setEnabled(true);
       btnconsigna.setEnabled(true);
       jPanel2.setVisible(true);
       lblavance.setVisible(true);
       lblsaldo.setVisible(true);
       lblretiro.setVisible(true);
       lblconsignar.setVisible(true);
       lblDisplay.setText("");       
        }
       else if (pin2 == 2345){
       saldo = 5000000;       
       btnsaldo.setEnabled(true);
       btnavance.setEnabled(true);
       btnretiro.setEnabled(true);
       btnconsigna.setEnabled(true);
       jPanel2.setVisible(true);
       lblavance.setVisible(true);
       lblsaldo.setVisible(true);
       lblretiro.setVisible(true);
       lblconsignar.setVisible(true);
       lblDisplay.setText("");
        }
       else if (pin3 == 3456){
       saldo = 15000000;
       btnsaldo.setEnabled(true);
       btnavance.setEnabled(true);
       btnretiro.setEnabled(true);
       btnconsigna.setEnabled(true);
       jPanel2.setVisible(true);
       lblavance.setVisible(true);
       lblsaldo.setVisible(true);
       lblretiro.setVisible(true);
       lblconsignar.setVisible(true);
       lblDisplay.setText("");
        }
        else
        {
          lblDisplay.setText("Invalid")  ;
        }
       
     
                
    }//GEN-LAST:event_btnenterActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtrate.setText(null);
        txttime.setText(null);
        txtcantidad.setText(null);
        lblcuota.setText(null);
        lbltotal.setText(null);
        txtreport.setText(null);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
       String annualInterestRate = String.format(txtrate.getText());
        String numberOfYears = String.format(txttime.getText());
        String loanAmount = String.format(txtcantidad.getText());

        String  monthlyPayment  = String.format(lblcuota.getText());
        String  totalPayment  = String.format(lbltotal.getText());
        //========================================================================
        int refs= 1325 + (int) (Math.random()*4238);

        //========================================================================
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        Tdate.format(timer.getTime());

        //========================================================================jtxtReceipt
        txtreport.append("Sistema Gestión de Préstamo\n" +
            "Referencia:\t\t" + refs +
            "\n====================================== " +
            "\nInterés:\t\t " + annualInterestRate +
            "\nAños Diferido:\t\t "+ numberOfYears +
            "\nTotal Prestado:\t\t " + "$"+ loanAmount +
            "\nCuota Mensual:\t\t " + monthlyPayment +
            "\nTotal a Pagar:\t\t " + totalPayment +

            "\n====================================== " +
            "\nDate: " + Tdate.format(timer.getTime()) +
            "\tHora: " + tTime.format(timer.getTime()) +
            "\n\tGracias...\n" );
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnavancebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavancebackActionPerformed
                lblDisplay.setText(""); 
                //frame = new JFrame("Exit");
                //if (JOptionPane.showConfirmDialog(frame, "¿Realmente Deseas Salir?", 
                //"Sistema Gestión de Préstamo",
                //JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        //System.exit(0);
                jPanel5.setVisible(false);
        //}
    }//GEN-LAST:event_btnavancebackActionPerformed

    private void btnretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretiroActionPerformed
        Operaciones.setSelectedIndex(3);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_btnretiroActionPerformed

    private void btnconsignaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsignaActionPerformed
        Operaciones.setSelectedIndex(1);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_btnconsignaActionPerformed

    private void btnconsignabackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsignabackActionPerformed
                lblDisplay.setText(""); 
                //frame = new JFrame("Exit");
                //if (JOptionPane.showConfirmDialog(frame, "¿Realmente Deseas Salir?", 
                //"Sistema Gestión de Consignaciones",
                //JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
                    //System.exit(0);
                jPanel5.setVisible(false);
                //}
    }//GEN-LAST:event_btnconsignabackActionPerformed

    private void btnconsultabackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultabackActionPerformed
                lblDisplay.setText(""); 
                //frame = new JFrame("Exit");
                //if (JOptionPane.showConfirmDialog(frame, "¿Realmente Deseas Salir?", 
                //"Sistema Gestión de Consultas",
                //JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
                    //System.exit(0);
                jPanel5.setVisible(false);
                //}
    }//GEN-LAST:event_btnconsultabackActionPerformed

    private void btnretirobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretirobackActionPerformed
                lblDisplay.setText(""); 
                //frame = new JFrame("Exit");
                //if (JOptionPane.showConfirmDialog(frame, "¿Realmente Deseas Salir?", 
                //"Sistema Gestión de Retiros",
                //JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
                    //System.exit(0);
                jPanel5.setVisible(false);
               // }
    }//GEN-LAST:event_btnretirobackActionPerformed

    /*
    lblDisplay.setText(""); 
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "¿Realmente Deseas Salir?", 
                "Sistema Gestión de Préstamo",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        //System.exit(0);
                jPanel5.setVisible(false);*/
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Avance;
    private javax.swing.JPanel Consignacion;
    private javax.swing.JPanel Consulta;
    private javax.swing.JTabbedPane Operaciones;
    private javax.swing.JPanel Retiro;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnavance;
    private javax.swing.JButton btnavanceback;
    private javax.swing.JButton btncalcavance;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnconsigna;
    private javax.swing.JButton btnconsignaback;
    private javax.swing.JButton btnconsultaback;
    private javax.swing.JButton btnenter;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnretiro;
    private javax.swing.JButton btnretiroback;
    private javax.swing.JButton btnsaldo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblavance;
    private javax.swing.JLabel lblconsignar;
    private javax.swing.JLabel lblcuota;
    private javax.swing.JLabel lblretiro;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lblsaldoactual;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtrate;
    private javax.swing.JTextArea txtreport;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
