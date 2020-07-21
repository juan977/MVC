package pe.edu.upeu.springMVC.dao;

import java.util.List;

import pe.edu.upeu.springMVC.entity.Mensaje;

public interface MensajeDao {

	List<Mensaje> readAll();
}
