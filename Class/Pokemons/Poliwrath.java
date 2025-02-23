package Class.Pokemons;

import Interfaces.Lucha;

public class Poliwrath extends Poliwhirl implements Lucha{
    private static String nombre = "Poliwrath";
    private static String num = "0062";
    private static String descripcion = "Pokémon de tipo Agua/Lucha";

    public Poliwrath(){
        super(nombre, num, descripcion);
    }

    public Poliwrath(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
}
