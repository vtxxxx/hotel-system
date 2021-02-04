package model.dao;

import java.util.List;

import model.entities.Rooms;

public interface RoomsDao {

	void insert(Rooms obj);
	void update(Rooms obj);
	void deleteById(Integer id);
	Rooms findById(Integer id);
	List<Rooms> findAll();
}
