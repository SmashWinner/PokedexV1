package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Shellder extends Pokemon implements Agua{

    private static String nombre = "Shellder";
    private static String num = "0090";
    private static String descripcion = "Pokémon de tipo Agua";

    public Shellder(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Shellder(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
