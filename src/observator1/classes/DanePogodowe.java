package observator1.classes;

import java.util.ArrayList;
import java.util.List;

import observator1.interfaces.Obserwator;
import observator1.interfaces.Podmiot;

public class DanePogodowe implements Podmiot{

	int stopnie;
	String pogoda;
	List<Obserwator> obserwatorzy = new ArrayList<>();
	boolean zmienione;

	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		this.obserwatorzy.add(obserwator);		
	}

	@Override
	public void usunObserwatora(Obserwator obserwator) {
		this.obserwatorzy.remove(obserwator);		
	}

	@Override
	public void powiadomObserwatorow() {
		ustawOdczyty();
		if(zmienione)
			for(Obserwator o : obserwatorzy) {
				o.akutalizacja(this);
			}		
		zmienione = false;
	}

	public void ustawOdczyty() {
		zmienione = true;
	}
	public void odczytyZmiana(int stopnie) {
		this.stopnie = stopnie;
		if(stopnie < 30)
			this.pogoda = "brzydka";
		else
			this.pogoda = "ladna";
	}


}
