package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Magikarp extends Pokemon implements Agua{
    private static String nombre = "Magikarp";
    private static String num = "0129";
    private static String descripcion = "Pokémon de tipo Agua";

    public Magikarp(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Magikarp(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
