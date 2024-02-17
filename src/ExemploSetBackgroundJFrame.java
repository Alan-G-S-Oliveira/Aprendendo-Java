import javax.swing.*;
import java.awt.*;

public class ExemploSetBackgroundJFrame extends JFrame {

    public ExemploSetBackgroundJFrame() {
        // Configurações básicas do JFrame
        setTitle("Exemplo setBackground em JFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Define a cor de fundo do JFrame usando setBackground
        setBackground(Color.GREEN);

        // Adiciona algum conteúdo ao JFrame (por exemplo, um rótulo)
        JLabel label = new JLabel("Olá, Mundo!");
        add(label);
    }

    public static void main(String[] args) {
        // Cria e exibe o JFrame
        SwingUtilities.invokeLater(() -> {
            ExemploSetBackgroundJFrame exemplo = new ExemploSetBackgroundJFrame();
            exemplo.setVisible(true);
        });
    }
}
