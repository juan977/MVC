package pe.edu.upeu.springMVC.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.springMVC.dao.MensajeDao;
import pe.edu.upeu.springMVC.entity.Mensaje;

@Repository
public class MensajeDaoImp implements MensajeDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("Select *from mensajes",
				BeanPropertyRowMapper.newInstance(Mensaje.class));
	}

}
