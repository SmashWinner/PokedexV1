package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Lucha;

public class Hitmonlee extends Pokemon implements Lucha{
    private static String nombre = "Hitmonlee";
    private static String num = "0106";
    private static String descripcion = "Pokémon de tipo Lucha";

    public Hitmonlee(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Hitmonlee(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
