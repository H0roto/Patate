
import java.util.Observable;

public class Modèle extends Observable {
	//C'est super
	int compte;
	
	public Modèle() {
		this.compte = 0;
	}

	public void incrémente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
