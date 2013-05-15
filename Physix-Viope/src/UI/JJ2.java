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
public class JJ2 extends  JPanel{
    JButton j1,j2,j3;
    public JJ2(){
        j1 = new JButton("C");
        j2 = new JButton("D");
        j3 = new JButton("back");


        add(j1);
        add(j2);
        add(j3);
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
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cl = (CardLayout)(c.getLayout());
                cl.show(c,"1");
            }
        });

    }
}