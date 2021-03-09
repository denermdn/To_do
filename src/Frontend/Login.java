package Frontend;

import java.awt.Color;
import java.awt.Font;
import Backend.funcoes;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_jTextField1 = new javax.swing.JTextField();
        err_jLabel3 = new javax.swing.JLabel();
        password_jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 211, 16));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("To do");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("To Study");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(127, 80, 121));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 211, 16));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Entrar");
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

        jButton2.setBackground(new java.awt.Color(255, 211, 16));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        name_jTextField1.setBackground(new java.awt.Color(240, 230, 140));
        name_jTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        name_jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        name_jTextField1.setText("Nome...");
        name_jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name_jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_jTextField1FocusLost(evt);
            }
        });
        name_jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_jTextField1MouseExited(evt);
            }
        });
        name_jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name_jTextField1KeyPressed(evt);
            }
        });

        err_jLabel3.setText(" ");

        password_jPasswordField1.setBackground(new java.awt.Color(240, 230, 140));
        password_jPasswordField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        password_jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        password_jPasswordField1.setText("Senha...");
        password_jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_jPasswordField1FocusLost(evt);
            }
        });
        password_jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                password_jPasswordField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                password_jPasswordField1MouseExited(evt);
            }
        });
        password_jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_jPasswordField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name_jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addComponent(err_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(name_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(password_jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(err_jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void login_Action() {

        if (!funcoes.validate(name_jTextField1.getText(), new String(password_jPasswordField1.getPassword()))) {
            err_jLabel3.setText("Usuários ou senha incorretos");
            err_jLabel3.setFont(new Font("Ink Free", Font.BOLD, 15));
            err_jLabel3.setForeground(Color.orange);
            return;
        }
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }

    private boolean filled_fields() {
        return !name_jTextField1.getText().equals("")
                && !name_jTextField1.getText().equals("Nome...")
                && !password_jPasswordField1.getText().equals("")
                && !password_jPasswordField1.getText().equals("Senha...");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login_Action();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name_jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_jTextField1MouseEntered
        name_jTextField1.setFocusable(true);
        name_jTextField1.setBackground(Color.white);
        if (!err_jLabel3.getText().equals(" ")) {
            err_jLabel3.setText(" ");
        }

    }//GEN-LAST:event_name_jTextField1MouseEntered

    private void name_jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_jTextField1MouseExited
        name_jTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_name_jTextField1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0, 255, 127));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton1MouseExited

    private void name_jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_jTextField1FocusGained
        if (name_jTextField1.getText().equals("Nome...")) {
            name_jTextField1.setText("");
            name_jTextField1.setForeground(Color.black);
            name_jTextField1.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_name_jTextField1FocusGained

    private void name_jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_jTextField1FocusLost
        if (name_jTextField1.getText().equals("")) {
            name_jTextField1.setText("Nome...");
            name_jTextField1.setForeground(new Color(153, 153, 153));
            name_jTextField1.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_name_jTextField1FocusLost

    private void key_Event(int key_code) {
        if (key_code == 10) {
            if (filled_fields()) {
                login_Action();
            } else {
                err_jLabel3.setText("Preencha todos os campos");
                err_jLabel3.setFont(new Font("Ink Free", Font.BOLD, 15));
                err_jLabel3.setForeground(Color.orange);
            }
        }
    }

    private void name_jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_jTextField1KeyPressed
        key_Event(evt.getKeyCode());
    }//GEN-LAST:event_name_jTextField1KeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        password_jPasswordField1.setEchoChar('\u0000');
    }//GEN-LAST:event_formWindowActivated

    private void password_jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_jPasswordField1MouseEntered
        password_jPasswordField1.setBackground(Color.white);
        if (!err_jLabel3.getText().equals(" ")) {
            err_jLabel3.setText(" ");
        }
    }//GEN-LAST:event_password_jPasswordField1MouseEntered

    private void password_jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_jPasswordField1MouseExited
        password_jPasswordField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_password_jPasswordField1MouseExited

    private void password_jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_jPasswordField1FocusLost
        if (password_jPasswordField1.getText().equals("")) {
            password_jPasswordField1.setText("Senha...");
            password_jPasswordField1.setForeground(new Color(153, 153, 153));
            password_jPasswordField1.setFont(Font.decode("Arial Black"));
            password_jPasswordField1.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_password_jPasswordField1FocusLost

    private void password_jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_jPasswordField1FocusGained
        if (password_jPasswordField1.getText().equals("Senha...")) {
            password_jPasswordField1.setText("");
            password_jPasswordField1.setEchoChar('\u2022');
            password_jPasswordField1.setForeground(Color.black);
            password_jPasswordField1.setFont(new java.awt.Font("Arial", 1, 15));
        }
    }//GEN-LAST:event_password_jPasswordField1FocusGained

    private void password_jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_jPasswordField1KeyPressed
        key_Event(evt.getKeyCode());
    }//GEN-LAST:event_password_jPasswordField1KeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        funcoes.salvasaida();
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Register register = new Register();
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        name_jTextField1.setFocusable(false);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel err_jLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name_jTextField1;
    private javax.swing.JPasswordField password_jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
