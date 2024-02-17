package exercicios.java.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JButton;

public class TextoTeste implements ActionListener {
    
    JTextField texto;
    JButton button;
    JLabel label1, label2;

    TextoTeste(){

        JFrame frame = new JFrame("E lá vamos nós...");

        frame.setLayout(new FlowLayout());
        frame.setSize(240, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        texto = new JTextField(10);
        texto.setActionCommand("maoe");

        button = new JButton("Reverter");

        texto.addActionListener(this);
        button.addActionListener(this);

        label1 = new JLabel("Digite alguma coisa: ");
        label2 = new JLabel("");

        frame.add(label1);
        frame.add(texto);
        frame.add(button);
        frame.add(label2);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("Reverter")){

            String aux1 = texto.getText();
            String aux2 = "";

            for(int i = aux1.length() - 1; i >= 0; i--)
                aux2 += aux1.charAt(i);

            texto.setText(aux2);

        } else
            label2.setText("O texto digitado foi: " + texto.getText());

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                new TextoTeste();

            }

        });

    }

}
