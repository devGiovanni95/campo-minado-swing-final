package br.com.giovanni.cm.visao;

import br.com.giovanni.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;
public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(
                tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
        tabuleiro.registrarObservadores(e -> {

            SwingUtilities.invokeLater(() -> {
                if (e.isGanhou()){
                    JOptionPane.showMessageDialog(this, "Ganhou :)");
                }else {
                    JOptionPane.showMessageDialog(this, "Perdeu :(");
                }

                tabuleiro.reiniciar();
            });
//para nao ter problema de executar uma coisa depoius que fechar o campo
// como mostrar o x que ativou as bombas depois que fechar a tela usamos o INVOKERLATER
//            if (e.isGanhou()){
//                JOptionPane.showMessageDialog(this, "Ganhou :)");
//            }else {
//                JOptionPane.showMessageDialog(this, "Perdeu :(");
//            }



            //TODO mostrar resultado pro usuario!!

//            tabuleiro.reiniciar();
        });

//        int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
//
//        for (int i = 0; i< total; i++){
//            add(new BotaoCampo(null));
//            add(new JButton());
//        }
    }
}
