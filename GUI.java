import javax.swing.*;

public class GUI {
    // GUI method for username input
    public String GuiQTitle(String title, String prompt) {
        String GuiATitleV = JOptionPane.showInputDialog(title, prompt);
        return GuiATitleV;
    }

    // GUI method for password input
    public String GuiQPassword(String title, String prompt) {
        String GuiAPasswordV = JOptionPane.showInputDialog(title, prompt);
        return GuiAPasswordV;
    }
}
