package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Lucha;

public class Hitmonchan extends Pokemon implements Lucha{
    private static String nombre = "Hitmonchan";
    private static String num = "0107";
    private static String descripcion = "Pokémon de tipo Lucha";

    public Hitmonchan(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Hitmonchan(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
