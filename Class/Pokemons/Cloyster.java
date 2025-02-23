package Class.Pokemons;

import Interfaces.Hielo;

public class Cloyster extends Shellder implements Hielo {
    private static String nombre = "Cloyster";
    private static String num = "0091";
    private static String descripcion = "Pokémon de tipo Agua/Hielo";

    public Cloyster(){
        super(nombre, num, descripcion);
    }

    public Cloyster(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
}
