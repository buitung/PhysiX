/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author duyb
 */
public class UI extends JFrame {

    private JButton btnCalc;
    private JLabel lblX;
    private JLabel lblY;
    private JLabel lblZ;
    private JLabel lblMagnitude;
    private JLabel lblSqrMagnitude;
    private JPanel panel;
    private JTextField txtX;
    private JTextField txtY;
    private JTextField txtZ;
    private JTextField txtMagnitude;
    private JTextField txtSqrMagnitude;

    public UI() {
        initUI();
    }

    public final void initUI() {
        getContentPane().add(new Vector());
/*        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        lblX = new JLabel("X");
        lblX.setBounds(20, 20, 30, 30);
        lblY = new JLabel("Y");
        lblY.setBounds(20, 60, 30, 30);
        lblZ = new JLabel("Z");
        lblZ.setBounds(20, 100, 30, 30);
        lblMagnitude = new JLabel("Magnitude");
        lblMagnitude.setBounds(20, 140, 130, 30);
        lblSqrMagnitude = new JLabel("Square Magnitude");
        lblSqrMagnitude.setBounds(20, 180, 130, 30);
        txtX = new JTextField("");
        txtX.setBounds(150, 20, 130, 30);
        txtY = new JTextField("");
        txtY.setBounds(150, 60, 130, 30);
        txtZ = new JTextField("");
        txtZ.setBounds(150, 100, 130, 30);
        txtMagnitude = new JTextField("");
        txtMagnitude.setBounds(150, 140, 260, 30);
        txtSqrMagnitude = new JTextField("");
        txtSqrMagnitude.setBounds(150, 180, 260, 30);
        btnCalc = new JButton("Calculate");
        btnCalc.setBounds(300, 20, 110, 110);
        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float z = Float.parseFloat(txtZ.getText().toString());
                PhysixLib.Vector v = new PhysixLib.Vector(x,y,z);
                txtMagnitude.setText(Float.toString(v.Magnitude())); 
                txtSqrMagnitude.setText(Float.toString(v.SqrMagnitude())); 
           }
        });
        
        panel.add(lblX);
        panel.add(lblY);
        panel.add(lblZ);
        panel.add(lblMagnitude);
        panel.add(lblSqrMagnitude);
        panel.add(txtX);
        panel.add(txtY);
        panel.add(txtZ);
        panel.add(txtMagnitude);
        panel.add(txtSqrMagnitude);
        panel.add(btnCalc);
*/        
        setTitle("Vector UI");
        setSize(450, 270);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet.");
                UI ui = new UI();
                ui.setVisible(true);
            }
        });
    }
}
