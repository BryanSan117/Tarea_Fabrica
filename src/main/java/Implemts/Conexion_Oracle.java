package Implemts;

import Iconexion.iconexion;

public class Conexion_Oracle implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public void ConexionMysQL() {
		this.host = "";
		this.puerto = "";
		this.usuario = "";
		this.contraseña = "";
		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto con Oracle");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Oracle");
		
	}
	
}
