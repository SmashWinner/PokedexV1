package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;

public class Koffing extends Pokemon implements Veneno{

    private static String nombre = "Koffing";
    private static String num = "0109";
    private static String descripcion = "Pokémon de tipo veneno";

    public Koffing(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Koffing(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
