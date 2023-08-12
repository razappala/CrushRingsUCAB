import java.util.ArrayList;

public interface Mano <F extends Ficha,C extends Casilla<F,C>> {
	// interface que genera las fichas en mano dependiendo de su implementacion
	
	ArrayList<Ficha> mano = new ArrayList<>();
	//Contratos

	void generarMano(ArrayList<C> casillas);             // la implementacion de este metodo generara la fichas de mano de una manera determinada

	boolean cumple(ArrayList<C> casillas, Ficha ficha);  // verifica si la ficha generada cumple ciertas condiciones para ser generada

}