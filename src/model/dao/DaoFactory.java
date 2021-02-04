package model.dao;

import model.dao.impl.RoomsDaoJDBC;

public class DaoFactory {

	public static RoomsDao createRoomsDao() {
		return new RoomsDaoJDBC();
	}
}
