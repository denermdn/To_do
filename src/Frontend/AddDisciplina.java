package Frontend;

import Backend.Disciplina;
import java.awt.Color;
import java.awt.Font;
import Backend.funcoes;
import Backend.main;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddDisciplina extends javax.swing.JFrame {

    public AddDisciplina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        disciplinaNome_jTextField1 = new javax.swing.JTextField();
        termino_jFormattedTextField1 = new javax.swing.JFormattedTextField();
        inicio_jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(389, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 211, 16));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adicionar Disciplina");
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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
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

        disciplinaNome_jTextField1.setBackground(new java.awt.Color(240, 230, 140));
        disciplinaNome_jTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        disciplinaNome_jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        disciplinaNome_jTextField1.setText("Nome da disciplina");
        disciplinaNome_jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        disciplinaNome_jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disciplinaNome_jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disciplinaNome_jTextField1FocusLost(evt);
            }
        });
        disciplinaNome_jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disciplinaNome_jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disciplinaNome_jTextField1MouseExited(evt);
            }
        });

        termino_jFormattedTextField1.setBackground(new java.awt.Color(240, 230, 140));
        termino_jFormattedTextField1.setBorder(null);
        termino_jFormattedTextField1.setForeground(new java.awt.Color(153, 153, 153));
        try {
            termino_jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        termino_jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        inicio_jFormattedTextField2.setBorder(null);
        inicio_jFormattedTextField2.setForeground(new java.awt.Color(153, 153, 153));
        try {
            inicio_jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inicio_jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inicio_jFormattedTextField2.setToolTipText("");
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

        jCheckBox1.setText("Segunda-feira");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox2.setText("Terça-feira");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox3.setText("Quarta-feira");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox4.setText("Quinta-feira");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox5.setText("Sexta-feira");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox6.setText("Sábado");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(disciplinaNome_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(disciplinaNome_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jCheckBox5)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox4))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disciplinaNome_jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1MouseExited
        disciplinaNome_jTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_disciplinaNome_jTextField1MouseExited

    private void disciplinaNome_jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1MouseEntered
        disciplinaNome_jTextField1.setBackground(Color.white);

    }//GEN-LAST:event_disciplinaNome_jTextField1MouseEntered

    private void disciplinaNome_jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1FocusLost
        if (disciplinaNome_jTextField1.getText().equals("")) {
            disciplinaNome_jTextField1.setText("Nome da disciplina");
            disciplinaNome_jTextField1.setForeground(new Color(153, 153, 153));
            disciplinaNome_jTextField1.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_disciplinaNome_jTextField1FocusLost

    private void disciplinaNome_jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1FocusGained
        if (disciplinaNome_jTextField1.getText().equals("Nome da disciplina")) {
            disciplinaNome_jTextField1.setText("");
            disciplinaNome_jTextField1.setForeground(Color.black);
            disciplinaNome_jTextField1.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_disciplinaNome_jTextField1FocusGained
    private boolean _validaCampos() {
        return disciplinaNome_jTextField1.getText().equals("Nome da disciplina")
                || inicio_jFormattedTextField2.getText().equals("  :  ")
                || termino_jFormattedTextField1.getText().equals("  :  ");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!_validaCampos()) {
            this.setVisible(false);
            List<String> diasS = new ArrayList<>();
            if (jCheckBox1.isSelected()) {
                diasS.add("Segunda-feira");
            }
            if (jCheckBox2.isSelected()) {
                diasS.add("Terça-feira");
            }
            if (jCheckBox3.isSelected()) {
                diasS.add("Quarta-feira");
            }
            if (jCheckBox4.isSelected()) {
                diasS.add("Quinta-feira");
            }
            if (jCheckBox5.isSelected()) {
                diasS.add("Sexta-feira");
            }
            if (jCheckBox6.isSelected()) {
                diasS.add("Sábado");
            }
            try {
                Disciplina dis = new Disciplina(disciplinaNome_jTextField1.getText(), diasS, inicio_jFormattedTextField2.getText(), termino_jFormattedTextField1.getText());
                main.disciplinas.add(dis);
            } catch (ParseException ex) {
                Logger.getLogger(AddDisciplina.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        funcoes.salvasaida();
    }//GEN-LAST:event_formWindowClosing

    private void inicio_jFormattedTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2MouseEntered
        inicio_jFormattedTextField2.setBackground(Color.white);
    }//GEN-LAST:event_inicio_jFormattedTextField2MouseEntered

    private void termino_jFormattedTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1MouseEntered
        termino_jFormattedTextField1.setBackground(Color.white);
    }//GEN-LAST:event_termino_jFormattedTextField1MouseEntered

    private void inicio_jFormattedTextField2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2MouseExited
        inicio_jFormattedTextField2.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_inicio_jFormattedTextField2MouseExited

    private void termino_jFormattedTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termino_jFormattedTextField1MouseExited
        termino_jFormattedTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_termino_jFormattedTextField1MouseExited

    private void inicio_jFormattedTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2FocusGained
        inicio_jFormattedTextField2.setForeground(Color.black);
        inicio_jFormattedTextField2.setFont(new java.awt.Font("Arial", 1, 15));
    }//GEN-LAST:event_inicio_jFormattedTextField2FocusGained

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

    private void inicio_jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inicio_jFormattedTextField2FocusLost
        if (inicio_jFormattedTextField2.getText().equals("  :  ")) {
            inicio_jFormattedTextField2.setForeground(new Color(153, 153, 153));
            inicio_jFormattedTextField2.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_inicio_jFormattedTextField2FocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField disciplinaNome_jTextField1;
    private javax.swing.JFormattedTextField inicio_jFormattedTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField termino_jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
