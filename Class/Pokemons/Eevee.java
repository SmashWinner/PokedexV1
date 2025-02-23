package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Eevee extends Pokemon implements Normal{
    private static String nombre = "Eevee";
    private static String num = "0133";
    private static String descripcion = "Pokémon de tipo Normal";

    public Eevee(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Eevee(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
