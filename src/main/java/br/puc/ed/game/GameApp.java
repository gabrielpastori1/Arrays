package br.puc.ed.game;

public class GameApp {

  public static void main(String[] args) {
    PainelPontuacao painelPontuacao = new PainelPontuacao(5);
    painelPontuacao.adicionar(new RegistroPontuacao("Lúcia", 57));
    painelPontuacao.adicionar(new RegistroPontuacao("Ricardo", 79));
    painelPontuacao.adicionar(new RegistroPontuacao("Maria", 42));
    painelPontuacao.adicionar(new RegistroPontuacao("Erick", 50));
    painelPontuacao.imprimir();
    painelPontuacao.adicionar(new RegistroPontuacao("Vinícius", 55));
    painelPontuacao.imprimir();
    painelPontuacao.adicionar(new RegistroPontuacao("João", 43));
    painelPontuacao.imprimir();
    painelPontuacao.adicionar(new RegistroPontuacao("Rafael", 35));
    painelPontuacao.add(new RegistroPontuacao("Lucas", 90));
    painelPontuacao.imprimir();
    painelPontuacao.add(new RegistroPontuacao("Fernando", 15));
    painelPontuacao.imprimir();
    // painelPontuacao.remover(3);
    // painelPontuacao.imprimir();
    // 
  }
}
