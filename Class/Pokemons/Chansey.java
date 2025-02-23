package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Chansey extends Pokemon implements Normal{
    private static String nombre = "Rhydon";
    private static String num = "0113";
    private static String descripcion = "Pokémon de tipo Normal";

    public Chansey(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Chansey(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
    