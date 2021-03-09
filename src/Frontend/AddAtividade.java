package Frontend;

import Backend.Atividade;
import Backend.funcoes;
import Backend.main;
import java.awt.Color;
import java.awt.Font;

public class AddAtividade extends javax.swing.JFrame {

    public AddAtividade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        subjects_jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        termino_jFormattedTextField1 = new javax.swing.JFormattedTextField();
        inicio_jFormattedTextField2 = new javax.swing.JFormattedTextField();
        mes_jFormattedTextField3 = new javax.swing.JFormattedTextField();
        ano_jFormattedTextField4 = new javax.swing.JFormattedTextField();
        dia_jFormattedTextField5 = new javax.swing.JFormattedTextField();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(389, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 211, 16));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agendar Atividades");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(127, 80, 121));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 211, 16));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        subjects_jTextField1.setBackground(new java.awt.Color(240, 230, 140));
        subjects_jTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        subjects_jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        subjects_jTextField1.setText("Nome da atividade...");
        subjects_jTextField1.setToolTipText("Campo para o nome da atividade");
        subjects_jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subjects_jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subjects_jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                subjects_jTextField1FocusLost(evt);
            }
        });
        subjects_jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjects_jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjects_jTextField1MouseExited(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 211, 16));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("Voltar");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        termino_jFormattedTextField1.setBackground(new java.awt.Color(240, 230, 140));
        termino_jFormattedTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        termino_jFormattedTextField1.setForeground(new java.awt.Color(153, 153, 153));
        try {
            termino_jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        termino_jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        termino_jFormattedTextField1.setToolTipText("Hora de término");
        termino_jFormattedTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        termino_jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                termino_jFormattedTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                termino_jFormattedTextField1FocusLost(evt);
            }
        });
        termino_jFormattedTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                termino_jFormattedTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                termino_jFormattedTextField1MouseExited(evt);
            }
        });

        inicio_jFormattedTextField2.setBackground(new java.awt.Color(240, 230, 140));
        inicio_jFormattedTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inicio_jFormattedTextField2.setForeground(new java.awt.Color(153, 153, 153));
        try {
            inicio_jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inicio_jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inicio_jFormattedTextField2.setToolTipText("Hora de início");
        inicio_jFormattedTextField2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        inicio_jFormattedTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inicio_jFormattedTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inicio_jFormattedTextField2FocusLost(evt);
            }
        });
        inicio_jFormattedTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicio_jFormattedTextField2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicio_jFormattedTextField2MouseExited(evt);
            }
        });

        mes_jFormattedTextField3.setBackground(new java.awt.Color(240, 230, 140));
        mes_jFormattedTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mes_jFormattedTextField3.setForeground(new java.awt.Color(153, 153, 153));
        mes_jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mes_jFormattedTextField3.setText("Mês");
        mes_jFormattedTextField3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        mes_jFormattedTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mes_jFormattedTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mes_jFormattedTextField3FocusLost(evt);
            }
        });
        mes_jFormattedTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mes_jFormattedTextField3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mes_jFormattedTextField3MouseExited(evt);
            }
        });

        ano_jFormattedTextField4.setBackground(new java.awt.Color(240, 230, 140));
        ano_jFormattedTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ano_jFormattedTextField4.setForeground(new java.awt.Color(153, 153, 153));
        ano_jFormattedTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ano_jFormattedTextField4.setText("Ano");
        ano_jFormattedTextField4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ano_jFormattedTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ano_jFormattedTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ano_jFormattedTextField4FocusLost(evt);
            }
        });
        ano_jFormattedTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ano_jFormattedTextField4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ano_jFormattedTextField4MouseExited(evt);
            }
        });

        dia_jFormattedTextField5.setBackground(new java.awt.Color(240, 230, 140));
        dia_jFormattedTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dia_jFormattedTextField5.setForeground(new java.awt.Color(153, 153, 153));
        dia_jFormattedTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dia_jFormattedTextField5.setText("Dia");
        dia_jFormattedTextField5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dia_jFormattedTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dia_jFormattedTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dia_jFormattedTextField5FocusLost(evt);
            }
        });
        dia_jFormattedTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dia_jFormattedTextField5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dia_jFormattedTextField5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(subjects_jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dia_jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(mes_jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(ano_jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(subjects_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mes_jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano_jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia_jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        funcoes.salvasaida();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        subjects_jTextField1.setFocusable(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton3MouseEntered

    private void subjects_jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjects_jTextField1MouseExited
        subjects_jTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_subjects_jTextField1MouseExited

    private void subjects_jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjects_jTextField1MouseEntered
        subjects_jTextField1.setBackground(Color.white);
        subjects_jTextField1.setFocusable(true);
    }//GEN-LAST:event_subjects_jTextField1MouseEntered

    private void subjects_jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjects_jTextField1FocusLost
        if (subjects_jTextField1.getText().equals("")) {
            subjects_jTextField1.setText("Nome da atividade...");
            subjects_jTextField1.setForeground(new Color(153, 153, 153));
            subjects_jTextField1.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_subjects_jTextField1FocusLost

    private void subjects_jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjects_jTextField1FocusGained
        if (subjects_jTextField1.getText().equals("Nome da atividade...")) {
            subjects_jTextField1.setText("");
            subjects_jTextField1.setForeground(Color.black);
            subjects_jTextField1.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_subjects_jTextField1FocusGained
    private boolean _validaCampos() {
        return subjects_jTextField1.getText().equals("Nome da atividade...")
                || dia_jFormattedTextField5.getText().equals("Dia")
                || mes_jFormattedTextField3.getText().equals("Mês")
                || ano_jFormattedTextField4.getText().equals("Ano")
                || inicio_jFormattedTextField2.getText().equals("  :  ")
                || termino_jFormattedTextField1.getText().equals("  :  ");

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!_validaCampos()) {
            String day = dia_jFormattedTextField5.getText();
            String month = mes_jFormattedTextField3.getText();
            String year = ano_jFormattedTextField4.getText();
            String datta = day + "/" + month + "/" + year;
            Atividade nova_atividade = new Atividade(subjects_jTextField1.getText(), datta, inicio_jFormattedTextField2.getText(), termino_jFormattedTextField1.getText());
            main.atividades.add(nova_atividade);
            this.dispose();
            new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void inicio_jFormattedTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2MouseEntered
        inicio_jFormattedTextField2.setBackground(Color.white);
    }//GEN-LAST:event_inicio_jFormattedTextField2MouseEntered

    private void inicio_jFormattedTextField2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2MouseExited
        inicio_jFormattedTextField2.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_inicio_jFormattedTextField2MouseExited

    private void termino_jFormattedTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1MouseEntered
        termino_jFormattedTextField1.setBackground(Color.white);
    }//GEN-LAST:event_termino_jFormattedTextField1MouseEntered

    private void termino_jFormattedTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1MouseExited
        termino_jFormattedTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_termino_jFormattedTextField1MouseExited

    private void inicio_jFormattedTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2FocusGained
        inicio_jFormattedTextField2.setForeground(Color.black);
        inicio_jFormattedTextField2.setFont(new java.awt.Font("Arial", 1, 15));
    }//GEN-LAST:event_inicio_jFormattedTextField2FocusGained

    private void inicio_jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2FocusLost
        if (inicio_jFormattedTextField2.getText().equals("  :  ")) {
            inicio_jFormattedTextField2.setForeground(new Color(153, 153, 153));
            inicio_jFormattedTextField2.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_inicio_jFormattedTextField2FocusLost

    private void termino_jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1FocusGained
        termino_jFormattedTextField1.setForeground(Color.black);
        termino_jFormattedTextField1.setFont(new java.awt.Font("Arial", 1, 15));
    }//GEN-LAST:event_termino_jFormattedTextField1FocusGained

    private void termino_jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1FocusLost
        if (termino_jFormattedTextField1.getText().equals("  :  ")) {
            termino_jFormattedTextField1.setForeground(new Color(153, 153, 153));
            termino_jFormattedTextField1.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_termino_jFormattedTextField1FocusLost

    private void dia_jFormattedTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia_jFormattedTextField5MouseEntered
        dia_jFormattedTextField5.setBackground(Color.white);
    }//GEN-LAST:event_dia_jFormattedTextField5MouseEntered

    private void dia_jFormattedTextField5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia_jFormattedTextField5MouseExited
        dia_jFormattedTextField5.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_dia_jFormattedTextField5MouseExited

    private void dia_jFormattedTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dia_jFormattedTextField5FocusGained
        if (dia_jFormattedTextField5.getText().equals("Dia")) {
            dia_jFormattedTextField5.setText("");
            try {
                dia_jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            dia_jFormattedTextField5.setForeground(Color.black);
            dia_jFormattedTextField5.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_dia_jFormattedTextField5FocusGained

    private void dia_jFormattedTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dia_jFormattedTextField5FocusLost
        if (dia_jFormattedTextField5.getText().equals("")) {
            dia_jFormattedTextField5.setText("Dia");
            dia_jFormattedTextField5.setForeground(new Color(153, 153, 153));
            dia_jFormattedTextField5.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_dia_jFormattedTextField5FocusLost

    private void mes_jFormattedTextField3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mes_jFormattedTextField3MouseEntered
        mes_jFormattedTextField3.setBackground(Color.white);
    }//GEN-LAST:event_mes_jFormattedTextField3MouseEntered

    private void mes_jFormattedTextField3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mes_jFormattedTextField3MouseExited
        mes_jFormattedTextField3.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_mes_jFormattedTextField3MouseExited

    private void mes_jFormattedTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mes_jFormattedTextField3FocusGained
        if (mes_jFormattedTextField3.getText().equals("Mês")) {
            mes_jFormattedTextField3.setText("");
            try {
                mes_jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            mes_jFormattedTextField3.setForeground(Color.black);
            mes_jFormattedTextField3.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_mes_jFormattedTextField3FocusGained

    private void mes_jFormattedTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mes_jFormattedTextField3FocusLost
        if (mes_jFormattedTextField3.getText().equals("")) {
            mes_jFormattedTextField3.setText("Mês");
            mes_jFormattedTextField3.setForeground(new Color(153, 153, 153));
            mes_jFormattedTextField3.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_mes_jFormattedTextField3FocusLost

    private void ano_jFormattedTextField4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ano_jFormattedTextField4MouseEntered
        ano_jFormattedTextField4.setBackground(Color.white);
    }//GEN-LAST:event_ano_jFormattedTextField4MouseEntered

    private void ano_jFormattedTextField4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ano_jFormattedTextField4MouseExited
        ano_jFormattedTextField4.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_ano_jFormattedTextField4MouseExited

    private void ano_jFormattedTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ano_jFormattedTextField4FocusGained
        if (ano_jFormattedTextField4.getText().equals("Ano")) {
            ano_jFormattedTextField4.setText("");
            try {
                ano_jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            ano_jFormattedTextField4.setForeground(Color.black);
            ano_jFormattedTextField4.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_ano_jFormattedTextField4FocusGained

    private void ano_jFormattedTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ano_jFormattedTextField4FocusLost
        if (ano_jFormattedTextField4.getText().equals("")) {
            ano_jFormattedTextField4.setText("Ano");
            ano_jFormattedTextField4.setForeground(new Color(153, 153, 153));
            ano_jFormattedTextField4.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_ano_jFormattedTextField4FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ano_jFormattedTextField4;
    private javax.swing.JFormattedTextField dia_jFormattedTextField5;
    private javax.swing.JFormattedTextField inicio_jFormattedTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFormattedTextField mes_jFormattedTextField3;
    private javax.swing.JTextField subjects_jTextField1;
    private javax.swing.JFormattedTextField termino_jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
