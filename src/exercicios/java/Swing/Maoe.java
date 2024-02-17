package exercicios.java.Swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Maoe implements ActionListener{

    JLabel label1, label2;
    JTextField texto;
    JButton botão;

    String senha = "123ah3v92";

    Maoe(){

        JFrame frame = new JFrame("Um tapa na gostosa");

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.blue);

        label1 = new JLabel("Digite a senha:");
        label2 = new JLabel("");

        texto = new JTextField(20);
        texto.setActionCommand("yamete");
        texto.addActionListener(this);

        botão = new JButton("Apagar");
        botão.setBackground(Color.green);
        botão.addActionListener(this);

        frame.add(label1);
        frame.add(texto);
        frame.add(botão);
        frame.add(label2);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("Apagar")){

            texto.setText("");
            label2.setText("");
        
        } else {

            if(senha.equals(texto.getText()))
                label2.setText("Senha correta.");
            else
                label2.setText("Senha incorreta.");

        }

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                new Maoe();

            }

        });

    }
    
}
