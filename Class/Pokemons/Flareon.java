package Class.Pokemons;

import Interfaces.Fuego;

public class Flareon extends Eevee implements Fuego{
    private static String nombre = "Flareon";
    private static String num = "0136";
    private static String descripcion = "Pokémon de tipo Fuego";

    public Flareon(){
        super(nombre, num, descripcion);
    }

    public Flareon(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
