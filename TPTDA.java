package tptda;



public class TPTDA {

    private int codigo;
    private double base;
    private double altura;
    private int manzana;

    //constructor
    public TPTDA(int cod, double bas, double alt, int manz) {
        codigo = cod;
        base = bas;
        altura = alt;
        manzana = manz;
        bas = 0;
        alt = 0;
    }
    //OBVSERVADORES
   public int getCodigo() {
        return this.codigo;
    }
      public double getBase() {
        return this.base;
    }
         public double getAltura() {
        return this.altura;
    }
         public int getManzana() {
        return this.manzana;
    }
    public String toString() {
        return "codigo "+codigo + "-" +"base"+ base + " -"+"altura" + altura + "-" + "manzana"+manzana;
    }

    public boolean equals(TPTDA Ider) {
        return Ider.codigo == codigo && Ider.base == base && Ider.altura == altura && Ider.manzana == manzana;
    }

    //MODIFICADORES
    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setBase(double bas) {
        base = bas;
    }

    public void setAltura(double alt) {
        altura = alt;
    }

    public void setManzana(int manz) {
        manzana = manz;
    }

}
