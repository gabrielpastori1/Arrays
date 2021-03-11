package br.puc.ed.game;

public class PainelPontuacao {

    private RegistroPontuacao[] registros;
    private int quantidadeRegistros;
    private int capacidade;

    public PainelPontuacao(int capacity) {
        registros = new RegistroPontuacao[capacity];
        capacidade = capacity;
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

    public void add(RegistroPontuacao rp){
      if(quantidadeRegistros < registros.length){
        registros[quantidadeRegistros] = rp;
        quantidadeRegistros++;
      }else{
        int pontuacao = rp.getPontuacao();
        int index = -1; 
        int menor = 10^10;

        for(int i = 0; i < registros.length; i++){
          if(index == -1 || registros[i].getPontuacao() < menor){
            index = i;
            menor = registros[i].getPontuacao();
          }
        }
        registros[index] = rp;

      }
    }

    public void imprimir() {
        for (int i = 0; i < quantidadeRegistros; i++) {
            System.out
                .println(i + ": " + registros[i].getNome() + " / " + registros[i].getPontuacao());
        }
        System.out.println();
    }

    public RegistroPontuacao remover(int index) {
      RegistroPontuacao[] newRegistros = new RegistroPontuacao[capacidade];
      int count = 0;
      for(int i = 0; i < quantidadeRegistros; i++) {
        if(i == index) continue;
        newRegistros[count] = registros[i];
        count++;
      }
      RegistroPontuacao response = registros[index];
      registros = newRegistros;
      quantidadeRegistros--;
      return response;
    }
}