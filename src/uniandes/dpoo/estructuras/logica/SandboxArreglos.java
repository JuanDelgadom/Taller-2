package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.lang.Math;
/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int sizeEnteros = arregloEnteros.length;
    	int newCantidadEnteros[]= new int[sizeEnteros];
    	for(int i = 0; i < sizeEnteros; i++) {
            newCantidadEnteros[i] = arregloEnteros[i]; 
         }
        return newCantidadEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	int sizeCadenas = arregloCadenas.length;
    	String newCantidadCadenas[]= new String[sizeCadenas];
    	for(int i = 0; i < sizeCadenas; i++) {
            newCantidadCadenas[i] = arregloCadenas[i]; 
         }
        return newCantidadCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int sizeEnteros = arregloEnteros.length;
    	int newCantidadEnteros[]= new int[sizeEnteros + 1];
    	for(int i = 0; i < sizeEnteros; i++) {
            newCantidadEnteros[i] = arregloEnteros[i]; 
         }
    	newCantidadEnteros[sizeEnteros] = entero;
    	arregloEnteros = newCantidadEnteros;
    	
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int sizeCadenas = arregloCadenas.length;
    	String newCantidadCadenas[]= new String[sizeCadenas + 1];
    	for(int i = 0; i < sizeCadenas; i++) {
            newCantidadCadenas[i] = arregloCadenas[i];
         }
    	newCantidadCadenas[sizeCadenas] = cadena;
    	arregloCadenas = newCantidadCadenas;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int sizeEnteros = getCantidadEnteros( );
    	int newCantidadEnteros[]= new int[sizeEnteros];
    	int y = 0;
    	for(int i = 0, j=0; i < sizeEnteros; i++) {
    		if (arregloEnteros[i] != valor) {
    			newCantidadEnteros[j] = arregloEnteros[i];
    			j++;
    			y++;
    			}
    	}
    	int newCantidadEnteros1[] = new int[y];
    	for (int k = 0; k < y; k++){
    		newCantidadEnteros1[k] = newCantidadEnteros[k];
    	}
    	arregloEnteros = newCantidadEnteros1;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int sizeCadenas = getCantidadCadenas( );
    	String newCantidadCadenas[]= new String[sizeCadenas];
    	int y = 0;
    	for(int i = 0, j=0; i < sizeCadenas; i++) {
    		if (arregloCadenas[i] != cadena) {
    			newCantidadCadenas[j] = arregloCadenas[i];
    			j++;
    			y++;
    			}
    	}
    	String newCantidadCadenas1[] = new String[y];
    	for (int k = 0; k < y; k++){
    		newCantidadCadenas1[k] = newCantidadCadenas[k];
    	}
    	arregloCadenas = newCantidadCadenas1;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int sizeEnteros = getCantidadEnteros( );
    	int newCantidadEnteros[]= new int[sizeEnteros + 1];
    	if(posicion < 0 || posicion == 0) {
    		newCantidadEnteros[0] = entero;
			for(int i = 0, j=1; i < sizeEnteros; i++) {
	    		newCantidadEnteros[j] = arregloEnteros[i];
	    		j++;
	    	}
			arregloEnteros = newCantidadEnteros;
		} else if(posicion > sizeEnteros){
    		agregarEntero(entero);
    	} else {
    		newCantidadEnteros[posicion] = entero;
    		for(int i = 0, j=0; i < sizeEnteros;) {
        		if(j != posicion) {
        			newCantidadEnteros[j] = arregloEnteros[i];
        			i++;
        		}
        		j++;
             }
    		arregloEnteros = newCantidadEnteros;
    	}

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int sizeEnteros = getCantidadEnteros();
        if (posicion >= 0 && posicion < sizeEnteros) {
            int newCantidadEnteros[] = new int[sizeEnteros - 1];
            for (int i = 0, j = 0; i < sizeEnteros; i++) {
                if (i != posicion) {
                    newCantidadEnteros[j++] = arregloEnteros[i];
                }
            }
            arregloEnteros = newCantidadEnteros;
        }
    
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int sizeValores = valores.length;
    	int newCantidadEnteros[]= new int[sizeValores];
    	for(int i = 0; i < sizeValores; i++) {
    		int valorEntero = (int) valores[i];
            newCantidadEnteros[i] = valorEntero; 
         }
    	arregloEnteros = newCantidadEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int sizeCadenas = objetos.length;
    	String newCantidadCadenas[]= new String[sizeCadenas];
    	for(int i = 0; i < sizeCadenas; i++) {
    		String cadena = objetos[i].toString();
            newCantidadCadenas[i] = cadena; 
         }
    	arregloCadenas = newCantidadCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int sizeEnteros = arregloEnteros.length;
    	int newCantidadEnteros[]= new int[sizeEnteros];
    	for(int i = 0; i < sizeEnteros; i++) {
    		if (arregloEnteros[i] < 0) {
    			newCantidadEnteros[i] = arregloEnteros[i] * - 1;
    		} else {
    			newCantidadEnteros[i] = arregloEnteros[i]; 
    		}   
         }
        arregloEnteros = newCantidadEnteros;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int cent = 0;
    	int sizeEnteros = arregloEnteros.length;
    	for(int i = 0; i < sizeEnteros; i++) {
    		for (int j = i+1; j < sizeEnteros; j++) {
    			if(arregloEnteros[i] > arregloEnteros[j]) {
    				cent = arregloEnteros[i];
        			arregloEnteros[i] = arregloEnteros[j];
        			arregloEnteros[j] = cent;
    			}
    			
    		}
    	}

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	String cent = "";
    	int sizeCadenas = arregloCadenas.length;
    	for(int i = 0; i < sizeCadenas; i++) {
    		for (int j = i+1; j < sizeCadenas; j++) {
    			int result = arregloCadenas[i].compareTo(arregloCadenas[j]);
    			if (result > 0) {
    				cent = arregloCadenas[i];
        			arregloCadenas[i] = arregloCadenas[j];
        			arregloCadenas[j] = cent;
    			}
    			/*if(arregloCadenas.[i] > arregloCadenas[j]) {
    				cent = arregloCadenas[i];
        			arregloCadenas[i] = arregloCadenas[j];
        			arregloCadenas[j] = cent;*/
    			
    		}
    	}

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    
    {
    	int sizeEnteros = arregloEnteros.length;
    	int veces = 0;
    	for(int i = 0; i < sizeEnteros; i++) {
            if (arregloEnteros[i] == valor){
            	veces++;
            }
            
         }
        return veces;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int sizeCadenas = arregloCadenas.length;
    	int veces = 0;
    	for(int i = 0; i < sizeCadenas; i++) {
    		String caracter = arregloCadenas[i].toLowerCase();
    		int result = caracter.compareTo(cadena.toLowerCase());
            if (result == 0){
            	veces++;
            }
            
         }
        return veces;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int sizeEnteros = arregloEnteros.length;
    	int tamaño = 0;
    	for(int i = 0; i < sizeEnteros; i++) {
    		if (arregloEnteros[i] == valor) {
    			tamaño ++;
    			}
         }
    	int newPosiciones[]= new int[tamaño];
    	for(int i = 0, j = 0; i < sizeEnteros; i++) {
    		if (arregloEnteros[i] == valor) {
    			newPosiciones[j] = i;
    			j++;
    			}
         }
        
        return newPosiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	organizarEnteros( );
    	int sizeEnteros = arregloEnteros.length;
    	int[] rangoVacio = new int[0];
    	int[] rango1 = new int[2];
    	if (sizeEnteros > 0) {
    		int menor = arregloEnteros[0];
    		rango1[0] = menor;
    		if (sizeEnteros >= 2) {
    			int mayor = arregloEnteros[sizeEnteros -1];
    			rango1[1] = mayor;
    		}
    		return rango1;
    	} else {
    		return rangoVacio;
    	}
       
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> Histograma = new HashMap<Integer, Integer>();
    	int sizeEnteros = arregloEnteros.length;
    	for(int i = 0; i < sizeEnteros; i++) {
    		int veces = 0;
    		for (int j = 0; j < sizeEnteros; j++) {
    			if(arregloEnteros[i] == arregloEnteros[j]) {
    				veces ++;
    			}
    		}
    		if (Histograma.containsKey(arregloEnteros[i]) == false){
    			Histograma.put(arregloEnteros[i], veces);
    		}
    		
    	}
        return Histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> Histograma = calcularHistograma( );
    	int enterosRepetidos = 0;
    	for(Integer key: Histograma.keySet()) {
    		int valor = Histograma.get(key);
    		if (valor > 1)
    			enterosRepetidos ++;
    	}
    	
        return enterosRepetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	int sizeEnteros = arregloEnteros.length;
    	boolean retorno = true;
    	for(int i = 0; i < sizeEnteros; i++) {
    		if(retorno == true) {
    			if(sizeEnteros != otroArreglo.length || arregloEnteros[i] != otroArreglo[i]) {
    				retorno = false;
    			}
    		}
    	}
    	if(otroArreglo.length == 0 || arregloEnteros.length == 0)
    		retorno = false;
    	return retorno;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) 
            return false;
    	
    	else {
	    	int[] copiaArreglo = organizarEnteros1(arregloEnteros);
	    	int[] copiaOtroArreglo = organizarEnteros1(otroArreglo);
	    	
	    	boolean retorno = true;
	    	int sizeEnteros = copiaArreglo.length;
	    	
	    	for(int i = 0; i < sizeEnteros; i++) {
	    		if(retorno == true) {
	    			if(sizeEnteros != copiaOtroArreglo.length || copiaArreglo[i] != copiaOtroArreglo[i]) {
	    				retorno = false;
	    			}
	    		}
	    	}
	    	if (otroArreglo.length == 0 && arregloEnteros.length == 0) {
	    		retorno = true;
	    	}
    	return retorno;
    	} 
    }
    
    
    public int[] getCopiaEnteros1(int[] arregloC )
    {
    	int sizeEnteros = arregloC.length;
    	int newEnteros[]= new int[sizeEnteros];
    	for(int i = 0; i < sizeEnteros; i++) {
    		newEnteros[i] = arregloC[i]; 
         }
        return newEnteros;
    }
    
    public int[] organizarEnteros1( int[] arreglo )
    {
    	int cent = 0;
    	int[] retornoArreglo = getCopiaEnteros1(arreglo );
    	int sizeEnteros = retornoArreglo.length;
    	for(int i = 0; i < sizeEnteros; i++) {
    		for (int j = i+1; j < sizeEnteros; j++) {
    			if(retornoArreglo[i] > retornoArreglo[j]) {
    				cent = retornoArreglo[i];
    				retornoArreglo[i] = retornoArreglo[j];
    				retornoArreglo[j] = cent;
    			}
    			
    		}
    	}
    	return retornoArreglo;

    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int sizeCadenas = cantidad;
    	int newCantidadCadenas[]= new int[sizeCadenas];
    	int rango = maximo - minimo + 1;
    	for(int i = 0; i < sizeCadenas; i++) {
    		int random = (int)(Math.random() * rango) + minimo;
            newCantidadCadenas[i] = random;
            
         }
        arregloEnteros = newCantidadCadenas;

    }

}
