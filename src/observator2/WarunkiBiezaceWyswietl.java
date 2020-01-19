package observator2;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {
	private DanePogodowe danePogodowe;

	@Override
	public void wyswietl() {
		System.out.println("Warunki biezace: ");
		System.out.println("Temperatura: " + danePogodowe.temperatura);
		System.out.println("Wilgotnosc: " + danePogodowe.wilgotnosc);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.danePogodowe = (DanePogodowe)arg0;
	}

}
