
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contrôleur implements ActionListener {

	Modèle refModl;
	
	public Contrôleur(Modèle m) {
		this.refModl = m;
		System.out.println("florian est sympa");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incrémente();
	}

	
}
