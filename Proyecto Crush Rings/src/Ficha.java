import java.util.HashMap;

public class Ficha  {

    private HashMap<Size,Color> valor;     /* Coleccion que almacena datos asociando una llave a un valor, en este caso
										          la clave es el tamano de la ficha y el valor representa su color*/

    public Ficha() {                                      // Constructor de Ficha
        valor = new HashMap<>();
    }

    public void setValor(Size key, Color color) {         // agregar tamaño de ficha y su color
        this.valor.put(key, color);
    }

    public HashMap<Size,Color> getValor() {               // getter de valor 
        return valor;
    }


}