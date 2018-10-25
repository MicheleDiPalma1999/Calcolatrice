package calcolatrice;

public class calcolatrice extends javax.swing.JFrame {

    double Operando1;
    double Operando2;
    String Operazione;
    boolean controllo = true;

    public calcolatrice() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        latodxt = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bot = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setToolTipText("");

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );

        getContentPane().add(top, java.awt.BorderLayout.PAGE_START);

        latodxt.setMaximumSize(new java.awt.Dimension(51, 25));
        latodxt.setPreferredSize(new java.awt.Dimension(50, 500));
        latodxt.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        jButton1.setText("+");
        jButton1.setMaximumSize(new java.awt.Dimension(49, 90));
        jButton1.setMinimumSize(new java.awt.Dimension(49, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(49, 50));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        latodxt.add(jButton1);
        jButton1.getAccessibleContext().setAccessibleName("x");
        jButton1.getAccessibleContext().setAccessibleDescription("");

        jButton2.setText("-");
        jButton2.setMaximumSize(new java.awt.Dimension(49, 90));
        jButton2.setMinimumSize(new java.awt.Dimension(49, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(49, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        latodxt.add(jButton2);

        jButton3.setText("/");
        jButton3.setMaximumSize(new java.awt.Dimension(49, 90));
        jButton3.setMinimumSize(new java.awt.Dimension(49, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(49, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        latodxt.add(jButton3);

        jButton4.setText("X");
        jButton4.setMaximumSize(new java.awt.Dimension(49, 90));
        jButton4.setMinimumSize(new java.awt.Dimension(49, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(49, 50));
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        latodxt.add(jButton4);

        getContentPane().add(latodxt, java.awt.BorderLayout.LINE_END);

        jButton5.setText("=");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botLayout = new javax.swing.GroupLayout(bot);
        bot.setLayout(botLayout);
        botLayout.setHorizontalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
        );
        botLayout.setVerticalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(bot, java.awt.BorderLayout.PAGE_END);

        center.setLayout(new java.awt.GridLayout(4, 3, 20, 20));

        jButton6.setText("1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        center.add(jButton6);

        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        center.add(jButton7);

        jButton8.setText("3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        center.add(jButton8);

        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        center.add(jButton9);

        jButton10.setText("5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        center.add(jButton10);

        jButton11.setText("6");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        center.add(jButton11);

        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        center.add(jButton12);

        jButton13.setText("8");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        center.add(jButton13);

        jButton14.setText("9");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        center.add(jButton14);

        jButton16.setText("CE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        center.add(jButton16);

        jButton15.setText("0");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        center.add(jButton15);

        jButton17.setText(",");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        center.add(jButton17);

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Operazione = "+";
        if (!"".equals(jTextField1.getText())) {
            Operando1 = Double.parseDouble(jTextField1.getText());
        }

        jTextPane1.setText(jTextPane1.getText() + "+");
        jTextField1.setText("");
        controllo = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Operazione = "-";
        if (!"".equals(jTextField1.getText())) {
            Operando1 = Double.parseDouble(jTextField1.getText());
        }
        jTextPane1.setText(jTextPane1.getText() + "-");
        jTextField1.setText("");
        controllo = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Operazione = "/";
        if (!"".equals(jTextField1.getText())) {
            Operando1 = Double.parseDouble(jTextField1.getText());
        }

        jTextPane1.setText(jTextPane1.getText() + "/");
        jTextField1.setText("");
        controllo = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Operazione = "*";

        if (!"".equals(jTextField1.getText())) {
            Operando1 = Double.parseDouble(jTextField1.getText());
        }
        jTextPane1.setText(jTextPane1.getText() + "*");
        jTextField1.setText("");
        controllo = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (!"".equals(jTextField1.getText())) {
            String[] s = jTextPane1.getText().split("[+-/*]");
            int[] v = new int[s.length];
            int i = 0;
            for (String p : s) {
                v[i] = Integer.parseInt(p);
                i++;
            }

            Operando2 = Double.parseDouble(jTextField1.getText());
            switch (Operazione) {
                case "+":
                    jTextPane1.setText(String.format("%s", (somma(v))));
                    break;
                case "-":
                    jTextPane1.setText(String.format("%s", (sottrazione(v))));
                    break;
                case "/":
                    jTextPane1.setText(String.format("%s", (Operando1 / Operando2)));
                    break;
                case "*":
                    jTextPane1.setText(String.format("%s", (Operando1 * Operando2)));
                    break;

            }
            jTextField1.setText("");
            Operando1 = Double.parseDouble(jTextPane1.getText());
            controllo = false;
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private int somma(int[] v) {
        int somma = 0;
        for (int i = 0; i < v.length; i++) {
            somma += v[i];
        }
        return somma;
    }

    private int sottrazione(int[] v) {
        int sott = v[0];
        for (int i = 1; i < v.length; i++) {
            sott -= v[i];
        }
        return sott;
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if ("".equals(jTextField1.getText())) {
            jTextPane1.setText("");
        }
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "0");
        } else {
            jTextPane1.setText("0");
        }
        jTextField1.setText(jTextField1.getText() + "0");

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTextField1.setText("");
        jTextPane1.setText("");
        Operando1 = 0;
        Operando2 = 0;
        Operazione = "";
        controllo = false;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "9");
        } else {
            jTextPane1.setText("9");
        }
        jTextField1.setText(jTextField1.getText() + "9");

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "8");
        } else {
            jTextPane1.setText("8");
        }
        jTextField1.setText(jTextField1.getText() + "8");

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "7");
        } else {
            jTextPane1.setText("7");
        }
        jTextField1.setText(jTextField1.getText() + "7");

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "6");
        } else {
            jTextPane1.setText("6");
        }
        jTextField1.setText(jTextField1.getText() + "6");

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "5");
        } else {
            jTextPane1.setText("5");
        }
        jTextField1.setText(jTextField1.getText() + "5");

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "4");
        } else {
            jTextPane1.setText("4");
        }
        jTextField1.setText(jTextField1.getText() + "4");

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "2");
        } else {
            jTextPane1.setText("2");
        }
        jTextField1.setText(jTextField1.getText() + "2");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "1");
        } else {
            jTextPane1.setText("1");
        }
        jTextField1.setText(jTextField1.getText() + "1");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (controllo) {
            jTextPane1.setText(jTextPane1.getText() + "3");
        } else {
            jTextPane1.setText("3");
        }
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcolatrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bot;
    private javax.swing.JPanel center;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel latodxt;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
