package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Veneno;

public class Grimer extends Pokemon implements Veneno{

    private static String nombre = "Grimer";
    private static String num = "0088";
    private static String descripcion = "Pokémon de tipo Veneno";

    public Grimer(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Grimer(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
