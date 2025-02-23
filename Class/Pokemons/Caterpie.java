package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;

public class Caterpie extends Pokemon implements Bicho{
    private static String nombre = "Caterpie";
    private static String num = "0010";
    private static String descripcion = "Pokémon de tipo bicho";

    public Caterpie(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Caterpie(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
