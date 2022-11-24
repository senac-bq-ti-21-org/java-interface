package projeto_interface;
import java.awt.*;
import javax.swing.*;
public class Imagem extends JFrame{
    private JLabel label;
    private ImageIcon icon;
    public Imagem(){
        this.setTitle("Labels");
        this.setSize(350,120);
        this.setLocation(50, 50);
        this.getContentPane().setLayout(new GridLayout(6, 6));
        this.getContentPane().setBackground(Color.YELLOW);

        this.icon = new ImageIcon("C:\\Users\\887335\\Pictures\\Saved Pictures\\perfil.png");
        this.label = new JLabel("LEFT", icon, JLabel.LEFT);
        this.getContentPane().add(this.label);

        this.icon = new ImageIcon("C:\\Users\\887335\\Pictures\\Saved Pictures\\perfil.png");
        this.label = new JLabel("RIGHT", icon, JLabel.RIGHT);
        this.getContentPane().add(this.label);

        this.icon = new ImageIcon("C:\\Users\\887335\\Pictures\\Saved Pictures\\perfil.png");
        this.label = new JLabel("CENTER", icon, JLabel.CENTER);
        this.getContentPane().add(this.label);

        this.icon = new ImageIcon("C:\\Users\\887335\\Pictures\\Saved Pictures\\perfil.png");
        this.label = new JLabel("HORIZONTAL", icon, JLabel.HORIZONTAL);
        this.getContentPane().add(this.label);
    }
    public static void main(String[] args) {
        Imagem janela = new Imagem();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(HIDE_ON_CLOSE);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
