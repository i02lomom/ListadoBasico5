package ListadoBasico5;
import utiles.*;
/**
 * Crea una clase MostrarMatriz que solicite al usuario el tamaño de una nueva matriz y
 * que le pida los enteros necesarios para inicializarla. Utiliza los métodos pedirFila(),
 * pedirColumna(), pedirDatos(int[]) y mostrarMatriz();
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MostrarMatriz{
	public static void main(String[] args){
		int [][] matriz = new int [pedirFila()][pedirColumna()];
		pedirDatos(matriz);
		System.out.println("\nMatriz: \n");
		Utilidades.mostrarMatrizEnteros(matriz);
	}

	/**
	 * Pide al usuario la dimensión de la fila
	 * @return tamaño de la fila
	 */
	static int pedirFila(){
		int fila;

		do{
			fila=Teclado.leerEntero("\nIntroduzca la dimension de la fila: ");
			if(fila<=0)
				System.out.println("\nError. El tamaño debe de ser mayor que cero");
		}while(fila<=0);
		return fila;
	}

	/**
	 * Pide al usuario la dimensión de la columna
	 * @return tamaño de la columna
	 */
	static int pedirColumna(){
		int columna;

		do{
			columna=Teclado.leerEntero("\nIntroduzca la dimension de la columna: ");
			if(columna<=0)
				System.out.println("\nError. El tamaño debe de ser mayor que cero");
		}while(columna<=0);
		return columna;
	}

	/**
	 * Pide al usuario los elementos de la matriz
	 * @param matriz de enteros
	 */
	static void pedirDatos(int [][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Teclado.leerEntero("\nIntroduzca el valor del elemento m["+i+"]["+j+"]: ");
		}
	}
}
