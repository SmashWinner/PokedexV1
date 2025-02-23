package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Ditto extends Pokemon implements Normal{
    private static String nombre = "Ditto";
    private static String num = "0132";
    private static String descripcion = "Pokémon de tipo Normal";

    public Ditto(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Ditto(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
