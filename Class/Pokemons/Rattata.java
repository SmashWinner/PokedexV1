package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Rattata extends Pokemon implements Normal{
    private static String nombre = "Rattata";
    private static String num = "0019";
    private static String descripcion = "Pokémon de tipo Normal";

    public Rattata(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Rattata(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
