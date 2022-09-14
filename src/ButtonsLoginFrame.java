import javax.swing.*;
import java.awt.*;

public class ButtonsLoginFrame extends JButton {
    private JButton loginButton;

    ButtonsLoginFrame() {
        loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setFont(Font.getFont(Font.SERIF));
        loginButton.setFocusable(false);
        loginButton.setBackground(new Color(0x3eff37));
        loginButton.setForeground(Color.white);

    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
