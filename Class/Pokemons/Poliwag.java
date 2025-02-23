package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Poliwag extends Pokemon implements Agua{
    private static String nombre = "Poliwag";
    private static String num = "0060";
    private static String descripcion = "Pokémon de tipo Agua";

    public Poliwag(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Poliwag(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
