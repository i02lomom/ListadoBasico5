package ListadoBasico5;
import utiles.*;
/**
 * Define la clase SieteYMedia que permita al usuario jugar a las siete y media. Para ello,
 * has de almacenar las 40 cartas en un array bidimensional. Utiliza el método
 * Math.random() para seleccionar una de ellas. Recuerda que no pueden seleccionarse
 * dos veces. El jugador decide si seguir arriesgando o no mediante una pregunta.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SieteYMedia{
	public static void main(String[] args){
		boolean continuar=false;
		double acumulado=0;
		double[][] matriz=crearBaraja();

		do{
			acumulado=sacarCarta(matriz,acumulado);
			continuar=comprobarPuntuacion(acumulado,continuar);
		}while(continuar);
	}

	/**
	 * Saca una carta válida y devuelve el valor de esa carta
	 * @param matriz que almacena la baraja
	 * @param acumulado valor actual de la puntuación acumulada
	 * @return acumulado nueva puntuación acumulada
	 */
	static double sacarCarta(double [][] matriz,double acumulado){
		int palo,figura,SACADA=-1;
		double carta=0;

		do{
			palo=generarPalo();
			figura=generarFigura();
			carta=matriz[palo][figura];
		}while(carta==SACADA);

		mostrarCarta(palo,figura);
		acumulado=obtenerPuntuacion(carta,acumulado);
		matriz[palo][figura]=SACADA;
		return acumulado;
	}

	/**
	 * Genera el palo de la carta
	 * @return entero que representa el palo
	 */
	static int generarPalo(){
		return Utilidades.generarEnteroAleatorio(0,3);
	}

	/**
	 * Genera la figura de la carta
	 * @return entero que representa la figura
	 */
	static int generarFigura(){
		return Utilidades.generarEnteroAleatorio(0,9);
	}

	/**
	 * Crea la matriz que representa la baraja
	 * @return matriz
	 */
	static double[][] crearBaraja(){
		double[][] matriz = {{1,2,3,4,5,6,7,0.5,0.5,0.5},	//oros
		{1,2,3,4,5,6,7,0.5,0.5,0.5},	//copas
		{1,2,3,4,5,6,7,0.5,0.5,0.5},	//espadas
		{1,2,3,4,5,6,7,0.5,0.5,0.5}};	//bastos
		return matriz;
	}

	/**
	 * Se suma a la puntuación el valor de la carta obtenida
	 * @return acumulado nueva puntuación acumulada
	 */
	static double obtenerPuntuacion(double carta,double acumulado){
		acumulado+=carta;
		return acumulado;
	}

	/**
	 * Se comprueba la puntuación y se devuelve true si el jugador desea continuar.
	 * Se devuelve false si el jugador no desea continuar o bien si no se puede continuar.
	 * @return continuar devuelve true o false
	 */
	static boolean comprobarPuntuacion(double acumulado,boolean continuar){
		continuar=false;
		System.out.println("\nAcumulado = "+acumulado);
		if(acumulado<7.5)
			continuar=Utilidades.deseaContinuar();
		else if(acumulado==7.5)
			System.out.println("\nYOU WIN!");
		else if(acumulado>7.5)
			System.out.println("\nYOU LOSE!");
		return continuar;
	}

	/**
	 * Muestra tanto la figura como el palo
	 * @param palo número que indica el palo
	 * @param figura número que indica la figura
	 */
	static void mostrarCarta(int palo, int figura){
		mostrarFigura(figura);
		mostrarPalo(palo);
	}

	/**
	 * Muestra la figura
	 * @param figura número que indica la figura
	 */
	static void mostrarFigura(int figura){
		switch(figura){
			case 0:
				System.out.print("\nEl As de ");
				break;
			case 1:
				System.out.print("\nEl 2 de ");
				break;
			case 2:
				System.out.print("\nEl 3 de ");
				break;
			case 3:
				System.out.print("\nEl 4 de ");
				break;
			case 4:
				System.out.print("\nEl 5 de ");
				break;
			case 5:
				System.out.print("\nEl 6 de ");
				break;
			case 6:
				System.out.print("\nEl 7 de ");
				break;
			case 7:
				System.out.print("\nLa Sota de ");
				break;
			case 8:
				System.out.print("\nEl Caballo de ");
				break;
			default:
				System.out.print("\nEl Rey de ");
				break;
		}
	}

	/**
	 * Muestra el palo
	 * @param palo número que indica el palo
	 */
	static void mostrarPalo(int palo){
		switch(palo){
			case 0:
				System.out.print("oros\n");
				break;
			case 1:
				System.out.print("copas\n");
				break;
			case 2:
				System.out.print("espadas\n");
				break;
			default:
				System.out.print("bastos\n");
				break;
		}
	}
}
