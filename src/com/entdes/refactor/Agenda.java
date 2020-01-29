package com.entdes.refactor;

import java.util.ArrayList;

public class Agenda {
	private static final String TIT_LISTADO = "LISTADO:\n";

	public static void main(String[] args){
		ArrayList<Usuario> ListaUsuarios;
		ArrayList<Mensaje> Mensajes=new ArrayList<Mensaje>();
		Usuario persona;
		Mensaje m;
		ListaUsuarios=new ArrayList<Usuario>();
		persona=new Usuario("Ana","anac","ana@pp.com","23");
		ListaUsuarios.add(persona);
		persona=new Usuario("Bea","beee","bea@pp.com","34");
		ListaUsuarios.add(persona);
		persona=new Usuario("Clara","clarita","cl@pp.com","15");
		ListaUsuarios.add(persona);
		persona=new Usuario("Delia","dddd","delia@pp.com","28");
		ListaUsuarios.add(persona);
		
		System.out.println(TIT_LISTADO);
		
		for(Usuario u:ListaUsuarios){
			imprimirUsuario(u);
		}
		
		m=new Mensaje(ListaUsuarios.get(0),ListaUsuarios.get(1),"Primer Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(2),"Otro Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(0),"Respuesta al primer Mensaje");
		Mensajes.add(m);
		m=new Mensaje(ListaUsuarios.get(1),ListaUsuarios.get(3),"òltimo Mensaje");
		Mensajes.add(m);
		
		
		System.out.println(TIT_LISTADO);
		
		
		
		for(Mensaje actual:Mensajes){
			imprimirMensajes(actual);
		}
		
		
	}

	private static void imprimirMensajes(Mensaje actual) {
		System.out.println(actual);
	}

	private static void imprimirUsuario(Usuario u) {
		System.out.println(u);
	}

}
