package pe.edu.upeu.springMVC.entity;

public class Mensaje {

	private int idmensaje;
	private String titulo;
	private String detalle;
	
	public Mensaje() {
		super();
	}

	public Mensaje(int idmensaje, String titulo, String detalle) {
		this.idmensaje = idmensaje;
		this.titulo = titulo;
		this.detalle = detalle;
	}

	public int getIdmensaje() {
		return idmensaje;
	}

	public void setIdmensaje(int idmensaje) {
		this.idmensaje = idmensaje;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
