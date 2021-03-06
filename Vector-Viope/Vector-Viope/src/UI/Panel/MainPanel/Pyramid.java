/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Panel.MainPanel;

import UI.Panel.InforPanel.PyramidInformation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thanhtr
 */
public class Pyramid extends javax.swing.JPanel {

    /**
     * Creates new form Pyramid
     */
    public Pyramid() {
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
        lblBaseSide = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        lblb = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        lblc = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        lblm4 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblcube3 = new javax.swing.JLabel();
        lblsqm = new javax.swing.JLabel();
        lblSurAns = new javax.swing.JLabel();
        lblVolAns = new javax.swing.JLabel();
        lblVol = new javax.swing.JLabel();
        lblSurfaceArea = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        lblm3 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        lblm2 = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();

        lblWelcome.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblWelcome.setText("Welcome to PhysiX");

        lblCopyright.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright by IPEramus 2013");

        lblBaseSide.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblBaseSide.setText("Base sides");

        lbla.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lbla.setText("a = ");

        txta.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblb.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblb.setText(" b = ");

        txtb.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        lblc.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblc.setText(" c = ");

        txtc.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txtc.setText(" ");

        lblm4.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm4.setText("m");

        txtHeight.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txtHeight.setText("    ");

        lblHeight.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblHeight.setText("Height");

        lblcube3.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblcube3.setText("m^3");

        lblsqm.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblsqm.setText("m^2");

        lblSurAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSurAns.setText("   ");

        lblVolAns.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblVolAns.setText("   ");

        lblVol.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblVol.setText("Volume");

        lblSurfaceArea.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblSurfaceArea.setText("Surface Area");

        btnCal.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnCal.setText("Calculate");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        lblm3.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm3.setText("m");

        btnInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnInfo.setText("Information");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        lblm2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm2.setText("m");

        lblm.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblm.setText("m");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSurfaceArea)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBaseSide)
                                        .addGap(71, 71, 71)
                                        .addComponent(lbla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHeight)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblm)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblm2))
                                    .addComponent(lblm4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(lblSurAns, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVol)
                                .addGap(129, 129, 129)
                                .addComponent(lblVolAns, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblm3))
                            .addComponent(lblsqm)
                            .addComponent(lblcube3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(btnCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblCopyright))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBaseSide)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeight)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblm4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblm3)
                                .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblc)
                                .addComponent(lblm2)
                                .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblb)
                                .addComponent(lblm)
                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbla)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSurfaceArea)
                                    .addComponent(lblSurAns)
                                    .addComponent(lblsqm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVol)
                                    .addComponent(lblVolAns)
                                    .addComponent(lblcube3)))
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkTriangle(float a, float b, float c) {
        return (a + b > c) && (a + c > b) && (c + b > a) && (a > 0) && (b * c > 0);
    }

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
        try {
            PhysixLib.Pyramid py = new PhysixLib.Pyramid(Float.parseFloat(txta.getText().toString()),
                    Float.parseFloat(txtb.getText().toString()),
                    Float.parseFloat(txtc.getText().toString()),
                    Float.parseFloat(txtHeight.getText().toString()));
            if (!checkTriangle(Float.parseFloat(txta.getText().toString()),
                    Float.parseFloat(txtb.getText().toString()),
                    Float.parseFloat(txtc.getText().toString()))) {
                throw new ArithmeticException();
            }
            if (Float.parseFloat(txtHeight.getText().toString())<=0) throw new NullPointerException();
            lblSurAns.setText(Float.toString(py.Area()));
            lblVolAns.setText(Float.toString(py.Volume()));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this,
                    "These are not three side of the base triangle\n"
                    + "Please enter again three side of the base triangle");
            lblSurAns.setText("");
            lblVolAns.setText("");
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,
                    "The height must be higher than zero.\n"
                    + "Please enter again the height");
            lblSurAns.setText("");
            lblVolAns.setText("");        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter information in the right form");
            lblSurAns.setText("");
            lblVolAns.setText("");
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        JFrame infoFr = new JFrame();
        infoFr.setContentPane(new PyramidInformation());
        infoFr.pack();
        infoFr.setVisible(true);
        infoFr.setTitle("About 4-face Pyramid");
        infoFr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel lblBaseSide;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblSurAns;
    private javax.swing.JLabel lblSurfaceArea;
    private javax.swing.JLabel lblVol;
    private javax.swing.JLabel lblVolAns;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblcube3;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblm2;
    private javax.swing.JLabel lblm3;
    private javax.swing.JLabel lblm4;
    private javax.swing.JLabel lblsqm;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    // End of variables declaration//GEN-END:variables
}
