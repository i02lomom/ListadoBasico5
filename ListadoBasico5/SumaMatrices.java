package ListadoBasico5;
import utiles.*;
/**
 * Define la clase SumaMatrices que sume dos matrices de enteros. El usuario introducirá
 * por teclado las dimensiones de las matrices (m x n). Las matrices se inicializarán de
 * forma aleatoria con enteros entre 0 y 10. Se visualizarán sumandos y suma.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaMatrices{
	public static void main(String[] args){
		int filas = pedirDimension("filas");
		int columnas = pedirDimension("columnas");
		int [][] m1=new int[filas][columnas];
		int [][] m2=new int[filas][columnas];
		int [][] suma=new int[filas][columnas];

		inicializarMatrizAleatoriamente(m1);
		System.out.println("\nPrimera matriz: \n");
		Utilidades.mostrarMatrizEnteros(m1);
		inicializarMatrizAleatoriamente(m2);
		System.out.println("\nSegunda matriz: \n");
		Utilidades.mostrarMatrizEnteros(m2);

		sumarMatrices(m1,m2,suma);
		System.out.println("\nMatriz resultante: \n");
		Utilidades.mostrarMatrizEnteros(suma);		
	}

	/**
	 * Pide al usuario la dimensión de la fila o la columna
	 * @param filaColumna cadena que indica si se pide la fila o la columna
	 * @return dimension tamaño de la fila o la columna
	 */
	static int pedirDimension(String filaColumna){
		int dimension;

		do{
			dimension=Teclado.leerEntero("\nIntroduzca la dimension de las "+filaColumna+": ");
			if(dimension<=0)
				System.out.println("\nError. El tamaño debe de ser mayor que cero");
		}while(dimension<=0);
		return dimension;
	}

	/**
	 * Introduce valores aleatorios en la matriz
	 * @param matriz matriz de números enteros
	 */
	static void inicializarMatrizAleatoriamente(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Utilidades.generarEnteroAleatorio(0,10);
		}
	}

	/**
	 * Suma dos matrices de enteros
	 * @param m1 matriz de números enteros
	 * @param m2 matriz de números enteros
	 * @param suma matriz de números enteros
	 */
	static void sumarMatrices(int [][] m1,int [][] m2,int [][] suma){
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1[i].length;j++){
				suma[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
}
