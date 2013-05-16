/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.Panel.FrontPage;
import UI.Panel.Geo;
import UI.Panel.Trig;
import UI.Panel.Vector;
import java.awt.CardLayout;
import java.awt.SplashScreen;
import javax.swing.*;

/**
 *
 * @author DuyTung
 */
public final class MainUI extends JFrame {

    public MainUI() {
        setSplashScreen();
        addToContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public void setSplashScreen() {
        final SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            try {
                Thread.sleep(1000);             // wait a second
            } catch (InterruptedException ex) {
            }
            splash.close();
        }
    }

    public void addToContentPane() {
        setTitle("Front Page");
        FrontPage frontP = new FrontPage(this);
        Geo geoP = new Geo(this);
        Trig trigP = new Trig(this);
        Vector vecP = new Vector(this);
        JPanel cards = new JPanel(new CardLayout());
        cards.add(frontP, "Front Page");
        cards.add(geoP, "Geo Page");
        cards.add(trigP, "Trig Page");
        cards.add(vecP,"Vec Page");
        frontP.setActionToPerform(cards);
        geoP.setActionToPerform(cards);
        trigP.setActionToPerform(cards);
        vecP.setActionToPerform(cards);
        //cards.add(cards)
        add(cards);
        pack();

    }

    public static void main(String[] args) {
        //Set the Nimbus look and feel
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainUI mainUI = new MainUI();
            }
        });
    }
}
