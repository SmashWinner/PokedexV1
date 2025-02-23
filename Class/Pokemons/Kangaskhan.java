package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Kangaskhan extends Pokemon implements Normal{
    private static String nombre = "Kangaskhan";
    private static String num = "0115";
    private static String descripcion = "Pokémon de tipo Normal";

    public Kangaskhan(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Kangaskhan(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
