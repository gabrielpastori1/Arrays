package br.puc.ed.game;

public class PainelPontuacao {

    private RegistroPontuacao[] registros;
    private int quantidadeRegistros;

    public PainelPontuacao(int capacidade) {
        registros = new RegistroPontuacao[capacidade];
        quantidadeRegistros = 0;
    }

    public void adicionar(RegistroPontuacao rp) {
        int novaPontuacao = rp.getPontuacao();
        if (quantidadeRegistros < registros.length
            || novaPontuacao > registros[quantidadeRegistros - 1]
            .getPontuacao()) {
            if (quantidadeRegistros < registros.length) {
                quantidadeRegistros++;
            }
            int j = quantidadeRegistros - 1;
            while (j > 0 && registros[j - 1].getPontuacao() < novaPontuacao) {
                registros[j] = registros[j - 1];
                j--;
            }
            registros[j] = rp;
        }
    }

    public void imprimir() {
        for (int i = 0; i < quantidadeRegistros; i++) {
            System.out
                .println(i + ": " + registros[i].getNome() + " / " + registros[i].getPontuacao());
        }
        System.out.println();
    }
}