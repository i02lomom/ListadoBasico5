package ListadoBasico5;
import utiles.*;
/**
 * Crea una clase MediaDelVector que cree un vector con enteros aleatorios y muestre la
 * media del vector. Para ello, implementa los métodos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], min, max) y hallarMedia(int[]).
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MediaDelVector{
	public static void main(String[] args){
		int vector[]=new int[pedirDimension()];

		inicializarVectorAleatoriamente(vector);
		Utilidades.mostrarVectorEnteros(vector);
		System.out.println("\nLa media del vector es: "+hallarMedia(vector));
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
	 * Calcula la media del vector
	 * @param vector vector de enteros
	 * @return media del vector
	 */
	static float hallarMedia(int[] vector){
		float media=0;

		for(int i=0;i<vector.length;i++){
			media+=vector[i];
		}
		return (media/vector.length);
	}
}
