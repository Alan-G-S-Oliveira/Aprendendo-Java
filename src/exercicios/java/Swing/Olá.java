package exercicios.java.Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Olá implements ActionListener{

    JTextField texto;
    JLabel nome, ola;

    Olá(){

        JFrame frame = new JFrame("BAKA");
        
        frame.setLayout(new FlowLayout());
        frame.setSize(240, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JTextField(10);
        texto.setActionCommand("ma");
        texto.addActionListener(this);

        nome = new JLabel("Digite seu nome:");
        ola = new JLabel("");

        frame.add(nome);
        frame.add(texto);
        frame.add(ola);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        ola.setText("Olá " + texto.getText());

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                new Olá();

            }

        });

    }

    
}
