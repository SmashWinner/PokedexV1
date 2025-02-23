package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Bicho;
import Interfaces.Veneno;

public class Weedle extends Pokemon implements Bicho, Veneno{
    private static String nombre = "Weedle";
    private static String num = "0013";
    private static String descripcion = "Pokémon de tipo bicho/veneno";

    public Weedle(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Weedle(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
