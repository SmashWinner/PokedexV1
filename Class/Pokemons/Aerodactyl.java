package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Roca;
import Interfaces.Volador;

public class Aerodactyl extends Pokemon implements Roca, Volador{
    private static String nombre = "Aerodactyl";
    private static String num = "0142";
    private static String descripcion = "Pokémon de tipo Roca/Volador";

    public Aerodactyl(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Aerodactyl(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
