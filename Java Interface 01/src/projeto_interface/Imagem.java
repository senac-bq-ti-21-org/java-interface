package projeto_interface;
import java.awt.*;
import javax.swing.*;
public class Imagem extends JFrame{
    private JLabel label1, label2;
    private ImageIcon icone = new ImageIcon("CAMINHO_DA_IMAGEM");
    public Imagem(){
        this.setTitle("Labels");
        this.setSize(350,120);
        this.setLocation(50, 50);
        this.getContentPane().setBackground(Color.YELLOW);
        this.label1 = new JLabel("Esquerda", icone, JLabel.LEFT);
        this.label2 = new JLabel("Direita", JLabel.RIGHT);
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.label2);
    }
    public static void main(String[] args) {
        Imagem janela = new Imagem();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(HIDE_ON_CLOSE);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
