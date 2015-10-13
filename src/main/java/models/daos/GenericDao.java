package models.daos;

import java.util.ArrayList;

public interface GenericDao<T, ID> {

	void create(T entity);

	T read(ID id);

	void update(T entity);

	void deleteById(ID id);

	ArrayList<T> findAll();

}