package Main;

import javax.swing.*;

public class AppFrame extends JFrame {

    public AppPanel appPanel;


    public AppFrame(){
        initialize();
    }

    public void initialize(){

        appPanel = new AppPanel(this);
        add(appPanel);
        setTitle("Przedszkole");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


    }


}
