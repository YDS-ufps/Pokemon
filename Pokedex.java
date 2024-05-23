
/**
 * Write a description of class Pokedex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokedex
{
    String entrenador;
    //variables del mundo
    static int agua;
    static int fuego;
    static int volador;
    static int roca;
    static int planta;
    static int electrico;
    static int dragon;
    static int entrenadores;
    
    //variables para el entrenador
    private int aguaTipo;
    private int fuegoTipo;
    private int voladorTipo;
    private int rocaTipo;
    private int plantaTipo;
    private int electricoTipo;
    private int dragonTipo;
    

    
    public Pokedex()
    {
        // initialise instance variables
        entrenadores++;
    }
    
    public void capturarPokemon(Pokemon p){
        if(p.getTipo() == "agua"){
            agua++;
            aguaTipo++;
        }else if(p.getTipo() == "fuego"){
            fuego++;
            fuegoTipo++;
        }else if(p.getTipo() == "volador"){
            volador++;
            voladorTipo++;
        }else if(p.getTipo() == "roca"){
            roca++;
            rocaTipo++;
        }else if(p.getTipo() == "planta"){
            planta++;
            plantaTipo++;
        }else if(p.getTipo() == "electrico"){
            electrico++;
            electricoTipo++;
        }else if(p.getTipo() == "dragon"){
            dragon++;
            dragonTipo++;
        }
        
    }
    
    public void liberarPokemon(Pokemon p){
        if(p.getTipo()=="agua"){
            agua--;
            aguaTipo--;
        }else if(p.getTipo()=="fuego"){
            fuego--;
            fuegoTipo--;
        }else if(p.getTipo()=="volador"){
            volador--;
            voladorTipo--;
        }else if(p.getTipo()=="roca"){
            roca--;
            rocaTipo--;
        }else if(p.getTipo()=="planta"){
            planta--;
            plantaTipo--;
        }else if(p.getTipo()=="electrico"){
            electrico--;
            electricoTipo--;
        }else if(p.getTipo()=="dragon"){
            dragon--;
            dragonTipo--;
        }
        
    }
    
    public void intercambiarPokemon(Pokemon pNew, Pokemon pLast){
        this.capturarPokemon(pNew);
        this.liberarPokemon(pLast);
    }
    
    public void reiniciar(){
        agua = 0;
        fuego = 0;
        volador = 0;
        roca = 0;
        planta = 0;
        electrico = 0;
        dragon = 0;
    }
    
    public double mediaPokemon(){
        return (agua+fuego+volador+roca+planta+electrico+dragon)/entrenadores;
    }
    
    public void mostrarPokedex(){
        System.out.println("Los Pokemon de tipo agua: " + agua);
        System.out.println("Los Pokemon de tipo fuego: " + fuego);
        System.out.println("Los Pokemon de tipo volador: " + volador);
        System.out.println("Los Pokemon de tipo roca: " + roca);
        System.out.println("Los Pokemon de tipo planta: " + planta);
        System.out.println("Los Pokemon de tipo electrico: " + electrico);
        System.out.println("Los Pokemon de tipo dragon: " + dragon);
    }
    
}
