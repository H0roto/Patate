
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contrôleur implements ActionListener {

	//j'ai rajouté un comment
	Modèle refModl;
	
	
	public Contrôleur(Modèle m) {
		this.refModl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incrémente();
		System.out.println("hello");
	}
	public void xboxone(String s) {
		System.out.println(s);
	}

	public void bonjour() {
		System.out.println("teamwork makes the dream work");
	}

}
