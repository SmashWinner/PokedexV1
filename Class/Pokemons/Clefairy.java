package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Hada;

public class Clefairy extends Pokemon implements Hada{
    private static String nombre = "Clefairy";
    private static String num = "0035";
    private static String descripcion = "Pokémon de tipo Hada";


    public Clefairy(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Clefairy(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
