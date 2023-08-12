import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		
		Tablero<FichaCircular,CasillaCuadrada,ManoOrigin<FichaCircular,CasillaCuadrada>> tablero = new TableroBasico();
		//Tablero<FichaTriangular,CasillaHexagonal,ManoOrigin<FichaTriangular,CasillaHexagonal>> tablero = new TableroAbstracto();
		//Tablero<FichaCircular,CasillaCuadrada,ManoOrigin<FichaCircular,CasillaCuadrada>> tablero = new TableroLleno();
        //Tablero<FichaCuadrada,CasillaTriangular,ManoOrigin<FichaCuadrada,CasillaTriangular>> tablero = new TableroAbstractoT();

		tablero.generarTablero();
		tablero.setMano(new ManoOrigin<>());
		tablero.generarMano();

        do {
            
            tablero.estatus();
            
            try {       //Estas excepciones permiten dar mensaje de error al momento de que el usuario
                        //introduzca un caracter inválido cuando se le solicita la ficha y/o casilla a jugar.
            	
            	 int pos;
                 do{
                     Scanner teclado = new Scanner(System.in);
                     System.out.println("Ficha a jugar : ");
                     pos = teclado.nextInt();
                 } while ( (pos<=0) || (pos>tablero.getMano().mano.size()) );
                 
                 try {
                	 
                	  int numcasilla;
                      do{
                          Scanner teclado2 = new Scanner(System.in);
                          System.out.println("Casilla donde jugar  : ");
                          numcasilla = teclado2.nextInt();
                      }while ((numcasilla<=0) || (numcasilla>tablero.casillas.size()));
                      
                      try {
                    	  
                    	   Ficha copia = tablero.getMano().mano.get(pos-1);
                           tablero.jugarPieza( numcasilla,copia, pos-1);

                           tablero.revisarMatch(new CrushRings<>());

                           if (tablero.getMano().mano.size() == 0) {
                        	   tablero.generarMano();
                           }
                    	  
                      }catch (Exception e) {
                      	System.out.println("Por favor ingrese un numero entero");
                      }
                 	
                 }catch(Exception e){
                 	System.out.println("Por favor ingrese un numero entero");
                 }
                
            	
            }catch(Exception e) {
            	System.out.println("Por favor ingrese un numero entero");
            }
            
        } while ( !(tablero.lleno()) && !(tablero.trancado()) );

        tablero.estatus();
        System.out.println("GAME OVER, puntaje final : "+ tablero.puntaje);

    }

}
