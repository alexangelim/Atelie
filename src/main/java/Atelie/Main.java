package Atelie;

import Atelie.view.menuGUI;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) throws Exception {

        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        menuGUI form = new menuGUI();

        form.setExtendedState(MAXIMIZED_BOTH);
        form.setVisible(true);
    }
    
}
