package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Electrico;

public class Pikachu extends Pokemon implements Electrico{
    private static String nombre = "Pikachu";
    private static String num = "0025";
    private static String descripcion = "Pokémon de tipo Electrico";


    public Pikachu(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Pikachu(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
