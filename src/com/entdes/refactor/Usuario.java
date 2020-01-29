package com.entdes.refactor;

public class Usuario {
	public String nombre;
	private String email;
	private String password;
	private int edad;
	
	public Usuario(String nom,String password,String email,int edad){
		this.nombre=nom;
		this.email=email;
		this.password=password;
		this.edad=edad;
	}
	
	@Override
	public String toString(){
		String salida="";
		salida+="\nNombre    : "+this.nombre;
		salida+="\nContraseña: ";
		for(int i=0;i<this.password.length();i++) salida+="*";
		salida+="\nCorreo    : "+this.email;
		salida+="\nEdad      : "+this.edad;
		salida+="\n-----------------------";
		return salida;
	}

}
