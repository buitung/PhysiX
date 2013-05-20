/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Panel.MainPanel;

import UI.MainUI;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author thanhtr
 */
public class Vector extends javax.swing.JPanel {

    /**
     * Creates new form Vector
     */
    private MainUI mainUI;

    /**
     *
     * @param mainUI
     */
    public Vector(MainUI mainUI) {
        this.mainUI = mainUI;
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
        jPanel1 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnCrossProduct = new javax.swing.JButton();
        btnDotProduct = new javax.swing.JButton();
        btnAngle = new javax.swing.JButton();
        btnDistance = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        lblWelcome.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblWelcome.setText("Welcome to PhysiX");

        lblCopyright.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblCopyright.setText("Copyright by IPEramus 2013");

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        btnInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfo);

        btnAdd.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);

        btnSubtract.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnSubtract.setText("Subtract");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubtract);

        btnMultiply.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnMultiply.setText("Multiply");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiply);

        btnCrossProduct.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnCrossProduct.setText("Cross product");
        btnCrossProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrossProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrossProduct);

        btnDotProduct.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnDotProduct.setText("Dot product");
        btnDotProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnDotProduct);

        btnAngle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnAngle.setText("Angle");
        btnAngle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngleActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngle);

        btnDistance.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnDistance.setText("Distance");
        btnDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnDistance);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnBack.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnBack.setText("BACK");
        jPanel2.add(btnBack);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblCopyright))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param cards
     */
    public void setActionToPerform(JPanel cards) {
        final JPanel c = cards;
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CardLayout cl = (CardLayout) c.getLayout();
                cl.show(c, "Front Page");
                mainUI.setTitle("Front Page");
            }
        });
    }

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Vector Information");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorInfo());
        fr.setLocationRelativeTo(this);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Adding two Vectors");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorAdd());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Subtracting two Vectors");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorSubtract());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);

    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Vector Product");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorMultiplication());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnCrossProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrossProductActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Vector cross product");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorCrossProduct());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnCrossProductActionPerformed

    private void btnDotProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotProductActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Vector Dot Product");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorDotProduct());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnDotProductActionPerformed

    private void btnAngleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngleActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Angle between two Vectors");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorAngle());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnAngleActionPerformed

    private void btnDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanceActionPerformed
        // TODO add your handling code here:
        JFrame fr = new JFrame();
        fr.setTitle("Distance between two Vectors");
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setContentPane(new VectorDistance());
        fr.setLocationRelativeTo(mainUI);
        fr.pack();
        fr.setVisible(true);
    }//GEN-LAST:event_btnDistanceActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAngle;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCrossProduct;
    private javax.swing.JButton btnDistance;
    private javax.swing.JButton btnDotProduct;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
