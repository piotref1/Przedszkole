package Main;

import javax.swing.*;


public class LogFrame extends JFrame  {

    public static LogPanel logPanel;


    public LogFrame(){
        initializeLayout();
    }

    private void initializeLayout(){

        logPanel = new LogPanel(this);
        add(logPanel);
        setTitle("Przedszkole");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}

