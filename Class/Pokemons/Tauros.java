package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Tauros extends Pokemon implements Normal{
    private static String nombre = "Tauros";
    private static String num = "0128";
    private static String descripcion = "Pokémon de tipo Normal";

    public Tauros(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Tauros(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
