package br.com.giovanni.cm.visao;

import br.com.giovanni.cm.modelo.Tabuleiro;

import javax.swing.*;


public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 5);
//        PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
//
//        add(painelTabuleiro);
        add(new PainelTabuleiro(tabuleiro));


        setTitle("Campo Minado"); //titulo da janela
        setSize(690, 438);//tamanho da tela
        setLocationRelativeTo(null); // centralização da tela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // fechar aplicaçaõ no fechamento da aba
        setVisible(true); // pra aba aparecer
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

}
