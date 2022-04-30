
public class TDA {
    private int codigo;
    private String nombre;
    private double peso;
    private int edad;

    // CONSTRUCTOR

public TDA(int codigo)
{
    codigo=0;
}

public TDA(int cod, String nn, double pe, int ed)
{
    codigo=cod;
    nombre = nn;
    peso = pe;
    edad = ed;
}

public int getCodigo() {
    return this.codigo;
}
public String getnombre() {
    return this.nombre;
}
public double getPeso() {
    return this.peso;
}
public int getEdad() {
    return this.edad;
}


public String toString()
{
    return "codigo = "+codigo+"nombre = "+nombre+"peso = "+"edad = "+edad; 

}

//MODIFICADORES
public void setCodigo(int cod) {
    codigo = cod;
}
public void setNombre(String nn) {
    nombre = nn;
}
public void setPeso(double pe) {
    peso = pe;
}
public void setEdad(int ed) {
    edad = ed;
}

public boolean equal(TDA Ider)
{
    return Ider.codigo==codigo;
}
}