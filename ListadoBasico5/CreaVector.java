package ListadoBasico5;
import utiles.*;
/**
 * Crea una clase CreaVector que solicite al usuario el tamaño de un nuevo vector y que
 * le pida los enteros necesarios para inicializarlo. Utiliza los métodos pedirDimension() y
 * pedirDatos(int[])
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class CreaVector{
	public static void main(String[] args){
		int vector[]=new int[pedirDimension()];

		pedirDatos(vector);
		Utilidades.mostrarVectorEnteros(vector);
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
	 * Pide al usuario los elementos del vector
	 * @param vector vector de enteros
	 */
	static void pedirDatos(int[] vector){
		for(int i=0;i<vector.length;i++){
			vector[i]=Teclado.leerEntero("Introduzca el valor de vector["+i+"]: ");
		}
	}
}
