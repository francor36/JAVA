/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

/**
 *
 * @author Franco
 */
public class Fechas {
    private int dia;
    private int mes;
    private int anyo;
    
    public Fechas(int edia){
        dia = 365;
        mes = 12;
        anyo = 0;
    }
        public Fechas(int edia, int emes,int eanyo)
    {
        //ATRIBUTOS
       dia = edia;
       mes = emes;
       anyo = eanyo;
    }
    //OBVSERVADORES
    public int getDia()
    {
        return this.dia;
    }
    public int getMes()
    {
        return this.mes;
    }
    public int getAnyo()
    {
        return this.anyo;
    }
    public String toString(){
    return dia + " " + mes + " " + anyo;
    }
    public boolean equals(Fechas Ider)
    {
      return Ider.dia==dia && Ider.mes==mes && Ider.anyo==anyo;
    }
    //MODIFICADORES
    public void setDia(int edia)
    {
        this.dia=edia;
    }
    public void setMes(int emes)
    {
        this.mes=emes;
    }
    public void setAnyo(int eanyo)
    {
        this.anyo=eanyo;
    }
    
}
