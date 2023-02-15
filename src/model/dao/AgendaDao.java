package model.dao;

import model.entities.Apointment;

import java.util.Date;
import java.util.List;

public interface AgendaDao {

    List<Apointment> findByDate(Date date);
    List<Apointment> findByCategory(String category);
    void insert(Apointment apointment);
    void delete(Apointment apointment);
    void update(Apointment apointment);

}
