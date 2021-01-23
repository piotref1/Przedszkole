package Main;

import Database.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppPanel extends JPanel implements ActionListener{

    public JButton bUzytkownicy, bGrafik, bZabawki, bWyloguj, bPowrot, bDodajUzytkownika, bUsunUzytkownika, bKupZabawki, bSprawdzStanZabawek, bSporzadzGrafik, bZobaczGrafik;
    public JPanel pUzytkownicy, pGrafik, pZabawki, pWyloguj, pMenu;
    public AppFrame appFrame;

    public AppPanel(AppFrame appFrame){
        this.appFrame = appFrame;
        initialize();
    }


    public void initialize(){
        pMenu = new JPanel();
        appFrame.setContentPane(pMenu);
        pMenu.setLayout(null);
        pMenu.setFocusable(true);
        pMenu.setPreferredSize(new Dimension(700,700));
        pMenu.setBackground(Color.black);
        appFrame.pack();


        bUzytkownicy = new JButton("UZYTKOWNICY");
        bUzytkownicy.setBounds(270,140,200,60);
        bUzytkownicy.setForeground(Color.BLACK);
        bUzytkownicy.setBackground(Color.CYAN);
        bUzytkownicy.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bUzytkownicy);
        bUzytkownicy.addActionListener(this);

        bZabawki = new JButton("ZABAWKI");
        bZabawki.setBounds(270,210,200,60);
        bZabawki.setForeground(Color.BLACK);
        bZabawki.setBackground(Color.CYAN);
        bZabawki.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bZabawki);
        bZabawki.addActionListener(this);

        bGrafik = new JButton("GRAFIK");
        bGrafik.setBounds(270,280,200,60);
        bGrafik.setForeground(Color.BLACK);
        bGrafik.setBackground(Color.CYAN);
        bGrafik.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bGrafik);
        bGrafik.addActionListener(this);

        bWyloguj = new JButton("WYLOGUJ");
        bWyloguj.setBounds(270,350,200,60);
        bWyloguj.setForeground(Color.BLACK);
        bWyloguj.setBackground(Color.CYAN);
        bWyloguj.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bWyloguj);
        bWyloguj.addActionListener(this);

        bPowrot = new JButton("POWROT");
        bPowrot.setBounds(270,350,200,60);
        bPowrot.setForeground(Color.BLACK);
        bPowrot.setBackground(Color.CYAN);
        bPowrot.setFont(new Font("Arial",Font.BOLD,16));
        bPowrot.addActionListener(this);


        bDodajUzytkownika = new JButton("DODAJ");
        bDodajUzytkownika.setBounds(270,210,200,60);
        bDodajUzytkownika.setForeground(Color.BLACK);
        bDodajUzytkownika.setBackground(Color.CYAN);
        bDodajUzytkownika.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bDodajUzytkownika);
        bDodajUzytkownika.addActionListener(this);

        bUsunUzytkownika = new JButton("USUN");
        bUsunUzytkownika.setBounds(270,280,200,60);
        bUsunUzytkownika.setForeground(Color.BLACK);
        bUsunUzytkownika.setBackground(Color.CYAN);
        bUsunUzytkownika.setFont(new Font("Arial",Font.BOLD,16));
        pMenu.add(bUsunUzytkownika);
        bUsunUzytkownika.addActionListener(this);

        bKupZabawki = new JButton("KUP");
        bKupZabawki.setBounds(270,210,200,60);
        bKupZabawki.setForeground(Color.BLACK);
        bKupZabawki.setBackground(Color.CYAN);
        bKupZabawki.setFont(new Font("Arial",Font.BOLD,16));
        bKupZabawki.addActionListener(this);

        bSprawdzStanZabawek = new JButton("STAN");
        bSprawdzStanZabawek.setBounds(270,280,200,60);
        bSprawdzStanZabawek.setForeground(Color.BLACK);
        bSprawdzStanZabawek.setBackground(Color.CYAN);
        bSprawdzStanZabawek.setFont(new Font("Arial",Font.BOLD,16));
        bSprawdzStanZabawek.addActionListener(this);

        bSporzadzGrafik = new JButton("SPORZADZ");
        bSporzadzGrafik.setBounds(270,210,200,60);
        bSporzadzGrafik.setForeground(Color.BLACK);
        bSporzadzGrafik.setBackground(Color.CYAN);
        bSporzadzGrafik.setFont(new Font("Arial",Font.BOLD,16));
        bSporzadzGrafik.addActionListener(this);

        bZobaczGrafik = new JButton("ZOBACZ");
        bZobaczGrafik.setBounds(270,280,200,60);
        bZobaczGrafik.setForeground(Color.BLACK);
        bZobaczGrafik.setBackground(Color.CYAN);
        bZobaczGrafik.setFont(new Font("Arial",Font.BOLD,16));
        bZobaczGrafik.addActionListener(this);


        pUzytkownicy = new JPanel();
        pUzytkownicy.setLayout(null);
        pUzytkownicy.setFocusable(true);
        pUzytkownicy.setPreferredSize(new Dimension(700,700));
        pUzytkownicy.setBackground(Color.black);
        pUzytkownicy.add(bDodajUzytkownika);
        pUzytkownicy.add(bUsunUzytkownika);


        pZabawki = new JPanel();
        pZabawki.setLayout(null);
        pZabawki.setFocusable(true);
        pZabawki.setPreferredSize(new Dimension(700,700));
        pZabawki.setBackground(Color.black);
        pZabawki.add(bKupZabawki);
        pZabawki.add(bSprawdzStanZabawek);


        pGrafik = new JPanel();
        pGrafik.setLayout(null);
        pGrafik.setFocusable(true);
        pGrafik.setPreferredSize(new Dimension(700,700));
        pGrafik.setBackground(Color.black);
        pGrafik.add(bSporzadzGrafik);
        pGrafik.add(bZobaczGrafik);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == bWyloguj){
            appFrame.dispose();
        }
        else if(source == bUzytkownicy){
            pUzytkownicy.add(bPowrot);
            appFrame.setContentPane(pUzytkownicy);
            appFrame.pack();
        }
        else if(source == bZabawki){
            pZabawki.add(bPowrot);
            appFrame.setContentPane(pZabawki);
            appFrame.pack();
        }
        else if(source == bGrafik){
            pGrafik.add(bPowrot);
            appFrame.setContentPane(pGrafik);
            appFrame.pack();
        }
        else if(source == bPowrot){
            appFrame.setContentPane(pMenu);
            appFrame.pack();
        }

    }
}
