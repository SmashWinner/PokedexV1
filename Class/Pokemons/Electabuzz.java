package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Electrico;

public class Electabuzz extends Pokemon implements Electrico{
    private static String nombre = "Electabuzz";
    private static String num = "0125";
    private static String descripcion = "Pokémon de tipo Electrico";

    public Electabuzz(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Electabuzz(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
