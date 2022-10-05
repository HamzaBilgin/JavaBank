package qui.setting;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author hamza
 */
public class TextSetting {

    /*
    Focus
     */
    private static String originalText;
    private static Color originalFgColor;

    public static void checkTheTextFocusGained(JTextField tf, String org) {
        originalText = org;
        if (tf.getText().trim().equals(org)) {
            originalFgColor = tf.getForeground();
            tf.setText("");
        }
        tf.setForeground(Color.red);

    }

    public static void checkTheTextFocusLost(JTextField tf) {
        if (tf.getText().trim().equals("")) {
            tf.setText(originalText);
            tf.setForeground(originalFgColor);
        } else {
            tf.setForeground(Color.black);
        }
    }

    /*
    Key setting
     */
    public static void setOnlyNumber(JTextField tf) {
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });

    }

    public static void setOnlyAlphabetic(JTextField tf) {
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

        });

    }
    /*
    Limit Setting
     */
    private static int limit;

    public static void setMaxLimit(JTextField tf, int lim) {
        limit = lim;
        tf.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a);
                }
            }

        });
    }
    public static boolean lengthIsItLessThan(int length,String str) {
        return (str.length() < length);
    }

    /*
    Money setting
     */
    public static int checkTheTextKeyReleased(JTextField tf, int moneyLimit) {
        String text = tf.getText();
        if (!text.equals("")) {
            int amount = Integer.valueOf(text);
            if (amount > moneyLimit) {
                amount = moneyLimit;
                tf.setText(String.valueOf(amount));
            }
            return amount;
        }
        return 0;
    }
    /*
    Text fields Control
    */
    public static boolean fiilingTextFields(JPanel panel){
        Component[] components = panel.getComponents();
        for(Component c : components){
            if(c instanceof JTextField){
                JTextField tf = (JTextField) c;
                if(tf.getText().trim().equals("")&&tf.isEnabled())
                    return false;
            }
        }
        return true;
           
    }
}
