package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Lucha;

public class Machop extends Pokemon implements Lucha{
    private static String nombre = "Machop";
    private static String num = "0066";
    private static String descripcion = "Pokémon de tipo Lucha";

    public Machop(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Machop(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
   
}
