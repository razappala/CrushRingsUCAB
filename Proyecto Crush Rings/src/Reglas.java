import java.util.ArrayList;
import java.util.HashMap;

public interface Reglas <F extends Ficha, C extends Casilla<F,C> > {  // abstraccion que permite modelar cualquier tipo de regla de match 3 
	
	ArrayList<HashMap<C, Color>> match(C casilla); // contrato de  reglas de match 3
}