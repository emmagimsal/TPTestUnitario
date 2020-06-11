package SourcePackages;

public class Cliente {
	private String usuario;
	private String contrase�a;
	private Domicilio domicilio;
	
	public Cliente(String usuario, String contrase�a, Domicilio domicilio) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.domicilio = domicilio;
	}

	public Cliente() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	
}
