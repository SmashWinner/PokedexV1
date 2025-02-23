package Class.Pokemons;

import Interfaces.Agua;

public class Vaporeon extends Eevee implements Agua{
    private static String nombre = "Vaporeon";
    private static String num = "0134";
    private static String descripcion = "Pokémon de tipo Agua";

    public Vaporeon(){
        super(nombre, num, descripcion);
    }

    public Vaporeon(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
}
