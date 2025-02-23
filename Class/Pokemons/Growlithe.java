package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fuego;

public class Growlithe extends Pokemon implements Fuego{
    private static String nombre = "Growlithe";
    private static String num = "0058";
    private static String descripcion = "Pokémon de tipo Fuego";

    public Growlithe(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Growlithe(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
