package model.dao;

import java.util.List;

import model.entities.Rooms;

public interface GoodsDao {

	void insert(Rooms obj);
	void update(Rooms obj);
	void deleteById(Integer id);
	Rooms findById(Integer id);
	List<Rooms> findAll();
	
}
