import java.util.ArrayList;
import java.util.HashMap;

public class Casilla <F extends Ficha, C extends Casilla<F,C>> {

	protected int numero;                                  // numero de casillas
    private Adyacencia<F,C> adyacencias;                   // casillas vecinas
    private F ficha;                                      // ficha que almacena
    private Reglas<F,C> reglas;                            // Atributo Interface que representa una abstraccion en cuanto a las reglas de match 3
    

//-----------------------------------------------METODOS---------------------------------------------

    public boolean cabe (Ficha f){                         // Al poner una ficha de mano, se verifica si es compatible con la ficha que ya se tiene

        boolean respuesta = false;
        int cont=0;

        for(Size size : this.ficha.getValor().keySet()){   // recorremos los tamaños de la ficha
            if ( (((this.ficha.getValor().get(size)==null))) || ( (this.ficha.getValor().get(size)!=null) && (f.getValor().get(size)==null) ) ){
                cont=cont+1;                               // si cumple las condiciones el contador aumenta
            }
        }

        if(cont==this.ficha.getValor().size()){          // si el valor del contador es igual a la cantidad de tamanos, las fichas son compatibles
            respuesta = true;
        }

        return  respuesta;

    }

    public int cleanColor(Color color) {                          // Cuando hay match, se elimina el color que participo en dicho match

        int cont = 0;                                             // cuenta cuantas veces esta el color en esta ficha

        for (Size key : this.ficha.getValor().keySet()) {         // recorremos los tamanos de la ficha
        	if(this.ficha.getValor().get(key)!=null) {            // se verifica que el tamano no esta vacio
                if(this.ficha.getValor().get(key)==color) {       // el color del tamano de la ficha es igual al color que participo en el match
                	this.ficha.getValor().replace(key, null);     // eliminamos el color
                    cont++;
                }
        	}
        }


        return cont;                                       
    }

    public ArrayList<HashMap<C, Color>> match () {     // Se verifica si esta casilla participa en uno o mas match
    	return reglas.match((C) this);
    }

//------------Getters y Setters--------------

    public void setNumero(int numero) {                    // setter del atributo nombre
        this.numero = numero;
    }

    public int getNumero() {							   // getter del atributo nombre
        return numero;
    }

    public void setAdyacencias(Adyacencia<F,C> adyacencias) {   // setter de adyacencias
        this.adyacencias = adyacencias;
    }

    public Adyacencia<F,C> getAdyacencias() {              // getter de adyacencias
        return adyacencias;
    }

    public C getVecino(Direccion Direccion){              //Obtener la casilla adyacente de una direccion dada
        return this.getAdyacencias().getCasilla(Direccion);
    }

    public void setReglas(Reglas<F, C> reglas) {           // setter reglas de match 3 donde la casilla participa
        this.reglas = reglas;

    }

    public void setFicha(Ficha ficha) {                    // setter de la ficha que esta casilla almacena

        if (this.ficha==null){                             // ficha vacia
            this.ficha = (F) ficha;                        //tipo F ya que la lista de mano en la interfaz es de tipo ficha
        }
        else {
            for(Size size : this.ficha.getValor().keySet()){    // se recorre los tamaños de la ficha
                Color color = this.ficha.getValor().get(size);  // se accede al color
                if(color==null){                                // si el color es null, es porque el tamano esta vacio
                    this.ficha.getValor().replace(size,ficha.getValor().get(size));  // se reemplaza el color null por el color que tiene la ficha que se recibio en ese tamano
                }
            }
        }

    }

    public F getFicha(){ 								   // getter de ficha
        return this.ficha;
    }

}