package ListadoBasico5;
import utiles.*;
/**
 * Crea la clase AlumnosMatriculados. Queremos guardar en la memoria del ordenador el
 * número de alumnos matriculados en cada grupo del ciclo de Desarrollo de
 * Aplicaciones Web (por módulos). Existen dos grupos y se imparten seis módulos
 * distintos en cada grupo. Utiliza métodos en la medida de lo posible. 
 *
 * En el primer grupo hay:
 * 		i. 30 alumnos matriculados en Sistemas informáticos
 * 		ii. 27 alumnos matriculados en Bases de datos
 *		iii. 25 alumnos matriculados en Programación
 * 		iv. 21 alumnos matriculados en Lenguaje de marcas
 * 		v. 19 alumnos matriculados en Entornos de desarrollo
 *		vi. 16 alumnos matriculados en FOL
 * En el segundo grupo hay:
 *		i. 15 alumnos matriculados en Desarrollo Web en entorno cliente
 *		ii. 14 alumnos matriculados en Desarrollo Web en entorno servidor
 *		iii. 15 alumnos matriculados en Despliegue de aplicaciones Web
 *		iv. 15 alumnos matriculados en Diseño de interfaces Web
 *		v. 15 alumnos matriculados en Desarrollo Web en entorno cliente
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class AlumnosMatriculados{
	public static void main(String[] args){
		int [][] alumnos = {{30,27,25,21,19,16},{15,14,15,15,15,14}};

		mostrarPrimeraCabecera();
		mostrarPrimeraFila(alumnos);
		mostrarSegundaCabecera();
		mostrarSegundaFila(alumnos);
	}

	/**
	 * Muestra una cabecera
	 */
	static void mostrarPrimeraCabecera(){
		System.out.println("\nS.I.\tB.D.\tPGN\tL.M.\tE.D.\tFOL");
	}

	/**
	 * Muestra la primera fila de la matriz
	 * @param alumnos matriz de enteros
	 */
	static void mostrarPrimeraFila(int [][] alumnos){
		for(int i=0;i<alumnos[0].length;i++){
			System.out.print(alumnos[0][i]+"\t");
		}
	}

	/**
	 * Muestra una cabecera
	 */
	static void mostrarSegundaCabecera(){
		System.out.print("\n");
		System.out.println("\nDWC\tDWS\tDAW\tDIW\tHLC\tEIE");
	}

	/**
	 * Muestra la segunda fila de la matriz
	 * @param alumnos matriz de enteros
	 */
	static void mostrarSegundaFila(int [][] alumnos){
		for(int i=0;i<alumnos[1].length;i++){
			System.out.print(alumnos[1][i]+"\t");
		}
	}
}
