package jogo;

import jplay.GameImage;
import jplay.URL;
import jplay.Window;

public class Cenario {
	private Window janela;
	private GameImage cena;
	private Jogador jogador;
	
	public Cenario(Window window){
		janela = window;
		cena = new GameImage(URL.sprite("fantasy_001_800x600.png"));
		jogador = new Jogador(640, 350);
		executar();
	}
	
	private void executar(){
		while(true){
			cena.draw();
			jogador.draw();
			jogador.mover(janela);
			janela.update();
		}
	}
}
