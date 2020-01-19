package observator1;

import observator1.classes.DanePogodowe;
import observator1.classes.PrognozaWyswietl;
import observator1.classes.StatystykaWyswietl;
import observator1.classes.WarunkiBiezaceWyswietl;

public class Main {

	public static void main(String[] args) {

		DanePogodowe danePogodowe = new DanePogodowe();

		WarunkiBiezaceWyswietl warunkiBiezace = new WarunkiBiezaceWyswietl();
		StatystykaWyswietl statystyka = new StatystykaWyswietl();
		PrognozaWyswietl prognoza= new PrognozaWyswietl();
		
		danePogodowe.zarejestrujObserwatora(warunkiBiezace);
		danePogodowe.zarejestrujObserwatora(statystyka);
		danePogodowe.zarejestrujObserwatora(prognoza);		

		danePogodowe.odczytyZmiana(30);
		danePogodowe.powiadomObserwatorow();

		warunkiBiezace.wyswietl();
		statystyka.wyswietl();
		prognoza.wyswietl();


	}

}
