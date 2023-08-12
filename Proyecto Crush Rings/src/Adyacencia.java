import java.util.HashMap;

public class Adyacencia <F extends Ficha,C extends Casilla<F, C>> {

    private HashMap<Direccion, C> grafo = new HashMap<>(); /* Coleccion que almacena datos asociando una llave a un valor, en este caso
    														la clave es la direccion y el valor representa la casilla vecina en dicha direccion*/



    public void add(Direccion direccion, C casilla) {       // añade casilla vecina en una direccion
        grafo.put(direccion, casilla);
    }

    public C getCasilla(Direccion direccion) {              // recibe una direccion y devuelve la casilla adyacente con dicha direccion
        return grafo.get(direccion);
    }

    public HashMap<Direccion, C> getGrafo() {               // Devuelve las adyacencias de la casilla
        return grafo;
    }

}