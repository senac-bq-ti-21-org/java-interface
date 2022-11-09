package projeto_interface;
import java.awt.Color;
import javax.swing.JFrame;
public class Interface extends JFrame {
    public Interface(){
        this.setTitle("Meu programa");
        this.setSize(1080,900);
        this.setLocation(300, 50);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }
    public static void main(String[] args) {
        Interface janela = new Interface();
        janela.setUndecorated(true);
        janela.setVisible(true);
        janela.getRootPane().setWindowDecorationStyle(HIDE_ON_CLOSE);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
