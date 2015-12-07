package ListadoBasico5;
import utiles.*;
/**
 * Define la clase MatrizDecimales que cree una matriz de decimales. Pide las
 * dimensiones (filas y columnas). Se inicializa con valores aleatorios entre 1 y 100 y
 * visualiza el array.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MatrizDecimales{
	public static void main(String[] args){
		double matriz[][]=new double[pedirDimension("filas")][pedirDimension("columnas")];

		inicializarMatrizAleatoriamente(matriz);
		Utilidades.mostrarMatrizDecimales(matriz);
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
	 * @param matriz matriz de números decimales
	 */
	static void inicializarMatrizAleatoriamente(double[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Utilidades.generarDecimalAleatorio(1,100);
		}
	}
}
