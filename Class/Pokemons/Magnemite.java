package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Acero;
import Interfaces.Electrico;

public class Magnemite extends Pokemon implements Electrico, Acero{
    private static String nombre = "Magnemite";
    private static String num = "0081";
    private static String descripcion = "Pokémon de tipo Electrico/Acero";

    public Magnemite(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Magnemite(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
}
