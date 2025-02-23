package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Normal;
import Interfaces.Volador;

public class Farfetchd extends Pokemon implements Normal, Volador{

    private static String nombre = "Farfetchd";
    private static String num = "0083";
    private static String descripcion = "Pokémon de tipo Normal/Volador";

    public Farfetchd(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Farfetchd(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
