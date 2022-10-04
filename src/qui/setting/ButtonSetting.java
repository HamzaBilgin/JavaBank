/**
 *
 * @author hamza
 */

package qui.setting;

import java.awt.Color;
import javax.swing.JButton;

/*
Background and text color settings
*/

public class ButtonSetting {
    private static Color originalBgColor;
    public static void setBgFg(JButton button,Color bgColor,Color fgColor){
        originalBgColor = button.getBackground();
        originalBgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
    }
    public static void setOriginalBgFg (JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalBgColor);
    }
    
}

