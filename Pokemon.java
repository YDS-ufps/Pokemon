
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String tipo;
    
    public Pokemon(String nombre, String tipo)
    {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre del Pokemon es: "+getNombre() + "y su tipo es: " + getTipo());
    }

}
