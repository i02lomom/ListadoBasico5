package ListadoBasico5;
import utiles.*;
/**
 * Crea una clase DelReves que implemente el método mostrarDelReves(int []). Se le
 * pasará como argumento un vector de enteros inicializado mediante llaves. Mostrará
 * dicho vector del revés
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class DelReves{
	public static void main(String[] args){
		int [] array= {1,2,3,4,5,6,7,8,9,10};

		mostrarDelReves(array);
	}

	/**
	 * Muestra los elementos del vector desde el último al primero
	 * @param array vector de enteros
	 */
	static void mostrarDelReves(int [] array){
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
	}
}
