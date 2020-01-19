package observator2;

public class Main {

	public static void main(String[] args) {

		DanePogodowe danePogodowe = new DanePogodowe();

		WarunkiBiezaceWyswietl warunkiBiezace = new WarunkiBiezaceWyswietl();
		StatystykaWyswietl statystyka = new StatystykaWyswietl();
		PrognozaWyswietl prognoza= new PrognozaWyswietl();
		
		danePogodowe.addObserver(warunkiBiezace);
		danePogodowe.addObserver(statystyka);
		danePogodowe.addObserver(prognoza);		

		danePogodowe.pobierzTemperature(15);
		danePogodowe.pobierzWilgotnosc("sucho");
		
		danePogodowe.notifyObservers();

		warunkiBiezace.wyswietl();
		statystyka.wyswietl();
		prognoza.wyswietl();


	}

}
