package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Meowth extends Pokemon implements Normal{
    private static String nombre = "Meowth";
    private static String num = "0052";
    private static String descripcion = "Pokémon de tipo Normal";


    public Meowth(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Meowth(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
