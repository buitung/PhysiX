/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Panel.MainPanel;

import PhysixLib.MathUtils;
import UI.Panel.InforPanel.AngleCalInformation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thanhtr
 */
public class AngleCalculation extends javax.swing.JPanel {

    /**
     * Creates new form AngleCalculation
     */
    public AngleCalculation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();
        lblAngle = new javax.swing.JLabel();
        answerPanel = new javax.swing.JPanel();
        lblSin = new javax.swing.JLabel();
        lblCos = new javax.swing.JLabel();
        lblTan = new javax.swing.JLabel();
        lblSinAnswer = new javax.swing.JLabel();
        lblCosAnswer = new javax.swing.JLabel();
        lblTanAnswer = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnInformation = new javax.swing.JButton();
        lblDegree = new javax.swing.JLabel();
        btnDegreeRadian = new javax.swing.JButton();

        lblWelcome.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblWelcome.setText("Welcome to PhysiX");

        lblCopyright.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblCopyright.setText("Copyright IPEramus 2013");

        txtAngle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txtAngle.setText("    ");

        lblAngle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblAngle.setText("Angle");

        lblSin.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSin.setText("Sin");

        lblCos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblCos.setText("Cos");

        lblTan.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblTan.setText("Tan");

        lblSinAnswer.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSinAnswer.setText("   ");

        lblCosAnswer.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblCosAnswer.setText("   ");

        lblTanAnswer.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblTanAnswer.setText("   ");

        javax.swing.GroupLayout answerPanelLayout = new javax.swing.GroupLayout(answerPanel);
        answerPanel.setLayout(answerPanelLayout);
        answerPanelLayout.setHorizontalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerPanelLayout.createSequentialGroup()
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSin)
                    .addComponent(lblCos)
                    .addComponent(lblTan))
                .addGap(37, 37, 37)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTanAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(lblSinAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(lblCosAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        answerPanelLayout.setVerticalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSin)
                    .addComponent(lblSinAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCos)
                    .addComponent(lblCosAnswer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTan)
                    .addComponent(lblTanAnswer))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnCalculate.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnInformation.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnInformation.setText("Information");
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        lblDegree.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblDegree.setText("Degree");

        btnDegreeRadian.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnDegreeRadian.setText("Degree/Radian");
        btnDegreeRadian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDegreeRadianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCopyright))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAngle)
                                .addGap(29, 29, 29)
                                .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDegree)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDegreeRadian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblCopyright))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngle)
                    .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegree)
                    .addComponent(btnDegreeRadian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInformation)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDegreeRadianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDegreeRadianActionPerformed
        // TODO add your handling code here:
        if (txtAngle.getText().trim().length() > 0) {
            try {
                if (lblDegree.getText().equalsIgnoreCase("Degree")) {
                    lblDegree.setText("Radian");
                    txtAngle.setText(
                            Float.toString(
                            MathUtils.Deg2Rad(Float.parseFloat(txtAngle.getText()))));
                } else {
                    lblDegree.setText("Degree");
                    txtAngle.setText(
                            Float.toString(
                            MathUtils.Rag2Deg(Float.parseFloat(txtAngle.getText()))));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter the angle in the right form");
                lblSinAnswer.setText("");
                lblCosAnswer.setText("");
                lblTanAnswer.setText("");
            }
        } else {
            if (lblDegree.getText().equalsIgnoreCase("Degree")) {
                lblDegree.setText("Radian");
            } else {
                lblDegree.setText("Degree");
            }
        }
    }//GEN-LAST:event_btnDegreeRadianActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        double ee = 0.0001;
        try {
            double ang = Double.parseDouble(txtAngle.getText());
            if (lblDegree.getText().equalsIgnoreCase("Degree")) {
                ang = MathUtils.Deg2Rad((float) ang);
            }
            double s = Math.sin(ang);
            if (Math.abs(s) < ee) {
                s = 0;
            } else if (Math.abs(s) + ee >= 1.0) {
                if (s >= 0) {
                    s = 1.0;
                } else {
                    s = -1.0;
                }
            }
            double c = Math.cos(ang);
            System.out.println(c);
            if (Math.abs(c) < ee) {
                c = 0;
            } else if (Math.abs(c) + ee >= 1.0) {
                if (c >= 0) {
                    c = 1.0;
                } else {
                    c = -1.0;
                }
            }
            double t = s / c;
            if (Math.abs(t) < ee) {
                t = 0;
            } else if (Math.abs(t) + ee >= Math.ceil(Math.abs(t))) {
                if (t >= 0) {
                    t = Math.ceil(t);
                } else {
                    t = Math.ceil(t) * (float) (-1.0);
                }
            }
            System.out.println(c);
            if (Double.toString(s).length() > 6) {
                lblSinAnswer.setText(Double.toString(s).substring(0, 6));
            } else {
                lblSinAnswer.setText(Double.toString(s));
            }
            if (Double.toString(c).length() > 6) {
                lblCosAnswer.setText(Double.toString(c).substring(0, 6));
            } else {
                lblCosAnswer.setText(Double.toString(c));
            }
            if (Double.toString(t).length() > 6) {
                lblTanAnswer.setText(Double.toString(t).substring(0, 6));
            } else {
                lblTanAnswer.setText(Double.toString(t));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter the angle in the right form");
            lblSinAnswer.setText("");
            lblCosAnswer.setText("");
            lblTanAnswer.setText("");
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        // TODO add your handling code here:
        JFrame infoFr = new JFrame();
        infoFr.setContentPane(new AngleCalInformation());
        infoFr.pack();
        infoFr.setVisible(true);
        infoFr.setTitle("About Calculating Angle Information");
        infoFr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInformationActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel answerPanel;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDegreeRadian;
    private javax.swing.JButton btnInformation;
    private javax.swing.JLabel lblAngle;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblCos;
    private javax.swing.JLabel lblCosAnswer;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblSin;
    private javax.swing.JLabel lblSinAnswer;
    private javax.swing.JLabel lblTan;
    private javax.swing.JLabel lblTanAnswer;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtAngle;
    // End of variables declaration//GEN-END:variables
}