package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Hada;
import Interfaces.Normal;

public class Jigglypuff extends Pokemon implements Normal, Hada{
    private static String nombre = "Jigglypuff";
    private static String num = "0039";
    private static String descripcion = "Pokémon de tipo Normal/Hada";


    public Jigglypuff(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Jigglypuff(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
