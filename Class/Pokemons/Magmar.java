package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Fuego;

public class Magmar extends Pokemon implements Fuego{
    private static String nombre = "Magmar";
    private static String num = "0126";
    private static String descripcion = "Pokémon de tipo Fuego";

    public Magmar(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Magmar(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
