package exercicios.java.Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SeleçãoTeste implements ItemListener{
    
    JLabel menu, selecionado;
    JCheckBox a, b, c, aux;

    SeleçãoTeste(){

        JFrame frame = new JFrame("ara ara");

        frame.setLayout(new FlowLayout());
        frame.setSize(160, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new JLabel("Escolha uma opção:");
        selecionado = new JLabel("");

        a = new JCheckBox("A");
        b = new JCheckBox("B");
        c = new JCheckBox("C");

        a.addItemListener(this);
        b.addItemListener(this);
        c.addItemListener(this);

        frame.add(menu);
        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(selecionado);
        frame.setVisible(true);

    }

    public void itemStateChanged(ItemEvent ie){

        JCheckBox ol = (JCheckBox) ie.getItem();

        if(ol.isSelected()){

            selecionado.setText("A caixa " + ol.getText() + " foi selecionada.");

            if(aux != null){

                if(aux.getText() != ol.getText()){

                    aux.setSelected(false);

                }

            }

            aux = ol;
        
        }
        else
            selecionado.setText("");

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){

            public void run(){

                new SeleçãoTeste();

            }

        });

    }

}
