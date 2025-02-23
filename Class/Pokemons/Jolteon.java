package Class.Pokemons;

import Interfaces.Electrico;

public class Jolteon extends Eevee implements Electrico{
    private static String nombre = "Jolteon";
    private static String num = "0135";
    private static String descripcion = "Pokémon de tipo Electrico";

    public Jolteon(){
        super(nombre, num, descripcion);
    }

    public Jolteon(String nombre, String num, String descripcion){
        super(nombre, num, descripcion);

    }
    
    
}
