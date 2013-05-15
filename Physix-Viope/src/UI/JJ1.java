package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: DuyTung
 * Date: 15/05/13
 * Time: 06:33
 * To change this template use File | Settings | File Templates.
 */
public class JJ1 extends JPanel{
    JButton j1,j2;
    public JJ1(){
        j1 = new JButton("A");
        j2 = new JButton("B");
        add(j1);
        add(j2);
    }

    public void setAction(JPanel cards){
        final JPanel c = cards;
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cl = (CardLayout)(c.getLayout());
                cl.show(c,j1.getText());
            }
        });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cl = (CardLayout)(c.getLayout());
                cl.show(c,j2.getText());
            }
        });

    }
}
