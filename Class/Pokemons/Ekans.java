package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;

public class Ekans extends Pokemon implements Veneno{
    private static String nombre = "Ekans";
    private static String num = "0023";
    private static String descripcion = "Pokémon de tipo Veneno";


    public Ekans(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Ekans(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
