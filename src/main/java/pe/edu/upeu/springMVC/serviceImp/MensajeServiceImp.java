package pe.edu.upeu.springMVC.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.springMVC.dao.MensajeDao;
import pe.edu.upeu.springMVC.entity.Mensaje;
import pe.edu.upeu.springMVC.service.MensajeService;

@Service
public class MensajeServiceImp implements MensajeService {

	@Autowired
	private MensajeDao MensajeDao;
	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return MensajeDao.readAll();
	}

	
}
