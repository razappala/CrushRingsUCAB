public class TableroLleno extends Tablero <FichaCircular,CasillaCuadrada,ManoOrigin<FichaCircular,CasillaCuadrada>>{
	
// caso de  Game Over para la defensa del proyecto
	
		public void generarTablero() {
			
			  	CasillaCuadrada c1 = new CasillaCuadrada();
		        CasillaCuadrada c2 = new CasillaCuadrada();
		        CasillaCuadrada c3 = new CasillaCuadrada();
		        CasillaCuadrada c4 = new CasillaCuadrada();
		        CasillaCuadrada c5 = new CasillaCuadrada();
		        CasillaCuadrada c6 = new CasillaCuadrada();
		        CasillaCuadrada c7 = new CasillaCuadrada();
		        CasillaCuadrada c8 = new CasillaCuadrada();
		        CasillaCuadrada c9 = new CasillaCuadrada();

	 
		        c1.setNumero(1);
		        c2.setNumero(2);
		        c3.setNumero(3);
		        c4.setNumero(4);
		        c5.setNumero(5);
		        c6.setNumero(6);
		        c7.setNumero(7);
		        c8.setNumero(8);
		        c9.setNumero(9);
		        
	 
		        FichaCircular f1 = new FichaCircular();
		        f1.setValor(Size.Small, Color.Yellow);
		        f1.setValor(Size.Medium, Color.White);
		        f1.setValor(Size.Large, Color.Green);

		        FichaCircular f2 = new FichaCircular();
		        f2.setValor(Size.Small, Color.Blue);
		        f2.setValor(Size.Medium, Color.Red);
		        f2.setValor(Size.Large, Color.Pink );

		        FichaCircular f3 = new FichaCircular();
		        f3.setValor(Size.Small, Color.Purple);
		        f3.setValor(Size.Medium, Color.Purple);
		        f3.setValor(Size.Large, Color.White);

		        FichaCircular f4 = new FichaCircular();
		        f4.setValor(Size.Small, Color.Blue);
		        f4.setValor(Size.Medium, Color.Red);
		        f4.setValor(Size.Large, Color.Pink );

		        FichaCircular f5 = new FichaCircular();
		        f5.setValor(Size.Small,Color.Purple);
		        f5.setValor(Size.Medium, Color.Blue);
		        f5.setValor(Size.Large, null);

		        FichaCircular f6 = new FichaCircular();
		        f6.setValor(Size.Small, Color.Yellow);
		        f6.setValor(Size.Medium, Color.White);
		        f6.setValor(Size.Large, Color.Green);

		        FichaCircular f7 = new FichaCircular();
		        f7.setValor(Size.Small, Color.Blue);
		        f7.setValor(Size.Medium, Color.Red);
		        f7.setValor(Size.Large, Color.Pink );

		        FichaCircular f8= new FichaCircular();
		        f8.setValor(Size.Small, Color.Yellow);
		        f8.setValor(Size.Medium, Color.White);
		        f8.setValor(Size.Large, Color.Green);

		        FichaCircular f9 = new FichaCircular();
		        f9.setValor(Size.Small, Color.Blue);
		        f9.setValor(Size.Medium, Color.Red);
		        f9.setValor(Size.Large, Color.Pink );


		        Adyacencia<FichaCircular, CasillaCuadrada> a1 = new Adyacencia<>();
		        a1.add(Direccion.E, c2);
		        a1.add(Direccion.S, c4);
		        a1.add(Direccion.SE, c5);
		        c1.setFicha(f1);
		        c1.setAdyacencias(a1);

		        Adyacencia<FichaCircular, CasillaCuadrada> a2 = new Adyacencia<>();
		        a2.add(Direccion.O, c1);
		        a2.add(Direccion.E, c3);
		        a2.add(Direccion.S, c5);
		        c2.setFicha(f2);
		        c2.setAdyacencias(a2);

		        Adyacencia<FichaCircular, CasillaCuadrada> a3 = new Adyacencia<>();
		        a3.add(Direccion.O, c2);
		        a3.add(Direccion.S, c6);
		        a3.add(Direccion.SO, c5);
		        c3.setFicha(f3);
		        c3.setAdyacencias(a3);

		        Adyacencia<FichaCircular, CasillaCuadrada> a4 = new Adyacencia<>();
		        a4.add(Direccion.N, c1);
		        a4.add(Direccion.E, c5);
		        a4.add(Direccion.S, c7);
		        c4.setFicha(f4);
		        c4.setAdyacencias(a4);

		        Adyacencia<FichaCircular, CasillaCuadrada> a5 = new Adyacencia<>();
		        a5.add(Direccion.NO, c1);
		        a5.add(Direccion.N, c2);
		        a5.add(Direccion.NE, c3);
		        a5.add(Direccion.O, c4);
		        a5.add(Direccion.E, c6);
		        a5.add(Direccion.SO, c7);
		        a5.add(Direccion.S, c8);
		        a5.add(Direccion.SE, c9);
		        c5.setFicha(f5);
		        c5.setAdyacencias(a5);

		        Adyacencia<FichaCircular, CasillaCuadrada> a6 = new Adyacencia<>();
		        a6.add(Direccion.N, c3);
		        a6.add(Direccion.O, c5);
		        a6.add(Direccion.S, c9);
		        c6.setFicha(f6);
		        c6.setAdyacencias(a6);

		        Adyacencia<FichaCircular, CasillaCuadrada> a7 = new Adyacencia<>();
		        a7.add(Direccion.N, c4);
		        a7.add(Direccion.NE, c5);
		        a7.add(Direccion.E, c8);
		        c7.setFicha(f7);
		        c7.setAdyacencias(a7);

		        Adyacencia<FichaCircular, CasillaCuadrada> a8 = new Adyacencia<>();
		        a8.add(Direccion.N, c5);
		        a8.add(Direccion.O, c7);
		        a8.add(Direccion.E, c9);
		        c8.setFicha(f8);
		        c8.setAdyacencias(a8);

		        Adyacencia<FichaCircular, CasillaCuadrada> a9 = new Adyacencia<>();
		        a9.add(Direccion.NO, c5);
		        a9.add(Direccion.N, c6);
		        a9.add(Direccion.O, c8);
		        c9.setFicha(f9);
		        c9.setAdyacencias(a9);

		        casillas.add(c1);
		        casillas.add(c2);
		        casillas.add(c3);
		        casillas.add(c4);
		        casillas.add(c5);
		        casillas.add(c6);
		        casillas.add(c7);
		        casillas.add(c8);
		        casillas.add(c9);
			
		}
}

