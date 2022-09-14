import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    private JPanel panelLoggingIn, toDoListPanel;
    private JPanel mainName, loginName, loginPasswordPanel, buttonsPanel;
    private Dimension mainDimension = new Dimension(400, 600);
    private Dimension elementsDimension = new Dimension(300, 200);
    private ButtonsLoginFrame buttonsLoginFrame = new ButtonsLoginFrame();

    LoginFrame() {
        super("ToDoApp Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        /**ToDoList Panel**/
        toDoListPanel = new JPanel();
        toDoListPanel.setPreferredSize(mainDimension);
        toDoListPanel.setBackground(new Color(0x3eff37));
        toDoListPanel.setLayout(new BorderLayout());

        mainName = new JPanel();
        mainName.setPreferredSize(elementsDimension);
        toDoListPanel.add(BorderLayout.CENTER, mainName);

        this.add(toDoListPanel, BorderLayout.WEST);
        /**ToDoList Panel**/

        /**panelLoggingIn panel**/
        panelLoggingIn = new JPanel();
        panelLoggingIn.setPreferredSize(mainDimension);
        panelLoggingIn.setBackground(Color.white);

        loginName = new JPanel();

        loginPasswordPanel = new JPanel();


        buttonsPanel = new JPanel();
        buttonsPanel.add(buttonsLoginFrame.getLoginButton());

        this.add(panelLoggingIn, BorderLayout.EAST);
        /**panelLoggingIn panel**/

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
