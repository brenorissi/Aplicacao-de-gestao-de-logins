/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author breno
 */
public class SecondWin extends JFrame {

    public enum Source {
        STEAM, NEXUS, DISNEY, PRIME, GOOGLE, TWITCH
    }
    JTextField eu, sen;
    JButton saveS, saveN, saveD, saveP, saveG, saveT, lookS, lookN, lookD, lookP, lookG, lookT;

    public void criarSteam() {
        setTitle("Steam");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveS = new JButton("Salvar");
        saveS.setBounds(120, 200, 100, 25);
        saveS.setFont(new Font("Arial", Font.BOLD, 12));

        lookS = new JButton("Ver login");
        lookS.setBounds(270, 200, 100, 25);
        lookS.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveS);
        this.add(lookS);
    }

    public void adicionarActionS() {
        this.saveS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosS(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosS();
            }

        });
    }

    public void adicionarActionN() {
        this.saveN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosN(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosN();
            }

        });
    }

    public void adicionarActionD() {
        this.saveN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosD(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosD();
            }

        });
    }

    public void adicionarActionP() {
        this.saveP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosP(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosP();
            }

        });
    }

    public void adicionarActionG() {
        this.saveG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosG(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosG();
            }

        });
    }

    public void adicionarActionT() {
        this.saveT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDadosT(eu.getText(), new String(sen.getText()));
            }

        });

        this.lookT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarDadosT();
            }

        });
    }

    private void salvarDadosS(String email, String senha) {
        try (FileWriter saveSteam = new FileWriter("steam.txt", true); BufferedWriter bw = new BufferedWriter(saveSteam)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosS() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("steam.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login da Steam", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    private void salvarDadosN(String email, String senha) {
        try (FileWriter saveNexus = new FileWriter("nexus.txt", true); BufferedWriter bw = new BufferedWriter(saveNexus)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosN() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("nexus.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login do NexusMods", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    private void salvarDadosD(String email, String senha) {
        try (FileWriter saveDisney = new FileWriter("disney.txt", true); BufferedWriter bw = new BufferedWriter(saveDisney)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosD() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("disney.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login do Disney+", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    private void salvarDadosP(String email, String senha) {
        try (FileWriter savePrime = new FileWriter("prime.txt", true); BufferedWriter bw = new BufferedWriter(savePrime)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosP() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("prime.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login do Amazon Prime", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    private void salvarDadosG(String email, String senha) {
        try (FileWriter saveGoogle = new FileWriter("google.txt", true); BufferedWriter bw = new BufferedWriter(saveGoogle)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosG() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("google.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login do Google", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    private void salvarDadosT(String email, String senha) {
        try (FileWriter saveTwitch = new FileWriter("twitch.txt", true); BufferedWriter bw = new BufferedWriter(saveTwitch)) {
            bw.write("E-mail/usuário: " + email + ", " + "Senha: " + senha);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage());
        }
    }

    private String[] carregarDadosT() {
        StringBuilder dados = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("twitch.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(this, dados.toString(), "Login da Twitch.tv", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
        return null;
    }

    public void criarNexus() {
        setTitle("NexusMods");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveN = new JButton("Salvar");
        saveN.setBounds(120, 200, 100, 25);
        saveN.setFont(new Font("Arial", Font.BOLD, 12));

        lookN = new JButton("Ver login");
        lookN.setBounds(270, 200, 100, 25);
        lookN.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveN);
        this.add(lookN);
    }

    public void criarDisney() {
        setTitle("Disney+");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveD = new JButton("Salvar");
        saveD.setBounds(120, 200, 100, 25);
        saveD.setFont(new Font("Arial", Font.BOLD, 12));

        lookD = new JButton("Ver login");
        lookD.setBounds(270, 200, 100, 25);
        lookD.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveD);
        this.add(lookD);
    }

    public void criarPrime() {
        setTitle("Amazon Prime");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveP = new JButton("Salvar");
        saveP.setBounds(120, 200, 100, 25);
        saveP.setFont(new Font("Arial", Font.BOLD, 12));

        lookP = new JButton("Ver login");
        lookP.setBounds(270, 200, 100, 25);
        lookP.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveP);
        this.add(lookP);
    }

    public void criarGoogle() {
        setTitle("Google");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveG = new JButton("Salvar");
        saveG.setBounds(120, 200, 100, 25);
        saveG.setFont(new Font("Arial", Font.BOLD, 12));

        lookG = new JButton("Ver login");
        lookG.setBounds(270, 200, 100, 25);
        lookG.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveG);
        this.add(lookG);
    }

    public void criarTwitch() {
        setTitle("Twitch");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel t1 = new JLabel("Email ou usuário:");
        t1.setBounds(165, 20, 200, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel t2 = new JLabel("Senha:");
        t2.setBounds(210, 90, 200, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 20));

        eu = new JTextField();
        eu.setBounds(120, 70, 250, 20);

        sen = new JTextField();
        sen.setBounds(120, 140, 250, 20);

        saveT = new JButton("Salvar");
        saveT.setBounds(120, 200, 100, 25);
        saveT.setFont(new Font("Arial", Font.BOLD, 12));

        lookT = new JButton("Ver login");
        lookT.setBounds(270, 200, 100, 25);
        lookT.setFont(new Font("Arial", Font.BOLD, 12));

        this.add(t1);
        this.add(t2);
        this.add(sen);
        this.add(eu);
        this.add(saveT);
        this.add(lookT);
    }

    public SecondWin(Source source) {
        if (source == Source.STEAM) {
            criarSteam();
            adicionarActionS();
        }
        if (source == Source.NEXUS) {
            criarNexus();
            adicionarActionN();
        }
        if (source == Source.DISNEY) {
            criarDisney();
            adicionarActionD();
        }
        if (source == Source.PRIME) {
            criarPrime();
            adicionarActionP();
        }
        if (source == Source.GOOGLE) {
            criarGoogle();
            adicionarActionG();
        }
        if (source == Source.TWITCH) {
            criarTwitch();
            adicionarActionT();

        }
    }
}
