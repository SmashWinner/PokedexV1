package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;
import Interfaces.Veneno;

public class Venomoth extends Pokemon implements Bicho, Veneno{
    private static String nombre = "Venomoth";
    private static String num = "0049";
    private static String descripcion = "Pokémon de tipo Bicho/Veneno";

    public Venomoth(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Venomoth(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
