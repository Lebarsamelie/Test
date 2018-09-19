import java.util.Scanner;

public class Main {
	
	public static Scanner clavier = new Scanner(System.in);


	public static void main(String[] args) {

		Animal unAnimal = new Animal ("arthur");
		Animal unAutreAnimal = new Animal ("Max", "Tortue");
		
		System.out.println(unAnimal.versChaine());
		System.out.println(unAutreAnimal.versChaine());

				//menu choix
				System.out.println("Menu \n1 = Ajouter un animaux \n2 = Rechercher un animaux \3 = Modifier un animaux \4 supprimer un animaux");
				String choix = clavier.nextLine();
				switch (choix){
					case 1: 
						System.out.println("Nom du animaux");
						nom = clavier.nextLine();
						System.out.println("Type du animaux");
						type1 = clavier.nextLine();
						
						break;
						
					case 2:
						System.out.println("Nom du animaux à rechercher : ");
						nom = clavier.nextLine();
						if (unAnimal.rechercher(nom)) {
							System.out.println("Le animaux " + nom + " est présent dans le pokedex");
						}
						else {
							System.out.println("Le animaux n'est pas présent dans le pokedex");
						}
			        break;
						
					case 3:
						System.out.println("Nom du animaux a modifier : ");
						nom = clavier.nextLine();
			        
			        break;
						
						
					case 4:
						
						break;
				}
				
		
		
		
	}

}
