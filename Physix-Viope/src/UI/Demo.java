package UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: DuyTung
 * Date: 15/05/13
 * Time: 06:49
 * To change this template use File | Settings | File Templates.
 */
public class Demo extends JFrame {

    public Demo(){
        addToContentPane();
    }

    public static void addToContentPane(){
        JFrame frame = new JFrame("Card Layout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel cards = new JPanel(new CardLayout());
        JJ1 jj1 = new JJ1();
        JJ2 jj2 = new JJ2();
        JJ3 jj3 = new JJ3();
        JJ4 jj4 = new JJ4();
        cards.add(jj1,"1");
        cards.add(jj2,"A");
        cards.add(jj3,"B");
        cards.add(jj4,"C");
        jj1.setAction(cards);
        jj2.setAction(cards);
        jj3.setAction(cards);
        jj4.setAction(cards);
        frame.add(cards);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                addToContentPane();
            }
        });
    }

}
