package ListadoBasico5;
import utiles.*;
/**
 * Crea la clase NotasAlumnos. Declara y crea un tipo de variable que sea capaz de
 * contener la nota que han obtenido 4 alumnos en los diferentes módulos en los que
 * están matriculados. Sabemos que el primer alumno está matriculado en 4 módulos; el
 * segundo en 7, el tercero en 3 módulos y el cuarto en dos módulos. Genera
 * aleatoriamente las notas de los alumnos y muéstralos. Utiliza métodos de la forma
 * más eficiente y clara.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class NotasAlumnos{
	public static void main(String[] args){
		int [][] m = new int [4][];
		m[0] = new int[4];
		m[1] = new int[7];
		m[2] = new int[3];
		m[3] = new int[2];

		inicializarMatrizAleatoriamente(m);
		System.out.println("\nMatriz: \n");
		Utilidades.mostrarMatrizEnteros(m);
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
}
