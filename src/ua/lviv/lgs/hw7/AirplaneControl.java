package ua.lviv.lgs.hw7;

public class AirplaneControl {
	void moveUP(){
		System.out.println("Літак рухається вверх на " + (int)(1 + Math.random()*100) + "км");
	}
	void moveDOWN(){
		System.out.println("Літак рухається вниз на " + (int)(1 + Math.random()*100) + "км");
	}
	void moveLEFT(){
		System.out.println("Літак рухається вліво на " + (int)(1 + Math.random()*100) + "км");
	}
	void moveRIGHT(){
		System.out.println("Літак рухається вправо на " + (int)(1 + Math.random()*100) + "км");
	}
}
