package exercicios.java.Swing;

import javax.swing.*;

public class SwingTeste {
    
    SwingTeste(){

        JFrame frame = new JFrame("Testando 1 2 3...");

        frame.setSize(480, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("YAMETE KUDASAI");

        frame.add(label);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run(){

                new SwingTeste();

            }


        });

    }

}
