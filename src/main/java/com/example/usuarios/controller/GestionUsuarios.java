package com.example.usuarios.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarios.entidades.DTOResponse;
import com.example.usuarios.entidades.DTOResponseObject;
import com.example.usuarios.entidades.DatosOpinion;

@RestController
public class GestionUsuarios {
	
	@PostMapping("/api/formularios")
	ResponseEntity <DTOResponse> crearFormulario(@RequestBody DatosOpinion datosOpinion) {
		
		DTOResponse dTOResponse= new DTOResponse(); 
		DTOResponseObject dTOResponseObject= new DTOResponseObject();
		
		if (datosOpinion.getIdAccount()==4559) {
			if (datosOpinion.getApiToken().equals("ASD1SA65D4SA2D4AS57DSA21DSA54S5AD4AS56D4SA5")) {
				dTOResponse.setResponseMessage("SUCCESS");
				dTOResponse.setResponseMsg("");
				String link = "www.urlpruebacapacitacion.com/"+cadenaAleatoria(20);
				dTOResponseObject.setLink(link);
				dTOResponseObject.setShow("true");
				dTOResponse.setResponseObject(dTOResponseObject);
				return ResponseEntity.status(HttpStatus.OK).body(dTOResponse);
			}else {
				dTOResponse.setResponseMessage("FAILED");
				dTOResponse.setResponseMsg("PASSWORD INCORRECTO");
				dTOResponseObject.setLink("");
				dTOResponseObject.setShow("");
				dTOResponse.setResponseObject(dTOResponseObject);
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dTOResponse);
			}
		}else if(datosOpinion.getIdAccount()==4560) {
				if (datosOpinion.getApiToken().equals("ASD1SA65D4SA2D4AS57DSA21DSA54S5AD4AS56D4SA5")) {
					dTOResponse.setResponseMessage("SUCCESS");
					dTOResponse.setResponseMsg("");
					dTOResponseObject.setLink("NO RECIBE FORMULARIO");
					dTOResponseObject.setShow("false");
					dTOResponse.setResponseObject(dTOResponseObject);
					return ResponseEntity.status(HttpStatus.OK).body(dTOResponse);
				}else {
					dTOResponse.setResponseMessage("FAILED");
					dTOResponse.setResponseMsg("PASSWORD INCORRECTO");
					dTOResponseObject.setLink("");
					dTOResponseObject.setShow("");
					dTOResponse.setResponseObject(dTOResponseObject);
					return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dTOResponse);
				}
		}else {
			dTOResponse.setResponseMessage("FAILED");
			dTOResponse.setResponseMsg("USUARIO INCORRECTO");
			dTOResponseObject.setLink("");
			dTOResponseObject.setShow("");
			dTOResponse.setResponseObject(dTOResponseObject);
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dTOResponse);
		}
		
	}
	
	public static String cadenaAleatoria(int longitud) {
	    // El banco de caracteres
	    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    // La cadena en donde iremos agregando un carácter aleatorio
	    String cadena = "";
	    for (int x = 0; x < longitud; x++) {
	        int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
	        char caracterAleatorio = banco.charAt(indiceAleatorio);
	        cadena += caracterAleatorio;
	    }
	    return cadena;
	}
	
	public static int numeroAleatorioEnRango(int minimo, int maximo) {
	    // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
	    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}
}