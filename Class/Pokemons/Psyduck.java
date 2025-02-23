package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Psyduck extends Pokemon implements Agua{
    private static String nombre = "Psyduck";
    private static String num = "0054";
    private static String descripcion = "Pokémon de tipo Agua";


    public Psyduck(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Psyduck(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
