/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;



    public class Terreno
    {
        private int codigo, manzana;
        private double base,altura;
    
    
    public Terreno(int cod)
    {
       codigo = 0;
       base = 0;
    }
    public Terreno(int cod, double ba, double al, int man)
    {
        //ATRIBUTOS
       codigo = cod;
       base = ba;
       altura = al;
       manzana=man;
    }
    
    //OBVSERVADORES
    public int getCodigo()
    {
        return this.codigo;
    }
        public double getBase()
    {
        return this.base;
    }
    public double getAltura()
    {
        return this.altura;
    }
        public int getManzana()
    {
        return this.manzana;
    }
    public String toString(){
    return codigo + " " + manzana + " " + base + " " + altura;
    } 
    public boolean equals(Terreno Ider)
    {
      return Ider.codigo==codigo && Ider.base==base && Ider.altura==altura && Ider.altura==altura;
    }    
        //MODIFICADORES
    public void setManzana(int man)
    {
        this.manzana=man;
    }
    public void setBase(double ba)
    {
        this.base=ba;
    }
    public void setAltura(double al)
    {
        this.altura=al;
    }  
    //PROPIEDADES DEL TIPO
    
    public double perimetro()
    {
    return 2*(base+altura);
    }
    public double superficie()
    {
    return (base*altura);
    }
    public double valor(double precio)
    {
    return (base*altura)*precio;
    }

    
}