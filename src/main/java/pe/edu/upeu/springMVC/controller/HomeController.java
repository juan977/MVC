package pe.edu.upeu.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.springMVC.entity.Mensaje;
import pe.edu.upeu.springMVC.service.MensajeService;

@RestController
public class HomeController {

	@Autowired
    private MensajeService MensajeService;
	@GetMapping("/")
	public List<Mensaje> mensaje() {
		return MensajeService.readAll();
	}
}
