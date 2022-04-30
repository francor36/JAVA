/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Franco
 */
public class Tp2 
{
    public class Persona
    {
        private String nombre;
        public Persona()
        {
            this.nombre=null;
        }
        public Persona(String n)
        {
          this.nombre=n;
        }
        public void setNombre(String nuevoNombre)
        {
          this.nombre=nuevoNombre;
          
        }
        public String getNombre()
        {
        return this.nombre;
        }
        public String aCadena()
        {
         return this.getNombre();
        }
        public boolean esIgualA(Persona otraPersona)
        {
            return (this.getNombre().equalsIgnoreCase(otraPersona.getNombre()));
        }
        
    }
    
}
