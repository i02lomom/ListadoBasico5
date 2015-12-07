package ListadoBasico5;
import utiles.*;
import java.util.Arrays;
/**
 * Crea una clase MayorDelVector que cree un vector con enteros aleatorios y muestre el
 * valor máximo. Para ello, implementa los métodos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], i, max) y hallarMaximo(int[]).
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MayorDelVector{
	public static void main(String[] args){
		int vector[]=new int[pedirDimension()];

		inicializarVectorAleatoriamente(vector);
		Utilidades.mostrarVectorEnteros(vector);
		System.out.println("\nEl maximo del vector es: "+hallarMaximo(vector));
	}

	/**
	 * Pide al usuario la dimensión del vector
	 * @return dimension tamaño del vector
	 */
	static int pedirDimension(){
		int dimension;

		do{
			dimension=Teclado.leerEntero("\nIntroduzca el tamaño del vector: ");
			if(dimension<=0)
				System.out.println("\nError. El tamaño debe de ser mayor que cero");
		}while(dimension<=0);
		return dimension;
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

	/**
	 * Encuentra el elemento de mayor valor en el vector
	 * @param vector vector de enteros
	 * @return maximo valor del vector
	 */
	static int hallarMaximo(int[] vector){
		Arrays.sort(vector);
		return vector[vector.length-1];
	}
}
