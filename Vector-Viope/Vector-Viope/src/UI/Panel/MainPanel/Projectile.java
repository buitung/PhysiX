/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Panel.MainPanel;

import PhysixLib.MathUtils;
import UI.Panel.InforPanel.ProjectileInformation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Teo
 */
public class Projectile extends javax.swing.JPanel {

    /**
     * Creates new form Projectile
     */

    public Projectile() {
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
        calculationPanel = new javax.swing.JPanel();
        lblAngle = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();
        lblVelocity = new javax.swing.JLabel();
        txtVelocity = new javax.swing.JTextField();
        lblDistance = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblProjectileTime = new javax.swing.JLabel();
        lblDisAns = new javax.swing.JLabel();
        lblHeightAns = new javax.swing.JLabel();
        lblProjectileAns = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();
        lblDegreeRadian = new javax.swing.JLabel();
        lblms = new javax.swing.JLabel();
        lblm2 = new javax.swing.JLabel();
        lbls = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnDegRad = new javax.swing.JButton();

        lblWelcome.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblWelcome.setText("Welcome to PhysiX");

        lblCopyright.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright IPEramus 2013");

        lblAngle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblAngle.setText("Angle");

        txtAngle.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblVelocity.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblVelocity.setText("Velocity");

        txtVelocity.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblDistance.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblDistance.setText("Distance");

        lblHeight.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblHeight.setText("Height");

        lblProjectileTime.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblProjectileTime.setText("Projectile time");

        lblDisAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblHeightAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblProjectileAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblm.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm.setText("m");

        lblDegreeRadian.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblDegreeRadian.setText("Degree");

        lblms.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblms.setText("m/s");

        lblm2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm2.setText("m");

        lbls.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lbls.setText("s");

        btnCal.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnCal.setText("Calculate");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        btnInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnInfo.setText("Information");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnDegRad.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnDegRad.setText("Deg/Rad");
        btnDegRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDegRadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculationPanelLayout = new javax.swing.GroupLayout(calculationPanel);
        calculationPanel.setLayout(calculationPanelLayout);
        calculationPanelLayout.setHorizontalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDistance)
                    .addComponent(lblHeight)
                    .addComponent(lblProjectileTime)
                    .addComponent(lblVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisAns, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeightAns)
                    .addComponent(lblProjectileAns))
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDegreeRadian))
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblm2)
                            .addComponent(lblm)
                            .addComponent(lbls)))
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblms)))
                .addGap(20, 20, 20)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDegRad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        calculationPanelLayout.setVerticalGroup(
            calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngle)
                    .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegreeRadian)
                    .addComponent(btnDegRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocity)
                    .addComponent(lblms)
                    .addComponent(btnCal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(calculationPanelLayout.createSequentialGroup()
                        .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisAns)
                            .addComponent(lblm)
                            .addComponent(lblDistance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeight)
                            .addComponent(lblHeightAns)
                            .addComponent(lblm2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjectileAns)
                            .addComponent(lblProjectileTime)
                            .addComponent(lbls)))
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(85, 85, 85)
                        .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calculationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCopyright)
                    .addComponent(lblWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDegRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDegRadActionPerformed
        // TODO add your handling code here:
        if (lblDegreeRadian.getText().trim().length() > 0) {
            try {
                if (lblDegreeRadian.getText().equalsIgnoreCase("Degree")) {
                    lblDegreeRadian.setText("Radian");
                    txtAngle.setText(
                            Float.toString(
                            MathUtils.Deg2Rad(Float.parseFloat(txtAngle.getText()))));
                } else {
                    lblDegreeRadian.setText("Degree");
                    txtAngle.setText(
                            Float.toString(
                            MathUtils.Rag2Deg(Float.parseFloat(txtAngle.getText()))));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Please enter the angle in the right form");
            }
        } else {
            if (lblDegreeRadian.getText().equalsIgnoreCase("Degree")) {
                lblDegreeRadian.setText("Radian");
            } else {
                lblDegreeRadian.setText("Degree");
            }
        }
    }//GEN-LAST:event_btnDegRadActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
        try {
            float velocity = Float.parseFloat(txtVelocity.getText());
            if (velocity < 0) {
                throw new ArithmeticException();
            }
            float ang = Float.parseFloat(txtAngle.getText());
            if (lblDegreeRadian.getText().equalsIgnoreCase("Degree")) {
                ang = MathUtils.Deg2Rad(ang);
            }
            if (ang < 0 || ang > (float) Math.PI) {
                throw new NullPointerException();
            }
            if (ang == (float) Math.PI) {
                ang = 0;
            }
            PhysixLib.Projectile pp = new PhysixLib.Projectile(velocity, ang);
            if (Math.abs(pp.Distance()) > 0.001) {
                lblDisAns.setText(Float.toString((float)Math.abs(pp.Distance())));
            } else {
                lblDisAns.setText("0");
            }
            if (pp.Height() > (float) 0.001) {
                lblHeightAns.setText(Float.toString(pp.Height()));
            } else {
                lblHeightAns.setText("0");
            }
            if (pp.ProjTime() > (float) 0.001) {
                lblProjectileAns.setText(Float.toString(pp.ProjTime()));
            } else {
                lblProjectileAns.setText("0");
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this,
                    "The velocity must be higher or equal zero.\n"
                    + "Please enter the velocity in the right form");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "The angle must be higher or equal zero as well as lower or equal 180 degree / PI rad.\n"
                    + "Please enter the velocity in the right form");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter the angle and the velocity in the right form");
            lblDisAns.setText("");
            lblHeightAns.setText("");
            lblProjectileAns.setText("");
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        JFrame infoFr = new JFrame();
        infoFr.setContentPane(new ProjectileInformation());
        infoFr.pack();
        infoFr.setVisible(true);
        infoFr.setTitle("About Projectile");
        infoFr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnDegRad;
    private javax.swing.JButton btnInfo;
    private javax.swing.JPanel calculationPanel;
    private javax.swing.JLabel lblAngle;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblDegreeRadian;
    private javax.swing.JLabel lblDisAns;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeightAns;
    private javax.swing.JLabel lblProjectileAns;
    private javax.swing.JLabel lblProjectileTime;
    private javax.swing.JLabel lblVelocity;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblm2;
    private javax.swing.JLabel lblms;
    private javax.swing.JLabel lbls;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JTextField txtVelocity;
    // End of variables declaration//GEN-END:variables
}
