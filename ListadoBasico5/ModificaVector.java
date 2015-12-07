package ListadoBasico5;
import utiles.*;
/**
 * Define la clase ModificaVector. Realizará las siguientes opciones:
 * 
 * a. Creará un vector con la dimensión indicada por el usuario.
 * b. Inicializará con valores consecutivos (1, 2, 3…).
 * c. Después se solicitará al usuario un elemento del array (entre 1 y longitud) y su
 * nuevo valor para modificarlo.
 * d. Este proceso de modificación de un elemento se repetirá tantas veces como
 * quiera el usuario (¿quiere modificar otro(s/n)?)
 * e. Al acabar, se visualizarán el array ya modificado
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ModificaVector{
	public static void main(String[] args){
		int valor;
		int vector[]=new int[pedirDimension()];

		inicializarVector(vector);
		do{
			modificarVector(vector,pedirElemento(vector));
		}while(modificar());
		Utilidades.mostrarVectorEnteros(vector);
	}

	/**
	 * Pide al usuario la dimensión del vector
	 * @return dimension tamaño del vector
	 */
	static int pedirDimension(){
		int dimension;

		System.out.println("\nVamos a crear un array con valores consecutivos.");
		do{
			dimension=Teclado.leerEntero("\nDame la longitud del array (entero positivo): ");
			if(dimension<=0)
				System.out.println("\nError. La longitud debe de ser mayor que cero");
		}while(dimension<=0);
		return dimension;
	}

	/**
	 * Introduce valores consecutivos en el vector empezando por el 1
	 * @param vector vector de enteros
	 */
	static void inicializarVector(int[] vector){
		for(int i=0;i<vector.length;i++){
			vector[i]=i+1;
		}
		System.out.println("\nYA LO HE CREADO. Ahora vamos a modificar el array.");
	}

	/**
	 * Pide al usuario la posición que desee modificar
	 * @param vector vector de enteros
	 */
	static int pedirElemento(int[] vector){
		int elemento;

		do{
			elemento=Teclado.leerEntero("\nDame un elemento del array (entre 1 y "+vector.length+"): ");
			if(elemento<1 || elemento>vector.length)
				System.out.println("\nError. El elemento debe de estar entre 1 y "+vector.length);
		}while(elemento<1 || elemento>vector.length);
		return elemento;
	}

	/**
	 * Pide un valor al usuario y se introduce en la posición dada del vector
	 * @param vector vector de enteros
	 * @param elemento elemento que se debe modificar (hay que restarle 1 para obtener la posición)
	 */
	static void modificarVector(int[] vector,int elemento){
		int valor=Teclado.leerEntero("\nDame un valor para introducir en la posición "+elemento+" del array: ");
		vector[elemento-1]=valor;
	}

	/**
	 * Pregunta al usuario si desea modificar otro valor pidiéndole un caracter (s/n)
	 * @return true si la respuesta es 's' y false si es 'n'
	 */
	public static boolean modificar(){
		char respuesta;

        do{
            respuesta=Character.toLowerCase(Teclado.leerCaracter("\n¿Quieres modificar otro (s/n)? "));
            if(respuesta!='s' && respuesta!='n')
            	System.out.println("\nError. Respuesta incorrecta.\n");
        }while (respuesta!='s' && respuesta!='n');

        if (respuesta=='s')
            return true;
        return false;
	}
}
