package com.entdes.refactor;

import java.util.Date;

public class Mensaje {
	private Usuario destino;
	private Usuario origen;
	private String texto;
	private Date fecha;
	
	public Mensaje(Usuario destino, Usuario origen,String texto){
		this.origen=origen;
		this.destino=destino;
		this.texto=texto;
		this.fecha=new Date();	
	}
	@Override
	public String toString(){
		String salida="";
		salida+="MENSAJE DE "+origen.nombre+" PARA: "+destino.nombre;
		salida+="\n"+fecha.toString();
		salida+="\n-----------------";
		salida+=texto;
		salida+="-----------------";
		return salida;
	}

}
