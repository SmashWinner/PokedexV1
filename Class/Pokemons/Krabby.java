package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Krabby extends Pokemon implements Agua{
    private static String nombre = "Krabby";
    private static String num = "0098";
    private static String descripcion = "Pokémon de tipo Agua";

    public Krabby(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Krabby(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    
}
