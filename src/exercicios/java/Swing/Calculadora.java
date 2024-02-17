package exercicios.java.Swing;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora implements ActionListener{

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton bAdd, bSub, bMul, bDiv, bEqu, bC;

    JLabel resultado;
    JTextField operação;

    Calculadora(){

        JFrame frame = new JFrame("Calculadora");

        frame.setLayout(new FlowLayout());
        frame.setSize(230, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("x");
        bDiv = new JButton("/");
        bEqu = new JButton("=");
        bC = new JButton("C");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bEqu.addActionListener(this);
        bC.addActionListener(this);

        resultado = new JLabel("");

        operação = new JTextField(18);
        operação.setActionCommand("yamete");
        operação.addActionListener(this);

        frame.add(operação);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bDiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bMul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bSub);
        frame.add(bC);
        frame.add(b0);
        frame.add(bEqu);
        frame.add(bAdd);
        frame.add(resultado);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        String aux = operação.getText();

        if(ae.getActionCommand().equals("1"))
            operação.setText(aux += "1");
        else if(ae.getActionCommand().equals("2"))
            operação.setText(aux += "2");
        else if(ae.getActionCommand().equals("3"))
            operação.setText(aux += "3");
        else if(ae.getActionCommand().equals("4"))
            operação.setText(aux += "4");
        else if(ae.getActionCommand().equals("5"))
            operação.setText(aux += "5");
        else if(ae.getActionCommand().equals("6"))
            operação.setText(aux += "6");
        else if(ae.getActionCommand().equals("7"))
            operação.setText(aux += "7");
        else if(ae.getActionCommand().equals("8"))
            operação.setText(aux += "8");
        else if(ae.getActionCommand().equals("9"))
            operação.setText(aux += "9");
        else if(ae.getActionCommand().equals("0"))
            operação.setText(aux += "0");
        else if(ae.getActionCommand().equals("+"))
            operação.setText(aux += "+");
        else if(ae.getActionCommand().equals("-"))
            operação.setText(aux += "-");
        else if(ae.getActionCommand().equals("x"))
            operação.setText(aux += "x");
        else if(ae.getActionCommand().equals("/"))
            operação.setText(aux += "/");
        else if(ae.getActionCommand().equals("=") || ae.getActionCommand().equals("yamete")){

            Boolean certo = true;
            boolean achou = false;
            double x, y, result;
            char op;
            
            String formula = operação.getText();
            String temp1, temp2, temp3;

            temp1 = temp2 = temp3 = "";

            for(int i = 0; i < formula.length(); i++){

                if(formula.charAt(i) != '+' && formula.charAt(i) != '-' && formula.charAt(i) != 'x' && formula.charAt(i) != '/' && !achou)
                    temp1 += formula.charAt(i);
                else if(!achou){

                    achou = true;
                    temp2 += formula.charAt(i);

                } else if(achou)
                    temp3 += formula.charAt(i);

            }
            
            x = Double.parseDouble(temp1);
            y = Double.parseDouble(temp3);
            op = temp2.charAt(0);

            result = Calcular.operação(x, y, op, certo);

            if(certo)
                resultado.setText("Resultado: " + Double.toString(result));
            else
                resultado.setText("Operação inválida");

        } else if(ae.getActionCommand().equals("C")){

            operação.setText("");
            resultado.setText("");

        }

    }
 
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run(){

                new Calculadora();

            }

        });

    }

}
