package pe.edu.upeu.springMVC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.springMVC.dao.MensajeDao;

@SpringBootTest
class SpringMvcApplicationTests {

	@Autowired
	private MensajeDao mensajeDao;
	@Test
	void contextLoads() {
		mensajeDao.readAll();
	}

}
