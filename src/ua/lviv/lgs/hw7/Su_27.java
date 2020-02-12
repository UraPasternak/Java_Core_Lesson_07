package ua.lviv.lgs.hw7;

import ua.lviv.lgs.hw7.inerface1.TehnologiaStels;
import ua.lviv.lgs.hw7.inerface1.TorboPryskorenia;
import ua.lviv.lgs.hw7.inerface1.YadernyiUdar;

public class Su_27 extends Airplane implements TorboPryskorenia, TehnologiaStels, YadernyiUdar {

	int maxSpeed;
	String color;
	AirplaneControl control = new AirplaneControl(); 

	public Su_27(int lengthAirplane, int widthAirplane, int weightAirplane, int maxSpeed, String color) {
		super(lengthAirplane, widthAirplane, weightAirplane);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void yUdar() {
		System.out.println("Скинуто " + (int) (1 + Math.random() * 10) + " ядерних боєголовок.");

	}

	@Override
	public void stels() {
		System.out.println("Включений режим стелс, латака не видно на " + (Math.random() * 60) + "хв.");

	}

	@Override
	public void turbo() {
		System.out.println(
				"Включений режим турбо і літак рухається зі швидкістю " + (maxSpeed + Math.random() * 100) + "км/год");

	}

}
