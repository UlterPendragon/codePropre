package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {
	
	private static final double MASSE_MOYENNE = 10.0;

	public double calculerKgsNourritureParJour(){
		return listeAnimaux.size() * MASSE_MOYENNE;
	}

	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0;
	}
}
