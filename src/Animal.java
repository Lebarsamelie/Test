
public class Animal {

	private String espece;
	private String nom;
	private String type1;
	
//accesseurs
	
	/**
	 * @param unNom donne une valeur nom
	 */
	public void setNom(String unNom){
		this.nom = unNom;
	}
	
	/**
	 * @return le nom de l'animal
	 */
	public String gettype1 (){
		return this.type1;
	}
	
	/**
	 * @param unNom donne une valeur nom
	 */
	public void settype1(String untype1){
		this.type1 = untype1;
	}
	
	/**
	 * @return le nom de l'animal
	 */
	public String getNom (){
		return this.nom;
	}

	/**
	 * @param uneEspece donne une valeur espece
	 */
	public void setEspece(String uneEspece){
		this.espece = uneEspece;
	}
	
	/**
	 * @return l'espece de l'animal
	 */
	public String getEspece(){
		return this.espece;
	}

	
//methode toString

	public String versChaine(){
		String chaine = "Nom : " + this.nom + "\n";
		if (this.espece != null)
			chaine = chaine + "Espece " + this.espece;
		return chaine;
	}
	
//constructeur défaut
	
	public Animal (){
		
	}

//constructeurs

	/**
	 * @param unNom Constructeur de la class Animal
	 */
	public Animal (String unNom){
		this.nom = unNom;
	}
	
	public Animal (String unNom, String uneEspece){
		this.nom = unNom;
		this.espece = uneEspece;
	}
	
	//erreur de signature
	// public Animal (String uneEspece){
	//	 this.espece = uneEspece;
	// }



}