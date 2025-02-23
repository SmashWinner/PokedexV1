package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Snorlax extends Pokemon implements Normal{
    private static String nombre = "Snorlax";
    private static String num = "0143";
    private static String descripcion = "Pokémon de tipo Normal";

    public Snorlax(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Snorlax(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
