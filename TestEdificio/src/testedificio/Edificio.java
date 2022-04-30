/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedificio;

/**
 *
 * @author Franco
 */
public class Edificio {
    private String identificacion;
    private String nombre;
    private char destino;
    private int cantPiso;
    private double valorMt2;
    private boolean construido;
    
    //CONSTRUCTORES
    
    public Edificio (String identi)
    {
     identificacion = identi;
    }
    public Edificio(String ide,String nom,char des,int cantP,double val, boolean constr) {
        identificacion = ide;
        nombre = nom;
        destino = des;
        cantPiso = cantP;
        valorMt2 = val;
        construido = constr;
    }
    //OBSERVADORES
    public String getIdentificacion() {
        return this.identificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public char getDestino() {
        return this.destino;
    }

    public int getCantPiso() {
        return this.cantPiso;
    }

    public double getValorMt2() {
        return this.valorMt2;
    }

    public boolean getConstruido() {
        return this.construido;
    }
        public String toString(){
    return identificacion+","+nombre+","+destino+","+cantPiso +","+valorMt2+","+construido+",";
    }
        public boolean equals(Edificio Ider){
      return Ider.identificacion.equalsIgnoreCase(Ider.getIdentificacion()) && nombre.equalsIgnoreCase(Ider.getNombre()) && Ider.destino==destino && Ider.cantPiso==cantPiso && Ider.valorMt2==valorMt2 && Ider.construido==construido;
        }    
    
//MODIFICADORES
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setDestino(char des) {
        this.destino = des;
    }

    public void setCantPiso(int cantP) {
        this.cantPiso = cantP;
    }

    public void setValorMt2(double val) {
        this.valorMt2 = val;
    }
        public void setConstruido(boolean constr) {
        this.construido = constr;
    }
}
    

