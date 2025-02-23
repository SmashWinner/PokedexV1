package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Lickitung extends Pokemon implements Normal{

    private static String nombre = "Lickitung";
    private static String num = "0108";
    private static String descripcion = "Pokémon de tipo Normal";

    public Lickitung(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Lickitung(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    
}
