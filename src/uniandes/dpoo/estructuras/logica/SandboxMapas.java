package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista( )
    {
    	ArrayList<String> valores = new ArrayList<String>();
    	for (Map.Entry<String, String> entry : mapaCadenas.entrySet()) {
            String value = entry.getValue();
            valores.add(value);
        }
    	String cent = "";
    	int sizeCadenas = valores.size();
    	for(int i = 0; i < sizeCadenas; i++) {
    		for (int j = i+1; j < sizeCadenas; j++) {
    			int result = valores.get(i).compareTo(valores.get(j));
    			if (result > 0) {
    				cent = valores.get(i);
    				valores.set(i, valores.get(j));
    				valores.set(j, cent);
    			}
    			
    		}
    	}
    	return valores;
    }

    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
    	ArrayList<String> keys = new ArrayList<String>();
    	for (Map.Entry<String, String> entry : mapaCadenas.entrySet()) {
            String key = entry.getKey();
            keys.add(key);
        }
    	String cent = "";
    	int sizeCadenas = keys.size();
    	for(int i = 0; i < sizeCadenas; i++) {
    		for (int j = i+1; j < sizeCadenas; j++) {
    			int result = keys.get(i).compareTo(keys.get(j));
    			if (result < 0) {
    				cent = keys.get(i);
    				keys.set(i, keys.get(j));
    				keys.set(j, cent);
    			}
    			
    		}
    	}
    	return keys;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    {
    	List<String> values = getValoresComoLista();
    	int valuesSize = values.size();
    	if(valuesSize != 0) {
    		String str = values.get(0);
    		return str;
    	}
    	else {
    		return null;
    	}
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    {
    	List<String> values = getValoresComoLista();
    	int valuesSize = values.size();
    	if(valuesSize != 0) {
    		String str = values.get(valuesSize - 1);
    		return str;
    	}
    	else {
    		return null;
    	}
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {
    	Collection<String> keys = new ArrayList<String>();
    	for (Map.Entry<String, String> entry : mapaCadenas.entrySet()) {
            String key = entry.getKey();
            keys.add(key.toUpperCase());
        }
        return keys;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
    	List<String> values = getValoresComoLista( );
    	int sizeValues = values.size();
    	String preValue = null;
    	int cont = 0;
    	for(int i = 0; i < sizeValues; i++) {
    		String value = values.get(i);
    		if(value != preValue) {
    			cont ++;
    		}
    		preValue = value;
    	}
    	
        return cont;
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {
    	String reverseString = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {

			reverseString = reverseString + cadena.charAt(i);
		}
    	mapaCadenas.put(reverseString, cadena);
    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {
    	mapaCadenas.remove(llave);

    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {
    	if (mapaCadenas.containsValue(valor) == true) {
	    	for (Map.Entry<String,String> entry : mapaCadenas.entrySet()) {  
	    		String key = entry.getKey();
	            String value = entry.getValue();  
	            if(value == valor)
	            	mapaCadenas.remove(key, value);
	    	}
    	}

    }

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	mapaCadenas.clear();
    	int sizeObject = objetos.size();
    	for(int i = 0; i < sizeObject; i++) {
    		Object value = objetos.get(i);
    		agregarCadena(value.toString());
    	}	

    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {
    	ArrayList<String> keys = new ArrayList<String>();
    	for (Map.Entry<String, String> entry : mapaCadenas.entrySet()) {
            String key = entry.getKey();
            keys.add(key);
        }
    	List<String> values = getValoresComoLista( );
    	mapaCadenas.clear();
    	for (int i = 0; i < keys.size(); i++) {
    		mapaCadenas.put(keys.get(i).toUpperCase(), values.get(i));
    	}

    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
    	int sizeOtroArreglo = otroArreglo.length;
    	for (int i = 0; i < sizeOtroArreglo; i++) {
    		if (mapaCadenas.containsValue(otroArreglo[i]) == false) {
    			return false;
    		}
    	}
        return true;
    }

}
