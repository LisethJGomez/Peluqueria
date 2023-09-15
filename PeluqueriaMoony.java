package Peluqueria;

import javax.swing.JOptionPane;

public class PeluqueriaMoony extends javax.swing.JFrame {

    int precioana = 0;
    int cantidadana = 0;
    int precioTotalana = 0;
    int precioCorteCaballeroAna = 0;
    int precioCorteDamaAna = 0;
    int precioTinturaAna = 0;
    int precioPeinadoAna = 0;
    int preciojose = 0;
    int precioCorteCaballeroJose = 0;
    int precioCorteDamaJose = 0;
    int precioTinturaJose = 0;
    int precioPeinadoJose = 0;
    int cantidadjose = 0;
    int precioTotaljose = 0;
    int precioCortejose = 0;

    int precioSara = 0;
    int cantidadSara = 0;
    int precioTotalSara = 0;
    int precioCorteCaballeroSara = 0;
    int precioCorteDamaSara = 0;
    int precioTinturaSara = 0;
    int precioPeinadoSara = 0;

    int precioRoberto = 0;
    int cantidadRoberto = 0;
    int precioTotalRoberto = 0;
    int precioCorteCaballeroRoberto = 0;
    int precioCorteDamaRoberto = 0;
    int precioTinturaRoberto = 0;
    int precioPeinadoRoberto = 0;
    Registro re = new Registro();

    public PeluqueriaMoony() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelCorteCaballeroAna = new javax.swing.JLabel();
        LabelCorteDamaAna = new javax.swing.JLabel();
        LabelTinturaAna = new javax.swing.JLabel();
        LabelPeinadoAna = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelTotalRecaudoAna = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        LabelCorteCaballeroSara = new javax.swing.JLabel();
        LabelCorteDamaSara = new javax.swing.JLabel();
        LabelTinturaSara = new javax.swing.JLabel();
        LabelPeinadoSara = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        LabelTotalRecaudoSara = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        LabelCorteCaballeroRoberto = new javax.swing.JLabel();
        LabelCorteDamaRoberto = new javax.swing.JLabel();
        LabelTinturaRoberto = new javax.swing.JLabel();
        LabelPeinadoRoberto = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LabelTotalRecaudoRoberto = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LabelCorteCaballeroJose = new javax.swing.JLabel();
        LabelCorteDamaJose = new javax.swing.JLabel();
        LabelTinturaJose = new javax.swing.JLabel();
        LabelPeinadoJose = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabelTotalRecaudoJose = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotonJose = new javax.swing.JButton();
        BotonRoberto = new javax.swing.JButton();
        BotonSara = new javax.swing.JButton();
        BotonAna = new javax.swing.JButton();
        BotonIniciarDia = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonVerTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PELUQUERIA MOONY");

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Peluqueria/Ana.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        LabelCorteCaballeroAna.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteCaballeroAna.setText("Corte caballero:   0   $0.00");

        LabelCorteDamaAna.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteDamaAna.setText("Corte dama:        0   $0.00");

        LabelTinturaAna.setForeground(new java.awt.Color(255, 255, 255));
        LabelTinturaAna.setText("Tintura cabello:    0   $0.00");

        LabelPeinadoAna.setForeground(new java.awt.Color(255, 255, 255));
        LabelPeinadoAna.setText("Peinado:              0   $0.00");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total servicios:     0");

        LabelTotalRecaudoAna.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotalRecaudoAna.setText("Total recaudado:  $0.00");

