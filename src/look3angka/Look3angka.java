package look3angka;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Look3angka {
    public static void main(String[] args) {
       try {
            // Set System L&F
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
       
       String angka1, angka2, angka3;
       angka1 = JOptionPane.showInputDialog("Masukkan angka pertama!");
       String msg = "Angka pertama adalah " + angka1 + "!";
       angka2 = JOptionPane.showInputDialog("Masukkan angka kedua!");
       String msg2 = "Angka pertama adalah " + angka2 + "!";
       angka3 = JOptionPane.showInputDialog("Masukkan angka ketiga!");
       String msg3 = "Angka pertama adalah " + angka3 + "!";
       
       String msg_output = "Angka pertama adalah "+angka1+", Angka kedua adalah "
               + angka2+", Angka ketiga adalah " + angka3;
       
       JOptionPane.showMessageDialog(null, msg_output);
       
       
    }
    
}
