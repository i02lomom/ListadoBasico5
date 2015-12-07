package ListadoBasico5;
import utiles.*;
/**
 * Crea una clase MínimoMatriz que solicite al usuario el tamaño de una nueva matriz y
 * que la inicialice con valores aleatorios (solicita al usuario el mínimo y el máximo de los
 * valores). Hallará el valor mínimo de una matriz, dando exactamente su posición filacolumna.
 * Utiliza los métodos pedirFila(), pedirColumna(), pedirMínimo(),
 * pedirMaximo, mostrarMatriz(), mostrarMínimo()
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MinimoMatriz{
	public static void main(String[] args){
		int [][] matriz = new int [pedirFila()][pedirColumna()];
		inicializarMatrizAleatoriamente(matriz,pedirMinimo(),pedirMaximo());
		System.out.println("\nMatriz: \n");
		Utilidades.mostrarMatrizEnteros(matriz);
		mostrarMinimo(matriz);
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
	 * Introduce valores aleatorios en la matriz
	 * @param matriz matriz de números enteros
	 */
	static void inicializarMatrizAleatoriamente(int[][] matriz,int minimo,int maximo){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Utilidades.generarEnteroAleatorio(minimo,maximo);
		}
	}

	/**
	 * Pide al usuario el mínimo de los valores
	 * @return tamaño mínimo
	 */
	static int pedirMinimo(){
		return Teclado.leerEntero("\nIntroduzca el minimo de los valores: ");
	}

	/**
	 * Pide al usuario el máximo de los valores
	 * @return tamaño máximo
	 */
	static int pedirMaximo(){
		return Teclado.leerEntero("\nIntroduzca el maximo de los valores: ");
	}

	/**
	 * Muestra el valor mínimo de la matriz
	 * @param matriz matriz de números enteros
	 */
	static void mostrarMinimo(int [][] matriz){
		int fila=0,columna=0;
		int minimo=matriz[0][0];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]<minimo){
					minimo=matriz[i][j];
					fila=i;
					columna=j;
				}
			}
		}
		System.out.println("\nEl elemento minimo es m["+fila+"]["+columna+"] = "+minimo);
	}
}
