package Class.Pokemons;

import Class.Pokemon;
import Interfaces.*;

public class Squirtle extends Pokemon implements Agua{
    private static String nombre = "Squirtle";
    private static String num = "0007";
    private static String descripcion = "Pokémon de tipo Agua";

    public Squirtle(){
       super(nombre, num);
       this.setDescripcion(descripcion); 
    }

    public Squirtle(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion); 
    }
}
