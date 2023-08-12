import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tablero <F extends Ficha, C extends Casilla<F,C>, M extends Mano<F,C>> {

    protected ArrayList<C> casillas = new ArrayList<>();                                    // casillas del tablero
    private M mano ;                                                                        // opciones de fichas a jugar
    private ArrayList<ArrayList<HashMap<C,Color>>> multiplematch = new ArrayList<>();       // lista de matches despues de una jugada
    protected int puntaje = 0; 																// estado de puntos acumulados

//-----------------------------------------------METODOS---------------------------------------------

	public void estatus(){                                                // va a imprimir el puntaje, el tablero, la fichas que estan en mano
    	

        System.out.println("--------------------------PUNTAJE-------------------------");
        System.out.println("                             "+this.puntaje);
        System.out.println("----------------------------------------------------------\n");
        
        System.out.println("--------------------------TABLERO-------------------------");
        
        for (C casilla : this.casillas) {
            System.out.print("\t"+casilla.getNumero()+ ": " );
            System.out.print(casilla.getFicha().getValor());
            System.out.println();
        }
        
        System.out.println("----------------------------------------------------------\n");
        
        System.out.println("----------------------------MANO--------------------------");
        
		for(Ficha f : this.mano.mano) {
			 System.out.println("\t"+f.getValor());
		}
		
        System.out.println("----------------------------------------------------------\n");

        
    }

    public void jugarPieza(int casilla, Ficha ficha, int pos) {// dada una casilla, pone una ficha de mano en dicha casilla en caso de ser posible

        boolean existe = false;

        for (C c : casillas) {                               // se recorre las casillas
            if (c.getNumero()==casilla ) {					 // coinciden los nombres
                if (c.cabe(ficha)) {						 
                	existe = true;							 // la ficha cabe
                    Ficha copiaa = mano.mano.get(pos);       // se saca una copia antes de eliminarla de mano
                    c.setFicha(copiaa);						 // se pone la ficha
                    mano.mano.remove(pos);				     // se elimina la ficha de mano
                } 
            }
        }

        if (!existe) {
        	System.out.println("La ficha introducida no cabe en la casilla seleccionada");   // mensaje de error
        }else{
            puntaje++;  // se aumenta el puntaje una unidad por cada ficha jugada
        }

    }

    public boolean lleno(){      // se verifica si el tablero esta lleno                                                               
    	
        boolean respuesta= false;
        int cont =0;

        for (C c : casillas){											// se recorren las casillas
            if(!(c.getFicha().getValor().containsValue(null))){			// si la ficha no contiene un color vacio es que esta llena
                cont++;	
            }
        }

        if(cont==casillas.size()){  // si la cantidad de fichas llenas es igual al total de fichas el tablero esta lleno
            respuesta=true;
        }
        
        return respuesta;
        
    }

    public boolean trancado(){   // caso cuando se juega una pieza y las que estan en mano ya no caben en el tablero, se tranca el juego
 
        boolean respuesta = true;

        for(Ficha ficha : mano.mano){  	// se recorre las fichas que estan en mano
            for (C c : casillas){		// al mismo tiempo se recorren las casillas
                if(c.cabe(ficha)){		
                    respuesta = false;	// si cabe en el tablero, el juego no esta trancado
                }

            }
        }
        return respuesta;

    }

    public void revisarMatch(Reglas<F, C> reglas){ // recibe las reglas de match 

        for (C casilla : casillas) {                       // se recorren las casillas
            casilla.setReglas(reglas);                 // se le envia el mensaje a las casillas con las reglas del match
            multiplematch.add(casilla.match());		   // lista que almacena los match en los que participa la casilla
        }
        
        if ((multiplematch.size()>=3)||(multiplematch.size()==0)){          // se recorre la lista de match
            for (ArrayList<HashMap<C,Color>> hashMaps : multiplematch) {  
                for (HashMap<C,Color> h : hashMaps) {				
                    for (C c : h.keySet()) {						// se accede al hashmap que almacena la casilla y el color que hizo match
                        puntaje = puntaje+c.cleanColor(h.get(c));  // aumenta el puntaje segun la cantidad de veces que participo el color
                    }
                }
            }
        }
        
        multiplematch.clear();		// se limpia la lista que almacena los match
        
    }

    public void generarMano() {						
    	this.mano.generarMano(this.casillas);		// se llama al metodo generarMano de la interface Mano 
    }

    public abstract void generarTablero();		// metodo abstracto que modelara la forma del tablero

//--------------------Getters y Setters------------------------

    public void setMano(M mano) {															   // setter de mano
        this.mano = mano;
    }

    public M getMano() {																	   // getter de mano
        return mano;
    }
    
}
