package ua.lviv.lgs.hw7;

public class Main {

	public static void main(String[] args) {
		Su_27 su = new Su_27(15, 20, 100, 1000, "Синій");
		
		su.zapuskDvyguniv();
		su.vzlitAirplane();
		su.control.moveUP();
		su.control.moveLEFT();
		su.control.moveDOWN();
		su.control.moveRIGHT();
		su.stels();
		su.yUdar();
		su.turbo();
		su.posadkaAirplane();

	}

}
