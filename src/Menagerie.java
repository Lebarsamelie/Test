import java.util.ArrayList;

//test

public class Menagerie {
//	private JPanel monPanel;
	//private JRadioButton jr1 ; monPa	private J
	
	
		//monPanel = new JPanel();
		
	//jr1 = new JRadioButton("Radio 1");
	//jr1.addActionListener(new ActionRadio());
		

	//propriété
	private ArrayList<Animal> listeAnimaux;

	
	//initialiser les attributs d'objets.
	public Menagerie(){
		this.listeAnimaux = new ArrayList <Animal>();
	}
	
	//mettre en place l'accesseur informant du nombre d'animaux dans la menagerie
	public int getNombreAnimaux(){
		return this.listeAnimaux.size();
	}
	
	
	//Methode Arriver
	public void arriver(Animal unAnimal){
		this.listeAnimaux.add(unAnimal);
	}
	
	
	//methode Partir
	public void partir(Animal unAnimal){
		this.listeAnimaux.remove(unAnimal);
	}
	
	
	//methode presenter
	public String presenter(){
		String chaine = "*****Presentation de la menagerie*****";
		if(this.listeAnimaux.size()==0){
			chaine +="\n la menagerie ne possede aucun animal";
		}
		else{
			for(int i = 0; i < this.listeAnimaux.size(); i++){
				chaine += "\n" + this.listeAnimaux.get(i).toString();
			}
		}
		return chaine;
	}
	
}