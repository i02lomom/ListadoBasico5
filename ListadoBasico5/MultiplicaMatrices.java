package ListadoBasico5;
import utiles.*;
/**
 * Define la clase MultiplicaMatrices que multiplique dos matrices de enteros. El usuario
 * introducirá por teclado las dimensiones de las matrices (m x n, n x o). Las matrices se
 * inicializarán de forma aleatoria con enteros entre 1 y 10. Se visualizarán factores y
 * resultado.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MultiplicaMatrices{
	public static void main(String[] args){
		int filasMatriz1 = pedirDimension("filas de la primera matriz");
		int columnasMatriz1 = pedirDimension("columnas de la primera matriz");
		int columnasMatriz2 = pedirDimension("columnas de la segunda matriz");
		int [][] m1 = new int [filasMatriz1][columnasMatriz1];
		int [][] m2 = new int [columnasMatriz1][columnasMatriz2];
		int [][] m3 = new int [filasMatriz1][columnasMatriz2];

		inicializarMatrizAleatoriamente(m1);
		System.out.println("\nPrimera matriz: \n");
		Utilidades.mostrarMatrizEnteros(m1);
		inicializarMatrizAleatoriamente(m2);
		System.out.println("\nSegunda matriz: \n");
		Utilidades.mostrarMatrizEnteros(m2);
		multiplicarMatrices(m1,m2,m3);
		System.out.println("\nMatriz resultante: \n");
		Utilidades.mostrarMatrizEnteros(m3);
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
				matriz[i][j]=Utilidades.generarEnteroAleatorio(1,10);
		}
	}

	/**
	 * Multiplica dos matrices de enteros
	 * @param m1 primera matriz de números enteros
	 * @param m2 segunda matriz de números enteros
	 * @param m3 matriz donde se almacenará el resultado
	 */
	static void multiplicarMatrices(int [][] m1,int [][] m2,int [][] m3){
		for(int i=0;i<m3.length;i++){
			for(int j=0;j<m3[i].length;j++){
				for(int k=0;k<m1[0].length;k++){
					m3[i][j] += m1[i][k]*m2[k][j]; 
				}
			}
		}
	}
}
