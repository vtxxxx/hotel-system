package application;

import model.entities.Goods;
import model.entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Goods obj = new Goods (1, "Coke", 3.00, 5.00);
		System.out.println(obj);

		Rooms room = new Rooms(1, 500, true);
		System.out.println(room);
		
	}

}
