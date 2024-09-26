/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author breno
 */
public class FirstWin extends JFrame {

    private JButton steam, nexus, disney, prime, google, twitch;

    public void criarComponentes() {
        setTitle("PassApp");
        setSize(1440, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Selecione um:");
        t1.setBounds(520, 30, 300, 100);
        t1.setFont(new Font("Arial", Font.BOLD, 40));

        JLabel t2 = new JLabel("Criado por: Breno Rissi Fernandes!");
        t2.setBounds(1240, 640, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 10));

        steam = new JButton("Steam");
        steam.setBounds(300, 200, 200, 50);
        steam.setFont(new Font("Arial", Font.BOLD, 20));

        nexus = new JButton("NexusMods");
        nexus.setBounds(550, 200, 200, 50);
        nexus.setFont(new Font("Arial", Font.BOLD, 20));

        disney = new JButton("Disney+");
        disney.setBounds(800, 200, 200, 50);
        disney.setFont(new Font("Arial", Font.BOLD, 20));

        prime = new JButton("Amazon Prime");
        prime.setBounds(300, 290, 200, 50);
        prime.setFont(new Font("Arial", Font.BOLD, 20));

        google = new JButton("Google");
        google.setBounds(550, 290, 200, 50);
        google.setFont(new Font("Arial", Font.BOLD, 20));

        twitch = new JButton("Twitch");
        twitch.setBounds(800, 290, 200, 50);
        twitch.setFont(new Font("Arial", Font.BOLD, 20));

        this.add(t1);
        this.add(t2);
        this.add(steam);
        this.add(nexus);
        this.add(disney);
        this.add(prime);
        this.add(google);
        this.add(twitch);
    }

    public void adicionarAction() {
        this.steam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("Steam");
            }

        });

        this.nexus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("NexusMods");
            }

        });

        this.disney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("Disney+");
            }

        });

        this.prime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("Amazon Prime");
            }

        });

        this.google.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("Google");
            }

        });

        this.twitch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanela("Twitch");
            }

        });
    }

    public void abrirJanela(String title) {
        switch (title) {
            case "Steam":
                SecondWin tela1 = new SecondWin(SecondWin.Source.STEAM);
                tela1.setVisible(true);
                break;
            case "NexusMods":
                SecondWin tela2 = new SecondWin(SecondWin.Source.NEXUS);
                tela2.setVisible(true);
                break;
            case "Disney+":
                SecondWin tela3 = new SecondWin(SecondWin.Source.DISNEY);
                tela3.setVisible(true);
                break;
            case "Amazon Prime":
                SecondWin tela4 = new SecondWin(SecondWin.Source.PRIME);
                tela4.setVisible(true);
                break;
            case "Google":
                SecondWin tela5 = new SecondWin(SecondWin.Source.GOOGLE);
                tela5.setVisible(true);
                break;
            case "Twitch":
                SecondWin tela6 = new SecondWin(SecondWin.Source.TWITCH);
                tela6.setVisible(true);
                break;
        }

    }

    public FirstWin() {
        criarComponentes();
        adicionarAction();
    }
}
