import javax.swing.*;
import java.awt.*;

/**
 * GUI Methods - CS 180 Project 5
 *
 * @author Aryan Wadhwani, Gowri Harish, CS 18000
 * @version 15th November 2019
 */
public class GUIMethods {
    private static String getHostnameAndPort(String message, String title) {
        ImageIcon icon = new ImageIcon("JavaCup.png");
        return (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION,
                icon, null, "");
    }

    public static String getHostName() {
        return getHostnameAndPort("What is the HostName you'd like to connect to?", "Hostname?");
    }

    public static String getPort() {
        return getHostnameAndPort("What is the port you'd like to connect to?", "Port?");
    }

    public static String conformInfo(String message){
        ImageIcon icon = new ImageIcon("JavaCup.png");
        return (String) JOptionPane.showInputDialog(null, message, "Confirm info",
                JOptionPane.YES_NO_OPTION, icon, null, "");
    }
}