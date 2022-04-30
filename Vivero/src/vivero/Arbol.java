
package vivero;

/**
 *
 * @author Franco
 */
public class Arbol {

    private int codigo;
    private String nVariedad;
    private String especie;
    private double altura;
    private boolean flor;
    private boolean fruto;
    private boolean perenne;
    //CONSTRUCTORES

    public Arbol(int codigo, double altura, boolean flor, boolean fruto, boolean perenne) {
        codigo = 0;
        altura = 0;
        flor = false;
        fruto = false;
        perenne = false;
    }

    public Arbol(int cod, String nom, String esp, double alt, boolean flo, boolean fru, boolean pere) {
        codigo = cod;
        nVariedad = nom;
        especie = esp;
        altura = alt;
        flor = flo;
        fruto = fru;
        perenne = pere;
    }


    //OBSERVADORES
    public int getCodigo() {
        return this.codigo;
    }

    public String getNVariedad() {
        return this.nVariedad;
    }

    public String getEspecie() {
        return this.especie;
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean getFlor() {
        return this.flor;
    }

    public boolean getFruto() {
        return this.fruto;
    }

    public boolean getPerenne() {
        return this.perenne;
    }
        public String toString(){
    return codigo + " " + nVariedad + " " + especie + " " + altura +" "+flor + " "+fruto+" " + perenne;
    } 
    public boolean equals(Arbol Ider)
    {
      return Ider.codigo==codigo && Ider.nVariedad==nVariedad && Ider.especie==especie && Ider.altura==altura && Ider.flor==flor && Ider.fruto==fruto && Ider.perenne==perenne;
    }
    //MODIFICADORES
    public void setNVariedad(String nom) {
        this.nVariedad = nom;

    }

    public void setEspecie(String esp) {
        this.especie = esp;
    }

    public void setAltura(double alt) {
        this.altura = alt;
    }

    public void setFlor(boolean flo) {
        this.flor = flo;
    }

    public void setFruto(boolean fru) {
        this.fruto = fru;
    }
        public void setPerenne(boolean pere) {
        this.perenne = pere;
    }
}

