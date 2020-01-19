package observator1.classes;

import observator1.interfaces.Obserwator;
import observator1.interfaces.WyswietlElement;

public class NowyTrybWyswietl implements Obserwator, WyswietlElement {
	DanePogodowe danePogodowe;

	@Override
	public void wyswietl() {
		System.out.println("Nowy tryb:");
		System.out.println("Temperatura: " + danePogodowe.stopnie);
		System.out.println("Pogoda: " + danePogodowe.pogoda);
		
	}

	@Override
	public void akutalizacja(DanePogodowe danePogodowe) {
		this.danePogodowe = danePogodowe;
		
	}
	
}
