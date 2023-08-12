import java.util.ArrayList;
import java.util.HashMap;

public class CrushRings <F extends Ficha,C extends Casilla<F,C>> implements Reglas<F,C> {

	public ArrayList<HashMap<C, Color>> match (C casilla) { //matchs en los que participa la casilla que recibe
		
	    ArrayList<HashMap<C,Color>> yield = new ArrayList<>();  
        C vecino1; C aux = null;
        HashMap<C,Color> clean = new HashMap<>(); // almacena los match donde la casilla participa
 
        int cont = 0;
        Color colorindv = null; //para caso de match individual

        for (Size size : casilla.getFicha().getValor().keySet()) { // se recorre la ficha que almacena la casilla recibida
            Color color = casilla.getFicha().getValor().get(size);
            if(casilla.getAdyacencias() != null) { // si la casilla tiene vecinos
                for (Direccion direccion :  casilla.getAdyacencias().getGrafo().keySet()) { // direccion de las casillas vecinas
                    if(color!=null){	
                        clean.put(casilla, color);    // candidata a participar en el match 
                        vecino1 = casilla.getVecino(direccion);
                        do{
                            if ((vecino1 != null)){		// el vecino existe
                                if((vecino1.getFicha().getValor().containsValue(color))){     // le pregunta al vecino si contiene su mismo color
                                    clean.put(vecino1,color);		// tambien es candidata a match 
                                    aux = vecino1.getVecino(direccion);
                                }
                                else{
                                    aux=null; //no tienen el mismo color
                                }
                            }
                            vecino1 = aux;
                        }while((vecino1!=null)); // el vecino tiene un vecino en la misma direccion
                    }
            //------------------Si se quiere ajustar el minimo de la longitud del match

                    if((clean.size()>=3)&&(color!=null)){   // se cumple el minimo de casillas para hacer match
                        HashMap<C,Color> copy =  (HashMap<C, Color>) clean.clone();
                        yield.add(copy);  // se agrega a los matchs donde la casilla participa
                    }
                    clean.clear();
                }
            }
            
            // -------------------- Caso cuando todos los tamaños de la ficha tienen igual color -----------------------------
            
            if (cont == 0) {
                colorindv = casilla.getFicha().getValor().get(size);  // se guarda el primer color
                cont++;
            } else { //Entro con el otro tamaño
                if (casilla.getFicha().getValor().get(size) == colorindv) { // las otras componentes tienen el mismo color
                    cont++;
                }
            }

            if(cont == casilla.getFicha().getValor().size()){  // la cantidad de tamanos con el mismo color es igual a la cantidad de tamaños
                clean.put(casilla, colorindv);
                HashMap<C,Color> copyindv = (HashMap<C, Color>) clean.clone();
                yield.add(copyindv); // hay match individual
            }

        }

        return yield;
    }
}