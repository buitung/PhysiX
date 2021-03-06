/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Panel.MainPanel;

import UI.Panel.InforPanel.SphereInformation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thanhtr
 */
public class Sphere extends javax.swing.JPanel {

    /**
     * Creates new form Sphere
     */
    public Sphere() {
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
        lblRadius = new javax.swing.JLabel();
        txtRadius = new javax.swing.JTextField();
        lblm = new javax.swing.JLabel();
        lblSurArea = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();
        lblSqm = new javax.swing.JLabel();
        lblCubem = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        lblAreaAns = new javax.swing.JLabel();
        lblVolAns = new javax.swing.JLabel();

        lblWelcome.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWelcome.setText("Welcome to PhysiX");

        lblCopyright.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright IPEramus 2013");

        lblRadius.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblRadius.setText("Radius");

        txtRadius.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txtRadius.setText("    ");

        lblm.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm.setText("m");

        lblSurArea.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSurArea.setText("Surface Area");

        lblVolume.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblVolume.setText("Volume");

        lblSqm.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSqm.setText("m^2");

        lblCubem.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblCubem.setText("m^3");

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

        lblAreaAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblVolAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCopyright))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVolume)
                            .addComponent(lblSurArea)
                            .addComponent(lblRadius))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVolAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRadius, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lblAreaAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblm)
                            .addComponent(lblCubem)
                            .addComponent(lblSqm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblCopyright))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadius)
                    .addComponent(txtRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblm)
                    .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAreaAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSurArea)
                                .addComponent(lblSqm)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVolume)
                            .addComponent(lblCubem)
                            .addComponent(lblVolAns, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
        try {
            PhysixLib.Sphere sph = new PhysixLib.Sphere(Float.parseFloat(txtRadius.getText().toString()));
            if (Float.parseFloat(txtRadius.getText())<=0)
                throw new ArithmeticException();
            lblAreaAns.setText(Float.toString(sph.Area()));
            lblVolAns.setText(Float.toString(sph.Volume()));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, 
                    "Radius must be higher than zero.\n"
                    + "Please enter the radius again.");
            lblAreaAns.setText("");
            lblVolAns.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter the radius in the right form");
            lblAreaAns.setText("");
            lblVolAns.setText("");
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        JFrame infoFr = new JFrame();
        infoFr.setContentPane(new SphereInformation());
        infoFr.pack();
        infoFr.setVisible(true);
        infoFr.setTitle("About Sphere");
        infoFr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel lblAreaAns;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblCubem;
    private javax.swing.JLabel lblRadius;
    private javax.swing.JLabel lblSqm;
    private javax.swing.JLabel lblSurArea;
    private javax.swing.JLabel lblVolAns;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblm;
    private javax.swing.JTextField txtRadius;
    // End of variables declaration//GEN-END:variables
}
