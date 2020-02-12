package ua.lviv.lgs.hw7;

public abstract class Airplane {
	int lengthAirplane;
	int widthAirplane;
	int weightAirplane;
	
	public Airplane(int lengthAirplane, int widthAirplane, int weightAirplane) {
		super();
		this.lengthAirplane = lengthAirplane;
		this.widthAirplane = widthAirplane;
		this.weightAirplane = weightAirplane;
	}
	
	void zapuskDvyguniv(){
		System.out.println("Літак злітає через " + (20 + Math.random()*88) + "хв.");
	};
	void vzlitAirplane(){
		System.out.println("Літак пролетить " + (Math.random()*1000) + "км");
	};
	void posadkaAirplane(){
		System.out.println("Літак іде на посадку!!!");
	};
	
}
