package ListadoBasico5;
import utiles.*;
/**
 * Define la clase AsignandoArrays tal y como muestra la captura. Indica en un
 * comentario lo que almacenaría la referencia a1 tras modificarse a2. Añade también los
 * siguientes comentarios en las líneas correspondientes:
 *
 * a. se referencia al mismo objeto
 * b. modificación de los elementos
 * c. declaración de un array
 * d. se muestran los elementos del objeto array
 * e. declaración, construcción e inicialización de un array
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class AsignandoArrays{
	public static void main(String[] args){
		int [] a1 = { 3, 5, 7, 11, 13 } ;	//declaración, construcción e inicialización de un array
		int [] a2;	//declaración de un array
		int i;

		a2=a1;	//se referencia al mismo objeto

		//La referencia a1 es la misma que al principio
		//Lo que cambian son los valores del objeto

		for(i=0;i<a2.length;i++)
			a2 [i] ++;	//modificación de los elementos

		for(i=0;i<a1.length;i++)
			System.out.println("a1[" +i+ "] = " + a1[i]);	//se muestran los elementos del objeto array	
	}
}
