package ListadoBasico5;
import utiles.*;
/**
 * Define la clase MatrizDecimales2 basada en la clase anterior. Se ha de inicializar con
 * valores aleatorios (solicita al usuario el mínimo y el máximo de los valores). Ha de
 * localizar los valores máximo, mínimo y media de la matriz. Que muestre tanto los
 * valores como la posición que ocupan en la matriz. Utiliza los métodos pedirFila(),
 * pedirColumna(), pedirMínimo(), pedirMaximo(), crearMatriz(),
 * mostrarMatriz(double[][]), hallarMedia(double[][]) ;
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MatrizDecimales2{
	public static void main(String[] args){
		double matriz[][]=new double[pedirDimension("filas")][pedirDimension("columnas")];

		inicializarMatrizAleatoriamente(matriz,pedirValor("minimo"),pedirValor("maximo"));
		
		Utilidades.mostrarMatrizDecimales(matriz);
		hallarMaximo(matriz);
		hallarMinimo(matriz);
		hallarMedia(matriz);
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
	 * Pide al usuario la dimensión de la fila o la columna
	 * @param minimoMaximo cadena que indica si se pide el mínimo o el máximo
	 * @return valor valor mínimo o máximo
	 */
	static int pedirValor(String minimoMaximo){
		int valor;

		do{
			valor=Teclado.leerEntero("\nIntroduzca el valor "+minimoMaximo+": ");
			if(valor<0)
				System.out.println("\nError. El valor debe de ser mayor que cero");
		}while(valor<0);
		return valor;
	}

	/**
	 * Introduce valores aleatorios en la matriz
	 * @param matriz matriz de números decimales
	 */
	static void inicializarMatrizAleatoriamente(double[][] matriz,int minimo,int maximo){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Utilidades.generarDecimalAleatorio(minimo,maximo);
		}
	}

	/**
	 * Encuentra e imprime el valor máximo
	 * @param matriz matriz de números decimales
	 */
	static void hallarMaximo(double[][] matriz){
		int fila=0,columna=0;
		double maximo=matriz[0][0];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]>maximo){
					maximo=matriz[i][j];
					fila=i;
					columna=j;
				}
			}
		}
		System.out.println("\nEl maximo elemento es m["+fila+"]["+columna+"] = "+maximo);
	}

	/**
	 * Encuentra e imprime el valor mínimo
	 * @param matriz matriz de números decimales
	 */
	static void hallarMinimo(double[][] matriz){
		int fila=0,columna=0;
		double minimo=matriz[0][0];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]<minimo){
					minimo=matriz[i][j];
					fila=i;
					columna=j;
				}
			}
		}
		System.out.println("\nEl minimo elemento es m["+fila+"]["+columna+"] = "+minimo);
	}

	/**
	 * Encuentra e imprime la media
	 * @param matriz matriz de números decimales
	 */
	static void hallarMedia(double[][] matriz){
		int contador=0;
		double media=0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				media+=matriz[i][j];
				contador++;
			}
		}
		System.out.println("\nLa media es: "+media/contador);
	}
}
