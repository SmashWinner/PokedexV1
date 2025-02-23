package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;

public class Porygon extends Pokemon implements Normal{
    private static String nombre = "Porygon";
    private static String num = "0137";
    private static String descripcion = "Pokémon de tipo Normal";


    public Porygon(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Porygon(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
