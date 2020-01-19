package observator2;

import java.util.Observable;
import java.util.Observer;

public class DanePogodowe extends Observable{
	int temperatura;
	String wilgotnosc;
	
	public void pobierzTemperature(int temperatura) {
		this.temperatura = temperatura;
	}
	public void pobierzWilgotnosc(String wilgotnosc) {
		this.wilgotnosc = wilgotnosc;		
	}
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}
	@Override
	public void notifyObservers() {
		super.setChanged();
		super.notifyObservers();
	}
	
	
	
}
