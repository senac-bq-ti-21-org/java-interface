package projeto_interface;
import javax.swing.JOptionPane;
public class Dialogo {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Nome de usuário:", "Login", JOptionPane.QUESTION_MESSAGE);
        if(s == null) {
            return;
        }
        if(JOptionPane.showConfirmDialog(null, "Sério", "Atenção", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            JOptionPane.showMessageDialog(null, s, "Entedimento computado.", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, s, "Login não confirmado.", JOptionPane.WARNING_MESSAGE);
            String [] nomes = {"exit", "Gabriel", "Andreliane", "Pedro"};
            int resp = JOptionPane.showOptionDialog(null, "Escolha Login padrão:", "Login no sistema", 0, JOptionPane.INFORMATION_MESSAGE, null, nomes, nomes[1]);
            if(resp == 0) {
                JOptionPane.showMessageDialog(null, "Login " + s + " inválido.", "Erro.", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
