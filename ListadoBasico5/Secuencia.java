package ListadoBasico5;
import utiles.*;
/**
 * Define la clase Secuencia que busque la secuencia en orden creciente más larga
 * dentro de un vector de enteros inicializado aleatoriamente (Math.random()). Se
 * mostrará tanto la posición de la primera componente de la secuencia como el tamaño
 * de la misma.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Secuencia{
	public static void main(String[] args){
		boolean bandera=false;
		int secuencia=1,posicion=0,max=1;
		int vector[]=new int[pedirDimension()];
		inicializarVectorAleatoriamente(vector);
		Utilidades.mostrarVectorEnteros(vector);
		
		for(int i=1;i<vector.length;i++){	// Recorremos el vector
			if(vector[i-1]+1==vector[i]){	// Si encontramos una secuencia
				bandera=true;				// Existe al menos una secuencia
				secuencia++;			
				if(max<secuencia){
					max=secuencia;
				}
			}
			else{
				if(secuencia==max){
					posicion=i-secuencia;
				}
				secuencia=1;
			}
		}
		if(bandera){
			System.out.println("\nTamaño de la secuencia mas larga: "+max);
			System.out.println("\nPosicion de la primera componente: "+posicion);
		}
		else{
			System.out.println("\nNo se ha hallado ninguna secuencia");
		}
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
}
