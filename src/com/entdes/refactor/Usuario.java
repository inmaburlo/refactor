package com.entdes.refactor;

public class Usuario {
	private String nombreDest;
	private String correoElectronico;
	private String password;
	private String edad;
	
	public Usuario(String nom,String password,String email,String edad){
		this.setNombreDest(nom);
		this.correoElectronico=email;
		this.password=password;
		this.edad=edad;
	}
	
	@Override
	public String toString(){
		String salida="";
		salida+="\nNombre    : "+this.getNombreDest();
		salida+="\nContraseña: ";
		for(int i=0;i<this.password.length();i++) salida+="*";
		salida+="\nCorreo    : "+this.correoElectronico;
		salida+="\nEdad      : "+this.edad;
		salida+="\n-----------------------";
		return salida;
	}

	public String getNombreDest() {
		return nombreDest;
	}

	public void setNombreDest(String nombreDest) {
		this.nombreDest = nombreDest;
	}

}
