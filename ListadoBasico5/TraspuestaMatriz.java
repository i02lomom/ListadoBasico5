package ListadoBasico5;
import utiles.*;
/**
 * Define la clase TraspuestaMatriz que invierta una matriz de enteros. Se piden las
 * dimensiones y toma valores aleatorios entre 1 y 10.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class TraspuestaMatriz{
	public static void main(String[] args){
		int filas = pedirDimension("filas");
		int columnas = pedirDimension("columnas");
		int [][] m1 = new int [filas][columnas];
		int [][] m2 = new int [columnas][filas];

		inicializarMatrizAleatoriamente(m1);
		System.out.println("\nMatriz original: \n");
		Utilidades.mostrarMatrizEnteros(m1);
		invertirMatriz(m1,m2);
		System.out.println("\nMatriz invertida: \n");
		Utilidades.mostrarMatrizEnteros(m2);
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
	 * Invierte la matriz
	 * @param m1 matriz de números enteros
	 * @param m2 matriz de números enteros
	 */
	static void invertirMatriz(int [][] m1,int [][] m2){
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1[i].length;j++){
				m2[j][i]=m1[i][j];
			}
		}
	}
}
