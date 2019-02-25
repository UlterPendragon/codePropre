package ex3;



public class Aquarium extends Zone {
	
	
	private static final double MASSE_MOYENNE = 0.2;
	public double calculerKgsNourritureParJour(){
	
		return listeAnimaux.size() * MASSE_MOYENNE;
	}

	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0;
	}
}
