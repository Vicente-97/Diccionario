package main.java.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {
	

	Map<String,Set<String>> diccionario = new HashMap<>();
	
	public boolean annadirPalabra(String palabra, String significado) {
		boolean sonIguales=false;
		if (!diccionario.containsKey(palabra)) {
			Set<String> listaSignificado = new HashSet<>();
				listaSignificado.add(significado);
				diccionario.put(palabra, listaSignificado);
				sonIguales=true;
			}else {
					diccionario.get(palabra).add(significado);			
				}
				sonIguales=true;

				return sonIguales;
			}
	
	
	public Set<String> buscarPalabraDiccionario(String palabra) {
		return diccionario.get(palabra);
	}
	
	public void borrarPalabraDiccionario(String palabra){
		if(diccionario.containsKey(palabra)) {
			diccionario.get(palabra).clear();
			diccionario.remove(palabra);
		}
		
	}
	
	public List<String> ListarPalabra(String palabra) {
		List<String> numeroSignificados = new ArrayList<>();
        for(String i:diccionario.keySet()) {
            if (i.startsWith(palabra)) {
               numeroSignificados.add(i);
            }
        }
       Arrays.sort(numeroSignificados.toArray());
        return numeroSignificados;
    }
	
	public void eliminarSignificado (String palabra, String significado) {
		diccionario.remove(palabra, significado);
	}
}
	
	
	

