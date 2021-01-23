package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LogPanel extends JPanel implements ActionListener {

    public JTextField tLogin;
    public JPasswordField pfPassword;
    public JLabel lLogin, lPassword, lPrzedszkole;
    public JButton bLogin;
    public String login, password;
    public volatile boolean logged;
    public LogFrame logFrame;


    public LogPanel(LogFrame logFrame){
        this.logFrame = logFrame;
        initialize();
    }

    private void initialize(){

        setLayout(null);
        setFocusable(true);
        setPreferredSize(new Dimension(500,400));

        setBackground(Color.black);

        tLogin = new JTextField();
        tLogin.setBounds(220,150,100,20);
        this.add(tLogin);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(220,190,100,20);
        this.add(pfPassword);

        lLogin = new JLabel("LOGIN");
        lLogin.setBounds(170,150,50,20);
        lLogin.setForeground(Color.white);
        this.add(lLogin);

        lPassword = new JLabel("HASLO");
        lPassword.setBounds(170,190,50,20);
        lPassword.setForeground(Color.white);
        this.add(lPassword);

        bLogin = new JButton("ZALOGUJ SIE");
        bLogin.setBounds(172,230,150,30);
        bLogin.setForeground(Color.BLACK);
        bLogin.setBackground(Color.GREEN);
        bLogin.setFont(new Font("Arial",Font.BOLD,16));
        this.add(bLogin);
        bLogin.addActionListener(this);

        lPrzedszkole = new JLabel("PRZEDSZKOLE");
        lPrzedszkole.setBounds(130,60,250,40);
        lPrzedszkole.setForeground(Color.white);
        lPrzedszkole.setFont(new Font("Arial",Font.BOLD,30));
        this.add(lPrzedszkole);

        logged = false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source==bLogin){

            login = tLogin.getText();
            password = pfPassword.getText();

            if(login.equals("1") && password.equals("1")){

                new AppFrame();
                logFrame.dispose();

            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "     ZLY LOGIN LUB HASLO", "BLAD", JOptionPane.ERROR_MESSAGE);
            }


        }
    }
}
