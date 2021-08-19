package Datos;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion cx1 = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("1.  Conexion  con PostgreSQL");
		System.out.println();
		System.out.println("**************************************************");
		cx1.conectar();
		System.out.println("**************************************************");
		cx1.desconectar();
		System.out.println("**************************************************");
	
		
		iconexion cx2 = Fabrica.getConexion("Vacia");
		System.out.println();
		System.out.println("2.  Conexion vacia no hay ninguna base de datos");
		System.out.println();
		System.out.println("**************************************************");
		cx2.conectar();
		System.out.println("**************************************************");
		cx2.desconectar();
		System.out.println("**************************************************");
		
		iconexion cx3 = Fabrica.getConexion("SQL");
		System.out.println();
		System.out.println("3.  Conexion  con SQL Server");
		System.out.println();
		System.out.println("**************************************************");
		cx3.conectar();
		System.out.println("**************************************************");
		cx3.desconectar();
		System.out.println("**************************************************");

		iconexion cx4 = Fabrica.getConexion("MysQL");
		System.out.println();
		System.out.println("4.	Conexion  con MySQL Server");
		System.out.println();
		System.out.println("**************************************************");
		cx4.conectar();
		System.out.println("**************************************************");
		cx4.desconectar();
		System.out.println("**************************************************");
		
		iconexion cx5 = Fabrica.getConexion("Oracle");
		System.out.println();
		System.out.println("5.	Conexion con Oracle");
		System.out.println();
		System.out.println("**************************************************");
		cx5.conectar();
		System.out.println("**************************************************");
		cx5.desconectar();
		System.out.println("**************************************************");
	}

}
