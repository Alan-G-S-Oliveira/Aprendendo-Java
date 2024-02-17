package exercicios.java.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotãoTeste implements ActionListener{
    
    JLabel label;

    BotãoTeste(){

        JFrame frame = new JFrame("Testando essa merda.");

        frame.setLayout(new FlowLayout());
        frame.setSize(630, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton up = new JButton("Vai subir?");
        JButton down = new JButton("Vai descer?");

        up.addActionListener(this);
        down.addActionListener(this);

        frame.add(up);
        frame.add(down);

        label = new JLabel("Aperte um botão: ");
        
        frame.add(label);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("Vai subir?"))
            label.setText("Subiu!!!");
        else
            label.setText("Desceu!!!");

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            public void run(){

                new BotãoTeste();

            }

        });

    }

}