        jLabel9.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCorteCaballeroAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCorteDamaAna)
                            .addComponent(LabelTinturaAna)
                            .addComponent(LabelPeinadoAna)
                            .addComponent(jLabel7)
                            .addComponent(LabelTotalRecaudoAna))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelCorteCaballeroAna)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCorteDamaAna)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTinturaAna)
                        .addGap(18, 18, 18)
                        .addComponent(LabelPeinadoAna)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTotalRecaudoAna))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Peluqueria/Sara.jpg"))); // NOI18N
        jLabel26.setText("jLabel2");

        LabelCorteCaballeroSara.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteCaballeroSara.setText("Corte caballero:   0   $0.00");

        LabelCorteDamaSara.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteDamaSara.setText("Corte dama:        0   $0.00");

        LabelTinturaSara.setForeground(new java.awt.Color(255, 255, 255));
        LabelTinturaSara.setText("Tintura cabello:    0   $0.00");

        LabelPeinadoSara.setForeground(new java.awt.Color(255, 255, 255));
        LabelPeinadoSara.setText("Peinado:              0   $0.00");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Total servicios:     0");

        LabelTotalRecaudoSara.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotalRecaudoSara.setText("Total recaudado:  $0.00");

        jLabel33.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("SARA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCorteCaballeroSara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCorteDamaSara)
                            .addComponent(LabelTinturaSara)
                            .addComponent(LabelPeinadoSara)
                            .addComponent(jLabel31)
                            .addComponent(LabelTotalRecaudoSara))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LabelCorteCaballeroSara)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCorteDamaSara)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTinturaSara)
                        .addGap(18, 18, 18)
                        .addComponent(LabelPeinadoSara)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTotalRecaudoSara))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Peluqueria/Roberto.jpg"))); // NOI18N
        jLabel18.setText("jLabel2");

        LabelCorteCaballeroRoberto.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteCaballeroRoberto.setText("Corte caballero:     0  $0.00");

        LabelCorteDamaRoberto.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteDamaRoberto.setText("Corte dama:          0  $0.00");

        LabelTinturaRoberto.setForeground(new java.awt.Color(255, 255, 255));
        LabelTinturaRoberto.setText("Tintura caballo:      0  $0.00");

        LabelPeinadoRoberto.setForeground(new java.awt.Color(255, 255, 255));
        LabelPeinadoRoberto.setText("Peinado:                0  $0.00");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Total servicios:       0");

        LabelTotalRecaudoRoberto.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotalRecaudoRoberto.setText("Total recaudado:    $0.00");

        jLabel25.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ROBERTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCorteCaballeroRoberto)
                            .addComponent(LabelCorteDamaRoberto)
                            .addComponent(LabelTinturaRoberto)
                            .addComponent(LabelPeinadoRoberto)
                            .addComponent(jLabel23)
                            .addComponent(LabelTotalRecaudoRoberto)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel25)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelCorteCaballeroRoberto)
                .addGap(18, 18, 18)
                .addComponent(LabelCorteDamaRoberto)
                .addGap(18, 18, 18)
                .addComponent(LabelTinturaRoberto)
                .addGap(18, 18, 18)
                .addComponent(LabelPeinadoRoberto)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(LabelTotalRecaudoRoberto))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Peluqueria/Jose.jpg"))); // NOI18N
        jLabel10.setText("jLabel2");

        LabelCorteCaballeroJose.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteCaballeroJose.setText("Corte caballero:   0    $0.00");

        LabelCorteDamaJose.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorteDamaJose.setText("Corte dama:        0    $0.00");

        LabelTinturaJose.setForeground(new java.awt.Color(255, 255, 255));
        LabelTinturaJose.setText("Tintura cabello:    0   $0.00");

        LabelPeinadoJose.setForeground(new java.awt.Color(255, 255, 255));
        LabelPeinadoJose.setText("Peinado:              0   $0.00");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total servicios:     0");

        LabelTotalRecaudoJose.setForeground(new java.awt.Color(255, 255, 255));
        LabelTotalRecaudoJose.setText("Total recaudado:  $0.00");

        jLabel17.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("JOSE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCorteCaballeroJose)
                    .addComponent(LabelCorteDamaJose)
                    .addComponent(LabelTinturaJose)
                    .addComponent(LabelPeinadoJose)
                    .addComponent(jLabel15)
                    .addComponent(LabelTotalRecaudoJose))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(LabelCorteCaballeroJose)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCorteDamaJose)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTinturaJose)
                        .addGap(18, 18, 18)
                        .addComponent(LabelPeinadoJose)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(16, 16, 16)
                        .addComponent(LabelTotalRecaudoJose))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonJose.setBackground(new java.awt.Color(153, 153, 255));
        BotonJose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonJose.setText("Registro Jose");
        BotonJose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJoseActionPerformed(evt);
            }
        });

        BotonRoberto.setBackground(new java.awt.Color(153, 153, 255));
        BotonRoberto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonRoberto.setText("Registro Roberto");
        BotonRoberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRobertoActionPerformed(evt);
            }
        });

        BotonSara.setBackground(new java.awt.Color(153, 153, 255));
        BotonSara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonSara.setText("Registro Sara");
        BotonSara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSaraActionPerformed(evt);
            }
        });

        BotonAna.setBackground(new java.awt.Color(153, 153, 255));
        BotonAna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAna.setText("Registro Ana");
        BotonAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnaActionPerformed(evt);
            }
        });

        BotonIniciarDia.setBackground(new java.awt.Color(153, 153, 255));
        BotonIniciarDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonIniciarDia.setText("Iniciar día");
        BotonIniciarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarDiaActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(153, 153, 255));
        BotonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonVerTotal.setBackground(new java.awt.Color(153, 153, 255));
        BotonVerTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonVerTotal.setText("Ver totales");
        BotonVerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BotonIniciarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAna, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSara, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonJose, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonVerTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonJose, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSara, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAna, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIniciarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVerTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonVerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVerTotalActionPerformed

    private void BotonJoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJoseActionPerformed
        int corte = Integer.parseInt(JOptionPane.showInputDialog("¿Qué servicio quiere? \n 1. Corte caballero \n 2. Corte dama. \n 3. Tintura de cabello. \n 4. Peinado."));
        if (corte == 1) {
            preciojose = 8000;
            precioCortejose = precioCortejose + preciojose;
            LabelCorteCaballeroJose.setText("Corte caballero: \t 0 \t $" + precioCortejose);
            precioTotaljose = precioTotaljose + preciojose;
            LabelTotalRecaudoJose.setText("Total recaudado: \t $" + precioTotaljose);
            cantidadjose = cantidadjose + 1;
        } else if (corte == 2) {
            preciojose = 10500;
            precioCorteDamaJose = precioCorteDamaJose + preciojose;
            LabelCorteDamaJose.setText("Corte Dama: \t 0 \t $" + precioCorteDamaJose);
            precioTotaljose = precioTotaljose + preciojose;
            LabelTotalRecaudoJose.setText("Total recaudado: \t $" + precioTotaljose);
            cantidadjose = cantidadjose + 1;
        } else if (corte == 3) {
            preciojose = 40000;
            precioTinturaJose = precioTinturaJose + preciojose;
            LabelTinturaJose.setText("Corte caballero: \t 0 \t $" + precioTinturaJose);
            precioTotaljose = precioTotaljose + preciojose;
            LabelTotalRecaudoJose.setText("Total recaudado: \t $" + precioTotaljose);
            cantidadjose = cantidadjose + 1;
        } else if (corte == 4) {
            preciojose = 15000;
            precioPeinadoJose = precioPeinadoJose + preciojose;
            LabelPeinadoJose.setText("Corte caballero: \t 0 \t $" + precioPeinadoJose);
            precioTotaljose = precioTotaljose + preciojose;
            LabelTotalRecaudoJose.setText("Total recaudado: \t $" + precioTotaljose);
            cantidadjose = cantidadjose + 1;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido.");
        }
    }//GEN-LAST:event_BotonJoseActionPerformed

    private void BotonRobertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRobertoActionPerformed
        int corte = Integer.parseInt(JOptionPane.showInputDialog("¿Qué servicio quiere? \n 1. Corte caballero \n 2. Corte dama. \n 3. Tintura de cabello. \n 4. Peinado."));
        if (corte == 1) {
            precioRoberto = 8000;
            cantidadRoberto = cantidadRoberto + 1;
            precioCorteCaballeroRoberto = precioCorteCaballeroRoberto + precioRoberto;
            LabelCorteCaballeroRoberto.setText("Corte caballero: \t 0 \t $" + precioCorteCaballeroRoberto);
            precioTotalRoberto = precioTotalRoberto + precioRoberto;
            LabelTotalRecaudoRoberto.setText("Total recaudado: \t $" + precioTotalRoberto);
        } else if (corte == 2) {
            precioRoberto = 10500;
            LabelCorteDamaRoberto.setText("Corte Dama: \t 0 \t $" + precioCorteDamaRoberto);
            cantidadRoberto = cantidadRoberto + 1;
            precioTotalRoberto = precioTotalRoberto + precioRoberto;
            LabelTotalRecaudoRoberto.setText("Total recaudado: \t $" + precioTotalRoberto);
        } else if (corte == 3) {
            precioRoberto = 40000;
            LabelTinturaRoberto.setText("Corte tintura: \t 0 \t $" + precioTinturaRoberto);
            cantidadRoberto = cantidadRoberto + 1;
            precioTotalRoberto = precioTotalRoberto + precioRoberto;
            LabelTotalRecaudoRoberto.setText("Total recaudado: \t $" + precioTotalRoberto);
        } else if (corte == 4) {
            precioRoberto = 15000;
            LabelPeinadoRoberto.setText("Peinado: \t 0 \t $" + precioPeinadoRoberto);
            cantidadRoberto = cantidadRoberto + 1;
            precioTotalRoberto = precioTotalRoberto + precioRoberto;
            LabelTotalRecaudoRoberto.setText("Total recaudado: \t $" + precioTotalRoberto);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido.");
        }
    }//GEN-LAST:event_BotonRobertoActionPerformed

    private void BotonSaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSaraActionPerformed
        int corte = Integer.parseInt(JOptionPane.showInputDialog("¿Qué servicio quiere? \n 1. Corte caballero \n 2. Corte dama. \n 3. Tintura de cabello. \n 4. Peinado."));
        if (corte == 1) {
            precioSara = 8000;
            cantidadSara = cantidadSara + 1;
            precioCorteCaballeroSara = precioCorteCaballeroSara + precioSara;
            LabelCorteCaballeroSara.setText("Corte caballero: \t 0 \t $" + precioCorteCaballeroSara);
            precioTotalSara = precioTotalSara + precioSara;
            LabelTotalRecaudoSara.setText("Total recaudado: \t $" + precioTotalSara);

        } else if (corte == 2) {
            precioSara = 10500;
            precioCorteDamaSara = precioCorteDamaSara + precioSara;
            LabelCorteDamaSara.setText("Corte caballero: \t 0 \t $" + precioCorteDamaSara);
            cantidadSara = cantidadSara + 1;
            precioTotalSara = precioTotalSara + precioSara;
            LabelTotalRecaudoSara.setText("Total recaudado: \t $" + precioTotalSara);
        } else if (corte == 3) {
            precioSara = 40000;
            precioTinturaSara = precioTinturaSara + precioSara;
            LabelTinturaSara.setText("Corte caballero: \t 0 \t $" + precioTinturaSara);
            cantidadSara = cantidadSara + 1;
            precioTotalSara = precioTotalSara + precioSara;
            LabelTotalRecaudoSara.setText("Total recaudado: \t $" + precioTotalSara);
        } else if (corte == 4) {
            precioSara = 15000;
            precioPeinadoSara = precioPeinadoSara + precioSara;
            LabelPeinadoSara.setText("Corte caballero: \t 0 \t $" + precioPeinadoSara);
            cantidadSara = cantidadSara + 1;
            precioTotalSara = precioTotalSara + precioSara;
            LabelTotalRecaudoSara.setText("Total recaudado: \t $" + precioTotalSara);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido.");
        }
    }//GEN-LAST:event_BotonSaraActionPerformed

    private void BotonAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnaActionPerformed
        int corte = Integer.parseInt(JOptionPane.showInputDialog("¿Qué servicio quiere? \n 1. Corte caballero \n 2. Corte dama. \n 3. Tintura de cabello. \n 4. Peinado."));
        if (corte == 1) {
            precioana = 8000;
            precioCorteCaballeroAna = precioCorteCaballeroAna + precioana;
            cantidadana = cantidadana + 1;
            LabelCorteCaballeroAna.setText("Corte caballero: \t 0 \t $" + precioCorteCaballeroAna);
            precioTotalana = precioTotalana + precioana;
            LabelTotalRecaudoAna.setText("Total recaudado: \t $" + precioTotalana);
        } else if (corte == 2) {
            precioana = 10500;
            precioCorteDamaAna = precioCorteDamaAna + precioana;
            LabelCorteDamaAna.setText("Corte dama: \t 0 \t $" + precioCorteDamaAna);
            precioTotalana = precioTotalana + precioana;
            LabelTotalRecaudoAna.setText("Total recaudado: \t $" + precioTotalana);
            cantidadana = cantidadana + 1;
        } else if (corte == 3) {
            precioana = 40000;
            precioTinturaAna = precioTinturaAna + precioana;
            LabelTinturaAna.setText("Tintura de Cabello: \t 0 \t $" + precioTinturaAna);
            precioTotalana = precioTotalana + precioana;
            LabelTotalRecaudoAna.setText("Total recaudado: \t $" + precioTotalana);
            cantidadana = cantidadana + 1;
        } else if (corte == 4) {
            precioana = 15000;
            precioPeinadoAna = precioPeinadoAna + precioana;
            LabelPeinadoAna.setText("Peinado: \t 0 \t $" + precioPeinadoAna);
            precioTotalana = precioTotalana + precioana;
            LabelTotalRecaudoAna.setText("Total recaudado: \t $" + precioTotalana);
            cantidadana = cantidadana + 1;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido.");
        }
        re.Registro(cantidadana, precioana);
    }//GEN-LAST:event_BotonAnaActionPerformed

    private void BotonIniciarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarDiaActionPerformed
        LabelCorteCaballeroAna.setText("Corte caballero: \t 0 \t $0.00");
        LabelCorteDamaAna.setText("Corte dama: \t 0 \t $0.00");
        LabelTinturaAna.setText("Tintura: \t 0 \t $0.00");
        LabelPeinadoAna.setText("Peinado: \t 0 \t $0.00");
        jLabel7.setText("Total servicios: \t 0");
        LabelTotalRecaudoAna.setText("Total recaudado: \t $0.00");

        LabelCorteCaballeroSara.setText("Corte caballero \t 0 \t $0.00");
        LabelCorteDamaSara.setText("Corte dama \t 0 \t $0.00");
        LabelTinturaSara.setText("Tintura \t 0 \t $0.00");
        LabelPeinadoSara.setText("Peinado \t 0 \t $0.00");
        jLabel31.setText("Total servicios: \t 0");
        LabelTotalRecaudoSara.setText("Total recaudado: \t $0.00");

        LabelCorteCaballeroRoberto.setText("Corte caballero \t 0 \t $0.00");
        LabelCorteDamaRoberto.setText("Corte dama \t 0 \t $0.00");
        LabelTinturaRoberto.setText("Tintura \t 0 \t $0.00");
        LabelPeinadoRoberto.setText("Peinado \t 0 \t $0.00");
        jLabel23.setText("Total servicios: \t 0");
        LabelTotalRecaudoRoberto.setText("Total recaudado: \t $0.00");

        LabelCorteCaballeroJose.setText("Corte caballero \t 0 \t $0.00");
        LabelCorteDamaJose.setText("Corte dama \t 0 \t $0.00");
        LabelTinturaJose.setText("Tintura \t 0 \t $0.00");
        LabelPeinadoJose.setText("Peinado \t 0 \t $0.00");
        jLabel15.setText("Total servicios: \t 0");
        LabelTotalRecaudoJose.setText("Total recaudado: \t $0.00");
    }//GEN-LAST:event_BotonIniciarDiaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeluqueriaMoony.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeluqueriaMoony.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeluqueriaMoony.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeluqueriaMoony.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeluqueriaMoony().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAna;
    private javax.swing.JButton BotonIniciarDia;
    private javax.swing.JButton BotonJose;
    private javax.swing.JButton BotonRoberto;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSara;
    private javax.swing.JButton BotonVerTotal;
    private javax.swing.JLabel LabelCorteCaballeroAna;
    private javax.swing.JLabel LabelCorteCaballeroJose;
    private javax.swing.JLabel LabelCorteCaballeroRoberto;
    private javax.swing.JLabel LabelCorteCaballeroSara;
    private javax.swing.JLabel LabelCorteDamaAna;
    private javax.swing.JLabel LabelCorteDamaJose;
    private javax.swing.JLabel LabelCorteDamaRoberto;
    private javax.swing.JLabel LabelCorteDamaSara;
    private javax.swing.JLabel LabelPeinadoAna;
    private javax.swing.JLabel LabelPeinadoJose;
    private javax.swing.JLabel LabelPeinadoRoberto;
    private javax.swing.JLabel LabelPeinadoSara;
    private javax.swing.JLabel LabelTinturaAna;
    private javax.swing.JLabel LabelTinturaJose;
    private javax.swing.JLabel LabelTinturaRoberto;
    private javax.swing.JLabel LabelTinturaSara;
    private javax.swing.JLabel LabelTotalRecaudoAna;
    private javax.swing.JLabel LabelTotalRecaudoJose;
    private javax.swing.JLabel LabelTotalRecaudoRoberto;
    private javax.swing.JLabel LabelTotalRecaudoSara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
