package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Horsea extends Pokemon implements Agua{
    private static String nombre = "Horsea";
    private static String num = "0116";
    private static String descripcion = "Pokémon de tipo Agua";

    public Horsea(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Horsea(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
