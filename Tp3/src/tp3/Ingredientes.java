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
public class Ingredientes 
{
    //atributos
    private String nombre,medida;
    private int cantidad;
    
    //constructores
    public Ingredientes()
    {
        nombre = "";
        cantidad = 0;
        medida = "";
    }
    
    public Ingredientes(int cant,String nom, String med)
    {
        nombre = nom;
        cantidad = cant;
        medida = med;
    }
    
    //observadores
    public int getCantidad()
    {
        return cantidad;
    }
    
    public String getMedida()
    {
        return medida;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String toString()
    {
        return nombre + " - " + cantidad + " - " + medida;
    }
    
    public boolean equals(Ingredientes ing)
    {
        return nombre == ing.getNombre() && cantidad == ing.getCantidad() && medida == ing.getMedida();
    }
    
    //modificadores
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setMedida(String medida)
    {
        this.medida = medida;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
}
 
