package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Agua;

public class Staryu extends Pokemon implements Agua{
    private static String nombre = "Staryu";
    private static String num = "0120";
    private static String descripcion = "Pokémon de tipo Agua";

    public Staryu(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Staryu(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
