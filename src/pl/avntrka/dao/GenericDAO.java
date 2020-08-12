package pl.avntrka.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T,PK extends  Serializable> {

    T create(T newObject);
    T read(PK primaryKey);
    boolean update(T updateObject);
    boolean delete(PK key);
    List<T> getAll();

}
