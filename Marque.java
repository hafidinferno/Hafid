
public class Marque extends NoeudAbstrait {

	public Marque(NoeudAbstrait frere) {
		super(frere);
	}


	@Override
	public boolean contient(String s) {

		if(s.isEmpty()) {
			return true;
		}
		if(frere==null) {
			return false ;
		}


		return frere.contient(s);
	}


	@Override
	public boolean prefixe(String s) {

		if(s.isEmpty()) {
			return true;
		}
		if(frere==null) {
			return false ;
		}

		return frere.prefixe(s);
	}



	@Override
	public int nbMots() {
		return 1+frere.nbMots();
	}



	@Override
	public NoeudAbstrait ajout(String s) {
		if(s.isEmpty()) {
			return this;
		}
		if(frere==null) {
			NoeudAbstrait n=new Marque(null) ;
			for(int i=s.length();i>=0;i--) {
				new Noeud(null,n,s.charAt(i));
			}
			frere =n;
		}
		return frere;
	}





	@Override
	public NoeudAbstrait suppr(String s) {
		if(s.isEmpty()) {
			return frere;
		}
		frere=frere.suppr(s);
		return frere;
	}



	@Override
	public String toString(String s) {
		String res = s + "\n";
		if(frere==null) {
			return res;
		}
		return res+frere.toString(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
