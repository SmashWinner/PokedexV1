package Class.Pokemons;

import Class.Pokemon;
import Interfaces.*;

public class Charmander extends Pokemon implements Fuego{
    private static String nombre = "Charmander";
    private static String num = "0004";
    private static String descripcion = "Pokémon de tipo fuego";

    public Charmander(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Charmander(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
