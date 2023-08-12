public class TableroAbstractoT extends Tablero <FichaCuadrada,CasillaTriangular,ManoOrigin<FichaCuadrada,CasillaTriangular>> {
    // tablero con con forma abstracta y con fichas y casillas de diferentes formas
    public void generarTablero() {

        CasillaTriangular c1 = new CasillaTriangular();
        CasillaTriangular c2 = new CasillaTriangular();
        CasillaTriangular c3 = new CasillaTriangular();
        CasillaTriangular c4 = new CasillaTriangular();
        CasillaTriangular c5 = new CasillaTriangular();
        CasillaTriangular c6 = new CasillaTriangular();
        CasillaTriangular c7 = new CasillaTriangular();
        CasillaTriangular c8 = new CasillaTriangular();
        CasillaTriangular c9 = new CasillaTriangular();
        CasillaTriangular c10 = new CasillaTriangular();


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
        f7.setValor(Size.Small,Color.Blue);
        f7.setValor(Size.Medium, null);
        f7.setValor(Size.Large, null);

        FichaTriangular f8= new FichaTriangular();
        f8.setValor(Size.Small, null);
        f8.setValor(Size.Medium,Color.Blue);
        f8.setValor(Size.Large, null);

        FichaTriangular f9 = new FichaTriangular();
        f9.setValor(Size.Small, null);
        f9.setValor(Size.Medium, null);
        f9.setValor(Size.Large, null);

        FichaTriangular f10 = new FichaTriangular();
        f10.setValor(Size.Small, null);
        f10.setValor(Size.Medium, null);
        f10.setValor(Size.Large, Color.Blue);


        Adyacencia<FichaCuadrada, CasillaTriangular> a1 = new Adyacencia<>();
        a1.add(Direccion.NE, c2);
        c1.setFicha(f1);
        c1.setAdyacencias(a1);

        Adyacencia<FichaCuadrada, CasillaTriangular> a2 = new Adyacencia<>();
        a2.add(Direccion.SO, c1);
        a2.add(Direccion.SE, c3);
        c2.setFicha(f2);
        c2.setAdyacencias(a2);

        Adyacencia<FichaCuadrada, CasillaTriangular> a3 = new Adyacencia<>();
        a3.add(Direccion.NO, c2);
        a3.add(Direccion.NE, c4);
        a3.add(Direccion.S, c6);
        c3.setFicha(f3);
        c3.setAdyacencias(a3);

        Adyacencia<FichaCuadrada, CasillaTriangular> a4 = new Adyacencia<>();
        a4.add(Direccion.SO, c3);
        a4.add(Direccion.SE, c5);
        c4.setFicha(f4);
        c4.setAdyacencias(a4);

        Adyacencia<FichaCuadrada, CasillaTriangular> a5 = new Adyacencia<>();
        a5.add(Direccion.NO, c4);
        c5.setFicha(f5);
        c5.setAdyacencias(a5);

        Adyacencia<FichaCuadrada, CasillaTriangular> a6 = new Adyacencia<>();
        a6.add(Direccion.N, c3);
        a6.add(Direccion.SE, c7);
        c6.setFicha(f6);
        c6.setAdyacencias(a6);

        Adyacencia<FichaCuadrada, CasillaTriangular> a7 = new Adyacencia<>();
        a7.add(Direccion.NE, c6);
        a7.add(Direccion.S, c8);
        c7.setFicha(f7);
        c7.setAdyacencias(a7);

        Adyacencia<FichaCuadrada, CasillaTriangular> a8 = new Adyacencia<>();
        a8.add(Direccion.N, c7);
        a8.add(Direccion.SO, c9);
        c8.setFicha(f8);
        c8.setAdyacencias(a8);

        Adyacencia<FichaCuadrada, CasillaTriangular> a9 = new Adyacencia<>();
        a9.add(Direccion.NE, c8);
        a9.add(Direccion.NO, c10);
        c9.setFicha(f9);
        c9.setAdyacencias(a9);

        Adyacencia<FichaCuadrada, CasillaTriangular> a10 = new Adyacencia<>();
        a10.add(Direccion.SE, c9);
        c10.setFicha(f10);
        c10.setAdyacencias(a10);


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

    }
}
