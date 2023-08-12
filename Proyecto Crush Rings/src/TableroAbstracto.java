public class TableroAbstracto  extends Tablero <FichaTriangular,CasillaHexagonal,ManoOrigin<FichaTriangular,CasillaHexagonal>> {
// tablero con con forma abstracta y con fichas y casillas de diferentes formas
	public void generarTablero() {
		
			CasillaHexagonal c1 = new CasillaHexagonal();
			CasillaHexagonal c2 = new CasillaHexagonal();
			CasillaHexagonal c3 = new CasillaHexagonal();
			CasillaHexagonal c4 = new CasillaHexagonal();
			CasillaHexagonal c5 = new CasillaHexagonal();
			CasillaHexagonal c6 = new CasillaHexagonal();
			CasillaHexagonal c7 = new CasillaHexagonal();
			CasillaHexagonal c8 = new CasillaHexagonal();
			CasillaHexagonal c9 = new CasillaHexagonal();
			CasillaHexagonal c10 = new CasillaHexagonal();
			CasillaHexagonal c11= new CasillaHexagonal();
			CasillaHexagonal c12 = new CasillaHexagonal();

  
	        c1.setNumero(1);
	        c2.setNumero(2);
	        c3.setNumero(3);
	        c4.setNumero(4);
	        c5.setNumero(5);
	        c6.setNumero(6);
	        c7.setNumero(7);
	        c8.setNumero(8);
	        c9.setNumero(9);
	        c10.setNumero(10);
	        c11.setNumero(11);
	        c12.setNumero(12);
 
	        FichaTriangular f1 = new FichaTriangular();
	        f1.setValor(Size.Small, null);
	        f1.setValor(Size.Medium, null);
	        f1.setValor(Size.Large, null);

	        FichaTriangular f2 = new FichaTriangular();
	        f2.setValor(Size.Small, null);
	        f2.setValor(Size.Medium, null);
	        f2.setValor(Size.Large, null );

	        FichaTriangular f3 = new FichaTriangular();
	        f3.setValor(Size.Small, null);
	        f3.setValor(Size.Medium, null);
	        f3.setValor(Size.Large, null);

	        FichaTriangular f4 = new FichaTriangular();
	        f4.setValor(Size.Small, null);
	        f4.setValor(Size.Medium, null);
	        f4.setValor(Size.Large, null);

	        FichaTriangular f5 = new FichaTriangular();
	        f5.setValor(Size.Small,null);
	        f5.setValor(Size.Medium, null);
	        f5.setValor(Size.Large, null);

	        FichaTriangular f6 = new FichaTriangular();
	        f6.setValor(Size.Small, null);
	        f6.setValor(Size.Medium, null);
	        f6.setValor(Size.Large, null);

	        FichaTriangular f7 = new FichaTriangular();
	        f7.setValor(Size.Small,null);
	        f7.setValor(Size.Medium, null);
	        f7.setValor(Size.Large, null);

	        FichaTriangular f8= new FichaTriangular();
	        f8.setValor(Size.Small, null);
	        f8.setValor(Size.Medium,null);
	        f8.setValor(Size.Large, null);

	        FichaTriangular f9 = new FichaTriangular();
	        f9.setValor(Size.Small, null);
	        f9.setValor(Size.Medium, null);
	        f9.setValor(Size.Large, Color.Blue);
	        
	        FichaTriangular f10 = new FichaTriangular();
	        f10.setValor(Size.Small, null);
	        f10.setValor(Size.Medium, null);
	        f10.setValor(Size.Large, Color.Blue);
	        
	        FichaTriangular f11 = new FichaTriangular();
	        f11.setValor(Size.Small, null);
	        f11.setValor(Size.Medium, Color.Blue);
	        f11.setValor(Size.Large, null);
	        
	        FichaTriangular f12 = new FichaTriangular();
	        f12.setValor(Size.Small, Color.Blue);
	        f12.setValor(Size.Medium, null);
	        f12.setValor(Size.Large, null);


	        Adyacencia<FichaTriangular, CasillaHexagonal> a1 = new Adyacencia<>();
	        a1.add(Direccion.NE, c4);
			a1.add(Direccion.SE, c5);
			a1.add(Direccion.S, c2);
	        c1.setFicha(f1);
	        c1.setAdyacencias(a1);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a2 = new Adyacencia<>();
	        a2.add(Direccion.N, c1);
	        a2.add(Direccion.S, c3);
	        a2.add(Direccion.SE, c6);
			a2.add(Direccion.NE, c5);
	        c2.setFicha(f2);
	        c2.setAdyacencias(a2);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a3 = new Adyacencia<>();
	        a3.add(Direccion.N, c2);
			a3.add(Direccion.NE, c6);
			a3.add(Direccion.SE, c7);
	        c3.setFicha(f3);
	        c3.setAdyacencias(a3);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a4 = new Adyacencia<>();
	        a4.add(Direccion.S, c5);
			a4.add(Direccion.SO, c1);
			a4.add(Direccion.SE, c8);
	        c4.setFicha(f4);
	        c4.setAdyacencias(a4);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a5 = new Adyacencia<>();
	        a5.add(Direccion.SO, c2);
	        a5.add(Direccion.N, c4);
	        a5.add(Direccion.NE, c8);
	        a5.add(Direccion.S, c6);
			a5.add(Direccion.NO, c1);
	        c5.setFicha(f5);
	        c5.setAdyacencias(a5);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a6 = new Adyacencia<>();
	        a6.add(Direccion.N, c5);
	        a6.add(Direccion.NO, c2);
	        a6.add(Direccion.SE, c12);
			a6.add(Direccion.S, c7);
			a6.add(Direccion.SO, c3);
	        c6.setFicha(f6);
	        c6.setAdyacencias(a6);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a7 = new Adyacencia<>();
	        a7.add(Direccion.N, c6);
	        a7.add(Direccion.NE, c12);
			a7.add(Direccion.NO, c3);
	        c7.setFicha(f7);
	        c7.setAdyacencias(a7);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a8 = new Adyacencia<>();
	        a8.add(Direccion.NE, c9);
	        a8.add(Direccion.SO, c5);
			a8.add(Direccion.NO, c4);
			a8.add(Direccion.SE, c10);
	        c8.setFicha(f8);
	        c8.setAdyacencias(a8);

	        Adyacencia<FichaTriangular, CasillaHexagonal> a9 = new Adyacencia<>();
	        a9.add(Direccion.SO, c8);
	        a9.add(Direccion.S, c10);
	        c9.setFicha(f9);
	        c9.setAdyacencias(a9);
	        
	        Adyacencia<FichaTriangular, CasillaHexagonal> a10 = new Adyacencia<>();
	        a10.add(Direccion.N, c9);
	        a10.add(Direccion.S, c11);
			a10.add(Direccion.NO, c8);
	        c10.setFicha(f10);
	        c10.setAdyacencias(a10);
	        
	        Adyacencia<FichaTriangular, CasillaHexagonal> a11 = new Adyacencia<>();
	        a11.add(Direccion.N, c10);
	        a11.add(Direccion.SO, c12);
	        c11.setFicha(f11);
	        c11.setAdyacencias(a11);
	        
	        Adyacencia<FichaTriangular, CasillaHexagonal> a12 = new Adyacencia<>();
	        a12.add(Direccion.NO, c6);
	        a12.add(Direccion.SO, c7);
	        a12.add(Direccion.NE, c11);
	        c12.setFicha(f12);
	        c12.setAdyacencias(a12);

	        casillas.add(c1);
	        casillas.add(c2);
	        casillas.add(c3);
	        casillas.add(c4);
	        casillas.add(c5);
	        casillas.add(c6);
	        casillas.add(c7);
	        casillas.add(c8);
	        casillas.add(c9);
	        casillas.add(c10);
	        casillas.add(c11);
	        casillas.add(c12);
		
	}
}