package javaswing;
import javax.swing.*;

class Swingdemo {
    JFrame jfrm;

    // Constructor
    Swingdemo() {
        jfrm = new JFrame("Simple Swing Application");
        jfrm.setSize(270, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jlab = new JLabel("Swing means powerful GUI");
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
    }
}

public class SwingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swingdemo();
            }
        });
    }
}
