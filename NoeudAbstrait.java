public abstract class NoeudAbstrait {
	protected NoeudAbstrait frere;
	public NoeudAbstrait(NoeudAbstrait frere) {
		this.frere=frere;
	}
	public abstract boolean contient(String s);
	public abstract boolean prefixe(String s);
	public abstract int nbMots(); 
	public abstract NoeudAbstrait ajout(String s);
	public abstract NoeudAbstrait suppr(String s);
	public abstract String toString(String s); 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoeudAbstrait entree = new Marque(null);

		System.out.print(">>>" +entree.toString(""));

		entree.ajout("toto");
		entree.ajout("toto");
		entree.ajout("titi");
		entree.ajout("tomate");
		entree.ajout("tot");

		entree.ajout("dupon");

		System.out.print(entree.toString(""));

	}
}

