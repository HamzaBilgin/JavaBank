
package qui.setting;

import javax.swing.JFrame;

/**
 *
 * @author hamza
 */
public class ActionSetting {
    public static void setVisible(JFrame oldFrame,JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
    
}
