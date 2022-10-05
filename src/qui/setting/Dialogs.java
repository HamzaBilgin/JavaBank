
package qui.setting;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialogs {
    
    public static void notEmptyMessageShow(JFrame frame){
        JOptionPane.showMessageDialog(frame, "All fields must be filled !");
    }
    public static void privateMessageShow(JFrame frame,String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    
}
