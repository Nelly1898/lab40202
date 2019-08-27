package com.senati.lab402;

public class Implementapersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un objeto policia con la clase persona
		Persona policia = new Persona();
		policia.id = 1;
		policia.nombre = "Yolmer";
		policia.apellido = "Conejo";
		policia.sexo = true;
		policia.ecivil = 'S';
		
		System.out.println(policia.toString());
		
	}

}
