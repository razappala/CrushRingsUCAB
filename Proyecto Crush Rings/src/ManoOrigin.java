import java.util.ArrayList;
import java.util.Random;

public class ManoOrigin <F extends Ficha,C extends Casilla<F,C>> implements Mano<F,C> {
	
    ArrayList<Integer> visitados = new ArrayList<>();  // lista que almacena la casilla a la que ya se le asigno una ficha para evitar repeticion al generar una ficha
	
    static <T extends Enum<?>> T randomEnum(Class<T> clazz) {  // recibe un enum y devuelve  un valor al azar del mismo 
    	Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length); 
        return clazz.getEnumConstants()[x];
    }


	@Override
	public void generarMano(ArrayList<C> casillas) {  // de esta forma generamos las fichas al azar

		   int cont = 0;
 
	        do
	        {
	            Ficha fichaX = new Ficha();     // almacena la ficha creada
	            Random n = new Random();  
	            int numram = n.nextInt(5)+1;    // numero al azar 

	            switch (numram)                 // segun el numero se genera una ficha 
	            {
	                case 1: fichaX.setValor(Size.Small,randomEnum(Color.class));
	                    fichaX.setValor(Size.Medium, null);
	                    fichaX.setValor(Size.Large, null);
	                    break;

	                case 2:	fichaX.setValor(Size.Small, null);
	                    fichaX.setValor(Size.Medium,randomEnum(Color.class));
	                    fichaX.setValor(Size.Large, null);
	                    break;

	                case 3: fichaX.setValor(Size.Small, null);
	                    fichaX.setValor(Size.Medium,null);
	                    fichaX.setValor(Size.Large, randomEnum(Color.class));

	                    break;

	                case 4:	fichaX.setValor(Size.Small, randomEnum(Color.class));
	                    fichaX.setValor(Size.Medium,randomEnum(Color.class));
	                    fichaX.setValor(Size.Large, null);

	                    break;

	                case 5:	fichaX.setValor(Size.Small, randomEnum(Color.class));
	                    fichaX.setValor(Size.Medium,null);
	                    fichaX.setValor(Size.Large,randomEnum(Color.class));

	                    break;

	                case 6:	fichaX.setValor(Size.Small, null);
	                    fichaX.setValor(Size.Medium,randomEnum(Color.class));
	                    fichaX.setValor(Size.Large,randomEnum(Color.class));

	                    break;
	            }


	            if (cumple(casillas,fichaX)) {  // si la ficha cumple las condiciones, se agrega a mano
	                mano.add(fichaX);
	            }else{
	                cont++;						
	            }
	            
	        } while  ( ((mano.size()<3)) && (cont<1000)) ;  

	        visitados.clear();
	}

	@Override
	public boolean cumple(ArrayList<C> casillas, Ficha ficha) {  
		
        boolean respuesta = false;

        for (C c : casillas) {
            if( (c.cabe(ficha)) && (!(visitados.contains(c.getNumero())))){ // se verifica si la ficha cabe en tablero y la casilla en la que cabe no ha sido visitada
                visitados.add(c.getNumero());
                respuesta = true;
                break;
            }
        }
        return respuesta;
	}
}
