package Class.Pokemons;

import Class.Pokemon;
import Interfaces.Lucha;

public class Mankey extends Pokemon implements Lucha{
    private static String nombre = "Mankey";
    private static String num = "0056";
    private static String descripcion = "Pokémon de tipo Lucha";

    public Mankey(){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }

    public Mankey(String nombre, String num, String descripcion){
        super(nombre, num);
        this.setDescripcion(descripcion);
    }
    
}
