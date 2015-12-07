package ListadoBasico5;
import utiles.*;
/**
 * Define la clase Notas que almacene en un array 15 notas. Las notas se inicializarán de
 * forma aleatoria con enteros entre 0 y 10. Se visualizarán las notas resultantes.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Notas{
	public static void main(String[] args){
		int vector[]=new int[15];

		inicializarVectorAleatoriamente(vector);
		Utilidades.mostrarVectorEnteros(vector);
	}

	/**
	 * Introduce valores aleatorios en el vector
	 * @param vector vector de enteros
	 */
	static void inicializarVectorAleatoriamente(int[] vector){
		for(int i=0;i<vector.length;i++){
			vector[i]=Utilidades.generarEnteroAleatorio(0,10);
		}
	}
}
