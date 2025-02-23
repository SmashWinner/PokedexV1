package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Goldeen extends Pokemon implements Agua{
    private static String nombre = "Goldeen";
    private static String num = "0118";
    private static String descripcion = "Pokémon de tipo Agua";

    public Goldeen(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Goldeen(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
    
}
