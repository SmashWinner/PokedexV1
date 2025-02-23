package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Dragon;

public class Dratini extends Pokemon implements Dragon{

    private static String nombre = "Dratini";
    private static String num = "0147";
    private static String descripcion = "Pokémon de tipo Dragon";

    public Dratini(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Dratini(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
